package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventSubscriptionResponse extends js.Object {
  /**
    * The event subscription that was created.
    */
  var EventSubscription: js.UndefOr[typingsSlinky.awsSdk.dmsMod.EventSubscription] = js.native
}

object CreateEventSubscriptionResponse {
  @scala.inline
  def apply(): CreateEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventSubscriptionResponse]
  }
  @scala.inline
  implicit class CreateEventSubscriptionResponseOps[Self <: CreateEventSubscriptionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSubscription(value: EventSubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSubscription")(js.undefined)
        ret
    }
  }
  
}

