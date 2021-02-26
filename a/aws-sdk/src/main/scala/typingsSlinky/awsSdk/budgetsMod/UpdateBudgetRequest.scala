package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBudgetRequest extends StObject {
  
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
  implicit class UpdateBudgetRequestMutableBuilder[Self <: UpdateBudgetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewBudget(value: Budget): Self = StObject.set(x, "NewBudget", value.asInstanceOf[js.Any])
  }
}
