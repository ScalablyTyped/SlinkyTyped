package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebase.mod.firebase.analytics.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Affiliation
  extends /* key */ StringDictionary[js.Any] {
  
  var affiliation: js.UndefOr[String] = js.native
  
  var coupon: js.UndefOr[String] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  var shipping: js.UndefOr[typingsSlinky.firebase.mod.firebase.analytics.Currency] = js.native
  
  var tax: js.UndefOr[typingsSlinky.firebase.mod.firebase.analytics.Currency] = js.native
  
  var transaction_id: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object Affiliation {
  
  @scala.inline
  def apply(): Affiliation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Affiliation]
  }
  
  @scala.inline
  implicit class AffiliationMutableBuilder[Self <: Affiliation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    @scala.inline
    def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setShipping(value: typingsSlinky.firebase.mod.firebase.analytics.Currency): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    @scala.inline
    def setTax(value: typingsSlinky.firebase.mod.firebase.analytics.Currency): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
