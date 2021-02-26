package typingsSlinky.messenger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  /**
    * If the message is associated with an ajax request or is counting down to retry, cancel it.
    */
  def cancel(): Unit = js.native
  
  /**
    * Hide the message, if it's hidden.
    */
  def hide(): Unit = js.native
  
  /**
    * Show the message, if it's hidden.
    */
  def show(): Unit = js.native
  
  /**
    * Update the message with the provided options.
    */
  def update(options: MessageOptions): Unit = js.native
}
object Message {
  
  @scala.inline
  def apply(cancel: () => Unit, hide: () => Unit, show: () => Unit, update: MessageOptions => Unit): Message = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: MessageOptions => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
