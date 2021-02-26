package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControlModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by a {@link ControlShape} to access the controls model.
  * @see com.sun.star.drawing.ControlShape
  * @see com.sun.star.awt.UnoControlModel
  */
@js.native
trait XControlShape extends XShape {
  
  /**
    * returns the control model of this {@link Shape} .
    * @returns if there is already a control model assigned to this {@link ControlShape} , than its returned. Otherwise you get an empty reference.
    */
  var Control: XControlModel = js.native
  
  /**
    * returns the control model of this {@link Shape} .
    * @returns if there is already a control model assigned to this {@link ControlShape} , than its returned. Otherwise you get an empty reference.
    */
  def getControl(): XControlModel = js.native
  
  /**
    * sets the control model for this {@link Shape} .
    * @param xControl this will be the new control model that is displayed with this shape. You may change the model more than once during the lifetime of a {
    */
  def setControl(xControl: XControlModel): Unit = js.native
}
object XControlShape {
  
  @scala.inline
  def apply(
    Control: XControlModel,
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    getControl: () => XControlModel,
    getPosition: () => Point,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setControl: XControlModel => Unit,
    setPosition: Point => Unit,
    setSize: Size => Unit
  ): XControlShape = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction0(getControl), getPosition = js.Any.fromFunction0(getPosition), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControl = js.Any.fromFunction1(setControl), setPosition = js.Any.fromFunction1(setPosition), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XControlShape]
  }
  
  @scala.inline
  implicit class XControlShapeMutableBuilder[Self <: XControlShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: XControlModel): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetControl(value: () => XControlModel): Self = StObject.set(x, "getControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetControl(value: XControlModel => Unit): Self = StObject.set(x, "setControl", js.Any.fromFunction1(value))
  }
}
