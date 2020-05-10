package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersUpdateLineItemShippingDetailsRequest extends js.Object {
  var deliverByDate: js.UndefOr[String] = js.native
  var lineItemId: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var productId: js.UndefOr[String] = js.native
  var shipByDate: js.UndefOr[String] = js.native
}

object OrdersUpdateLineItemShippingDetailsRequest {
  @scala.inline
  def apply(): OrdersUpdateLineItemShippingDetailsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersUpdateLineItemShippingDetailsRequest]
  }
  @scala.inline
  implicit class OrdersUpdateLineItemShippingDetailsRequestOps[Self <: OrdersUpdateLineItemShippingDetailsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliverByDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliverByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliverByDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withShipByDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipByDate")(js.undefined)
        ret
    }
  }
  
}

