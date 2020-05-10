package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A conversion containing data relevant to DoubleClick Search.
  */
@js.native
trait SchemaConversion extends js.Object {
  /**
    * DS ad group ID.
    */
  var adGroupId: js.UndefOr[String] = js.native
  /**
    * DS ad ID.
    */
  var adId: js.UndefOr[String] = js.native
  /**
    * DS advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * DS agency ID.
    */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * Available to advertisers only after contacting DoubleClick Search
    * customer support.
    */
  var attributionModel: js.UndefOr[String] = js.native
  /**
    * DS campaign ID.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Sales channel for the product. Acceptable values are:   -
    * &quot;local&quot;: a physical store  - &quot;online&quot;: an online
    * store
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * DS click ID for the conversion.
    */
  var clickId: js.UndefOr[String] = js.native
  /**
    * For offline conversions, advertisers provide this ID. Advertisers can
    * specify any ID that is meaningful to them. Each conversion in a request
    * must specify a unique ID, and the combination of ID and timestamp must be
    * unique amongst all conversions within the advertiser. For online
    * conversions, DS copies the dsConversionId or floodlightOrderId into this
    * property depending on the advertiser&#39;s Floodlight instructions.
    */
  var conversionId: js.UndefOr[String] = js.native
  /**
    * The time at which the conversion was last modified, in epoch millis UTC.
    */
  var conversionModifiedTimestamp: js.UndefOr[String] = js.native
  /**
    * The time at which the conversion took place, in epoch millis UTC.
    */
  var conversionTimestamp: js.UndefOr[String] = js.native
  /**
    * Available to advertisers only after contacting DoubleClick Search
    * customer support.
    */
  var countMillis: js.UndefOr[String] = js.native
  /**
    * DS criterion (keyword) ID.
    */
  var criterionId: js.UndefOr[String] = js.native
  /**
    * The currency code for the conversion&#39;s revenue. Should be in ISO 4217
    * alphabetic (3-char) format.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * Custom dimensions for the conversion, which can be used to filter data in
    * a report.
    */
  var customDimension: js.UndefOr[js.Array[SchemaCustomDimension]] = js.native
  /**
    * Custom metrics for the conversion.
    */
  var customMetric: js.UndefOr[js.Array[SchemaCustomMetric]] = js.native
  /**
    * The type of device on which the conversion occurred.
    */
  var deviceType: js.UndefOr[String] = js.native
  /**
    * ID that DoubleClick Search generates for each conversion.
    */
  var dsConversionId: js.UndefOr[String] = js.native
  /**
    * DS engine account ID.
    */
  var engineAccountId: js.UndefOr[String] = js.native
  /**
    * The Floodlight order ID provided by the advertiser for the conversion.
    */
  var floodlightOrderId: js.UndefOr[String] = js.native
  /**
    * ID that DS generates and uses to uniquely identify the inventory account
    * that contains the product.
    */
  var inventoryAccountId: js.UndefOr[String] = js.native
  /**
    * The country registered for the Merchant Center feed that contains the
    * product. Use an ISO 3166 code to specify a country.
    */
  var productCountry: js.UndefOr[String] = js.native
  /**
    * DS product group ID.
    */
  var productGroupId: js.UndefOr[String] = js.native
  /**
    * The product ID (SKU).
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The language registered for the Merchant Center feed that contains the
    * product. Use an ISO 639 code to specify a language.
    */
  var productLanguage: js.UndefOr[String] = js.native
  /**
    * The quantity of this conversion, in millis.
    */
  var quantityMillis: js.UndefOr[String] = js.native
  /**
    * The revenue amount of this TRANSACTION conversion, in micros (value
    * multiplied by 1000000, no decimal). For example, to specify a revenue
    * value of &quot;10&quot; enter &quot;10000000&quot; (10 million) in your
    * request.
    */
  var revenueMicros: js.UndefOr[String] = js.native
  /**
    * The numeric segmentation identifier (for example, DoubleClick Search
    * Floodlight activity ID).
    */
  var segmentationId: js.UndefOr[String] = js.native
  /**
    * The friendly segmentation identifier (for example, DoubleClick Search
    * Floodlight activity name).
    */
  var segmentationName: js.UndefOr[String] = js.native
  /**
    * The segmentation type of this conversion (for example, FLOODLIGHT).
    */
  var segmentationType: js.UndefOr[String] = js.native
  /**
    * The state of the conversion, that is, either ACTIVE or REMOVED. Note:
    * state DELETED is deprecated.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The ID of the local store for which the product was advertised.
    * Applicable only when the channel is &quot;local&quot;.
    */
  var storeId: js.UndefOr[String] = js.native
  /**
    * The type of the conversion, that is, either ACTION or TRANSACTION. An
    * ACTION conversion is an action by the user that has no monetarily
    * quantifiable value, while a TRANSACTION conversion is an action that does
    * have a monetarily quantifiable value. Examples are email list signups
    * (ACTION) versus ecommerce purchases (TRANSACTION).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaConversion {
  @scala.inline
  def apply(): SchemaConversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversion]
  }
  @scala.inline
  implicit class SchemaConversionOps[Self <: SchemaConversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withAgencyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgencyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agencyId")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributionModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionModel")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaignId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignId")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withClickId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickId")(js.undefined)
        ret
    }
    @scala.inline
    def withConversionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionId")(js.undefined)
        ret
    }
    @scala.inline
    def withConversionModifiedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionModifiedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionModifiedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionModifiedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withConversionTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCountMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withCriterionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criterionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriterionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criterionId")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDimension(value: js.Array[SchemaCustomDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMetric(value: js.Array[SchemaCustomMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDsConversionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsConversionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDsConversionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dsConversionId")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withInventoryAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventoryAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withProductGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantityMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withRevenueMicros(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenueMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevenueMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenueMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationId")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationName")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentationType")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

