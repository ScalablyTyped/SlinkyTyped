package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionHistory extends js.Object {
  var balance: String = js.native
  var price: String = js.native
  var status: SubscriptionStatus = js.native
  var subscriptionSource: SubscriptionSource = js.native
}

object SubscriptionHistory {
  @scala.inline
  def apply(balance: String, price: String, status: SubscriptionStatus, subscriptionSource: SubscriptionSource): SubscriptionHistory = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subscriptionSource = subscriptionSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionHistory]
  }
  @scala.inline
  implicit class SubscriptionHistoryOps[Self <: SubscriptionHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SubscriptionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionSource(value: SubscriptionSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

