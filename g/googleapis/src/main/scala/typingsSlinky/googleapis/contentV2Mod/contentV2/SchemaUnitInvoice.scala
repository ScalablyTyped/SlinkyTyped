package typingsSlinky.googleapis.contentV2Mod.contentV2

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
    * Deprecated.
    */
  var promotions: js.UndefOr[js.Array[SchemaPromotion]] = js.native
  /**
    * [required] Price of the unit, before applying taxes.
    */
  var unitPricePretax: js.UndefOr[SchemaPrice] = js.native
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
    def withPromotions(value: js.Array[SchemaPromotion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitPricePretax(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPricePretax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPricePretax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPricePretax")(js.undefined)
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

