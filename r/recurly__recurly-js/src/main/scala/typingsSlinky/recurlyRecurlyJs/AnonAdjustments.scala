package typingsSlinky.recurlyRecurlyJs

import typingsSlinky.recurlyRecurlyJs.checkoutMod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdjustments extends js.Object {
  var adjustments: String = js.native
  var discount: String = js.native
  var giftCard: String = js.native
  var items: js.Array[Item] = js.native
  var subscriptions: String = js.native
  var subtotal: String = js.native
  var taxes: String = js.native
  var total: String = js.native
}

object AnonAdjustments {
  @scala.inline
  def apply(
    adjustments: String,
    discount: String,
    giftCard: String,
    items: js.Array[Item],
    subscriptions: String,
    subtotal: String,
    taxes: String,
    total: String
  ): AnonAdjustments = {
    val __obj = js.Dynamic.literal(adjustments = adjustments.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], giftCard = giftCard.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdjustments]
  }
  @scala.inline
  implicit class AnonAdjustmentsOps[Self <: AnonAdjustments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGiftCard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giftCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

