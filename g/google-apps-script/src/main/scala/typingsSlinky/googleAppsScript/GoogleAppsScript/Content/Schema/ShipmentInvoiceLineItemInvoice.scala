package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShipmentInvoiceLineItemInvoice extends js.Object {
  var lineItemId: js.UndefOr[String] = js.native
  var productId: js.UndefOr[String] = js.native
  var shipmentUnitIds: js.UndefOr[js.Array[String]] = js.native
  var unitInvoice: js.UndefOr[UnitInvoice] = js.native
}

object ShipmentInvoiceLineItemInvoice {
  @scala.inline
  def apply(): ShipmentInvoiceLineItemInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentInvoiceLineItemInvoice]
  }
  @scala.inline
  implicit class ShipmentInvoiceLineItemInvoiceOps[Self <: ShipmentInvoiceLineItemInvoice] (val x: Self) extends AnyVal {
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
    def withUnitInvoice(value: UnitInvoice): Self = {
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

