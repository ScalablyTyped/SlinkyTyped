package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBudgetActionResponse extends js.Object {
  
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    *  A system-generated universally unique identifier (UUID) for the action. 
    */
  var ActionId: typingsSlinky.awsSdk.budgetsMod.ActionId = js.native
  
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
}
object CreateBudgetActionResponse {
  
  @scala.inline
  def apply(AccountId: AccountId, ActionId: ActionId, BudgetName: BudgetName): CreateBudgetActionResponse = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ActionId = ActionId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBudgetActionResponse]
  }
  
  @scala.inline
  implicit class CreateBudgetActionResponseOps[Self <: CreateBudgetActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionId(value: ActionId): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
  }
}
