package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var cancel: js.UndefOr[OrdersCustomBatchRequestEntryCancel] = js.native
  var cancelLineItem: js.UndefOr[OrdersCustomBatchRequestEntryCancelLineItem] = js.native
  var inStoreRefundLineItem: js.UndefOr[OrdersCustomBatchRequestEntryInStoreRefundLineItem] = js.native
  var merchantId: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var orderId: js.UndefOr[String] = js.native
  var refund: js.UndefOr[OrdersCustomBatchRequestEntryRefund] = js.native
  var rejectReturnLineItem: js.UndefOr[OrdersCustomBatchRequestEntryRejectReturnLineItem] = js.native
  var returnLineItem: js.UndefOr[OrdersCustomBatchRequestEntryReturnLineItem] = js.native
  var returnRefundLineItem: js.UndefOr[OrdersCustomBatchRequestEntryReturnRefundLineItem] = js.native
  var setLineItemMetadata: js.UndefOr[OrdersCustomBatchRequestEntrySetLineItemMetadata] = js.native
  var shipLineItems: js.UndefOr[OrdersCustomBatchRequestEntryShipLineItems] = js.native
  var updateLineItemShippingDetails: js.UndefOr[OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] = js.native
  var updateShipment: js.UndefOr[OrdersCustomBatchRequestEntryUpdateShipment] = js.native
}

object OrdersCustomBatchRequestEntry {
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryOps[Self <: OrdersCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: OrdersCustomBatchRequestEntryCancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelLineItem(value: OrdersCustomBatchRequestEntryCancelLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLineItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelLineItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLineItem")(js.undefined)
        ret
    }
    @scala.inline
    def withInStoreRefundLineItem(value: OrdersCustomBatchRequestEntryInStoreRefundLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inStoreRefundLineItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInStoreRefundLineItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inStoreRefundLineItem")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
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
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund(value: OrdersCustomBatchRequestEntryRefund): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectReturnLineItem(value: OrdersCustomBatchRequestEntryRejectReturnLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectReturnLineItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectReturnLineItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectReturnLineItem")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnLineItem(value: OrdersCustomBatchRequestEntryReturnLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnLineItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnLineItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnLineItem")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnRefundLineItem(value: OrdersCustomBatchRequestEntryReturnRefundLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnRefundLineItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnRefundLineItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnRefundLineItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLineItemMetadata(value: OrdersCustomBatchRequestEntrySetLineItemMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLineItemMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetLineItemMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLineItemMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withShipLineItems(value: OrdersCustomBatchRequestEntryShipLineItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipLineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipLineItems")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLineItemShippingDetails(value: OrdersCustomBatchRequestEntryUpdateLineItemShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLineItemShippingDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateLineItemShippingDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLineItemShippingDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateShipment(value: OrdersCustomBatchRequestEntryUpdateShipment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateShipment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateShipment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateShipment")(js.undefined)
        ret
    }
  }
  
}

