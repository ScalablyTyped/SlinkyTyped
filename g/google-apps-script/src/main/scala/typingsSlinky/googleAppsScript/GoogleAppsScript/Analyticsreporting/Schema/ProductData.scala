package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductData extends js.Object {
  
  var itemRevenue: js.UndefOr[Double] = js.native
  
  var productName: js.UndefOr[String] = js.native
  
  var productQuantity: js.UndefOr[String] = js.native
  
  var productSku: js.UndefOr[String] = js.native
}
object ProductData {
  
  @scala.inline
  def apply(): ProductData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductData]
  }
  
  @scala.inline
  implicit class ProductDataOps[Self <: ProductData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemRevenue(value: Double): Self = this.set("itemRevenue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRevenue: Self = this.set("itemRevenue", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    
    @scala.inline
    def setProductQuantity(value: String): Self = this.set("productQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductQuantity: Self = this.set("productQuantity", js.undefined)
    
    @scala.inline
    def setProductSku(value: String): Self = this.set("productSku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductSku: Self = this.set("productSku", js.undefined)
  }
}
