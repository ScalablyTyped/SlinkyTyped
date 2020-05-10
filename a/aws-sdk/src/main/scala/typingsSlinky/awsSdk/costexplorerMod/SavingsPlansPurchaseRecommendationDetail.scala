package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendationDetail extends js.Object {
  /**
    * The AccountID the recommendation is generated for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentAverageHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentMaximumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
    */
  var CurrentMinimumHourlyOnDemandSpend: js.UndefOr[GenericString] = js.native
  /**
    * The estimated utilization of the recommended Savings Plans.
    */
  var EstimatedAverageUtilization: js.UndefOr[GenericString] = js.native
  /**
    * The estimated monthly savings amount, based on the recommended Savings Plans.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length of the lookback period.
    */
  var EstimatedOnDemandCost: js.UndefOr[GenericString] = js.native
  /**
    *  The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected time period and the Savings Plans you own. 
    */
  var EstimatedOnDemandCostWithCurrentCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as estimatedSavingsAmount/ estimatedSPCost*100.
    */
  var EstimatedROI: js.UndefOr[GenericString] = js.native
  /**
    * The cost of the recommended Savings Plans over the length of the lookback period.
    */
  var EstimatedSPCost: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings amount based on the recommended Savings Plans over the length of the lookback period.
    */
  var EstimatedSavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The estimated savings percentage relative to the total cost of applicable On-Demand usage over the lookback period.
    */
  var EstimatedSavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    * The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage during the lookback period.
    */
  var HourlyCommitmentToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * Details for your recommended Savings Plans.
    */
  var SavingsPlansDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.SavingsPlansDetails] = js.native
  /**
    * The upfront cost of the recommended Savings Plans, based on the selected payment option.
    */
  var UpfrontCost: js.UndefOr[GenericString] = js.native
}

object SavingsPlansPurchaseRecommendationDetail {
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationDetail]
  }
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationDetailOps[Self <: SavingsPlansPurchaseRecommendationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
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
    def withCurrentAverageHourlyOnDemandSpend(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentAverageHourlyOnDemandSpend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentAverageHourlyOnDemandSpend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentAverageHourlyOnDemandSpend")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentMaximumHourlyOnDemandSpend(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentMaximumHourlyOnDemandSpend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMaximumHourlyOnDemandSpend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentMaximumHourlyOnDemandSpend")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentMinimumHourlyOnDemandSpend(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentMinimumHourlyOnDemandSpend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMinimumHourlyOnDemandSpend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentMinimumHourlyOnDemandSpend")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedAverageUtilization(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedAverageUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedAverageUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedAverageUtilization")(js.undefined)
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
    def withEstimatedOnDemandCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedOnDemandCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedOnDemandCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedOnDemandCost")(js.undefined)
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
    def withEstimatedSPCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedSPCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedSPCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedSPCost")(js.undefined)
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
    def withSavingsPlansDetails(value: SavingsPlansDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlansDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withUpfrontCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpfrontCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpfrontCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpfrontCost")(js.undefined)
        ret
    }
  }
  
}

