package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetActionsForBudgetRequest extends StObject {
  
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
  
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[GenericString] = js.native
}
object DescribeBudgetActionsForBudgetRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DescribeBudgetActionsForBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionsForBudgetRequest]
  }
  
  @scala.inline
  implicit class DescribeBudgetActionsForBudgetRequestMutableBuilder[Self <: DescribeBudgetActionsForBudgetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
