package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCancelLineItemRequest extends js.Object {
  /**
    * Amount to refund for the cancelation. Optional. If not set, Google will calculate the default based on the price and tax of the items involved. The
    * amount must not be larger than the net amount left on the order.
    */
  var amount: js.UndefOr[Price] = js.native
  /** The ID of the line item to cancel. */
  var lineItemId: js.UndefOr[String] = js.native
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
  /** The quantity to cancel. */
  var quantity: js.UndefOr[Double] = js.native
  /** The reason for the cancellation. */
  var reason: js.UndefOr[String] = js.native
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.native
}

object OrdersCancelLineItemRequest {
  @scala.inline
  def apply(): OrdersCancelLineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCancelLineItemRequest]
  }
  @scala.inline
  implicit class OrdersCancelLineItemRequestOps[Self <: OrdersCancelLineItemRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
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
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonText")(js.undefined)
        ret
    }
  }
  
}

