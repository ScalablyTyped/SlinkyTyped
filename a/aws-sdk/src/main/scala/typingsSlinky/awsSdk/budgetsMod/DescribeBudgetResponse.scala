package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetResponse extends js.Object {
  /**
    * The description of the budget.
    */
  var Budget: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.Budget] = js.native
}

object DescribeBudgetResponse {
  @scala.inline
  def apply(): DescribeBudgetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetResponse]
  }
  @scala.inline
  implicit class DescribeBudgetResponseOps[Self <: DescribeBudgetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBudget(value: Budget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budget")(js.undefined)
        ret
    }
  }
  
}

