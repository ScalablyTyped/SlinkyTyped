package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertionOrderBudget extends StObject {
  
  /** The type of automation used to manage bid and budget for the insertion order. If this field is unspecified in creation, the value defaults to `INSERTION_ORDER_AUTOMATION_TYPE_NONE`. */
  var automationType: js.UndefOr[String] = js.native
  
  /** Required. The list of budget segments. Use a budget segment to specify a specific budget for a given period of time an insertion order is running. */
  var budgetSegments: js.UndefOr[js.Array[InsertionOrderBudgetSegment]] = js.native
  
  /** Required. Immutable. The budget unit specifies whether the budget is currency based or impression based. */
  var budgetUnit: js.UndefOr[String] = js.native
}
object InsertionOrderBudget {
  
  @scala.inline
  def apply(): InsertionOrderBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertionOrderBudget]
  }
  
  @scala.inline
  implicit class InsertionOrderBudgetMutableBuilder[Self <: InsertionOrderBudget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationType(value: String): Self = StObject.set(x, "automationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationTypeUndefined: Self = StObject.set(x, "automationType", js.undefined)
    
    @scala.inline
    def setBudgetSegments(value: js.Array[InsertionOrderBudgetSegment]): Self = StObject.set(x, "budgetSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetSegmentsUndefined: Self = StObject.set(x, "budgetSegments", js.undefined)
    
    @scala.inline
    def setBudgetSegmentsVarargs(value: InsertionOrderBudgetSegment*): Self = StObject.set(x, "budgetSegments", js.Array(value :_*))
    
    @scala.inline
    def setBudgetUnit(value: String): Self = StObject.set(x, "budgetUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetUnitUndefined: Self = StObject.set(x, "budgetUnit", js.undefined)
  }
}
