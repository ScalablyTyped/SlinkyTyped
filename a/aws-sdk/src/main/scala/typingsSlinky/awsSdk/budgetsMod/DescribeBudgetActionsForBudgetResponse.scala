package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBudgetActionsForBudgetResponse extends StObject {
  
  /**
    *  A list of the budget action resources information. 
    */
  var Actions: typingsSlinky.awsSdk.budgetsMod.Actions = js.native
  
  var NextToken: js.UndefOr[GenericString] = js.native
}
object DescribeBudgetActionsForBudgetResponse {
  
  @scala.inline
  def apply(Actions: Actions): DescribeBudgetActionsForBudgetResponse = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBudgetActionsForBudgetResponse]
  }
  
  @scala.inline
  implicit class DescribeBudgetActionsForBudgetResponseMutableBuilder[Self <: DescribeBudgetActionsForBudgetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: Actions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
