package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  /** Additional URLs of images of the item. */
  var additionalImageLinks: js.UndefOr[js.Array[String]] = js.native
  /** Additional categories of the item (formatted as in products feed specification). */
  var additionalProductTypes: js.UndefOr[js.Array[String]] = js.native
  /** Set to true if the item is targeted towards adults. */
  var adult: js.UndefOr[Boolean] = js.native
  /** Used to group items in an arbitrary way. Only for CPA%, discouraged otherwise. */
  var adwordsGrouping: js.UndefOr[String] = js.native
  /** Similar to adwords_grouping, but only works on CPC. */
  var adwordsLabels: js.UndefOr[js.Array[String]] = js.native
  /** Allows advertisers to override the item URL when the product is shown within the context of Product Ads. */
  var adwordsRedirect: js.UndefOr[String] = js.native
  /** Target age group of the item. */
  var ageGroup: js.UndefOr[String] = js.native
  /** Specifies the intended aspects for the product. */
  var aspects: js.UndefOr[js.Array[ProductAspect]] = js.native
  /** Availability status of the item. */
  var availability: js.UndefOr[String] = js.native
  /** The day a pre-ordered product becomes available for delivery, in ISO 8601 format. */
  var availabilityDate: js.UndefOr[String] = js.native
  /** Brand of the item. */
  var brand: js.UndefOr[String] = js.native
  /** The item's channel (online or local). */
  var channel: js.UndefOr[String] = js.native
  /** Color of the item. */
  var color: js.UndefOr[String] = js.native
  /** Condition or state of the item. */
  var condition: js.UndefOr[String] = js.native
  /** The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for submitting any attribute of the feed specification in its generic form (e.g.,
    * { "name": "size type", "type": "text", "value": "regular" }). This is useful for submitting attributes not explicitly exposed by the API.
    */
  var customAttributes: js.UndefOr[js.Array[ProductCustomAttribute]] = js.native
  /** A list of custom (merchant-provided) custom attribute groups. */
  var customGroups: js.UndefOr[js.Array[ProductCustomGroup]] = js.native
  /** Custom label 0 for custom grouping of items in a Shopping campaign. */
  var customLabel0: js.UndefOr[String] = js.native
  /** Custom label 1 for custom grouping of items in a Shopping campaign. */
  var customLabel1: js.UndefOr[String] = js.native
  /** Custom label 2 for custom grouping of items in a Shopping campaign. */
  var customLabel2: js.UndefOr[String] = js.native
  /** Custom label 3 for custom grouping of items in a Shopping campaign. */
  var customLabel3: js.UndefOr[String] = js.native
  /** Custom label 4 for custom grouping of items in a Shopping campaign. */
  var customLabel4: js.UndefOr[String] = js.native
  /** Description of the item. */
  var description: js.UndefOr[String] = js.native
  /** Specifies the intended destinations for the product. */
  var destinations: js.UndefOr[js.Array[ProductDestination]] = js.native
  /** An identifier for an item for dynamic remarketing campaigns. */
  var displayAdsId: js.UndefOr[String] = js.native
  /** URL directly to your item's landing page for dynamic remarketing campaigns. */
  var displayAdsLink: js.UndefOr[String] = js.native
  /** Advertiser-specified recommendations. */
  var displayAdsSimilarIds: js.UndefOr[js.Array[String]] = js.native
  /** Title of an item for dynamic remarketing campaigns. */
  var displayAdsTitle: js.UndefOr[String] = js.native
  /** Offer margin for dynamic remarketing campaigns. */
  var displayAdsValue: js.UndefOr[Double] = js.native
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var energyEfficiencyClass: js.UndefOr[String] = js.native
  /**
    * Date on which the item should expire, as specified upon insertion, in ISO 8601 format. The actual expiration date in Google Shopping is exposed in
    * productstatuses as googleExpirationDate and might be earlier if expirationDate is too far in the future.
    */
  var expirationDate: js.UndefOr[String] = js.native
  /** Target gender of the item. */
  var gender: js.UndefOr[String] = js.native
  /** Google's category of the item (see Google product taxonomy). */
  var googleProductCategory: js.UndefOr[String] = js.native
  /** Global Trade Item Number (GTIN) of the item. */
  var gtin: js.UndefOr[String] = js.native
  /** The REST id of the product. */
  var id: js.UndefOr[String] = js.native
  /**
    * False when the item does not have unique product identifiers appropriate to its category, such as GTIN, MPN, and brand. Required according to the
    * Unique Product Identifier Rules for all target countries except for Canada.
    */
  var identifierExists: js.UndefOr[Boolean] = js.native
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.native
  /** Number and amount of installments to pay for an item. Brazil only. */
  var installment: js.UndefOr[Installment] = js.native
  /** Whether the item is a merchant-defined bundle. A bundle is a custom grouping of different products sold by a merchant for a single price. */
  var isBundle: js.UndefOr[Boolean] = js.native
  /** Shared identifier for all variants of the same product. */
  var itemGroupId: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#product". */
  var kind: js.UndefOr[String] = js.native
  /** URL directly linking to your item's page on your website. */
  var link: js.UndefOr[String] = js.native
  /** Loyalty points that users receive after purchasing the item. Japan only. */
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.native
  /** The material of which the item is made. */
  var material: js.UndefOr[String] = js.native
  /** Maximal product handling time (in business days). */
  var maxHandlingTime: js.UndefOr[String] = js.native
  /** Minimal product handling time (in business days). */
  var minHandlingTime: js.UndefOr[String] = js.native
  /** Link to a mobile-optimized version of the landing page. */
  var mobileLink: js.UndefOr[String] = js.native
  /** Manufacturer Part Number (MPN) of the item. */
  var mpn: js.UndefOr[String] = js.native
  /** The number of identical products in a merchant-defined multipack. */
  var multipack: js.UndefOr[String] = js.native
  /**
    * An identifier of the item. Leading and trailing whitespaces are stripped and multiple whitespaces are replaced by a single whitespace upon submission.
    * Only valid unicode characters are accepted. See the products feed specification for details.
    */
  var offerId: js.UndefOr[String] = js.native
  /** Whether an item is available for purchase only online. */
  var onlineOnly: js.UndefOr[Boolean] = js.native
  /** The item's pattern (e.g. polka dots). */
  var pattern: js.UndefOr[String] = js.native
  /** Price of the item. */
  var price: js.UndefOr[Price] = js.native
  /** Your category of the item (formatted as in products feed specification). */
  var productType: js.UndefOr[String] = js.native
  /** The unique ID of a promotion. */
  var promotionIds: js.UndefOr[js.Array[String]] = js.native
  /** Advertised sale price of the item. */
  var salePrice: js.UndefOr[Price] = js.native
  /** Date range during which the item is on sale (see products feed specification). */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  /** The quantity of the product that is reserved for sell-on-google ads. */
  var sellOnGoogleQuantity: js.UndefOr[String] = js.native
  /** Shipping rules. */
  var shipping: js.UndefOr[js.Array[ProductShipping]] = js.native
  /** Height of the item for shipping. */
  var shippingHeight: js.UndefOr[ProductShippingDimension] = js.native
  /** The shipping label of the product, used to group product in account-level shipping rules. */
  var shippingLabel: js.UndefOr[String] = js.native
  /** Length of the item for shipping. */
  var shippingLength: js.UndefOr[ProductShippingDimension] = js.native
  /** Weight of the item for shipping. */
  var shippingWeight: js.UndefOr[ProductShippingWeight] = js.native
  /** Width of the item for shipping. */
  var shippingWidth: js.UndefOr[ProductShippingDimension] = js.native
  /** System in which the size is specified. Recommended for apparel items. */
  var sizeSystem: js.UndefOr[String] = js.native
  /** The cut of the item. Recommended for apparel items. */
  var sizeType: js.UndefOr[String] = js.native
  /** Size of the item. */
  var sizes: js.UndefOr[js.Array[String]] = js.native
  /** The CLDR territory code for the item. */
  var targetCountry: js.UndefOr[String] = js.native
  /** Tax information. */
  var taxes: js.UndefOr[js.Array[ProductTax]] = js.native
  /** Title of the item. */
  var title: js.UndefOr[String] = js.native
  /** The preference of the denominator of the unit price. */
  var unitPricingBaseMeasure: js.UndefOr[ProductUnitPricingBaseMeasure] = js.native
  /** The measure and dimension of an item. */
  var unitPricingMeasure: js.UndefOr[ProductUnitPricingMeasure] = js.native
  /** The read-only list of intended destinations which passed validation. */
  var validatedDestinations: js.UndefOr[js.Array[String]] = js.native
  /** Read-only warnings. */
  var warnings: js.UndefOr[js.Array[Error]] = js.native
}

