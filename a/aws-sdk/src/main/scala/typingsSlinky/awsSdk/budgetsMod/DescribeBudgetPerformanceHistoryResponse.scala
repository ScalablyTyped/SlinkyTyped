package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetPerformanceHistoryResponse extends js.Object {
  /**
    * The history of how often the budget has gone into an ALARM state. For DAILY budgets, the history saves the state of the budget for the last 60 days. For MONTHLY budgets, the history saves the state of the budget for the current month plus the last 12 months. For QUARTERLY budgets, the history saves the state of the budget for the last four quarters.
    */
  var BudgetPerformanceHistory: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.BudgetPerformanceHistory] = js.native
  var NextToken: js.UndefOr[GenericString] = js.native
}

object DescribeBudgetPerformanceHistoryResponse {
  @scala.inline
  def apply(): DescribeBudgetPerformanceHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryResponse]
  }
  @scala.inline
  implicit class DescribeBudgetPerformanceHistoryResponseOps[Self <: DescribeBudgetPerformanceHistoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBudgetPerformanceHistory(value: BudgetPerformanceHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetPerformanceHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgetPerformanceHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetPerformanceHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

