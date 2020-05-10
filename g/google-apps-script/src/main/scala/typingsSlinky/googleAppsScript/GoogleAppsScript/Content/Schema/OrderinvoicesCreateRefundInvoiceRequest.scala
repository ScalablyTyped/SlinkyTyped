package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderinvoicesCreateRefundInvoiceRequest extends js.Object {
  var invoiceId: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var refundOnlyOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.native
  var returnOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.native
  var shipmentInvoices: js.UndefOr[js.Array[ShipmentInvoice]] = js.native
}

object OrderinvoicesCreateRefundInvoiceRequest {
  @scala.inline
  def apply(): OrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCreateRefundInvoiceRequest]
  }
  @scala.inline
  implicit class OrderinvoicesCreateRefundInvoiceRequestOps[Self <: OrderinvoicesCreateRefundInvoiceRequest] (val x: Self) extends AnyVal {
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
    def withRefundOnlyOption(value: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption): Self = {
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
    def withReturnOption(value: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption): Self = {
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
    def withShipmentInvoices(value: js.Array[ShipmentInvoice]): Self = {
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

