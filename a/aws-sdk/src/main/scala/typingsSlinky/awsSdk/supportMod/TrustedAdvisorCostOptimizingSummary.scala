package typingsSlinky.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedAdvisorCostOptimizingSummary extends StObject {
  
  /**
    * The estimated monthly savings that might be realized if the recommended operations are taken.
    */
  var estimatedMonthlySavings: Double = js.native
  
  /**
    * The estimated percentage of savings that might be realized if the recommended operations are taken.
    */
  var estimatedPercentMonthlySavings: Double = js.native
}
object TrustedAdvisorCostOptimizingSummary {
  
  @scala.inline
  def apply(estimatedMonthlySavings: Double, estimatedPercentMonthlySavings: Double): TrustedAdvisorCostOptimizingSummary = {
    val __obj = js.Dynamic.literal(estimatedMonthlySavings = estimatedMonthlySavings.asInstanceOf[js.Any], estimatedPercentMonthlySavings = estimatedPercentMonthlySavings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCostOptimizingSummary]
  }
  
  @scala.inline
  implicit class TrustedAdvisorCostOptimizingSummaryMutableBuilder[Self <: TrustedAdvisorCostOptimizingSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedMonthlySavings(value: Double): Self = StObject.set(x, "estimatedMonthlySavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedPercentMonthlySavings(value: Double): Self = StObject.set(x, "estimatedPercentMonthlySavings", value.asInstanceOf[js.Any])
  }
}
