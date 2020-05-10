package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetsResponse extends js.Object {
  /**
    * A list of budgets.
    */
  var Budgets: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.Budgets] = js.native
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object DescribeBudgetsResponse {
  @scala.inline
  def apply(): DescribeBudgetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBudgetsResponse]
  }
  @scala.inline
  implicit class DescribeBudgetsResponseOps[Self <: DescribeBudgetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBudgets(value: Budgets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBudgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Budgets")(js.undefined)
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

