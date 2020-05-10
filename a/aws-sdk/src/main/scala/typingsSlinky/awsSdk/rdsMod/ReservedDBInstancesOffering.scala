package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedDBInstancesOffering extends js.Object {
  /**
    * The currency code for the reserved DB instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The DB instance class for the reserved DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The duration of the offering in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The fixed price charged for this offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * Indicates if the offering applies to Multi-AZ deployments.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  /**
    * The offering type.
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The database engine used by the offering.
    */
  var ProductDescription: js.UndefOr[String] = js.native
  /**
    * The recurring price charged to run this reserved DB instance.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.native
  /**
    * The hourly price charged for this offering.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedDBInstancesOffering {
  @scala.inline
  def apply(): ReservedDBInstancesOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstancesOffering]
  }
  @scala.inline
  implicit class ReservedDBInstancesOfferingOps[Self <: ReservedDBInstancesOffering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: String): Self = {
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
    def withDBInstanceClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Integer): Self = {
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
    def withFixedPrice(value: Double): Self = {
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
    def withMultiAZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiAZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZ")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingType(value: String): Self = {
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
    def withProductDescription(value: String): Self = {
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
    def withRecurringCharges(value: RecurringChargeList): Self = {
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
    def withReservedDBInstancesOfferingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedDBInstancesOfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedDBInstancesOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedDBInstancesOfferingId")(js.undefined)
        ret
    }
    @scala.inline
    def withUsagePrice(value: Double): Self = {
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

