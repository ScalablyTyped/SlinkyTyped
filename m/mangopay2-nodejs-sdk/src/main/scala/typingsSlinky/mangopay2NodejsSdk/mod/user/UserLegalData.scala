package typingsSlinky.mangopay2NodejsSdk.mod.user

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserLegalData extends UserData {
  /**
    * The official registered number of the business
    */
  var CompanyNumber: String = js.native
  /**
    * The address of the company’s headquarters
    */
  var HeadquartersAddress: AddressType = js.native
  /**
    * Type for legal user.
    */
  var LegalPersonType: typingsSlinky.mangopay2NodejsSdk.mod.user.LegalPersonType = js.native
  /**
    * The address of the company’s Legal representative person
    */
  var LegalRepresentativeAddress: AddressType = js.native
  /**
    * The date of birth of the company’s Legal representative person - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  var LegalRepresentativeBirthday: Timestamp = js.native
  /**
    * The country of residence of the company’s Legal representative person
    */
  var LegalRepresentativeCountryOfResidence: CountryISO = js.native
  /**
    * The email of the company’s Legal representative person - must be valid
    */
  var LegalRepresentativeEmail: String = js.native
  /**
    * The first name of the company’s Legal representative person
    */
  var LegalRepresentativeFirstName: String = js.native
  /**
    * The last name of the company’s Legal representative person
    */
  var LegalRepresentativeLastName: String = js.native
  /**
    * The nationality of the company’s Legal representative person
    */
  var LegalRepresentativeNationality: CountryISO = js.native
  /**
    * The name of the legal user
    */
  var Name: String = js.native
  @JSName("PersonType")
  var PersonType_UserLegalData: LEGAL = js.native
  var ProofOfIdentity: String | Null = js.native
  /**
    * A MANGOPAY reference to the validated document of the proof of registration of the company
    */
  var ProofOfRegistration: String | Null = js.native
  /**
    * The shareholder declaration of the company
    */
  var ShareholderDeclaration: String | Null = js.native
  /**
    * The business statute of the company
    */
  var Statute: String | Null = js.native
}

object UserLegalData {
  @scala.inline
  def apply(
    CompanyNumber: String,
    CreationDate: Double,
    Email: String,
    HeadquartersAddress: AddressType,
    Id: String,
    KYCLevel: KYCLevel,
    LegalPersonType: LegalPersonType,
    LegalRepresentativeAddress: AddressType,
    LegalRepresentativeBirthday: Timestamp,
    LegalRepresentativeCountryOfResidence: CountryISO,
    LegalRepresentativeEmail: String,
    LegalRepresentativeFirstName: String,
    LegalRepresentativeLastName: String,
    LegalRepresentativeNationality: CountryISO,
    Name: String,
    PersonType: LEGAL,
    Tag: String
  ): UserLegalData = {
    val __obj = js.Dynamic.literal(CompanyNumber = CompanyNumber.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], HeadquartersAddress = HeadquartersAddress.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeAddress = LegalRepresentativeAddress.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeEmail = LegalRepresentativeEmail.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLegalData]
  }
  @scala.inline
  implicit class UserLegalDataOps[Self <: UserLegalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanyNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadquartersAddress(value: AddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadquartersAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalPersonType(value: LegalPersonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalPersonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalRepresentativeAddress(value: AddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalRepresentativeBirthday(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeBirthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalRepresentativeCountryOfResidence(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeCountryOfResidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalRepresentativeEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalRepresentativeFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeFirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalRepresentativeLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeLastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalRepresentativeNationality(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeNationality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonType(value: LEGAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProofOfIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProofOfIdentityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfIdentity")(null)
        ret
    }
    @scala.inline
    def withProofOfRegistration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProofOfRegistrationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfRegistration")(null)
        ret
    }
    @scala.inline
    def withShareholderDeclaration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareholderDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShareholderDeclarationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareholderDeclaration")(null)
        ret
    }
    @scala.inline
    def withStatute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statute")(null)
        ret
    }
  }
  
}

