package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to update.
    */
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The budget that you want to update your budget to.
    */
  var NewBudget: Budget = js.native
}

object UpdateBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, NewBudget: Budget): UpdateBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], NewBudget = NewBudget.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBudgetRequest]
  }
  @scala.inline
  implicit class UpdateBudgetRequestOps[Self <: UpdateBudgetRequest] (val x: Self) extends AnyVal {
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
    def withNewBudget(value: Budget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewBudget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

