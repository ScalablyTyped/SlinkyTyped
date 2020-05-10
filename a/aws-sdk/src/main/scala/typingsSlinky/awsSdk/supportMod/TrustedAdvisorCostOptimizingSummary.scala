package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorCostOptimizingSummary extends js.Object {
  /**
    * The estimated monthly savings that might be realized if the recommended actions are taken.
    */
  var estimatedMonthlySavings: Double = js.native
  /**
    * The estimated percentage of savings that might be realized if the recommended actions are taken.
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
  implicit class TrustedAdvisorCostOptimizingSummaryOps[Self <: TrustedAdvisorCostOptimizingSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedMonthlySavings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedMonthlySavings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedPercentMonthlySavings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedPercentMonthlySavings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

