package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscriptionResponse extends js.Object {
  /**
    * The AWS Shield Advanced subscription details for an account.
    */
  var Subscription: js.UndefOr[typingsSlinky.awsSdk.shieldMod.Subscription] = js.native
}

object DescribeSubscriptionResponse {
  @scala.inline
  def apply(): DescribeSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscriptionResponse]
  }
  @scala.inline
  implicit class DescribeSubscriptionResponseOps[Self <: DescribeSubscriptionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscription(value: Subscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscription")(js.undefined)
        ret
    }
  }
  
}

