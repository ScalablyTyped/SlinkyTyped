package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Product data. After inserting, updating, or deleting a product, it may take
  * several minutes before changes take effect.
  */
@js.native
trait SchemaProduct extends StObject {
  
  /**
    * Additional URLs of images of the item.
    */
  var additionalImageLinks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Additional categories of the item (formatted as in products feed
    * specification).
    */
  var additionalProductTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Set to true if the item is targeted towards adults.
    */
  var adult: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to group items in an arbitrary way. Only for CPA%, discouraged
    * otherwise.
    */
  var adwordsGrouping: js.UndefOr[String] = js.native
  
  /**
    * Similar to adwords_grouping, but only works on CPC.
    */
  var adwordsLabels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Allows advertisers to override the item URL when the product is shown
    * within the context of Product Ads.
    */
  var adwordsRedirect: js.UndefOr[String] = js.native
  
  /**
    * Target age group of the item.
    */
  var ageGroup: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Do not use.
    */
  var aspects: js.UndefOr[js.Array[SchemaProductAspect]] = js.native
  
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
    * A list of custom (merchant-provided) custom attribute groups.
    */
  var customGroups: js.UndefOr[js.Array[SchemaCustomGroup]] = js.native
  
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
    * Specifies the intended destinations for the product.
    */
  var destinations: js.UndefOr[js.Array[SchemaProductDestination]] = js.native
  
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
    * Deprecated. Whether an item is available for purchase only online.
    */
  var onlineOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The item&#39;s pattern (e.g. polka dots).
    */
  var pattern: js.UndefOr[String] = js.native
  
  /**
    * Price of the item.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Your category of the item (formatted as in products feed specification).
    */
  var productType: js.UndefOr[String] = js.native
  
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
  
