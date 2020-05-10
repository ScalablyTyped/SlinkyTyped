package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanRate extends js.Object {
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanRateOperation] = js.native
  /**
    * The product type.
    */
  var productType: js.UndefOr[SavingsPlanProductType] = js.native
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanRatePropertyList] = js.native
  /**
    * The rate.
    */
  var rate: js.UndefOr[Amount] = js.native
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanRateServiceCode] = js.native
  /**
    * The unit.
    */
  var unit: js.UndefOr[SavingsPlanRateUnit] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanRateUsageType] = js.native
}

object SavingsPlanRate {
  @scala.inline
  def apply(): SavingsPlanRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanRate]
  }
  @scala.inline
  implicit class SavingsPlanRateOps[Self <: SavingsPlanRate] (val x: Self) extends AnyVal {
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
    def withOperation(value: SavingsPlanRateOperation): Self = {
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
    def withProperties(value: SavingsPlanRatePropertyList): Self = {
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
    def withRate(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCode(value: SavingsPlanRateServiceCode): Self = {
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
    def withUnit(value: SavingsPlanRateUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageType(value: SavingsPlanRateUsageType): Self = {
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

