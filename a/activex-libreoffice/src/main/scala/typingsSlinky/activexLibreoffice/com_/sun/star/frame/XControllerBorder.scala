package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to retrieve information about controller's border. */
@js.native
trait XControllerBorder extends XInterface {
  
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  val Border: BorderWidths = js.native
  
  /** adds the specified listener to receive events about controller's border resizing. */
  def addBorderResizeListener(xListener: XBorderResizeListener): Unit = js.native
  
  /**
    * allows to get current border sizes of the document.
    * @returns {@link BorderWidths} representing the sizes of border
    */
  def getBorder(): BorderWidths = js.native
  
  /**
    * allows to get suggestion for resizing of object area surrounded by the border.
    *
    * If the view is going to be resized/moved this method can be used to get suggested object area. Pixels are used as units.
    * @returns suggestion for the resizing
    */
  def queryBorderedArea(aPreliminaryRectangle: Rectangle): Rectangle = js.native
  
  /** removes the specified listener. */
  def removeBorderResizeListener(xListener: XBorderResizeListener): Unit = js.native
}
object XControllerBorder {
  
  @scala.inline
  def apply(
    Border: BorderWidths,
    acquire: () => Unit,
    addBorderResizeListener: XBorderResizeListener => Unit,
    getBorder: () => BorderWidths,
    queryBorderedArea: Rectangle => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeBorderResizeListener: XBorderResizeListener => Unit
  ): XControllerBorder = {
    val __obj = js.Dynamic.literal(Border = Border.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addBorderResizeListener = js.Any.fromFunction1(addBorderResizeListener), getBorder = js.Any.fromFunction0(getBorder), queryBorderedArea = js.Any.fromFunction1(queryBorderedArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBorderResizeListener = js.Any.fromFunction1(removeBorderResizeListener))
    __obj.asInstanceOf[XControllerBorder]
  }
  
  @scala.inline
  implicit class XControllerBorderMutableBuilder[Self <: XControllerBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBorderResizeListener(value: XBorderResizeListener => Unit): Self = StObject.set(x, "addBorderResizeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorder(value: BorderWidths): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBorder(value: () => BorderWidths): Self = StObject.set(x, "getBorder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryBorderedArea(value: Rectangle => Rectangle): Self = StObject.set(x, "queryBorderedArea", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveBorderResizeListener(value: XBorderResizeListener => Unit): Self = StObject.set(x, "removeBorderResizeListener", js.Any.fromFunction1(value))
  }
}
