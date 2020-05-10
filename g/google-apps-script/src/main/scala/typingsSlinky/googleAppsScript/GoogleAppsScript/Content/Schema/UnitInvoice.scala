package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitInvoice extends js.Object {
  var additionalCharges: js.UndefOr[js.Array[UnitInvoiceAdditionalCharge]] = js.native
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
  var unitPricePretax: js.UndefOr[Price] = js.native
  var unitPriceTaxes: js.UndefOr[js.Array[UnitInvoiceTaxLine]] = js.native
}

object UnitInvoice {
  @scala.inline
  def apply(): UnitInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoice]
  }
  @scala.inline
  implicit class UnitInvoiceOps[Self <: UnitInvoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalCharges(value: js.Array[UnitInvoiceAdditionalCharge]): Self = {
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
    def withPromotions(value: js.Array[Promotion]): Self = {
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
    def withUnitPricePretax(value: Price): Self = {
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
    def withUnitPriceTaxes(value: js.Array[UnitInvoiceTaxLine]): Self = {
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

