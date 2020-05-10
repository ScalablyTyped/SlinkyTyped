package typingsSlinky.mangopay2NodejsSdk.mod.user

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserNaturalData extends UserData {
  /**
    * The user address
    */
  var Address: String | AddressData = js.native
  /**
    * The date of birth of the user - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  var Birthday: Timestamp = js.native
  /**
    * The capacity of this user - for use with UBO declarations
    */
  var Capacity: NORMAL | DECLARATIVE = js.native
  /**
    * The user’s country of residence. ISO 3166-1 alpha-2 format is expected
    */
  var CountryOfResidence: CountryISO = js.native
  /**
    * The name of the user
    */
  var FirstName: String = js.native
  var IncomeRange: typingsSlinky.mangopay2NodejsSdk.mod.user.IncomeRange = js.native
  /**
    * The last name of the user
    */
  var LastName: String = js.native
  /**
    * The user’s nationality. ISO 3166-1 alpha-2 format is expected
    */
  var Nationality: CountryISO = js.native
  /**
    * User’s occupation, ie. Work
    */
  var Occupation: String = js.native
  @JSName("PersonType")
  var PersonType_UserNaturalData: NATURAL = js.native
  /**
    * Maximum length is 255 characters
    */
  var ProofOfAddress: String | Null = js.native
  /**
    * Maximum length is 255 characters
    */
  var ProofOfIdentity: String | Null = js.native
}

object UserNaturalData {
  @scala.inline
  def apply(
    Address: String | AddressData,
    Birthday: Timestamp,
    Capacity: NORMAL | DECLARATIVE,
    CountryOfResidence: CountryISO,
    CreationDate: Double,
    Email: String,
    FirstName: String,
    Id: String,
    IncomeRange: IncomeRange,
    KYCLevel: KYCLevel,
    LastName: String,
    Nationality: CountryISO,
    Occupation: String,
    PersonType: NATURAL,
    Tag: String
  ): UserNaturalData = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Birthday = Birthday.asInstanceOf[js.Any], Capacity = Capacity.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncomeRange = IncomeRange.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], Occupation = Occupation.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNaturalData]
  }
  @scala.inline
  implicit class UserNaturalDataOps[Self <: UserNaturalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String | AddressData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthday(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacity(value: NORMAL | DECLARATIVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryOfResidence(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryOfResidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomeRange(value: IncomeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNationality(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nationality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccupation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Occupation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonType(value: NATURAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProofOfAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProofOfAddressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfAddress")(null)
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
  }
  
}

