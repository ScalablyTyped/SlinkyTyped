package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodLimits extends js.Object {
  var buy: js.Array[PaymentMethodLimit] = js.native
  var deposit: js.Array[PaymentMethodLimit] = js.native
  var instant_buy: js.Array[PaymentMethodLimit] = js.native
  var sell: js.Array[PaymentMethodLimit] = js.native
}

object PaymentMethodLimits {
  @scala.inline
  def apply(
    buy: js.Array[PaymentMethodLimit],
    deposit: js.Array[PaymentMethodLimit],
    instant_buy: js.Array[PaymentMethodLimit],
    sell: js.Array[PaymentMethodLimit]
  ): PaymentMethodLimits = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], deposit = deposit.asInstanceOf[js.Any], instant_buy = instant_buy.asInstanceOf[js.Any], sell = sell.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodLimits]
  }
  @scala.inline
  implicit class PaymentMethodLimitsOps[Self <: PaymentMethodLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuy(value: js.Array[PaymentMethodLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeposit(value: js.Array[PaymentMethodLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deposit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstant_buy(value: js.Array[PaymentMethodLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instant_buy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSell(value: js.Array[PaymentMethodLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sell")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

