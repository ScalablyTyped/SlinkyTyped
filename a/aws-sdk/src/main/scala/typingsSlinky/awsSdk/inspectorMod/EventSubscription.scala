package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSubscription extends StObject {
  
  /**
    * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
    */
  var event: InspectorEvent = js.native
  
  /**
    * The time at which SubscribeToEvent is called.
    */
  var subscribedAt: js.Date = js.native
}
object EventSubscription {
  
  @scala.inline
  def apply(event: InspectorEvent, subscribedAt: js.Date): EventSubscription = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], subscribedAt = subscribedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSubscription]
  }
  
  @scala.inline
  implicit class EventSubscriptionMutableBuilder[Self <: EventSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: InspectorEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedAt(value: js.Date): Self = StObject.set(x, "subscribedAt", value.asInstanceOf[js.Any])
  }
}
