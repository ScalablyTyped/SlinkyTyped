package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItem extends js.Object {
  /**
    * Annotations that are attached to the line item.
    */
  var annotations: js.UndefOr[js.Array[SchemaOrderMerchantProvidedAnnotation]] = js.native
  /**
    * Cancellations of the line item.
    */
  var cancellations: js.UndefOr[js.Array[SchemaOrderCancellation]] = js.native
  /**
    * The ID of the line item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Total price for the line item. For example, if two items for $10 are
    * purchased, the total price will be $20.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  /**
    * Product data as seen by customer from the time of the order placement.
    * Note that certain attributes values (e.g. title or gtin) might be
    * reformatted and no longer match values submitted via product feed.
    */
  var product: js.UndefOr[SchemaOrderLineItemProduct] = js.native
  /**
    * Number of items canceled.
    */
  var quantityCanceled: js.UndefOr[Double] = js.native
  /**
    * Number of items delivered.
    */
  var quantityDelivered: js.UndefOr[Double] = js.native
  /**
    * Number of items ordered.
    */
  var quantityOrdered: js.UndefOr[Double] = js.native
  /**
    * Number of items pending.
    */
  var quantityPending: js.UndefOr[Double] = js.native
  /**
    * Number of items returned.
    */
  var quantityReturned: js.UndefOr[Double] = js.native
  /**
    * Number of items shipped.
    */
  var quantityShipped: js.UndefOr[Double] = js.native
  /**
    * Details of the return policy for the line item.
    */
  var returnInfo: js.UndefOr[SchemaOrderLineItemReturnInfo] = js.native
  /**
    * Returns of the line item.
    */
  var returns: js.UndefOr[js.Array[SchemaOrderReturn]] = js.native
  /**
    * Details of the requested shipping for the line item.
    */
  var shippingDetails: js.UndefOr[SchemaOrderLineItemShippingDetails] = js.native
  /**
    * Total tax amount for the line item. For example, if two items are
    * purchased, and each have a cost tax of $2, the total tax amount will be
    * $4.
    */
  var tax: js.UndefOr[SchemaPrice] = js.native
}

object SchemaOrderLineItem {
  @scala.inline
  def apply(): SchemaOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItem]
  }
  @scala.inline
  implicit class SchemaOrderLineItemOps[Self <: SchemaOrderLineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: js.Array[SchemaOrderMerchantProvidedAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withCancellations(value: js.Array[SchemaOrderCancellation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellations")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: SchemaOrderLineItemProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityCanceled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantityCanceled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityCanceled")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityDelivered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityDelivered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantityDelivered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityDelivered")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityOrdered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityOrdered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantityOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityOrdered")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantityPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityPending")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityReturned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityReturned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantityReturned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityReturned")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantityShipped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityShipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantityShipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantityShipped")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnInfo(value: SchemaOrderLineItemReturnInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withReturns(value: js.Array[SchemaOrderReturn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returns")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingDetails(value: SchemaOrderLineItemShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTax(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(js.undefined)
        ret
    }
  }
  
}

