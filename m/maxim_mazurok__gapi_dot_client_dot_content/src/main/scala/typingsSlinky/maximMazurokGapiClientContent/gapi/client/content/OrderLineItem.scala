package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderLineItem extends js.Object {
  
  /** Price and tax adjustments applied on the line item. */
  var adjustments: js.UndefOr[js.Array[OrderLineItemAdjustment]] = js.native
  
  /** Annotations that are attached to the line item. */
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.native
  
  /** Cancellations of the line item. */
  var cancellations: js.UndefOr[js.Array[OrderCancellation]] = js.native
  
  /** The ID of the line item. */
  var id: js.UndefOr[String] = js.native
  
  /** Total price for the line item. For example, if two items for $10 are purchased, the total price will be $20. */
  var price: js.UndefOr[Price] = js.native
  
  /**
    * Product data as seen by customer from the time of the order placement. Note that certain attributes values (e.g. title or gtin) might be reformatted and no longer match values
    * submitted via product feed.
    */
  var product: js.UndefOr[OrderLineItemProduct] = js.native
  
  /** Number of items canceled. */
  var quantityCanceled: js.UndefOr[Double] = js.native
  
  /** Number of items delivered. */
  var quantityDelivered: js.UndefOr[Double] = js.native
  
  /** Number of items ordered. */
  var quantityOrdered: js.UndefOr[Double] = js.native
  
  /** Number of items pending. */
  var quantityPending: js.UndefOr[Double] = js.native
  
  /** Number of items ready for pickup. */
  var quantityReadyForPickup: js.UndefOr[Double] = js.native
  
  /** Number of items returned. */
  var quantityReturned: js.UndefOr[Double] = js.native
  
  /** Number of items shipped. */
  var quantityShipped: js.UndefOr[Double] = js.native
  
  /** Number of items undeliverable. */
  var quantityUndeliverable: js.UndefOr[Double] = js.native
  
  /** Details of the return policy for the line item. */
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.native
  
  /** Returns of the line item. */
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.native
  
  /** Details of the requested shipping for the line item. */
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.native
  
  /** Total tax amount for the line item. For example, if two items are purchased, and each have a cost tax of $2, the total tax amount will be $4. */
  var tax: js.UndefOr[Price] = js.native
}
object OrderLineItem {
  
  @scala.inline
  def apply(): OrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItem]
  }
  
  @scala.inline
  implicit class OrderLineItemOps[Self <: OrderLineItem] (val x: Self) extends AnyVal {
    
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
    def setAdjustmentsVarargs(value: OrderLineItemAdjustment*): Self = this.set("adjustments", js.Array(value :_*))
    
    @scala.inline
    def setAdjustments(value: js.Array[OrderLineItemAdjustment]): Self = this.set("adjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustments: Self = this.set("adjustments", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: OrderMerchantProvidedAnnotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[OrderMerchantProvidedAnnotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setCancellationsVarargs(value: OrderCancellation*): Self = this.set("cancellations", js.Array(value :_*))
    
    @scala.inline
    def setCancellations(value: js.Array[OrderCancellation]): Self = this.set("cancellations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellations: Self = this.set("cancellations", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setProduct(value: OrderLineItemProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setQuantityCanceled(value: Double): Self = this.set("quantityCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityCanceled: Self = this.set("quantityCanceled", js.undefined)
    
    @scala.inline
    def setQuantityDelivered(value: Double): Self = this.set("quantityDelivered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityDelivered: Self = this.set("quantityDelivered", js.undefined)
    
    @scala.inline
    def setQuantityOrdered(value: Double): Self = this.set("quantityOrdered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityOrdered: Self = this.set("quantityOrdered", js.undefined)
    
    @scala.inline
    def setQuantityPending(value: Double): Self = this.set("quantityPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityPending: Self = this.set("quantityPending", js.undefined)
    
    @scala.inline
    def setQuantityReadyForPickup(value: Double): Self = this.set("quantityReadyForPickup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityReadyForPickup: Self = this.set("quantityReadyForPickup", js.undefined)
    
    @scala.inline
    def setQuantityReturned(value: Double): Self = this.set("quantityReturned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityReturned: Self = this.set("quantityReturned", js.undefined)
    
    @scala.inline
    def setQuantityShipped(value: Double): Self = this.set("quantityShipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityShipped: Self = this.set("quantityShipped", js.undefined)
    
    @scala.inline
    def setQuantityUndeliverable(value: Double): Self = this.set("quantityUndeliverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantityUndeliverable: Self = this.set("quantityUndeliverable", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: OrderLineItemReturnInfo): Self = this.set("returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnInfo: Self = this.set("returnInfo", js.undefined)
    
    @scala.inline
    def setReturnsVarargs(value: OrderReturn*): Self = this.set("returns", js.Array(value :_*))
    
    @scala.inline
    def setReturns(value: js.Array[OrderReturn]): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
    
    @scala.inline
    def setShippingDetails(value: OrderLineItemShippingDetails): Self = this.set("shippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingDetails: Self = this.set("shippingDetails", js.undefined)
    
    @scala.inline
    def setTax(value: Price): Self = this.set("tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
  }
}
