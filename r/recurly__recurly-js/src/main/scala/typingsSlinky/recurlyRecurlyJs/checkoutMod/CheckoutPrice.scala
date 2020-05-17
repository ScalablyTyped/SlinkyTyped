package typingsSlinky.recurlyRecurlyJs.checkoutMod

import typingsSlinky.recurlyRecurlyJs.anon.Adjustments
import typingsSlinky.recurlyRecurlyJs.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckoutPrice extends js.Object {
  var currency: Code = js.native
  var next: Adjustments = js.native
  var now: Adjustments = js.native
  var taxes: js.Array[CheckoutPricingStateTax] = js.native
}

object CheckoutPrice {
  @scala.inline
  def apply(currency: Code, next: Adjustments, now: Adjustments, taxes: js.Array[CheckoutPricingStateTax]): CheckoutPrice = {
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
    def withCurrency(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: Adjustments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: Adjustments): Self = {
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

