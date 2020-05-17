package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import typingsSlinky.mangopay2NodejsSdk.mod.user.KYCLevel
import typingsSlinky.mangopay2NodejsSdk.mod.user.LegalPersonType
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserLegalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserLegalData> */
@js.native
trait MakeKeysRequiredPartialUs extends js.Object {
  var CompanyNumber: js.UndefOr[String] = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var Email: String = js.native
  var HeadquartersAddress: js.UndefOr[AddressType] = js.native
  var Id: js.UndefOr[String] = js.native
  var KYCLevel: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.user.KYCLevel] = js.native
  var LegalPersonType: typingsSlinky.mangopay2NodejsSdk.mod.user.LegalPersonType = js.native
  var LegalRepresentativeAddress: js.UndefOr[AddressType] = js.native
  var LegalRepresentativeBirthday: Timestamp = js.native
  var LegalRepresentativeCountryOfResidence: CountryISO = js.native
  var LegalRepresentativeEmail: js.UndefOr[String] = js.native
  var LegalRepresentativeFirstName: String = js.native
  var LegalRepresentativeLastName: String = js.native
  var LegalRepresentativeNationality: CountryISO = js.native
  var Name: String = js.native
  var PersonType: js.UndefOr[LEGAL] = js.native
  var ProofOfIdentity: js.UndefOr[String] = js.native
  var ProofOfRegistration: js.UndefOr[String] = js.native
  var ShareholderDeclaration: js.UndefOr[String] = js.native
  var Statute: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object MakeKeysRequiredPartialUs {
  @scala.inline
  def apply(
    Email: String,
    LegalPersonType: LegalPersonType,
    LegalRepresentativeBirthday: Timestamp,
    LegalRepresentativeCountryOfResidence: CountryISO,
    LegalRepresentativeFirstName: String,
    LegalRepresentativeLastName: String,
    LegalRepresentativeNationality: CountryISO,
    Name: String
  ): MakeKeysRequiredPartialUs = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeKeysRequiredPartialUs]
  }
  @scala.inline
  implicit class MakeKeysRequiredPartialUsOps[Self <: MakeKeysRequiredPartialUs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegalPersonType(value: LegalPersonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalPersonType")(value.asInstanceOf[js.Any])
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
    def withCompanyNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyNumber")(js.undefined)
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
    def withHeadquartersAddress(value: AddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadquartersAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadquartersAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadquartersAddress")(js.undefined)
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
    def withLegalRepresentativeAddress(value: AddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalRepresentativeAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalRepresentativeEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalRepresentativeEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonType(value: LEGAL): Self = {
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
    def withProofOfRegistration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProofOfRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProofOfRegistration")(js.undefined)
        ret
    }
    @scala.inline
    def withShareholderDeclaration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareholderDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareholderDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareholderDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withStatute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statute")(js.undefined)
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

