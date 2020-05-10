package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubscriptionStateResponse extends js.Object {
  /**
    * The status of the subscription.
    */
  var SubscriptionState: typingsSlinky.awsSdk.shieldMod.SubscriptionState = js.native
}

object GetSubscriptionStateResponse {
  @scala.inline
  def apply(SubscriptionState: SubscriptionState): GetSubscriptionStateResponse = {
    val __obj = js.Dynamic.literal(SubscriptionState = SubscriptionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionStateResponse]
  }
  @scala.inline
  implicit class GetSubscriptionStateResponseOps[Self <: GetSubscriptionStateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscriptionState(value: SubscriptionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

