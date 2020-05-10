package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends Entity {
  // The person's birthday.
  var birthday: js.UndefOr[String] = js.native
  // The name of the person's company.
  var companyName: js.UndefOr[String] = js.native
  // The person's department.
  var department: js.UndefOr[String] = js.native
  // The person's display name.
  var displayName: js.UndefOr[String] = js.native
  // The person's given name.
  var givenName: js.UndefOr[String] = js.native
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
  var imAddress: js.UndefOr[String] = js.native
  // true if the user has flagged this person as a favorite.
  var isFavorite: js.UndefOr[Boolean] = js.native
  // The person's job title.
  var jobTitle: js.UndefOr[String] = js.native
  // The location of the person's office.
  var officeLocation: js.UndefOr[String] = js.native
  // Free-form notes that the user has taken about this person.
  var personNotes: js.UndefOr[String] = js.native
  // The type of person.
  var personType: js.UndefOr[PersonType] = js.native
  // The person's phone numbers.
  var phones: js.UndefOr[js.Array[Phone]] = js.native
  // The person's addresses.
  var postalAddresses: js.UndefOr[js.Array[Location]] = js.native
  // The person's profession.
  var profession: js.UndefOr[String] = js.native
  // The person's email addresses.
  var scoredEmailAddresses: js.UndefOr[js.Array[ScoredEmailAddress]] = js.native
  // The person's surname.
  var surname: js.UndefOr[String] = js.native
  /**
    * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the
    * Internet standard RFC 822. By convention, this should map to the person's email name. The general format is
    * alias@domain.
    */
  var userPrincipalName: js.UndefOr[String] = js.native
  // The person's websites.
  var websites: js.UndefOr[js.Array[Website]] = js.native
  // The phonetic Japanese name of the person's company.
  var yomiCompany: js.UndefOr[String] = js.native
}

object Person {
  @scala.inline
  def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withImAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFavorite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFavorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFavorite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFavorite")(js.undefined)
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
    def withPersonNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonType(value: PersonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personType")(js.undefined)
        ret
    }
    @scala.inline
    def withPhones(value: js.Array[Phone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalAddresses(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddresses")(js.undefined)
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
    def withScoredEmailAddresses(value: js.Array[ScoredEmailAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoredEmailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoredEmailAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoredEmailAddresses")(js.undefined)
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
    def withUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsites(value: js.Array[Website]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websites")(js.undefined)
        ret
    }
    @scala.inline
    def withYomiCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiCompany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYomiCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiCompany")(js.undefined)
        ret
    }
  }
  
}

