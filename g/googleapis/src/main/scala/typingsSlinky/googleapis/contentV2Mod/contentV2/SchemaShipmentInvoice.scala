package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShipmentInvoice extends js.Object {
  /**
    * [required] Invoice summary.
    */
  var invoiceSummary: js.UndefOr[SchemaInvoiceSummary] = js.native
  /**
    * [required] Invoice details per line item.
    */
  var lineItemInvoices: js.UndefOr[js.Array[SchemaShipmentInvoiceLineItemInvoice]] = js.native
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in
    * the shipLineItems method and is used to group multiple line items that
    * have the same kind of shipping charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
}

object SchemaShipmentInvoice {
  @scala.inline
  def apply(): SchemaShipmentInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentInvoice]
  }
  @scala.inline
  implicit class SchemaShipmentInvoiceOps[Self <: SchemaShipmentInvoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

