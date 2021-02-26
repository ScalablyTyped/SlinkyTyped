package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUnitInvoice extends StObject {
  
  /**
    * Additional charges for a unit, e.g. shipping costs.
    */
  var additionalCharges: js.UndefOr[js.Array[SchemaUnitInvoiceAdditionalCharge]] = js.native
  
  /**
    * Deprecated.
    */
  var promotions: js.UndefOr[js.Array[SchemaPromotion]] = js.native
  
  /**
    * [required] Price of the unit, before applying taxes.
    */
  var unitPricePretax: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Tax amounts to apply to the unit price.
    */
  var unitPriceTaxes: js.UndefOr[js.Array[SchemaUnitInvoiceTaxLine]] = js.native
}
object SchemaUnitInvoice {
  
  @scala.inline
  def apply(): SchemaUnitInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoice]
  }
  
  @scala.inline
  implicit class SchemaUnitInvoiceMutableBuilder[Self <: SchemaUnitInvoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalCharges(value: js.Array[SchemaUnitInvoiceAdditionalCharge]): Self = StObject.set(x, "additionalCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargesUndefined: Self = StObject.set(x, "additionalCharges", js.undefined)
    
    @scala.inline
    def setAdditionalChargesVarargs(value: SchemaUnitInvoiceAdditionalCharge*): Self = StObject.set(x, "additionalCharges", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[SchemaPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: SchemaPromotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
    
    @scala.inline
    def setUnitPricePretax(value: SchemaPrice): Self = StObject.set(x, "unitPricePretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPricePretaxUndefined: Self = StObject.set(x, "unitPricePretax", js.undefined)
    
    @scala.inline
    def setUnitPriceTaxes(value: js.Array[SchemaUnitInvoiceTaxLine]): Self = StObject.set(x, "unitPriceTaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceTaxesUndefined: Self = StObject.set(x, "unitPriceTaxes", js.undefined)
    
    @scala.inline
    def setUnitPriceTaxesVarargs(value: SchemaUnitInvoiceTaxLine*): Self = StObject.set(x, "unitPriceTaxes", js.Array(value :_*))
  }
}
