package indi.z.patter.main;

import indi.z.patter.bean.ShapeMaker;

public class FacadePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

	}

}
