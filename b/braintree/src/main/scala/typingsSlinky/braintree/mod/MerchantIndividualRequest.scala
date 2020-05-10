package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantIndividualRequest extends js.Object {
  var address: MerchantAddressDetails = js.native
  var dateOfBirth: String = js.native
  var email: String = js.native
  var firstName: String = js.native
  var lastName: String = js.native
  var phone: js.UndefOr[String] = js.native
  var ssn: js.UndefOr[String] = js.native
  var ssnLast4: js.UndefOr[String] = js.native
}

object MerchantIndividualRequest {
  @scala.inline
  def apply(
    address: MerchantAddressDetails,
    dateOfBirth: String,
    email: String,
    firstName: String,
    lastName: String
  ): MerchantIndividualRequest = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], dateOfBirth = dateOfBirth.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantIndividualRequest]
  }
  @scala.inline
  implicit class MerchantIndividualRequestOps[Self <: MerchantIndividualRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: MerchantAddressDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateOfBirth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOfBirth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withSsn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssn")(js.undefined)
        ret
    }
    @scala.inline
    def withSsnLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssnLast4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsnLast4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssnLast4")(js.undefined)
        ret
    }
  }
  
}

