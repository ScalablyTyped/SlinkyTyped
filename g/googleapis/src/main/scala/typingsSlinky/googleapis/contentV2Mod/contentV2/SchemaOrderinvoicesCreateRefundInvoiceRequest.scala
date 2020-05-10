package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderinvoicesCreateRefundInvoiceRequest extends js.Object {
  /**
    * [required] The ID of the invoice.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * [required] The ID of the operation, unique across all operations for a
    * given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Option to create a refund-only invoice. Exactly one of refundOnlyOption
    * or returnOption must be provided.
    */
  var refundOnlyOption: js.UndefOr[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.native
  /**
    * Option to create an invoice for a refund and mark all items within the
    * invoice as returned. Exactly one of refundOnlyOption or returnOption must
    * be provided.
    */
  var returnOption: js.UndefOr[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.native
  /**
    * Invoice details for different shipment groups.
    */
  var shipmentInvoices: js.UndefOr[js.Array[SchemaShipmentInvoice]] = js.native
}

object SchemaOrderinvoicesCreateRefundInvoiceRequest {
  @scala.inline
  def apply(): SchemaOrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCreateRefundInvoiceRequest]
  }
  @scala.inline
  implicit class SchemaOrderinvoicesCreateRefundInvoiceRequestOps[Self <: SchemaOrderinvoicesCreateRefundInvoiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvoiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceId")(js.undefined)
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
    def withRefundOnlyOption(value: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundOnlyOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefundOnlyOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundOnlyOption")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnOption(value: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnOption")(js.undefined)
        ret
    }
    @scala.inline
    def withShipmentInvoices(value: js.Array[SchemaShipmentInvoice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentInvoices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipmentInvoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentInvoices")(js.undefined)
        ret
    }
  }
  
}

