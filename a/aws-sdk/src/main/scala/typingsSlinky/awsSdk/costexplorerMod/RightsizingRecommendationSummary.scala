package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsizingRecommendationSummary extends js.Object {
  /**
    *  Estimated total savings resulting from modifications, on a monthly basis.
    */
  var EstimatedTotalMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    *  The currency code that Amazon Web Services used to calculate the savings.
    */
  var SavingsCurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    *  Savings percentage based on the recommended modifications, relative to the total On Demand costs associated with these instances.
    */
  var SavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    *  Total number of instance recommendations.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.native
}

object RightsizingRecommendationSummary {
  @scala.inline
  def apply(): RightsizingRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendationSummary]
  }
  @scala.inline
  implicit class RightsizingRecommendationSummaryOps[Self <: RightsizingRecommendationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedTotalMonthlySavingsAmount(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedTotalMonthlySavingsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedTotalMonthlySavingsAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedTotalMonthlySavingsAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsCurrencyCode(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsCurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsCurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRecommendationCount(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRecommendationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRecommendationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRecommendationCount")(js.undefined)
        ret
    }
  }
  
}

