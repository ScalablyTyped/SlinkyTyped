package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansUtilizationAggregates extends StObject {
  
  /**
    * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.native
  
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.native
  
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: SavingsPlansUtilization = js.native
}
object SavingsPlansUtilizationAggregates {
  
  @scala.inline
  def apply(Utilization: SavingsPlansUtilization): SavingsPlansUtilizationAggregates = {
    val __obj = js.Dynamic.literal(Utilization = Utilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansUtilizationAggregates]
  }
  
  @scala.inline
  implicit class SavingsPlansUtilizationAggregatesMutableBuilder[Self <: SavingsPlansUtilizationAggregates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmortizedCommitment(value: SavingsPlansAmortizedCommitment): Self = StObject.set(x, "AmortizedCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmortizedCommitmentUndefined: Self = StObject.set(x, "AmortizedCommitment", js.undefined)
    
    @scala.inline
    def setSavings(value: SavingsPlansSavings): Self = StObject.set(x, "Savings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsUndefined: Self = StObject.set(x, "Savings", js.undefined)
    
    @scala.inline
    def setUtilization(value: SavingsPlansUtilization): Self = StObject.set(x, "Utilization", value.asInstanceOf[js.Any])
  }
}