object Product {
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def withAdditionalProductTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProductTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalProductTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProductTypes")(js.undefined)
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
    def withAdwordsGrouping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdwordsGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withAdwordsLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdwordsLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withAdwordsRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdwordsRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsRedirect")(js.undefined)
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
    def withAspects(value: js.Array[ProductAspect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspects")(js.undefined)
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
    def withCustomAttributes(value: js.Array[ProductCustomAttribute]): Self = {
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
    def withCustomGroups(value: js.Array[ProductCustomGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customGroups")(js.undefined)
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
    def withDestinations(value: js.Array[ProductDestination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(js.undefined)
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
    def withInstallment(value: Installment): Self = {
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
    def withLoyaltyPoints(value: LoyaltyPoints): Self = {
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
    def withOnlineOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlineOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineOnly")(js.undefined)
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
    def withPrice(value: Price): Self = {
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
    def withProductType(value: String): Self = {
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
    def withSalePrice(value: Price): Self = {
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
    def withShipping(value: js.Array[ProductShipping]): Self = {
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
    def withShippingHeight(value: ProductShippingDimension): Self = {
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
    def withShippingLength(value: ProductShippingDimension): Self = {
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
    def withShippingWeight(value: ProductShippingWeight): Self = {
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
    def withShippingWidth(value: ProductShippingDimension): Self = {
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
    def withTaxes(value: js.Array[ProductTax]): Self = {
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
    def withUnitPricingBaseMeasure(value: ProductUnitPricingBaseMeasure): Self = {
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
    def withUnitPricingMeasure(value: ProductUnitPricingMeasure): Self = {
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
    @scala.inline
    def withValidatedDestinations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatedDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

