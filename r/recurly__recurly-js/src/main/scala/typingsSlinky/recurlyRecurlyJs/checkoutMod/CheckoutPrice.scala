package typingsSlinky.recurlyRecurlyJs.checkoutMod

import typingsSlinky.recurlyRecurlyJs.AnonAdjustments
import typingsSlinky.recurlyRecurlyJs.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckoutPrice extends js.Object {
  var currency: AnonCode = js.native
  var next: AnonAdjustments = js.native
  var now: AnonAdjustments = js.native
  var taxes: js.Array[CheckoutPricingStateTax] = js.native
}

object CheckoutPrice {
  @scala.inline
  def apply(
    currency: AnonCode,
    next: AnonAdjustments,
    now: AnonAdjustments,
    taxes: js.Array[CheckoutPricingStateTax]
  ): CheckoutPrice = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutPrice]
  }
  @scala.inline
  implicit class CheckoutPriceOps[Self <: CheckoutPrice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: AnonAdjustments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: AnonAdjustments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxes(value: js.Array[CheckoutPricingStateTax]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

