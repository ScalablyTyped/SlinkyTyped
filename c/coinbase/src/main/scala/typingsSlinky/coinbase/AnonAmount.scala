package typingsSlinky.coinbase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmount extends js.Object {
  /**
    * Amount as floating-point in a string
    */
  var amount: String = js.native
  /**
    * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
    */
  var base: String = js.native
  /**
    * Currency e.g. "EUR" (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
}

object AnonAmount {
  @scala.inline
  def apply(amount: String, base: String, currency: String): AnonAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmount]
  }
  @scala.inline
  implicit class AnonAmountOps[Self <: AnonAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

