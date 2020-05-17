package typingsSlinky.recurlyRecurlyJs.pricingMod

import typingsSlinky.recurlyRecurlyJs.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tax extends js.Object {
  var amounts: js.UndefOr[Next] = js.native
  var tax_code: String = js.native
  var vat_number: js.UndefOr[String] = js.native
}

object Tax {
  @scala.inline
  def apply(tax_code: String): Tax = {
    val __obj = js.Dynamic.literal(tax_code = tax_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tax]
  }
  @scala.inline
  implicit class TaxOps[Self <: Tax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTax_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmounts(value: Next): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amounts")(js.undefined)
        ret
    }
    @scala.inline
    def withVat_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vat_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVat_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vat_number")(js.undefined)
        ret
    }
  }
  
}

