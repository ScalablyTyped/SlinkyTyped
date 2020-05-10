package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactDetail extends js.Object {
  /**
    * First line of the contact's address.
    */
  var AddressLine1: js.UndefOr[AddressLine] = js.native
  /**
    * Second line of contact's address, if any.
    */
  var AddressLine2: js.UndefOr[AddressLine] = js.native
  /**
    * The city of the contact's address.
    */
  var City: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.City] = js.native
  /**
    * Indicates whether the contact is a person, company, association, or public organization. If you choose an option other than PERSON, you must enter an organization name, and you can't enable privacy protection for the contact.
    */
  var ContactType: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.ContactType] = js.native
  /**
    * Code for the country of the contact's address.
    */
  var CountryCode: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.CountryCode] = js.native
  /**
    * Email address of the contact.
    */
  var Email: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.Email] = js.native
  /**
    * A list of name-value pairs for parameters required by certain top-level domains.
    */
  var ExtraParams: js.UndefOr[ExtraParamList] = js.native
  /**
    * Fax number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code]". For example, a US phone number might appear as "+1.1234567890".
    */
  var Fax: js.UndefOr[ContactNumber] = js.native
  /**
    * First name of contact.
    */
  var FirstName: js.UndefOr[ContactName] = js.native
  /**
    * Last name of contact.
    */
  var LastName: js.UndefOr[ContactName] = js.native
  /**
    * Name of the organization for contact types other than PERSON.
    */
  var OrganizationName: js.UndefOr[ContactName] = js.native
  /**
    * The phone number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as "+1.1234567890".
    */
  var PhoneNumber: js.UndefOr[ContactNumber] = js.native
  /**
    * The state or province of the contact's city.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.State] = js.native
  /**
    * The zip or postal code of the contact's address.
    */
  var ZipCode: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.ZipCode] = js.native
}

object ContactDetail {
  @scala.inline
  def apply(): ContactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactDetail]
  }
  @scala.inline
  implicit class ContactDetailOps[Self <: ContactDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressLine1(value: AddressLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressLine1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLine1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressLine1")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressLine2(value: AddressLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressLine2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLine2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressLine2")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: City): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(js.undefined)
        ret
    }
    @scala.inline
    def withContactType(value: ContactType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactType")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCode(value: CountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraParams(value: ExtraParamList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFax(value: ContactNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fax")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: ContactName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: ContactName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationName(value: ContactName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationName")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: ContactNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withZipCode(value: ZipCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipCode")(js.undefined)
        ret
    }
  }
  
}

