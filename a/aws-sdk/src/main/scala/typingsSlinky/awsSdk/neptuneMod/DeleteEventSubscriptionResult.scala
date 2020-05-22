package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.EventSubscription] = js.native
}

object DeleteEventSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): DeleteEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventSubscriptionResult]
  }
}

