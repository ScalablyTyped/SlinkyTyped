package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLineItem extends js.Object {
  var annotations: js.UndefOr[js.Array[OrderMerchantProvidedAnnotation]] = js.native
  var cancellations: js.UndefOr[js.Array[OrderCancellation]] = js.native
  var id: js.UndefOr[String] = js.native
  var price: js.UndefOr[Price] = js.native
  var product: js.UndefOr[OrderLineItemProduct] = js.native
  var quantityCanceled: js.UndefOr[Double] = js.native
  var quantityDelivered: js.UndefOr[Double] = js.native
  var quantityOrdered: js.UndefOr[Double] = js.native
  var quantityPending: js.UndefOr[Double] = js.native
  var quantityReturned: js.UndefOr[Double] = js.native
  var quantityShipped: js.UndefOr[Double] = js.native
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.native
  var returns: js.UndefOr[js.Array[OrderReturn]] = js.native
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.native
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
    def withAnnotations(value: js.Array[OrderMerchantProvidedAnnotation]): Self = {
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
    def withCancellations(value: js.Array[OrderCancellation]): Self = {
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
    def withPrice(value: Price): Self = {
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
    def withProduct(value: OrderLineItemProduct): Self = {
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
    def withReturnInfo(value: OrderLineItemReturnInfo): Self = {
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
    def withReturns(value: js.Array[OrderReturn]): Self = {
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
    def withShippingDetails(value: OrderLineItemShippingDetails): Self = {
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
    def withTax(value: Price): Self = {
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

