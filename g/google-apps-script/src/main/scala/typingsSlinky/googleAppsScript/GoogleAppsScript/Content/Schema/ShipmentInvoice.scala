package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShipmentInvoice extends js.Object {
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.native
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.native
  var shipmentGroupId: js.UndefOr[String] = js.native
}

object ShipmentInvoice {
  @scala.inline
  def apply(): ShipmentInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentInvoice]
  }
  @scala.inline
  implicit class ShipmentInvoiceOps[Self <: ShipmentInvoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

