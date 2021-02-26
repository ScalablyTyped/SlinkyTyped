package typingsSlinky.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItem extends StObject {
  
  /**
    * Item description. Maximum 127 characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the line item is a debit (sale) or credit (refund) to the customer. Accepted values: `debit` and `credit`.
    */
  var kind: LineItemKind = js.native
  
  /**
    * Item name. Maximum 127 characters.
    */
  var name: String = js.native
  
  /**
    * Product or UPC code for the item. Maximum 127 characters.
    */
  var productCode: js.UndefOr[String] = js.native
  
  /**
    * Number of units of the item purchased. This value must be a whole number and can't be negative or zero.
    */
  var quantity: String = js.native
  
  /**
    * Per-unit price of the item. Can include up to 2 decimal places. This value can't be negative or zero.
    */
  var unitAmount: String = js.native
  
  /**
    * Per-unit tax price of the item. Can include up to 2 decimal places. This value can't be negative or zero.
    */
  var unitTaxAmount: js.UndefOr[String] = js.native
  
  /**
    * The URL to product information.
    */
  var url: js.UndefOr[String] = js.native
}
object LineItem {
  
  @scala.inline
  def apply(kind: LineItemKind, name: String, quantity: String, unitAmount: String): LineItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], unitAmount = unitAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItem]
  }
  
  @scala.inline
  implicit class LineItemMutableBuilder[Self <: LineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKind(value: LineItemKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCode(value: String): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitAmount(value: String): Self = StObject.set(x, "unitAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitTaxAmount(value: String): Self = StObject.set(x, "unitTaxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitTaxAmountUndefined: Self = StObject.set(x, "unitTaxAmount", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
