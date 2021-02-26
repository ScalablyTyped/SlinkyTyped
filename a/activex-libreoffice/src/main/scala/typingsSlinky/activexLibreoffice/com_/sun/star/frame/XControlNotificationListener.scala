package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Must be implemented by dispatch objects which want to get notifications about control events.
  * @since OOo 2.0.3
  */
@js.native
trait XControlNotificationListener extends XInterface {
  
  /**
    * notifies that a control event has happened
    * @param Event contains the event information
    */
  def controlEvent(Event: ControlEvent): Unit = js.native
}
object XControlNotificationListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    controlEvent: ControlEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XControlNotificationListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), controlEvent = js.Any.fromFunction1(controlEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XControlNotificationListener]
  }
  
  @scala.inline
  implicit class XControlNotificationListenerMutableBuilder[Self <: XControlNotificationListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlEvent(value: ControlEvent => Unit): Self = StObject.set(x, "controlEvent", js.Any.fromFunction1(value))
  }
}
