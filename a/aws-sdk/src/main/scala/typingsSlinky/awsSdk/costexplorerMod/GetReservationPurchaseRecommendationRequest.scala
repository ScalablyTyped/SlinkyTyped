package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservationPurchaseRecommendationRequest extends js.Object {
  /**
    * The account ID that is associated with the recommendation. 
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    * The account scope that you want recommendations for. PAYER means that AWS includes the master account and any member accounts when it calculates its recommendations. LINKED means that AWS includes only member accounts when it calculates its recommendations. Valid values are PAYER and LINKED.
    */
  var AccountScope: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.AccountScope] = js.native
  /**
    * The number of previous days that you want AWS to consider when it calculates your recommendations.
    */
  var LookbackPeriodInDays: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.LookbackPeriodInDays] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The reservation purchase option that you want recommendations for.
    */
  var PaymentOption: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.PaymentOption] = js.native
  /**
    * The specific service that you want recommendations for.
    */
  var Service: GenericString = js.native
  /**
    * The hardware specifications for the service instances that you want recommendations for, such as standard or convertible Amazon EC2 instances.
    */
  var ServiceSpecification: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ServiceSpecification] = js.native
  /**
    * The reservation term that you want recommendations for.
    */
  var TermInYears: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TermInYears] = js.native
}

object GetReservationPurchaseRecommendationRequest {
  @scala.inline
  def apply(Service: GenericString): GetReservationPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationPurchaseRecommendationRequest]
  }
  @scala.inline
  implicit class GetReservationPurchaseRecommendationRequestOps[Self <: GetReservationPurchaseRecommendationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(value.asInstanceOf[js.Any])
        ret
    }
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

