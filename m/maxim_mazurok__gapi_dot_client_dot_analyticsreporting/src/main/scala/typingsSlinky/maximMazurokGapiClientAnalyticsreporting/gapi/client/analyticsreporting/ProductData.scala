package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductData extends StObject {
  
  /** The total revenue from purchased product items. */
  var itemRevenue: js.UndefOr[Double] = js.native
  
  /** The product name, supplied by the e-commerce tracking application, for the purchased items. */
  var productName: js.UndefOr[String] = js.native
  
  /** Total number of this product units in the transaction. */
  var productQuantity: js.UndefOr[String] = js.native
  
  /** Unique code that represents the product. */
  var productSku: js.UndefOr[String] = js.native
}
object ProductData {
  
  @scala.inline
  def apply(): ProductData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductData]
  }
  
  @scala.inline
  implicit class ProductDataMutableBuilder[Self <: ProductData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemRevenue(value: Double): Self = StObject.set(x, "itemRevenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRevenueUndefined: Self = StObject.set(x, "itemRevenue", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    @scala.inline
    def setProductQuantity(value: String): Self = StObject.set(x, "productQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductQuantityUndefined: Self = StObject.set(x, "productQuantity", js.undefined)
    
    @scala.inline
    def setProductSku(value: String): Self = StObject.set(x, "productSku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSkuUndefined: Self = StObject.set(x, "productSku", js.undefined)
  }
}
