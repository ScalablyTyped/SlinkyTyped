package typingsSlinky.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTestOrderLineItem extends StObject {
  
  /**
    * Product data from the time of the order placement.
    */
  var product: js.UndefOr[SchemaTestOrderLineItemProduct] = js.native
  
  /**
    * Number of items ordered.
    */
  var quantityOrdered: js.UndefOr[Double] = js.native
  
  /**
    * Details of the return policy for the line item.
    */
  var returnInfo: js.UndefOr[SchemaOrderLineItemReturnInfo] = js.native
  
  /**
    * Details of the requested shipping for the line item.
    */
  var shippingDetails: js.UndefOr[SchemaOrderLineItemShippingDetails] = js.native
}
object SchemaTestOrderLineItem {
  
  @scala.inline
  def apply(): SchemaTestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderLineItem]
  }
  
  @scala.inline
  implicit class SchemaTestOrderLineItemMutableBuilder[Self <: SchemaTestOrderLineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProduct(value: SchemaTestOrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setQuantityOrdered(value: Double): Self = StObject.set(x, "quantityOrdered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityOrderedUndefined: Self = StObject.set(x, "quantityOrdered", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: SchemaOrderLineItemReturnInfo): Self = StObject.set(x, "returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnInfoUndefined: Self = StObject.set(x, "returnInfo", js.undefined)
    
    @scala.inline
    def setShippingDetails(value: SchemaOrderLineItemShippingDetails): Self = StObject.set(x, "shippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingDetailsUndefined: Self = StObject.set(x, "shippingDetails", js.undefined)
  }
}
