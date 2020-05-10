package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUnitInvoice extends js.Object {
  /**
    * Additional charges for a unit, e.g. shipping costs.
    */
  var additionalCharges: js.UndefOr[js.Array[SchemaUnitInvoiceAdditionalCharge]] = js.native
  /**
    * [required] Pre-tax or post-tax price of the unit depending on the
    * locality of the order.
    */
  var unitPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Tax amounts to apply to the unit price.
    */
  var unitPriceTaxes: js.UndefOr[js.Array[SchemaUnitInvoiceTaxLine]] = js.native
}

object SchemaUnitInvoice {
  @scala.inline
  def apply(): SchemaUnitInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoice]
  }
  @scala.inline
  implicit class SchemaUnitInvoiceOps[Self <: SchemaUnitInvoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalCharges(value: js.Array[SchemaUnitInvoiceAdditionalCharge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalCharges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalCharges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalCharges")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitPrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitPriceTaxes(value: js.Array[SchemaUnitInvoiceTaxLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPriceTaxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPriceTaxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPriceTaxes")(js.undefined)
        ret
    }
  }
  
}

