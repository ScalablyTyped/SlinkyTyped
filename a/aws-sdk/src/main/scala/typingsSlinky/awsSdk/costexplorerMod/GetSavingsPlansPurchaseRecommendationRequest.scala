package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansPurchaseRecommendationRequest extends js.Object {
  /**
    * The lookback period used to generate the recommendation.
    */
  var LookbackPeriodInDays: typingsSlinky.awsSdk.costexplorerMod.LookbackPeriodInDays = js.native
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The payment option used to generate these recommendations.
    */
  var PaymentOption: typingsSlinky.awsSdk.costexplorerMod.PaymentOption = js.native
  /**
    * The Savings Plans recommendation type requested.
    */
  var SavingsPlansType: SupportedSavingsPlansType = js.native
  /**
    * The savings plan recommendation term used to generated these recommendations.
    */
  var TermInYears: typingsSlinky.awsSdk.costexplorerMod.TermInYears = js.native
}

object GetSavingsPlansPurchaseRecommendationRequest {
  @scala.inline
  def apply(
    LookbackPeriodInDays: LookbackPeriodInDays,
    PaymentOption: PaymentOption,
    SavingsPlansType: SupportedSavingsPlansType,
    TermInYears: TermInYears
  ): GetSavingsPlansPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(LookbackPeriodInDays = LookbackPeriodInDays.asInstanceOf[js.Any], PaymentOption = PaymentOption.asInstanceOf[js.Any], SavingsPlansType = SavingsPlansType.asInstanceOf[js.Any], TermInYears = TermInYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationRequest]
  }
  @scala.inline
  implicit class GetSavingsPlansPurchaseRecommendationRequestOps[Self <: GetSavingsPlansPurchaseRecommendationRequest] (val x: Self) extends AnyVal {
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
    def withPaymentOption(value: PaymentOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavingsPlansType(value: SupportedSavingsPlansType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTermInYears(value: TermInYears): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TermInYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageToken(value: NextPageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: NonNegativeInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(js.undefined)
        ret
    }
  }
  
}

