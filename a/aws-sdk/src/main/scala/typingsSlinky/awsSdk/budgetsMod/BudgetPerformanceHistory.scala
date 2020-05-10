package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetPerformanceHistory extends js.Object {
  var BudgetName: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.BudgetName] = js.native
  var BudgetType: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.BudgetType] = js.native
  /**
    * A list of amounts of cost or usage that you created budgets for, compared to your actual costs or usage.
    */
  var BudgetedAndActualAmountsList: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.BudgetedAndActualAmountsList] = js.native
  /**
    * The history of the cost filters for a budget during the specified time period.
    */
  var CostFilters: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.CostFilters] = js.native
  /**
    * The history of the cost types for a budget during the specified time period.
    */
  var CostTypes: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.CostTypes] = js.native
  var TimeUnit: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.TimeUnit] = js.native
}

object BudgetPerformanceHistory {
  @scala.inline
  def apply(): BudgetPerformanceHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetPerformanceHistory]
  }
  @scala.inline
  implicit class BudgetPerformanceHistoryOps[Self <: BudgetPerformanceHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBudgetName(value: BudgetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetName")(js.undefined)
        ret
    }
    @scala.inline
    def withBudgetType(value: BudgetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetType")(js.undefined)
        ret
    }
    @scala.inline
    def withBudgetedAndActualAmountsList(value: BudgetedAndActualAmountsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetedAndActualAmountsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgetedAndActualAmountsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetedAndActualAmountsList")(js.undefined)
        ret
    }
    @scala.inline
    def withCostFilters(value: CostFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withCostTypes(value: CostTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeUnit(value: TimeUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeUnit")(js.undefined)
        ret
    }
  }
  
}

