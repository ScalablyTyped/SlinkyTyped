package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendation extends js.Object {
  /**
    * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this reservation for an entire organization in AWS Organizations.
    */
  var AccountScope: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.AccountScope] = js.native
  /**
    * How many days of previous usage that AWS considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  /**
    * The payment option for the reservation. For example, AllUpfront or NoUpfront.
    */
  var PaymentOption: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.PaymentOption] = js.native
  /**
    * Details about the recommended purchases.
    */
  var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails] = js.native
  /**
    * A summary about the recommended purchase.
    */
  var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary] = js.native
  /**
    * Hardware specifications for the service that you want recommendations for.
    */
  var ServiceSpecification: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ServiceSpecification] = js.native
  /**
    * The term of the reservation that you want recommendations for, in years.
    */
  var TermInYears: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TermInYears] = js.native
}

object ReservationPurchaseRecommendation {
  @scala.inline
  def apply(): ReservationPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendation]
  }
  @scala.inline
  implicit class ReservationPurchaseRecommendationOps[Self <: ReservationPurchaseRecommendation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountScope(value: AccountScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountScope")(js.undefined)
        ret
    }
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
    def withRecommendationDetails(value: ReservationPurchaseRecommendationDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationSummary(value: ReservationPurchaseRecommendationSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceSpecification(value: ServiceSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSpecification")(js.undefined)
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

