package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderinvoicesCreateChargeInvoiceRequest extends js.Object {
  /**
    * [required] The ID of the invoice.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * [required] Invoice summary.
    */
  var invoiceSummary: js.UndefOr[SchemaInvoiceSummary] = js.native
  /**
    * [required] Invoice details per line item.
    */
  var lineItemInvoices: js.UndefOr[js.Array[SchemaShipmentInvoiceLineItemInvoice]] = js.native
  /**
    * [required] The ID of the operation, unique across all operations for a
    * given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in
    * the shipLineItems method and is used to group multiple line items that
    * have the same kind of shipping charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
}

object SchemaOrderinvoicesCreateChargeInvoiceRequest {
  @scala.inline
  def apply(): SchemaOrderinvoicesCreateChargeInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCreateChargeInvoiceRequest]
  }
  @scala.inline
  implicit class SchemaOrderinvoicesCreateChargeInvoiceRequestOps[Self <: SchemaOrderinvoicesCreateChargeInvoiceRequest] (val x: Self) extends AnyVal {
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
    def withInvoiceSummary(value: SchemaInvoiceSummary): Self = {
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
    def withLineItemInvoices(value: js.Array[SchemaShipmentInvoiceLineItemInvoice]): Self = {
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

