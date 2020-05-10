package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlansOfferingRatesRequest extends js.Object {
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanOfferingRateFiltersList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operations: js.UndefOr[SavingsPlanRateOperationList] = js.native
  /**
    * The AWS products.
    */
  var products: js.UndefOr[SavingsPlanProductTypeList] = js.native
  /**
    * The IDs of the offerings.
    */
  var savingsPlanOfferingIds: js.UndefOr[UUIDs] = js.native
  /**
    * The payment options.
    */
  var savingsPlanPaymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.native
  /**
    * The plan types.
    */
  var savingsPlanTypes: js.UndefOr[SavingsPlanTypeList] = js.native
  /**
    * The services.
    */
  var serviceCodes: js.UndefOr[SavingsPlanRateServiceCodeList] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageTypes: js.UndefOr[SavingsPlanRateUsageTypeList] = js.native
}

object DescribeSavingsPlansOfferingRatesRequest {
  @scala.inline
  def apply(): DescribeSavingsPlansOfferingRatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesRequest]
  }
  @scala.inline
  implicit class DescribeSavingsPlansOfferingRatesRequestOps[Self <: DescribeSavingsPlansOfferingRatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: SavingsPlanOfferingRateFiltersList): Self = {
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
    def withOperations(value: SavingsPlanRateOperationList): Self = {
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
    def withProducts(value: SavingsPlanProductTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlanOfferingIds(value: UUIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanOfferingIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanOfferingIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanOfferingIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlanPaymentOptions(value: SavingsPlanPaymentOptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanPaymentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanPaymentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanPaymentOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlanTypes(value: SavingsPlanTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCodes(value: SavingsPlanRateServiceCodeList): Self = {
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
    def withUsageTypes(value: SavingsPlanRateUsageTypeList): Self = {
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

