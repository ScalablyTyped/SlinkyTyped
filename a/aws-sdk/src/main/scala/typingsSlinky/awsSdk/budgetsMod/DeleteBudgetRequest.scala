package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to delete.
    */
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget that you want to delete.
    */
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
}

object DeleteBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DeleteBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBudgetRequest]
  }
  @scala.inline
  implicit class DeleteBudgetRequestOps[Self <: DeleteBudgetRequest] (val x: Self) extends AnyVal {
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
  }
  
}

