package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShipmentInvoiceLineItemInvoice extends js.Object {
  /**
    * ID of the line item. Either lineItemId or productId must be set.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * ID of the product. This is the REST ID used in the products service.
    * Either lineItemId or productId must be set.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * [required] The shipment unit ID is assigned by the merchant and defines
    * individual quantities within a line item. The same ID can be assigned to
    * units that are the same while units that differ must be assigned a
    * different ID (for example: free or promotional units).
    */
  var shipmentUnitIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * [required] Invoice details for a single unit.
    */
  var unitInvoice: js.UndefOr[SchemaUnitInvoice] = js.native
}

object SchemaShipmentInvoiceLineItemInvoice {
  @scala.inline
  def apply(): SchemaShipmentInvoiceLineItemInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShipmentInvoiceLineItemInvoice]
  }
  @scala.inline
  implicit class SchemaShipmentInvoiceLineItemInvoiceOps[Self <: SchemaShipmentInvoiceLineItemInvoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withShipmentUnitIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentUnitIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipmentUnitIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipmentUnitIds")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitInvoice(value: SchemaUnitInvoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitInvoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitInvoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitInvoice")(js.undefined)
        ret
    }
  }
  
}

