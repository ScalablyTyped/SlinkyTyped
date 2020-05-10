package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEventSubscriptionResponse extends js.Object {
  /**
    * The modified event subscription.
    */
  var EventSubscription: js.UndefOr[typingsSlinky.awsSdk.dmsMod.EventSubscription] = js.native
}

object ModifyEventSubscriptionResponse {
  @scala.inline
  def apply(): ModifyEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEventSubscriptionResponse]
  }
  @scala.inline
  implicit class ModifyEventSubscriptionResponseOps[Self <: ModifyEventSubscriptionResponse] (val x: Self) extends AnyVal {
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

