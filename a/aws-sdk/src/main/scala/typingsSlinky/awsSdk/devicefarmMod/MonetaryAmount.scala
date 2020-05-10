package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonetaryAmount extends js.Object {
  /**
    * The numerical amount of an offering or transaction.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * The currency code of a monetary amount. For example, USD means U.S. dollars.
    */
  var currencyCode: js.UndefOr[CurrencyCode] = js.native
}

object MonetaryAmount {
  @scala.inline
  def apply(): MonetaryAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonetaryAmount]
  }
  @scala.inline
  implicit class MonetaryAmountOps[Self <: MonetaryAmount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: CurrencyCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
  }
  
}

