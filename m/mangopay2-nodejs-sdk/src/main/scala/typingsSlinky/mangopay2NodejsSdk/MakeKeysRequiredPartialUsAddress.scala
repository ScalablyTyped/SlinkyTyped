package typingsSlinky.mangopay2NodejsSdk

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressData
import typingsSlinky.mangopay2NodejsSdk.mod.user.IncomeRange
import typingsSlinky.mangopay2NodejsSdk.mod.user.KYCLevel
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserNaturalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData> */
@js.native
trait MakeKeysRequiredPartialUsAddress extends js.Object {
  var Address: js.UndefOr[String | AddressData] = js.native
  var Birthday: Timestamp = js.native
  var Capacity: js.UndefOr[NORMAL | DECLARATIVE] = js.native
  var CountryOfResidence: CountryISO = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var Email: String = js.native
  var FirstName: String = js.native
  var Id: js.UndefOr[String] = js.native
  var IncomeRange: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.user.IncomeRange] = js.native
  var KYCLevel: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.user.KYCLevel] = js.native
  var LastName: String = js.native
  var Nationality: CountryISO = js.native
  var Occupation: js.UndefOr[String] = js.native
  var PersonType: js.UndefOr[NATURAL] = js.native
  var ProofOfAddress: js.UndefOr[String] = js.native
  var ProofOfIdentity: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object MakeKeysRequiredPartialUsAddress {
  @scala.inline
  def apply(
    Birthday: Timestamp,
    CountryOfResidence: CountryISO,
    Email: String,
    FirstName: String,
    LastName: String,
    Nationality: CountryISO
  ): MakeKeysRequiredPartialUsAddress = {
    val __obj = js.Dynamic.literal(Birthday = Birthday.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeKeysRequiredPartialUsAddress]
  }
  @scala.inline
  implicit class MakeKeysRequiredPartialUsAddressOps[Self <: MakeKeysRequiredPartialUsAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBirthday(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryOfResidence(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryOfResidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstName")(value.asInstanceOf[js.Any])
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
    def withAddress(value: String | AddressData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: NORMAL | DECLARATIVE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withIncomeRange(value: IncomeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withKYCLevel(value: KYCLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KYCLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKYCLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KYCLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withOccupation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Occupation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccupation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Occupation")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonType(value: NATURAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonType")(js.undefined)
        ret
    }
    @scala.inline
    def withProofOfAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProofOfAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withProofOfIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProofOfIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

