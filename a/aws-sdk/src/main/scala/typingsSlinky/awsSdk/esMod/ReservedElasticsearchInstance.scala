package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedElasticsearchInstance extends js.Object {
  /**
    * The currency code for the reserved Elasticsearch instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The duration, in seconds, for which the Elasticsearch instance is reserved.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The number of Elasticsearch instances that have been reserved.
    */
  var ElasticsearchInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The Elasticsearch instance type offered by the reserved instance offering.
    */
  var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.native
  /**
    * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering. 
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * The payment option as defined in the reserved Elasticsearch instance offering.
    */
  var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.native
  /**
    * The charge to your account regardless of whether you are creating any domains using the instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The customer-specified identifier to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.native
  /**
    * The unique identifier for the reservation.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.native
  /**
    * The offering identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[String] = js.native
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of the reserved Elasticsearch instance.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The rate you are charged for each hour for the domain that is using this reserved instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedElasticsearchInstance {
  @scala.inline
  def apply(): ReservedElasticsearchInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedElasticsearchInstance]
  }
  @scala.inline
  implicit class ReservedElasticsearchInstanceOps[Self <: ReservedElasticsearchInstance] (val x: Self) extends AnyVal {
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
    def withElasticsearchInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchInstanceType(value: ESPartitionInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchInstanceType")(js.undefined)
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
    def withPaymentOption(value: ReservedElasticsearchInstancePaymentOption): Self = {
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
    def withReservationName(value: ReservationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationName")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedElasticsearchInstanceId(value: GUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedElasticsearchInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedElasticsearchInstanceOfferingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceOfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedElasticsearchInstanceOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedElasticsearchInstanceOfferingId")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
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

