package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBudgetPerformanceHistoryRequest extends js.Object {
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.MaxResults] = js.native
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * Retrieves how often the budget went into an ALARM state for the specified time period.
    */
  var TimePeriod: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.TimePeriod] = js.native
}

object DescribeBudgetPerformanceHistoryRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetPerformanceHistoryRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetPerformanceHistoryRequest]
  }
  @scala.inline
  implicit class DescribeBudgetPerformanceHistoryRequestOps[Self <: DescribeBudgetPerformanceHistoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBudgetName(value: BudgetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BudgetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

