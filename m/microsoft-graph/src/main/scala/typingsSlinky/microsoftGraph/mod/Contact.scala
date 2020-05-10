package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends OutlookItem {
  // The name of the contact's assistant.
  var assistantName: js.UndefOr[String] = js.native
  /**
    * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[String] = js.native
  // The contact's business address.
  var businessAddress: js.UndefOr[PhysicalAddress] = js.native
  // The business home page of the contact.
  var businessHomePage: js.UndefOr[String] = js.native
  // The contact's business phone numbers.
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  // The names of the contact's children.
  var children: js.UndefOr[js.Array[String]] = js.native
  // The name of the contact's company.
  var companyName: js.UndefOr[String] = js.native
  // The contact's department.
  var department: js.UndefOr[String] = js.native
  /**
    * The contact's display name. You can specify the display name in a create or update operation. Note that later updates
    * to other properties may cause an automatically generated value to overwrite the displayName value you have specified.
    * To preserve a pre-existing value, always include it as displayName in an update operation.
    */
  var displayName: js.UndefOr[String] = js.native
  // The contact's email addresses.
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.native
  // The collection of open extensions defined for the contact. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // The name the contact is filed under.
  var fileAs: js.UndefOr[String] = js.native
  // The contact's generation.
  var generation: js.UndefOr[String] = js.native
  // The contact's given name.
  var givenName: js.UndefOr[String] = js.native
  // The contact's home address.
  var homeAddress: js.UndefOr[PhysicalAddress] = js.native
  // The contact's home phone numbers.
  var homePhones: js.UndefOr[js.Array[String]] = js.native
  // The contact's instant messaging (IM) addresses.
  var imAddresses: js.UndefOr[js.Array[String]] = js.native
  // The contact's initials.
  var initials: js.UndefOr[String] = js.native
  // The contact’s job title.
  var jobTitle: js.UndefOr[String] = js.native
  // The name of the contact's manager.
  var manager: js.UndefOr[String] = js.native
  // The contact's middle name.
  var middleName: js.UndefOr[String] = js.native
  // The contact's mobile phone number.
  var mobilePhone: js.UndefOr[String] = js.native
  // The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The contact's nickname.
  var nickName: js.UndefOr[String] = js.native
  // The location of the contact's office.
  var officeLocation: js.UndefOr[String] = js.native
  // Other addresses for the contact.
  var otherAddress: js.UndefOr[PhysicalAddress] = js.native
  // The ID of the contact's parent folder.
  var parentFolderId: js.UndefOr[String] = js.native
  // The user's notes about the contact.
  var personalNotes: js.UndefOr[String] = js.native
  // Optional contact picture. You can get or set a photo for a contact.
  var photo: js.UndefOr[ProfilePhoto] = js.native
  // The contact's profession.
  var profession: js.UndefOr[String] = js.native
  // The collection of single-value extended properties defined for the contact. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
  // The name of the contact's spouse/partner.
  var spouseName: js.UndefOr[String] = js.native
  // The contact's surname.
  var surname: js.UndefOr[String] = js.native
  // The contact's title.
  var title: js.UndefOr[String] = js.native
  // The phonetic Japanese company name of the contact.
  var yomiCompanyName: js.UndefOr[String] = js.native
  // The phonetic Japanese given name (first name) of the contact.
  var yomiGivenName: js.UndefOr[String] = js.native
  // The phonetic Japanese surname (last name) of the contact.
  var yomiSurname: js.UndefOr[String] = js.native
}

object Contact {
  @scala.inline
  def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssistantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssistantName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistantName")(js.undefined)
        ret
    }
    @scala.inline
    def withBirthday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBirthday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthday")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessAddress(value: PhysicalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessHomePage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessHomePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessHomePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessHomePage")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessPhones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessPhones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessPhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessPhones")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddresses(value: js.Array[EmailAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFileAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileAs")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeAddress(value: PhysicalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withHomePhones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePhones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomePhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePhones")(js.undefined)
        ret
    }
    @scala.inline
    def withImAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withInitials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withManager(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(js.undefined)
        ret
    }
    @scala.inline
    def withMobilePhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobilePhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhone")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withNickName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickName")(js.undefined)
        ret
    }
    @scala.inline
    def withOfficeLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfficeLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officeLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherAddress(value: PhysicalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withParentFolderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentFolderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFolderId")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: ProfilePhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withProfession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profession")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSpouseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spouseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpouseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spouseName")(js.undefined)
        ret
    }
    @scala.inline
    def withSurname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withYomiCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiCompanyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYomiCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiCompanyName")(js.undefined)
        ret
    }
    @scala.inline
    def withYomiGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiGivenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYomiGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiGivenName")(js.undefined)
        ret
    }
    @scala.inline
    def withYomiSurname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiSurname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYomiSurname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiSurname")(js.undefined)
        ret
    }
  }
  
}

