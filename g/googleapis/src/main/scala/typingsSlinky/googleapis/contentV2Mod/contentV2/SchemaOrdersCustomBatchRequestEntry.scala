package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * Required for cancel method.
    */
  var cancel: js.UndefOr[SchemaOrdersCustomBatchRequestEntryCancel] = js.native
  /**
    * Required for cancelLineItem method.
    */
  var cancelLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryCancelLineItem] = js.native
  /**
    * Required for inStoreReturnLineItem method.
    */
  var inStoreRefundLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The merchant order ID. Required for updateMerchantOrderId and
    * getByMerchantOrderId methods.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * The method to apply.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    * Required for all methods beside get and getByMerchantOrderId.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The ID of the order. Required for all methods beside
    * getByMerchantOrderId.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * Required for refund method.
    */
  var refund: js.UndefOr[SchemaOrdersCustomBatchRequestEntryRefund] = js.native
  /**
    * Required for rejectReturnLineItem method.
    */
  var rejectReturnLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryRejectReturnLineItem] = js.native
  /**
    * Required for returnLineItem method.
    */
  var returnLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryReturnLineItem] = js.native
  /**
    * Required for returnRefundLineItem method.
    */
  var returnRefundLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem] = js.native
  /**
    * Required for setLineItemMetadata method.
    */
  var setLineItemMetadata: js.UndefOr[SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata] = js.native
  /**
    * Required for shipLineItems method.
    */
  var shipLineItems: js.UndefOr[SchemaOrdersCustomBatchRequestEntryShipLineItems] = js.native
  /**
    * Required for updateLineItemShippingDate method.
    */
  var updateLineItemShippingDetails: js.UndefOr[SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] = js.native
  /**
    * Required for updateShipment method.
    */
  var updateShipment: js.UndefOr[SchemaOrdersCustomBatchRequestEntryUpdateShipment] = js.native
}

object SchemaOrdersCustomBatchRequestEntry {
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryOps[Self <: SchemaOrdersCustomBatchRequestEntry] (val x: Self) extends AnyVal {
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
    def withCancel(value: SchemaOrdersCustomBatchRequestEntryCancel): Self = {
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
    def withCancelLineItem(value: SchemaOrdersCustomBatchRequestEntryCancelLineItem): Self = {
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
    def withInStoreRefundLineItem(value: SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem): Self = {
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
    def withRefund(value: SchemaOrdersCustomBatchRequestEntryRefund): Self = {
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
    def withRejectReturnLineItem(value: SchemaOrdersCustomBatchRequestEntryRejectReturnLineItem): Self = {
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
    def withReturnLineItem(value: SchemaOrdersCustomBatchRequestEntryReturnLineItem): Self = {
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
    def withReturnRefundLineItem(value: SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem): Self = {
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
    def withSetLineItemMetadata(value: SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata): Self = {
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
    def withShipLineItems(value: SchemaOrdersCustomBatchRequestEntryShipLineItems): Self = {
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
    def withUpdateLineItemShippingDetails(value: SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails): Self = {
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
    def withUpdateShipment(value: SchemaOrdersCustomBatchRequestEntryUpdateShipment): Self = {
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

