package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetedAndActualAmounts extends js.Object {
  /**
    * Your actual costs or usage for a budget period.
    */
  var ActualAmount: js.UndefOr[Spend] = js.native
  /**
    * The amount of cost or usage that you created the budget for.
    */
  var BudgetedAmount: js.UndefOr[Spend] = js.native
  /**
    * The time period covered by this budget comparison.
    */
  var TimePeriod: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.TimePeriod] = js.native
}

object BudgetedAndActualAmounts {
  @scala.inline
  def apply(): BudgetedAndActualAmounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetedAndActualAmounts]
  }
  @scala.inline
  implicit class BudgetedAndActualAmountsOps[Self <: BudgetedAndActualAmounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualAmount(value: Spend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withBudgetedAmount(value: Spend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetedAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgetedAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetedAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePeriod(value: TimePeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(js.undefined)
        ret
    }
  }
  
}

