package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedElasticsearchInstanceOffering extends js.Object {
  /**
    * The currency code for the reserved Elasticsearch instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The duration, in seconds, for which the offering will reserve the Elasticsearch instance.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The Elasticsearch instance type offered by the reserved instance offering.
    */
  var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.native
  /**
    * The upfront fixed charge you will pay to purchase the specific reserved Elasticsearch instance offering. 
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * Payment option for the reserved Elasticsearch instance offering
    */
  var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.native
  /**
    * The charge to your account regardless of whether you are creating any domains using the instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The Elasticsearch reserved instance offering identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.native
  /**
    * The rate you are charged for each hour the domain that is using the offering is running.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedElasticsearchInstanceOffering {
  @scala.inline
  def apply(): ReservedElasticsearchInstanceOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedElasticsearchInstanceOffering]
  }
  @scala.inline
  implicit class ReservedElasticsearchInstanceOfferingOps[Self <: ReservedElasticsearchInstanceOffering] (val x: Self) extends AnyVal {
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
    def withReservedElasticsearchInstanceOfferingId(value: GUID): Self = {
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

