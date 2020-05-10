package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubscriptionRequest extends js.Object {
  /**
    * When you initally create a subscription, AutoRenew is set to ENABLED. If ENABLED, the subscription will be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. If the UpdateSubscription request does not included a value for AutoRenew, the existing value for AutoRenew remains unchanged.
    */
  var AutoRenew: js.UndefOr[typingsSlinky.awsSdk.shieldMod.AutoRenew] = js.native
}

object UpdateSubscriptionRequest {
  @scala.inline
  def apply(): UpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriptionRequest]
  }
  @scala.inline
  implicit class UpdateSubscriptionRequestOps[Self <: UpdateSubscriptionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRenew(value: AutoRenew): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRenew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRenew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRenew")(js.undefined)
        ret
    }
  }
  
}

