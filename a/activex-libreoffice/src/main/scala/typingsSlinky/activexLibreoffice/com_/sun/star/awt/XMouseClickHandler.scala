package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events from the mouse in a certain window.
  * @since OOo 1.1.2
  */
@js.native
trait XMouseClickHandler extends XEventListener {
  
  /**
    * is invoked when a mouse button has been pressed on a window.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def mousePressed(e: MouseEvent): Boolean = js.native
  
  /**
    * is invoked when a mouse button has been released on a window.
    * @returns When `FALSE` is returned the other handlers are called and a following handling of the event by the broadcaster takes place. Otherwise, when `TRU
    */
  def mouseReleased(e: MouseEvent): Boolean = js.native
}
object XMouseClickHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    mousePressed: MouseEvent => Boolean,
    mouseReleased: MouseEvent => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMouseClickHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMouseClickHandler]
  }
  
  @scala.inline
  implicit class XMouseClickHandlerMutableBuilder[Self <: XMouseClickHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMousePressed(value: MouseEvent => Boolean): Self = StObject.set(x, "mousePressed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseReleased(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseReleased", js.Any.fromFunction1(value))
  }
}
