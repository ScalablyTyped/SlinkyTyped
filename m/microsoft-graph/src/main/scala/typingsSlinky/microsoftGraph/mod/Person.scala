package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Person extends Entity {
  
  // The person's birthday.
  var birthday: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the person's company.
  var companyName: js.UndefOr[NullableOption[String]] = js.native
  
  // The person's department.
  var department: js.UndefOr[NullableOption[String]] = js.native
  
  // The person's display name.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The person's given name.
  var givenName: js.UndefOr[NullableOption[String]] = js.native
  
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
  var imAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // true if the user has flagged this person as a favorite.
  var isFavorite: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The person's job title.
  var jobTitle: js.UndefOr[NullableOption[String]] = js.native
  
  // The location of the person's office.
  var officeLocation: js.UndefOr[NullableOption[String]] = js.native
  
  // Free-form notes that the user has taken about this person.
  var personNotes: js.UndefOr[NullableOption[String]] = js.native
  
  // The type of person.
  var personType: js.UndefOr[NullableOption[PersonType]] = js.native
  
  // The person's phone numbers.
  var phones: js.UndefOr[NullableOption[js.Array[Phone]]] = js.native
  
  // The person's addresses.
  var postalAddresses: js.UndefOr[NullableOption[js.Array[Location]]] = js.native
  
  // The person's profession.
  var profession: js.UndefOr[NullableOption[String]] = js.native
  
  // The person's email addresses.
  var scoredEmailAddresses: js.UndefOr[NullableOption[js.Array[ScoredEmailAddress]]] = js.native
  
  // The person's surname.
  var surname: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the
    * Internet standard RFC 822. By convention, this should map to the person's email name. The general format is
    * alias@domain.
    */
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
  
  // The person's websites.
  var websites: js.UndefOr[NullableOption[js.Array[Website]]] = js.native
  
  // The phonetic Japanese name of the person's company.
  var yomiCompany: js.UndefOr[NullableOption[String]] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBirthday(value: NullableOption[String]): Self = this.set("birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    
    @scala.inline
    def setBirthdayNull: Self = this.set("birthday", null)
    
    @scala.inline
    def setCompanyName(value: NullableOption[String]): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setCompanyNameNull: Self = this.set("companyName", null)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setDepartmentNull: Self = this.set("department", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setGivenNameNull: Self = this.set("givenName", null)
    
    @scala.inline
    def setImAddress(value: NullableOption[String]): Self = this.set("imAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImAddress: Self = this.set("imAddress", js.undefined)
    
    @scala.inline
    def setImAddressNull: Self = this.set("imAddress", null)
    
    @scala.inline
    def setIsFavorite(value: NullableOption[Boolean]): Self = this.set("isFavorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFavorite: Self = this.set("isFavorite", js.undefined)
    
    @scala.inline
    def setIsFavoriteNull: Self = this.set("isFavorite", null)
    
    @scala.inline
    def setJobTitle(value: NullableOption[String]): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    
    @scala.inline
    def setJobTitleNull: Self = this.set("jobTitle", null)
    
    @scala.inline
    def setOfficeLocation(value: NullableOption[String]): Self = this.set("officeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficeLocation: Self = this.set("officeLocation", js.undefined)
    
    @scala.inline
    def setOfficeLocationNull: Self = this.set("officeLocation", null)
    
    @scala.inline
    def setPersonNotes(value: NullableOption[String]): Self = this.set("personNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonNotes: Self = this.set("personNotes", js.undefined)
    
    @scala.inline
    def setPersonNotesNull: Self = this.set("personNotes", null)
    
    @scala.inline
    def setPersonType(value: NullableOption[PersonType]): Self = this.set("personType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonType: Self = this.set("personType", js.undefined)
    
    @scala.inline
    def setPersonTypeNull: Self = this.set("personType", null)
    
    @scala.inline
    def setPhonesVarargs(value: Phone*): Self = this.set("phones", js.Array(value :_*))
    
    @scala.inline
    def setPhones(value: NullableOption[js.Array[Phone]]): Self = this.set("phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
    
    @scala.inline
    def setPhonesNull: Self = this.set("phones", null)
    
    @scala.inline
    def setPostalAddressesVarargs(value: Location*): Self = this.set("postalAddresses", js.Array(value :_*))
    
    @scala.inline
    def setPostalAddresses(value: NullableOption[js.Array[Location]]): Self = this.set("postalAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalAddresses: Self = this.set("postalAddresses", js.undefined)
    
    @scala.inline
    def setPostalAddressesNull: Self = this.set("postalAddresses", null)
    
    @scala.inline
    def setProfession(value: NullableOption[String]): Self = this.set("profession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfession: Self = this.set("profession", js.undefined)
    
    @scala.inline
    def setProfessionNull: Self = this.set("profession", null)
    
    @scala.inline
    def setScoredEmailAddressesVarargs(value: ScoredEmailAddress*): Self = this.set("scoredEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setScoredEmailAddresses(value: NullableOption[js.Array[ScoredEmailAddress]]): Self = this.set("scoredEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoredEmailAddresses: Self = this.set("scoredEmailAddresses", js.undefined)
    
    @scala.inline
    def setScoredEmailAddressesNull: Self = this.set("scoredEmailAddresses", null)
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = this.set("surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    
    @scala.inline
    def setSurnameNull: Self = this.set("surname", null)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserPrincipalNameNull: Self = this.set("userPrincipalName", null)
    
    @scala.inline
    def setWebsitesVarargs(value: Website*): Self = this.set("websites", js.Array(value :_*))
    
    @scala.inline
    def setWebsites(value: NullableOption[js.Array[Website]]): Self = this.set("websites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsites: Self = this.set("websites", js.undefined)
    
    @scala.inline
    def setWebsitesNull: Self = this.set("websites", null)
    
    @scala.inline
    def setYomiCompany(value: NullableOption[String]): Self = this.set("yomiCompany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYomiCompany: Self = this.set("yomiCompany", js.undefined)
    
    @scala.inline
    def setYomiCompanyNull: Self = this.set("yomiCompany", null)
  }
}
