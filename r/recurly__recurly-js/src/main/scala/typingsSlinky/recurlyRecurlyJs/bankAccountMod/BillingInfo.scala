package typingsSlinky.recurlyRecurlyJs.bankAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingInfo extends js.Object {
  var account_number: String = js.native
  var account_number_confirmation: String = js.native
  var account_type: String = js.native
  var address1: js.UndefOr[String] = js.native
  var address2: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var iban: js.UndefOr[String] = js.native
  var name_on_account: String = js.native
  var postal_code: js.UndefOr[String] = js.native
  var routing_number: String = js.native
  var state: js.UndefOr[String] = js.native
  var vat_number: js.UndefOr[String] = js.native
}

object BillingInfo {
  @scala.inline
  def apply(
    account_number: String,
    account_number_confirmation: String,
    account_type: String,
    name_on_account: String,
    routing_number: String
  ): BillingInfo = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], account_number_confirmation = account_number_confirmation.asInstanceOf[js.Any], account_type = account_type.asInstanceOf[js.Any], name_on_account = name_on_account.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingInfo]
  }
  @scala.inline
  implicit class BillingInfoOps[Self <: BillingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_number_confirmation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_number_confirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName_on_account(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_on_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouting_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address1")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address2")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withIban(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iban")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIban: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iban")(js.undefined)
        ret
    }
    @scala.inline
    def withPostal_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostal_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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

