package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Product data. After inserting, updating, or deleting a product, it may take
  * several minutes before changes take effect.
  */
@js.native
trait SchemaProduct extends js.Object {
  /**
    * Additional URLs of images of the item.
    */
  var additionalImageLinks: js.UndefOr[js.Array[String]] = js.native
  /**
    * Used to group items in an arbitrary way. Only for CPA%, discouraged
    * otherwise.
    */
  var adsGrouping: js.UndefOr[String] = js.native
  /**
    * Similar to ads_grouping, but only works on CPC.
    */
  var adsLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows advertisers to override the item URL when the product is shown
    * within the context of Product Ads.
    */
  var adsRedirect: js.UndefOr[String] = js.native
  /**
    * Set to true if the item is targeted towards adults.
    */
  var adult: js.UndefOr[Boolean] = js.native
  /**
    * Target age group of the item.
    */
  var ageGroup: js.UndefOr[String] = js.native
  /**
    * Availability status of the item.
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * The day a pre-ordered product becomes available for delivery, in ISO 8601
    * format.
    */
  var availabilityDate: js.UndefOr[String] = js.native
  /**
    * Brand of the item.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * The item&#39;s channel (online or local).
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * Color of the item.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Condition or state of the item.
    */
  var condition: js.UndefOr[String] = js.native
  /**
    * The two-letter ISO 639-1 language code for the item.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Cost of goods sold. Used for gross profit reporting.
    */
  var costOfGoodsSold: js.UndefOr[SchemaPrice] = js.native
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for
    * submitting any attribute of the feed specification in its generic form
    * (e.g., { &quot;name&quot;: &quot;size type&quot;, &quot;value&quot;:
    * &quot;regular&quot; }). This is useful for submitting attributes not
    * explicitly exposed by the API.
    */
  var customAttributes: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.native
  /**
    * Custom label 0 for custom grouping of items in a Shopping campaign.
    */
  var customLabel0: js.UndefOr[String] = js.native
  /**
    * Custom label 1 for custom grouping of items in a Shopping campaign.
    */
  var customLabel1: js.UndefOr[String] = js.native
  /**
    * Custom label 2 for custom grouping of items in a Shopping campaign.
    */
  var customLabel2: js.UndefOr[String] = js.native
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign.
    */
  var customLabel3: js.UndefOr[String] = js.native
  /**
    * Custom label 4 for custom grouping of items in a Shopping campaign.
    */
  var customLabel4: js.UndefOr[String] = js.native
  /**
    * Description of the item.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * An identifier for an item for dynamic remarketing campaigns.
    */
  var displayAdsId: js.UndefOr[String] = js.native
  /**
    * URL directly to your item&#39;s landing page for dynamic remarketing
    * campaigns.
    */
  var displayAdsLink: js.UndefOr[String] = js.native
  /**
    * Advertiser-specified recommendations.
    */
  var displayAdsSimilarIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Title of an item for dynamic remarketing campaigns.
    */
  var displayAdsTitle: js.UndefOr[String] = js.native
  /**
    * Offer margin for dynamic remarketing campaigns.
    */
  var displayAdsValue: js.UndefOr[Double] = js.native
  /**
    * The energy efficiency class as defined in EU directive 2010/30/EU.
    */
  var energyEfficiencyClass: js.UndefOr[String] = js.native
  /**
    * The list of destinations to exclude for this target (corresponds to
    * unchecked check boxes in Merchant Center).
    */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Date on which the item should expire, as specified upon insertion, in ISO
    * 8601 format. The actual expiration date in Google Shopping is exposed in
    * productstatuses as googleExpirationDate and might be earlier if
    * expirationDate is too far in the future.
    */
  var expirationDate: js.UndefOr[String] = js.native
  /**
    * Target gender of the item.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * Google&#39;s category of the item (see Google product taxonomy).
    */
  var googleProductCategory: js.UndefOr[String] = js.native
  /**
    * Global Trade Item Number (GTIN) of the item.
    */
  var gtin: js.UndefOr[String] = js.native
  /**
    * The REST ID of the product. Content API methods that operate on products
    * take this as their productId parameter. The REST ID for a product is of
    * the form channel:contentLanguage:targetCountry:offerId.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * False when the item does not have unique product identifiers appropriate
    * to its category, such as GTIN, MPN, and brand. Required according to the
    * Unique Product Identifier Rules for all target countries except for
    * Canada.
    */
  var identifierExists: js.UndefOr[Boolean] = js.native
  /**
    * URL of an image of the item.
    */
  var imageLink: js.UndefOr[String] = js.native
  /**
    * The list of destinations to include for this target (corresponds to
    * checked check boxes in Merchant Center). Default destinations are always
    * included unless provided in the excluded_destination field.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Number and amount of installments to pay for an item. Brazil only.
    */
  var installment: js.UndefOr[SchemaInstallment] = js.native
  /**
    * Whether the item is a merchant-defined bundle. A bundle is a custom
    * grouping of different products sold by a merchant for a single price.
    */
  var isBundle: js.UndefOr[Boolean] = js.native
  /**
    * Shared identifier for all variants of the same product.
    */
  var itemGroupId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#product&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * URL directly linking to your item&#39;s page on your website.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Loyalty points that users receive after purchasing the item. Japan only.
    */
  var loyaltyPoints: js.UndefOr[SchemaLoyaltyPoints] = js.native
  /**
    * The material of which the item is made.
    */
  var material: js.UndefOr[String] = js.native
  /**
    * The energy efficiency class as defined in EU directive 2010/30/EU.
    */
  var maxEnergyEfficiencyClass: js.UndefOr[String] = js.native
  /**
    * Maximal product handling time (in business days).
    */
  var maxHandlingTime: js.UndefOr[String] = js.native
  /**
    * The energy efficiency class as defined in EU directive 2010/30/EU.
    */
  var minEnergyEfficiencyClass: js.UndefOr[String] = js.native
  /**
    * Minimal product handling time (in business days).
    */
  var minHandlingTime: js.UndefOr[String] = js.native
  /**
    * Link to a mobile-optimized version of the landing page.
    */
  var mobileLink: js.UndefOr[String] = js.native
  /**
    * Manufacturer Part Number (MPN) of the item.
    */
  var mpn: js.UndefOr[String] = js.native
  /**
    * The number of identical products in a merchant-defined multipack.
    */
  var multipack: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the item. Leading and trailing whitespaces are
    * stripped and multiple whitespaces are replaced by a single whitespace
    * upon submission. Only valid unicode characters are accepted. See the
    * products feed specification for details. Note: Content API methods that
    * operate on products take the REST ID of the product, not this identifier.
    */
  var offerId: js.UndefOr[String] = js.native
  /**
    * The item&#39;s pattern (e.g. polka dots).
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * Price of the item.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  /**
    * Categories of the item (formatted as in products feed specification).
    */
  var productTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The unique ID of a promotion.
    */
  var promotionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Advertised sale price of the item.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Date range during which the item is on sale (see products feed
    * specification).
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  /**
    * The quantity of the product that is available for selling on Google.
    * Supported only for online products.
    */
  var sellOnGoogleQuantity: js.UndefOr[String] = js.native
  /**
    * Shipping rules.
    */
  var shipping: js.UndefOr[js.Array[SchemaProductShipping]] = js.native
  /**
    * Height of the item for shipping.
    */
  var shippingHeight: js.UndefOr[SchemaProductShippingDimension] = js.native
  /**
    * The shipping label of the product, used to group product in account-level
    * shipping rules.
    */
  var shippingLabel: js.UndefOr[String] = js.native
  /**
    * Length of the item for shipping.
    */
  var shippingLength: js.UndefOr[SchemaProductShippingDimension] = js.native
  /**
    * Weight of the item for shipping.
    */
  var shippingWeight: js.UndefOr[SchemaProductShippingWeight] = js.native
  /**
    * Width of the item for shipping.
    */
  var shippingWidth: js.UndefOr[SchemaProductShippingDimension] = js.native
  /**
    * System in which the size is specified. Recommended for apparel items.
    */
  var sizeSystem: js.UndefOr[String] = js.native
  /**
    * The cut of the item. Recommended for apparel items.
    */
  var sizeType: js.UndefOr[String] = js.native
  /**
    * Size of the item.
    */
  var sizes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The source of the offer, i.e., how the offer was created.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The CLDR territory code for the item.
    */
  var targetCountry: js.UndefOr[String] = js.native
  /**
    * Tax information.
    */
  var taxes: js.UndefOr[js.Array[SchemaProductTax]] = js.native
  /**
    * Title of the item.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The preference of the denominator of the unit price.
    */
  var unitPricingBaseMeasure: js.UndefOr[SchemaProductUnitPricingBaseMeasure] = js.native
  /**
    * The measure and dimension of an item.
    */
  var unitPricingMeasure: js.UndefOr[SchemaProductUnitPricingMeasure] = js.native
}

