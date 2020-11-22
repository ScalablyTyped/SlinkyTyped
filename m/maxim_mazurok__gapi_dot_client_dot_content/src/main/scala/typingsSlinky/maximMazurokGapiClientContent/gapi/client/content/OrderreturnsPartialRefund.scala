package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsPartialRefund extends js.Object {
  
  /** The pre-tax or post-tax amount to be refunded, depending on the location of the order. */
  var priceAmount: js.UndefOr[Price] = js.native
  
  /** Tax amount to be refunded. Note: This has different meaning depending on the location of the order. */
  var taxAmount: js.UndefOr[Price] = js.native
}
object OrderreturnsPartialRefund {
  
  @scala.inline
  def apply(): OrderreturnsPartialRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsPartialRefund]
  }
  
  @scala.inline
  implicit class OrderreturnsPartialRefundOps[Self <: OrderreturnsPartialRefund] (val x: Self) extends AnyVal {
    
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
    def setPriceAmount(value: Price): Self = this.set("priceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceAmount: Self = this.set("priceAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: Price): Self = this.set("taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxAmount: Self = this.set("taxAmount", js.undefined)
  }
}
