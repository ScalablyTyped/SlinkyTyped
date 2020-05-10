package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSubscription extends js.Object {
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
  implicit class EventSubscriptionOps[Self <: EventSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: InspectorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

