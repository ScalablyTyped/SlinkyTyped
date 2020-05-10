package typingsSlinky.chartmogulNode.mod.Subscription

import typingsSlinky.chartmogulNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscriptions extends Cursor {
  var customer_uuid: js.UndefOr[String] = js.native
  var subscriptions: js.Array[typingsSlinky.chartmogulNode.mod.Subscription.Subscription] = js.native
}

object Subscriptions {
  @scala.inline
  def apply(subscriptions: js.Array[typingsSlinky.chartmogulNode.mod.Subscription.Subscription]): Subscriptions = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscriptions]
  }
  @scala.inline
  implicit class SubscriptionsOps[Self <: Subscriptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscriptions(value: js.Array[typingsSlinky.chartmogulNode.mod.Subscription.Subscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_uuid")(js.undefined)
        ret
    }
  }
  
}

