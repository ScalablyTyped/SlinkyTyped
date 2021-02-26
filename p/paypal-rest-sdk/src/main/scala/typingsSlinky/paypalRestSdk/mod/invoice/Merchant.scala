package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.paypalRestSdk.mod.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Merchant extends Person {
  
  var additional_info: js.UndefOr[String] = js.native
  
  var additional_info_label: js.UndefOr[String] = js.native
  
  var fax: js.UndefOr[Phone] = js.native
  
  var tax_id: js.UndefOr[String] = js.native
}
object Merchant {
  
  @scala.inline
  def apply(): Merchant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Merchant]
  }
  
  @scala.inline
  implicit class MerchantMutableBuilder[Self <: Merchant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
    
    @scala.inline
    def setAdditional_info_label(value: String): Self = StObject.set(x, "additional_info_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_info_labelUndefined: Self = StObject.set(x, "additional_info_label", js.undefined)
    
    @scala.inline
    def setFax(value: Phone): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    @scala.inline
    def setTax_id(value: String): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_idUndefined: Self = StObject.set(x, "tax_id", js.undefined)
  }
}
