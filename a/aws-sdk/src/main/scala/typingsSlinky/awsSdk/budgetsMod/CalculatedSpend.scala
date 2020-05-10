package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculatedSpend extends js.Object {
  /**
    * The amount of cost, usage, or RI units that you have used.
    */
  var ActualSpend: Spend = js.native
  /**
    * The amount of cost, usage, or RI units that you are forecasted to use.
    */
  var ForecastedSpend: js.UndefOr[Spend] = js.native
}

object CalculatedSpend {
  @scala.inline
  def apply(ActualSpend: Spend): CalculatedSpend = {
    val __obj = js.Dynamic.literal(ActualSpend = ActualSpend.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedSpend]
  }
  @scala.inline
  implicit class CalculatedSpendOps[Self <: CalculatedSpend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualSpend(value: Spend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualSpend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForecastedSpend(value: Spend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastedSpend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastedSpend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastedSpend")(js.undefined)
        ret
    }
  }
  
}

