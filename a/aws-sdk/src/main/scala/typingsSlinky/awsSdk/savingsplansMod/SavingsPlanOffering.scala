package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOffering extends js.Object {
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The description.
    */
  var description: js.UndefOr[SavingsPlanDescription] = js.native
  /**
    * The duration, in seconds.
    */
  var durationSeconds: js.UndefOr[SavingsPlansDuration] = js.native
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[UUID] = js.native
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanOperation] = js.native
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.native
  /**
    * The plan type.
    */
  var planType: js.UndefOr[SavingsPlanType] = js.native
  /**
    * The product type.
    */
  var productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.native
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanOfferingPropertyList] = js.native
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanServiceCode] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanUsageType] = js.native
}

object SavingsPlanOffering {
  @scala.inline
  def apply(): SavingsPlanOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOffering]
  }
  @scala.inline
  implicit class SavingsPlanOfferingOps[Self <: SavingsPlanOffering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: CurrencyCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: SavingsPlanDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationSeconds(value: SavingsPlansDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingId(value: UUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: SavingsPlanOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentOption(value: SavingsPlanPaymentOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOption")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanType(value: SavingsPlanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planType")(js.undefined)
        ret
    }
    @scala.inline
    def withProductTypes(value: SavingsPlanProductTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: SavingsPlanOfferingPropertyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCode(value: SavingsPlanServiceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageType(value: SavingsPlanUsageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageType")(js.undefined)
        ret
    }
  }
  
}

