package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcommerceData extends js.Object {
  
  var actionType: js.UndefOr[String] = js.native
  
  var ecommerceType: js.UndefOr[String] = js.native
  
  var products: js.UndefOr[js.Array[ProductData]] = js.native
  
  var transaction: js.UndefOr[TransactionData] = js.native
}
object EcommerceData {
  
  @scala.inline
  def apply(): EcommerceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcommerceData]
  }
  
  @scala.inline
  implicit class EcommerceDataOps[Self <: EcommerceData] (val x: Self) extends AnyVal {
    
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
    def setActionType(value: String): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setEcommerceType(value: String): Self = this.set("ecommerceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcommerceType: Self = this.set("ecommerceType", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: ProductData*): Self = this.set("products", js.Array(value :_*))
    
    @scala.inline
    def setProducts(value: js.Array[ProductData]): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    
    @scala.inline
    def setTransaction(value: TransactionData): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
