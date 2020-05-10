package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodLimit extends js.Object {
  var period_in_days: Double = js.native
  var remaining: MoneyHash = js.native
  var total: MoneyHash = js.native
}

object PaymentMethodLimit {
  @scala.inline
  def apply(period_in_days: Double, remaining: MoneyHash, total: MoneyHash): PaymentMethodLimit = {
    val __obj = js.Dynamic.literal(period_in_days = period_in_days.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodLimit]
  }
  @scala.inline
  implicit class PaymentMethodLimitOps[Self <: PaymentMethodLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeriod_in_days(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period_in_days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemaining(value: MoneyHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: MoneyHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

