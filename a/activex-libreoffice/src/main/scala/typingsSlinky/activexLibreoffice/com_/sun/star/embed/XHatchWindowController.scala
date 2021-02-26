package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window owner is responsible to handle resize/move requests sent by the window. It is also responsible to validate tracking rectangle size.
  */
@js.native
trait XHatchWindowController extends XInterface {
  
  def activated(): Unit = js.native
  
  /**
    * returns the closest valid rectangle to the provided one.
    * @param aRect a new selected position and size of the tracking rectangle
    * @returns the closest valid position and size to the provided one
    */
  def calcAdjustedRectangle(aRect: Rectangle): Rectangle = js.native
  
  def deactivated(): Unit = js.native
  
  /**
    * requests window owner to resize/move the window.
    * @param aRect the new requested position and size of the window
    */
  def requestPositioning(aRect: Rectangle): Unit = js.native
}
object XHatchWindowController {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    activated: () => Unit,
    calcAdjustedRectangle: Rectangle => Rectangle,
    deactivated: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestPositioning: Rectangle => Unit
  ): XHatchWindowController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activated = js.Any.fromFunction0(activated), calcAdjustedRectangle = js.Any.fromFunction1(calcAdjustedRectangle), deactivated = js.Any.fromFunction0(deactivated), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestPositioning = js.Any.fromFunction1(requestPositioning))
    __obj.asInstanceOf[XHatchWindowController]
  }
  
  @scala.inline
  implicit class XHatchWindowControllerMutableBuilder[Self <: XHatchWindowController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivated(value: () => Unit): Self = StObject.set(x, "activated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCalcAdjustedRectangle(value: Rectangle => Rectangle): Self = StObject.set(x, "calcAdjustedRectangle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeactivated(value: () => Unit): Self = StObject.set(x, "deactivated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestPositioning(value: Rectangle => Unit): Self = StObject.set(x, "requestPositioning", js.Any.fromFunction1(value))
  }
}
