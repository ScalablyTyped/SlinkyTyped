package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesOffering extends js.Object {
  /**
    * The Availability Zone in which the Reserved Instance can be used.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard currency codes. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The duration of the Reserved Instance, in seconds.
    */
  var Duration: js.UndefOr[Long] = js.native
  /**
    * The purchase price of the Reserved Instance.
    */
  var FixedPrice: js.UndefOr[Float] = js.native
  /**
    * The tenancy of the instance.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  /**
    * The instance type on which the Reserved Instance can be used.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If it's a Reserved Instance Marketplace offering, this is true.
    */
  var Marketplace: js.UndefOr[Boolean] = js.native
  /**
    * If convertible it can be exchanged for Reserved Instances of the same or higher monetary value, with different configurations. If standard, it is not possible to perform an exchange.
    */
  var OfferingClass: js.UndefOr[OfferingClassType] = js.native
  /**
    * The Reserved Instance offering type.
    */
  var OfferingType: js.UndefOr[OfferingTypeValues] = js.native
  /**
    * The pricing details of the Reserved Instance offering.
    */
  var PricingDetails: js.UndefOr[PricingDetailsList] = js.native
  /**
    * The Reserved Instance product platform description.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  /**
    * The recurring charge tag assigned to the resource.
    */
  var RecurringCharges: js.UndefOr[RecurringChargesList] = js.native
  /**
    * The ID of the Reserved Instance offering. This is the offering ID used in GetReservedInstancesExchangeQuote to confirm that an exchange can be made.
    */
  var ReservedInstancesOfferingId: js.UndefOr[String] = js.native
  /**
    * Whether the Reserved Instance is applied to instances in a Region or an Availability Zone.
    */
  var Scope: js.UndefOr[scope] = js.native
  /**
    * The usage price of the Reserved Instance, per hour.
    */
  var UsagePrice: js.UndefOr[Float] = js.native
}

object ReservedInstancesOffering {
  @scala.inline
  def apply(): ReservedInstancesOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesOffering]
  }
  @scala.inline
  implicit class ReservedInstancesOfferingOps[Self <: ReservedInstancesOffering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: CurrencyCodeValues): Self = {
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
    def withDuration(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedPrice(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTenancy(value: Tenancy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTenancy")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMarketplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marketplace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marketplace")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingClass(value: OfferingClassType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingClass")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingType(value: OfferingTypeValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingType")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingDetails(value: PricingDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PricingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PricingDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withProductDescription(value: RIProductDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurringCharges(value: RecurringChargesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringCharges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurringCharges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringCharges")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstancesOfferingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesOfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstancesOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesOfferingId")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(js.undefined)
        ret
    }
    @scala.inline
    def withUsagePrice(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsagePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsagePrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsagePrice")(js.undefined)
        ret
    }
  }
  
}

