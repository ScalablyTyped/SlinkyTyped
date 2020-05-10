package typingsSlinky.recurlyRecurlyJs.giftCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GiftCardResult extends js.Object {
  var currency: String = js.native
  var unit_amount: Double = js.native
}

object GiftCardResult {
  @scala.inline
  def apply(currency: String, unit_amount: Double): GiftCardResult = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], unit_amount = unit_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiftCardResult]
  }
  @scala.inline
  implicit class GiftCardResultOps[Self <: GiftCardResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_amount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

