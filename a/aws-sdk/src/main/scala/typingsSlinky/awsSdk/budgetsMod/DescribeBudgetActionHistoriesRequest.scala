package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetActionHistoriesRequest extends StObject {
  
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    *  A system-generated universally unique identifier (UUID) for the action. 
    */
  var ActionId: typingsSlinky.awsSdk.budgetsMod.ActionId = js.native
  
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
  
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[GenericString] = js.native
  
  var TimePeriod: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.TimePeriod] = js.native
}
object DescribeBudgetActionHistoriesRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ActionId: ActionId, BudgetName: BudgetName): DescribeBudgetActionHistoriesRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ActionId = ActionId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionHistoriesRequest]
  }
  
  @scala.inline
  implicit class DescribeBudgetActionHistoriesRequestMutableBuilder[Self <: DescribeBudgetActionHistoriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionId(value: ActionId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setTimePeriod(value: TimePeriod): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
  }
}
