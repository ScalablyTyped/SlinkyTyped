package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BudgetedAndActualAmounts extends StObject {
  
  /**
    * Your actual costs or usage for a budget period.
    */
  var ActualAmount: js.UndefOr[Spend] = js.native
  
  /**
    * The amount of cost or usage that you created the budget for.
    */
  var BudgetedAmount: js.UndefOr[Spend] = js.native
  
  /**
    * The time period covered by this budget comparison.
    */
  var TimePeriod: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.TimePeriod] = js.native
}
object BudgetedAndActualAmounts {
  
  @scala.inline
  def apply(): BudgetedAndActualAmounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetedAndActualAmounts]
  }
  
  @scala.inline
  implicit class BudgetedAndActualAmountsMutableBuilder[Self <: BudgetedAndActualAmounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualAmount(value: Spend): Self = StObject.set(x, "ActualAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualAmountUndefined: Self = StObject.set(x, "ActualAmount", js.undefined)
    
    @scala.inline
    def setBudgetedAmount(value: Spend): Self = StObject.set(x, "BudgetedAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetedAmountUndefined: Self = StObject.set(x, "BudgetedAmount", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: TimePeriod): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
  }
}
