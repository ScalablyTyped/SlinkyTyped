package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderinvoicesCreateChargeInvoiceRequest extends js.Object {
  var invoiceId: js.UndefOr[String] = js.native
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.native
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.native
  var operationId: js.UndefOr[String] = js.native
  var shipmentGroupId: js.UndefOr[String] = js.native
}

object OrderinvoicesCreateChargeInvoiceRequest {
  @scala.inline
  def apply(): OrderinvoicesCreateChargeInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCreateChargeInvoiceRequest]
  }
  @scala.inline
  implicit class OrderinvoicesCreateChargeInvoiceRequestOps[Self <: OrderinvoicesCreateChargeInvoiceRequest] (val x: Self) extends AnyVal {
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
    def withInvoiceSummary(value: InvoiceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoiceSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItemInvoices(value: js.Array[ShipmentInvoiceLineItemInvoice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemInvoices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItemInvoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemInvoices")(js.undefined)
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
    def withShipmentGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipmentGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentGroupId")(js.undefined)
        ret
    }
  }
  
}

