package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XController2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to be notified of events happening in an {@link OfficeDocument} , and to cause notification of such events.
  *
  * This interface is the successor of the {@link XEventBroadcaster} interface, which should not be used anymore.
  * @see DocumentEvent
  * @since OOo 3.1
  */
@js.native
trait XDocumentEventBroadcaster extends js.Object {
  
  /**
    * registers a listener which is notified about document events
    * @param Listener the listener to register. The behavior of the method is undefined this listener is `NULL` .
    */
  def addDocumentEventListener(Listener: XDocumentEventListener): Unit = js.native
  
  /**
    * causes the broadcaster to notify all registered listeners of the given event
    *
    * The method will create a {@link DocumentEvent} instance with the given parameters, and fill in the `Source` member (denoting the broadcaster) as
    * appropriate.
    *
    * Whether the actual notification happens synchronously or asynchronously is up to the implementor of this method. However, implementations are
    * encouraged to specify this, for the list of supported event types, in their service contract.
    *
    * Implementations might also decide to limit the list of allowed events (means event names) at their own discretion. Again, in this case they're
    * encouraged to document this in their service contract.
    * @param EventName the name of the event to be notified.
    * @param ViewController the view/controller which the event applies to. May be `NULL`
    * @param Supplement supplemental information related to the event.
    * @throws com::sun::star::lang::IllegalArgumentException if EventName is empty, or if EventName is not supported by the document implementation.
    * @throws com::sun::star::lang::NoSupportException if the broadcaster implementation does not supported broadcasting events induced externally. This is usu
    */
  def notifyDocumentEvent(EventName: String, ViewController: XController2, Supplement: js.Any): Unit = js.native
  
  /**
    * revokes a listener which has previously been registered to be notified about document events.
    * @param Listener the listener to revoke. The behavior of the method is undefined this listener is `NULL` .
    */
  def removeDocumentEventListener(Listener: XDocumentEventListener): Unit = js.native
}
object XDocumentEventBroadcaster {
  
  @scala.inline
  def apply(
    addDocumentEventListener: XDocumentEventListener => Unit,
    notifyDocumentEvent: (String, XController2, js.Any) => Unit,
    removeDocumentEventListener: XDocumentEventListener => Unit
  ): XDocumentEventBroadcaster = {
    val __obj = js.Dynamic.literal(addDocumentEventListener = js.Any.fromFunction1(addDocumentEventListener), notifyDocumentEvent = js.Any.fromFunction3(notifyDocumentEvent), removeDocumentEventListener = js.Any.fromFunction1(removeDocumentEventListener))
    __obj.asInstanceOf[XDocumentEventBroadcaster]
  }
  
  @scala.inline
  implicit class XDocumentEventBroadcasterOps[Self <: XDocumentEventBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddDocumentEventListener(value: XDocumentEventListener => Unit): Self = this.set("addDocumentEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyDocumentEvent(value: (String, XController2, js.Any) => Unit): Self = this.set("notifyDocumentEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveDocumentEventListener(value: XDocumentEventListener => Unit): Self = this.set("removeDocumentEventListener", js.Any.fromFunction1(value))
  }
}