object SchemaProduct {
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  @scala.inline
  implicit class SchemaProductOps[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalImageLinks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalImageLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalImageLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalImageLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withAdsGrouping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withAdsLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withAdsRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdsRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withAdult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityDate")(js.undefined)
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
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
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withCostOfGoodsSold(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costOfGoodsSold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostOfGoodsSold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costOfGoodsSold")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributes(value: js.Array[SchemaCustomAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel0")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel1")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel2")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel3")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel4")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withDisplayAdsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAdsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAdsLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAdsLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsLink")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAdsSimilarIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsSimilarIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAdsSimilarIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsSimilarIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAdsTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAdsTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAdsValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAdsValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAdsValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnergyEfficiencyClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energyEfficiencyClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnergyEfficiencyClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energyEfficiencyClass")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedDestinations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleProductCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleProductCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleProductCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleProductCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withGtin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGtin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtin")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifierExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifierExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierExists")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLink")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedDestinations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallment(value: SchemaInstallment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installment")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBundle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLoyaltyPoints(value: SchemaLoyaltyPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loyaltyPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoyaltyPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loyaltyPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEnergyEfficiencyClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEnergyEfficiencyClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEnergyEfficiencyClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEnergyEfficiencyClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHandlingTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHandlingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHandlingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHandlingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinEnergyEfficiencyClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minEnergyEfficiencyClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinEnergyEfficiencyClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minEnergyEfficiencyClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHandlingTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHandlingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHandlingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHandlingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileLink")(js.undefined)
        ret
    }
    @scala.inline
    def withMpn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpn")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipack")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withProductTypes(value: js.Array[String]): Self = {
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
    def withPromotionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSalePrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalePrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePrice")(js.undefined)
        ret
    }
    @scala.inline
    def withSalePriceEffectiveDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePriceEffectiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalePriceEffectiveDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePriceEffectiveDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSellOnGoogleQuantity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellOnGoogleQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellOnGoogleQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellOnGoogleQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: js.Array[SchemaProductShipping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingHeight(value: SchemaProductShippingDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingLength(value: SchemaProductShippingDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingLength")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingWeight(value: SchemaProductShippingWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingWidth(value: SchemaProductShippingDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxes(value: js.Array[SchemaProductTax]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitPricingBaseMeasure(value: SchemaProductUnitPricingBaseMeasure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPricingBaseMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPricingBaseMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPricingBaseMeasure")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitPricingMeasure(value: SchemaProductUnitPricingMeasure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPricingMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPricingMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPricingMeasure")(js.undefined)
        ret
    }
  }
  
}

