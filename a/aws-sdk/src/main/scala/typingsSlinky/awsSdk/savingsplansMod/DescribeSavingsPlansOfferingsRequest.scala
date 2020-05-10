package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlansOfferingsRequest extends js.Object {
  /**
    * The currencies.
    */
  var currencies: js.UndefOr[CurrencyList] = js.native
  /**
    * The descriptions.
    */
  var descriptions: js.UndefOr[SavingsPlanDescriptionsList] = js.native
  /**
    * The durations, in seconds.
    */
  var durations: js.UndefOr[DurationsList] = js.native
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanOfferingFiltersList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The IDs of the offerings.
    */
  var offeringIds: js.UndefOr[UUIDs] = js.native
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operations: js.UndefOr[SavingsPlanOperationList] = js.native
  /**
    * The payment options.
    */
  var paymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.native
  /**
    * The plan type.
    */
  var planTypes: js.UndefOr[SavingsPlanTypeList] = js.native
  /**
    * The product type.
    */
  var productType: js.UndefOr[SavingsPlanProductType] = js.native
  /**
    * The services.
    */
  var serviceCodes: js.UndefOr[SavingsPlanServiceCodeList] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageTypes: js.UndefOr[SavingsPlanUsageTypeList] = js.native
}

object DescribeSavingsPlansOfferingsRequest {
  @scala.inline
  def apply(): DescribeSavingsPlansOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingsRequest]
  }
  @scala.inline
  implicit class DescribeSavingsPlansOfferingsRequestOps[Self <: DescribeSavingsPlansOfferingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencies(value: CurrencyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptions(value: SavingsPlanDescriptionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDurations(value: DurationsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durations")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: SavingsPlanOfferingFiltersList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingIds(value: UUIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringIds")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: SavingsPlanOperationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentOptions(value: SavingsPlanPaymentOptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanTypes(value: SavingsPlanTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withProductType(value: SavingsPlanProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCodes(value: SavingsPlanServiceCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageTypes(value: SavingsPlanUsageTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageTypes")(js.undefined)
        ret
    }
  }
  
}

