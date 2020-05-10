package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendationSummary extends js.Object {
  /**
    * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * The current total on demand spend of the applicable usage types over the lookback period.
    */
  var CurrentOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The recommended Savings Plans cost on a daily (24 hourly) basis.
    */
  var DailyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * The estimated monthly savings amount, based on the recommended Savings Plans purchase.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    *  The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected time period and the Savings Plans you own. 
    */
  var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The estimated return on investment based on the recommended Savings Plans and estimated savings.
    */
  var EstimatedROI: js.UndefOr[GenericString] = js.native
  /**
    * The estimated total savings over the lookback period, based on the purchase of the recommended Savings Plans.
    */
  var EstimatedSavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is calculated as estimatedSavingsAmount/ CurrentOnDemandSpend*100.
    */
  var EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    * The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the cost of Savings Plans during this term, and the remaining On-Demand usage.
    */
  var EstimatedTotalCost: js.UndefOr[GenericString] = js.native
  /**
    * The recommended hourly commitment based on the recommendation parameters.
    */
  var HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * The aggregate number of Savings Plans recommendations that exist for your account.
    */
  var TotalRecommendationCount: js.UndefOr[GenericString] = js.native
}

object SavingsPlansPurchaseRecommendationSummary {
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationSummary]
  }
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationSummaryOps[Self <: SavingsPlansPurchaseRecommendationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentOnDemandSpend(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentOnDemandSpend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentOnDemandSpend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentOnDemandSpend")(js.undefined)
        ret
    }
    @scala.inline
    def withDailyCommitmentToPurchase(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyCommitmentToPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyCommitmentToPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DailyCommitmentToPurchase")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedMonthlySavingsAmount(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlySavingsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedMonthlySavingsAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlySavingsAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedOnDemandCostWithCurrentCommitment(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedOnDemandCostWithCurrentCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedOnDemandCostWithCurrentCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedOnDemandCostWithCurrentCommitment")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedROI(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedROI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedROI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedROI")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedSavingsAmount(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedSavingsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedSavingsAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedSavingsAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedSavingsPercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedSavingsPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedSavingsPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedSavingsPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedTotalCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedTotalCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedTotalCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedTotalCost")(js.undefined)
        ret
    }
    @scala.inline
    def withHourlyCommitmentToPurchase(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyCommitmentToPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourlyCommitmentToPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyCommitmentToPurchase")(js.undefined)
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

