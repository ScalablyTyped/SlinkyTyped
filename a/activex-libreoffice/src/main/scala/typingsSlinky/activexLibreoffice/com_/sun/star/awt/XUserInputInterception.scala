package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to add handlers for key and mouse events. A handler is not a passive listener, it can even consume the event.
  * @since OOo 1.1.2
  */
@js.native
trait XUserInputInterception extends XInterface {
  
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.KeyEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addKeyHandler(xHandler: XKeyHandler): Unit = js.native
  
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.MouseEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addMouseClickHandler(xHandler: XMouseClickHandler): Unit = js.native
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeKeyHandler(xHandler: XKeyHandler): Unit = js.native
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeMouseClickHandler(xHandler: XMouseClickHandler): Unit = js.native
}
object XUserInputInterception {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addMouseClickHandler: XMouseClickHandler => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeMouseClickHandler: XMouseClickHandler => Unit
  ): XUserInputInterception = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler))
    __obj.asInstanceOf[XUserInputInterception]
  }
  
  @scala.inline
  implicit class XUserInputInterceptionMutableBuilder[Self <: XUserInputInterception] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddKeyHandler(value: XKeyHandler => Unit): Self = StObject.set(x, "addKeyHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMouseClickHandler(value: XMouseClickHandler => Unit): Self = StObject.set(x, "addMouseClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveKeyHandler(value: XKeyHandler => Unit): Self = StObject.set(x, "removeKeyHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMouseClickHandler(value: XMouseClickHandler => Unit): Self = StObject.set(x, "removeMouseClickHandler", js.Any.fromFunction1(value))
  }
}
