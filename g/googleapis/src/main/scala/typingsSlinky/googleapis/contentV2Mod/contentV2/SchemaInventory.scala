package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInventory extends StObject {
  
  /**
    * The availability of the product.
    */
  var availability: js.UndefOr[String] = js.native
  
  /**
    * Custom label 0 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel0: js.UndefOr[String] = js.native
  
  /**
    * Custom label 1 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel1: js.UndefOr[String] = js.native
  
  /**
    * Custom label 2 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel2: js.UndefOr[String] = js.native
  
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel3: js.UndefOr[String] = js.native
  
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel4: js.UndefOr[String] = js.native
  
  /**
    * Number and amount of installments to pay for an item. Brazil only.
    */
  var installment: js.UndefOr[SchemaInstallment] = js.native
  
  /**
    * The instore product location. Supported only for local products.
    */
  var instoreProductLocation: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#inventory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Loyalty points that users receive after purchasing the item. Japan only.
    */
  var loyaltyPoints: js.UndefOr[SchemaLoyaltyPoints] = js.native
  
  /**
    * Store pickup information. Only supported for local inventory. Not setting
    * pickup means &quot;don&#39;t update&quot; while setting it to the empty
    * value ({} in JSON) means &quot;delete&quot;. Otherwise, pickupMethod and
    * pickupSla must be set together, unless pickupMethod is &quot;not
    * supported&quot;.
    */
  var pickup: js.UndefOr[SchemaInventoryPickup] = js.native
  
  /**
    * The price of the product.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The quantity of the product. Must be equal to or greater than zero.
    * Supported only for local products.
    */
  var quantity: js.UndefOr[Double] = js.native
  
  /**
    * The sale price of the product. Mandatory if sale_price_effective_date is
    * defined.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * A date range represented by a pair of ISO 8601 dates separated by a
    * space, comma, or slash. Both dates might be specified as &#39;null&#39;
    * if undecided.
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  
  /**
    * The quantity of the product that is available for selling on Google.
    * Supported only for online products.
    */
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.native
}
object SchemaInventory {
  
  @scala.inline
  def apply(): SchemaInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventory]
  }
  
  @scala.inline
  implicit class SchemaInventoryMutableBuilder[Self <: SchemaInventory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
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
    def setInstallment(value: SchemaInstallment): Self = StObject.set(x, "installment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallmentUndefined: Self = StObject.set(x, "installment", js.undefined)
    
    @scala.inline
    def setInstoreProductLocation(value: String): Self = StObject.set(x, "instoreProductLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstoreProductLocationUndefined: Self = StObject.set(x, "instoreProductLocation", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLoyaltyPoints(value: SchemaLoyaltyPoints): Self = StObject.set(x, "loyaltyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoyaltyPointsUndefined: Self = StObject.set(x, "loyaltyPoints", js.undefined)
    
    @scala.inline
    def setPickup(value: SchemaInventoryPickup): Self = StObject.set(x, "pickup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupUndefined: Self = StObject.set(x, "pickup", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setSalePrice(value: SchemaPrice): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = StObject.set(x, "salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalePriceEffectiveDateUndefined: Self = StObject.set(x, "salePriceEffectiveDate", js.undefined)
    
    @scala.inline
    def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
    
    @scala.inline
    def setSellOnGoogleQuantity(value: Double): Self = StObject.set(x, "sellOnGoogleQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellOnGoogleQuantityUndefined: Self = StObject.set(x, "sellOnGoogleQuantity", js.undefined)
  }
}
