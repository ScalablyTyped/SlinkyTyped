package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUnitInvoiceTaxLine extends js.Object {
  /**
    * [required] Tax amount for the tax type.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * Optional name of the tax type. This should only be provided if taxType is
    * otherFeeTax.
    */
  var taxName: js.UndefOr[String] = js.native
  /**
    * [required] Type of the tax.
    */
  var taxType: js.UndefOr[String] = js.native
}

object SchemaUnitInvoiceTaxLine {
  @scala.inline
  def apply(): SchemaUnitInvoiceTaxLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoiceTaxLine]
  }
  @scala.inline
  implicit class SchemaUnitInvoiceTaxLineOps[Self <: SchemaUnitInvoiceTaxLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaxAmount(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxName")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxType")(js.undefined)
        ret
    }
  }
  
}

