package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmSubscriptionResponse extends js.Object {
  /**
    * The ARN of the created subscription.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.native
}

object ConfirmSubscriptionResponse {
  @scala.inline
  def apply(): ConfirmSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSubscriptionResponse]
  }
  @scala.inline
  implicit class ConfirmSubscriptionResponseOps[Self <: ConfirmSubscriptionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscriptionArn(value: subscriptionARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionArn")(js.undefined)
        ret
    }
  }
  
}

