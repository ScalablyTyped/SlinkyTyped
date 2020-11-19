package typingsSlinky.activexLibreoffice.com_.sun.star.accessibility

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register a component as a listener, which is called whenever an accessibility event occurs.
  * @see XAccessibleEventBroadcaster
  * @since OOo 1.1.2
  */
@js.native
trait XAccessibleEventListener extends XEventListener {
  
  /** is called whenever a accessible event (see {@link AccessibleEventObject} ) occurs. */
  def notifyEvent(aEvent: AccessibleEventObject): Unit = js.native
}
object XAccessibleEventListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyEvent: AccessibleEventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyEvent = js.Any.fromFunction1(notifyEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleEventListener]
  }
  
  @scala.inline
  implicit class XAccessibleEventListenerOps[Self <: XAccessibleEventListener] (val x: Self) extends AnyVal {
    
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
    def setNotifyEvent(value: AccessibleEventObject => Unit): Self = this.set("notifyEvent", js.Any.fromFunction1(value))
  }
}
