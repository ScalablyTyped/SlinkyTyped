package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayerInfo extends js.Object {
  var billing_address: js.UndefOr[Address] = js.native
  var birth_date: js.UndefOr[String] = js.native
  var country_code: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  val first_name: js.UndefOr[String] = js.native
  val last_name: js.UndefOr[String] = js.native
  val middle_name: js.UndefOr[String] = js.native
  val payer_id: js.UndefOr[String] = js.native
  val salutation: js.UndefOr[String] = js.native
  val shipping_address: js.UndefOr[Address] = js.native
  val suffix: js.UndefOr[String] = js.native
  var tax_id: js.UndefOr[String] = js.native
  var tax_id_type: js.UndefOr[String] = js.native
}

object PayerInfo {
  @scala.inline
  def apply(): PayerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayerInfo]
  }
  @scala.inline
  implicit class PayerInfoOps[Self <: PayerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling_address(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address")(js.undefined)
        ret
    }
    @scala.inline
    def withBirth_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birth_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBirth_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birth_date")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddle_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddle_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle_name")(js.undefined)
        ret
    }
    @scala.inline
    def withPayer_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayer_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSalutation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalutation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salutation")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_address(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
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
    @scala.inline
    def withTax_id_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_id_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_type")(js.undefined)
        ret
    }
  }
  
}

