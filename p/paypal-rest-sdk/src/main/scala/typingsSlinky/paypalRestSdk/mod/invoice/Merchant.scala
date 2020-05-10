package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Merchant extends Person {
  var additional_info: js.UndefOr[String] = js.native
  var additional_info_label: js.UndefOr[String] = js.native
  var fax: js.UndefOr[Phone] = js.native
  var tax_id: js.UndefOr[String] = js.native
}

object Merchant {
  @scala.inline
  def apply(): Merchant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Merchant]
  }
  @scala.inline
  implicit class MerchantOps[Self <: Merchant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_info(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_info")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditional_info_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_info_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_info_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_info_label")(js.undefined)
        ret
    }
    @scala.inline
    def withFax(value: Phone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fax")(js.undefined)
        ret
    }
    @scala.inline
    def withTax_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id")(js.undefined)
        ret
    }
  }
  
}

