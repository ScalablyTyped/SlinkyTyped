package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansPurchaseRecommendation extends js.Object {
  /**
    * The lookback period in days, used to generate the recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  /**
    * The payment option used to generate the recommendation.
    */
  var PaymentOption: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.PaymentOption] = js.native
  /**
    * Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible workloads.
    */
  var SavingsPlansPurchaseRecommendationDetails: js.UndefOr[SavingsPlansPurchaseRecommendationDetailList] = js.native
  /**
    * Summary metrics for your Savings Plans Recommendations. 
    */
  var SavingsPlansPurchaseRecommendationSummary: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.SavingsPlansPurchaseRecommendationSummary] = js.native
  /**
    * The requested Savings Plans recommendation type.
    */
  var SavingsPlansType: js.UndefOr[SupportedSavingsPlansType] = js.native
  /**
    * The Savings Plans recommendation term in years, used to generate the recommendation.
    */
  var TermInYears: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TermInYears] = js.native
}

object SavingsPlansPurchaseRecommendation {
  @scala.inline
  def apply(): SavingsPlansPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendation]
  }
  @scala.inline
  implicit class SavingsPlansPurchaseRecommendationOps[Self <: SavingsPlansPurchaseRecommendation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookbackPeriodInDays(value: LookbackPeriodInDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookbackPeriodInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookbackPeriodInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookbackPeriodInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentOption(value: PaymentOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlansPurchaseRecommendationDetails(value: SavingsPlansPurchaseRecommendationDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansPurchaseRecommendationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlansPurchaseRecommendationDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansPurchaseRecommendationDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlansPurchaseRecommendationSummary(value: SavingsPlansPurchaseRecommendationSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansPurchaseRecommendationSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlansPurchaseRecommendationSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansPurchaseRecommendationSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlansType(value: SupportedSavingsPlansType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlansType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansType")(js.undefined)
        ret
    }
    @scala.inline
    def withTermInYears(value: TermInYears): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TermInYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermInYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TermInYears")(js.undefined)
        ret
    }
  }
  
}

