package com.ryantang.rtcommondemo.slidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.ryantang.rtcommondemo.R;
/**
 * 
 * NewActivity.java
 * @author Ryan
 * Create at 2013-12-6 下午3:55:06
 */
public class NewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sm_mainpage);
		TextView textView = (TextView)this.findViewById(R.id.tv_text);
		textView.setText("This is a new activity!");
	}

}