  /**
    * Deprecated. The read-only list of intended destinations which passed
    * validation.
    */
  var validatedDestinations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Read-only warnings.
    */
  var warnings: js.UndefOr[js.Array[SchemaError]] = js.native
}
object SchemaProduct {
  
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  @scala.inline
  implicit class SchemaProductMutableBuilder[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalImageLinks(value: js.Array[String]): Self = StObject.set(x, "additionalImageLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalImageLinksUndefined: Self = StObject.set(x, "additionalImageLinks", js.undefined)
    
    @scala.inline
    def setAdditionalImageLinksVarargs(value: String*): Self = StObject.set(x, "additionalImageLinks", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalProductTypes(value: js.Array[String]): Self = StObject.set(x, "additionalProductTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalProductTypesUndefined: Self = StObject.set(x, "additionalProductTypes", js.undefined)
    
    @scala.inline
    def setAdditionalProductTypesVarargs(value: String*): Self = StObject.set(x, "additionalProductTypes", js.Array(value :_*))
    
    @scala.inline
    def setAdult(value: Boolean): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdultUndefined: Self = StObject.set(x, "adult", js.undefined)
    
    @scala.inline
    def setAdwordsGrouping(value: String): Self = StObject.set(x, "adwordsGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdwordsGroupingUndefined: Self = StObject.set(x, "adwordsGrouping", js.undefined)
    
    @scala.inline
    def setAdwordsLabels(value: js.Array[String]): Self = StObject.set(x, "adwordsLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdwordsLabelsUndefined: Self = StObject.set(x, "adwordsLabels", js.undefined)
    
    @scala.inline
    def setAdwordsLabelsVarargs(value: String*): Self = StObject.set(x, "adwordsLabels", js.Array(value :_*))
    
    @scala.inline
    def setAdwordsRedirect(value: String): Self = StObject.set(x, "adwordsRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdwordsRedirectUndefined: Self = StObject.set(x, "adwordsRedirect", js.undefined)
    
    @scala.inline
    def setAgeGroup(value: String): Self = StObject.set(x, "ageGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeGroupUndefined: Self = StObject.set(x, "ageGroup", js.undefined)
    
    @scala.inline
    def setAspects(value: js.Array[SchemaProductAspect]): Self = StObject.set(x, "aspects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectsUndefined: Self = StObject.set(x, "aspects", js.undefined)
    
    @scala.inline
    def setAspectsVarargs(value: SchemaProductAspect*): Self = StObject.set(x, "aspects", js.Array(value :_*))
    
    @scala.inline
    def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityDate(value: String): Self = StObject.set(x, "availabilityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityDateUndefined: Self = StObject.set(x, "availabilityDate", js.undefined)
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    @scala.inline
    def setCostOfGoodsSold(value: SchemaPrice): Self = StObject.set(x, "costOfGoodsSold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostOfGoodsSoldUndefined: Self = StObject.set(x, "costOfGoodsSold", js.undefined)
    
    @scala.inline
    def setCustomAttributes(value: js.Array[SchemaCustomAttribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    @scala.inline
    def setCustomAttributesVarargs(value: SchemaCustomAttribute*): Self = StObject.set(x, "customAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCustomGroups(value: js.Array[SchemaCustomGroup]): Self = StObject.set(x, "customGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomGroupsUndefined: Self = StObject.set(x, "customGroups", js.undefined)
    
    @scala.inline
    def setCustomGroupsVarargs(value: SchemaCustomGroup*): Self = StObject.set(x, "customGroups", js.Array(value :_*))
    
    @scala.inline
    def setCustomLabel0(value: String): Self = StObject.set(x, "customLabel0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLabel0Undefined: Self = StObject.set(x, "customLabel0", js.undefined)
    
    @scala.inline
    def setCustomLabel1(value: String): Self = StObject.set(x, "customLabel1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLabel1Undefined: Self = StObject.set(x, "customLabel1", js.undefined)
    
    @scala.inline
    def setCustomLabel2(value: String): Self = StObject.set(x, "customLabel2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLabel2Undefined: Self = StObject.set(x, "customLabel2", js.undefined)
    
    @scala.inline
    def setCustomLabel3(value: String): Self = StObject.set(x, "customLabel3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLabel3Undefined: Self = StObject.set(x, "customLabel3", js.undefined)
    
    @scala.inline
    def setCustomLabel4(value: String): Self = StObject.set(x, "customLabel4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLabel4Undefined: Self = StObject.set(x, "customLabel4", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestinations(value: js.Array[SchemaProductDestination]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: SchemaProductDestination*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setDisplayAdsId(value: String): Self = StObject.set(x, "displayAdsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAdsIdUndefined: Self = StObject.set(x, "displayAdsId", js.undefined)
    
    @scala.inline
    def setDisplayAdsLink(value: String): Self = StObject.set(x, "displayAdsLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAdsLinkUndefined: Self = StObject.set(x, "displayAdsLink", js.undefined)
    
    @scala.inline
    def setDisplayAdsSimilarIds(value: js.Array[String]): Self = StObject.set(x, "displayAdsSimilarIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAdsSimilarIdsUndefined: Self = StObject.set(x, "displayAdsSimilarIds", js.undefined)
    
    @scala.inline
    def setDisplayAdsSimilarIdsVarargs(value: String*): Self = StObject.set(x, "displayAdsSimilarIds", js.Array(value :_*))
    
    @scala.inline
    def setDisplayAdsTitle(value: String): Self = StObject.set(x, "displayAdsTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAdsTitleUndefined: Self = StObject.set(x, "displayAdsTitle", js.undefined)
    
    @scala.inline
    def setDisplayAdsValue(value: Double): Self = StObject.set(x, "displayAdsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAdsValueUndefined: Self = StObject.set(x, "displayAdsValue", js.undefined)
    
    @scala.inline
    def setEnergyEfficiencyClass(value: String): Self = StObject.set(x, "energyEfficiencyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnergyEfficiencyClassUndefined: Self = StObject.set(x, "energyEfficiencyClass", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setGoogleProductCategory(value: String): Self = StObject.set(x, "googleProductCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleProductCategoryUndefined: Self = StObject.set(x, "googleProductCategory", js.undefined)
    
    @scala.inline
    def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdentifierExists(value: Boolean): Self = StObject.set(x, "identifierExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierExistsUndefined: Self = StObject.set(x, "identifierExists", js.undefined)
    
    @scala.inline
    def setImageLink(value: String): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    @scala.inline
    def setInstallment(value: SchemaInstallment): Self = StObject.set(x, "installment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallmentUndefined: Self = StObject.set(x, "installment", js.undefined)
    
    @scala.inline
    def setIsBundle(value: Boolean): Self = StObject.set(x, "isBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBundleUndefined: Self = StObject.set(x, "isBundle", js.undefined)
    
    @scala.inline
    def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLoyaltyPoints(value: SchemaLoyaltyPoints): Self = StObject.set(x, "loyaltyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoyaltyPointsUndefined: Self = StObject.set(x, "loyaltyPoints", js.undefined)
    
    @scala.inline
    def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setMaxEnergyEfficiencyClass(value: String): Self = StObject.set(x, "maxEnergyEfficiencyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEnergyEfficiencyClassUndefined: Self = StObject.set(x, "maxEnergyEfficiencyClass", js.undefined)
    
    @scala.inline
    def setMaxHandlingTime(value: String): Self = StObject.set(x, "maxHandlingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHandlingTimeUndefined: Self = StObject.set(x, "maxHandlingTime", js.undefined)
    
    @scala.inline
    def setMinEnergyEfficiencyClass(value: String): Self = StObject.set(x, "minEnergyEfficiencyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinEnergyEfficiencyClassUndefined: Self = StObject.set(x, "minEnergyEfficiencyClass", js.undefined)
    
    @scala.inline
    def setMinHandlingTime(value: String): Self = StObject.set(x, "minHandlingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHandlingTimeUndefined: Self = StObject.set(x, "minHandlingTime", js.undefined)
    
    @scala.inline
    def setMobileLink(value: String): Self = StObject.set(x, "mobileLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileLinkUndefined: Self = StObject.set(x, "mobileLink", js.undefined)
    
    @scala.inline
    def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    @scala.inline
    def setMultipack(value: String): Self = StObject.set(x, "multipack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipackUndefined: Self = StObject.set(x, "multipack", js.undefined)
    
    @scala.inline
    def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    @scala.inline
    def setOnlineOnly(value: Boolean): Self = StObject.set(x, "onlineOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineOnlyUndefined: Self = StObject.set(x, "onlineOnly", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setProductType(value: String): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    @scala.inline
    def setPromotionIds(value: js.Array[String]): Self = StObject.set(x, "promotionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionIdsUndefined: Self = StObject.set(x, "promotionIds", js.undefined)
    
    @scala.inline
    def setPromotionIdsVarargs(value: String*): Self = StObject.set(x, "promotionIds", js.Array(value :_*))
    
    @scala.inline
    def setSalePrice(value: SchemaPrice): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = StObject.set(x, "salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalePriceEffectiveDateUndefined: Self = StObject.set(x, "salePriceEffectiveDate", js.undefined)
    
    @scala.inline
    def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
    
    @scala.inline
    def setSellOnGoogleQuantity(value: String): Self = StObject.set(x, "sellOnGoogleQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellOnGoogleQuantityUndefined: Self = StObject.set(x, "sellOnGoogleQuantity", js.undefined)
    
    @scala.inline
    def setShipping(value: js.Array[SchemaProductShipping]): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingHeight(value: SchemaProductShippingDimension): Self = StObject.set(x, "shippingHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingHeightUndefined: Self = StObject.set(x, "shippingHeight", js.undefined)
    
    @scala.inline
    def setShippingLabel(value: String): Self = StObject.set(x, "shippingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingLabelUndefined: Self = StObject.set(x, "shippingLabel", js.undefined)
    
    @scala.inline
    def setShippingLength(value: SchemaProductShippingDimension): Self = StObject.set(x, "shippingLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingLengthUndefined: Self = StObject.set(x, "shippingLength", js.undefined)
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    @scala.inline
    def setShippingVarargs(value: SchemaProductShipping*): Self = StObject.set(x, "shipping", js.Array(value :_*))
    
    @scala.inline
    def setShippingWeight(value: SchemaProductShippingWeight): Self = StObject.set(x, "shippingWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingWeightUndefined: Self = StObject.set(x, "shippingWeight", js.undefined)
    
    @scala.inline
    def setShippingWidth(value: SchemaProductShippingDimension): Self = StObject.set(x, "shippingWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingWidthUndefined: Self = StObject.set(x, "shippingWidth", js.undefined)
    
    @scala.inline
    def setSizeSystem(value: String): Self = StObject.set(x, "sizeSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeSystemUndefined: Self = StObject.set(x, "sizeSystem", js.undefined)
    
    @scala.inline
    def setSizeType(value: String): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSizes(value: js.Array[String]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: String*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    @scala.inline
    def setTaxes(value: js.Array[SchemaProductTax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
    
    @scala.inline
    def setTaxesVarargs(value: SchemaProductTax*): Self = StObject.set(x, "taxes", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUnitPricingBaseMeasure(value: SchemaProductUnitPricingBaseMeasure): Self = StObject.set(x, "unitPricingBaseMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPricingBaseMeasureUndefined: Self = StObject.set(x, "unitPricingBaseMeasure", js.undefined)
    
    @scala.inline
    def setUnitPricingMeasure(value: SchemaProductUnitPricingMeasure): Self = StObject.set(x, "unitPricingMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPricingMeasureUndefined: Self = StObject.set(x, "unitPricingMeasure", js.undefined)
    
    @scala.inline
    def setValidatedDestinations(value: js.Array[String]): Self = StObject.set(x, "validatedDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatedDestinationsUndefined: Self = StObject.set(x, "validatedDestinations", js.undefined)
    
    @scala.inline
    def setValidatedDestinationsVarargs(value: String*): Self = StObject.set(x, "validatedDestinations", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[SchemaError]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: SchemaError*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
