package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotificationSubscriptionResponse extends js.Object {
  /**
    * The subscription.
    */
  var Subscription: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.Subscription] = js.native
}

object CreateNotificationSubscriptionResponse {
  @scala.inline
  def apply(): CreateNotificationSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationSubscriptionResponse]
  }
  @scala.inline
  implicit class CreateNotificationSubscriptionResponseOps[Self <: CreateNotificationSubscriptionResponse] (val x: Self) extends AnyVal {
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

