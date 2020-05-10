package typingsSlinky.mangopay2NodejsSdk.mod.user

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserLegalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserLegalData | 'CompanyNumber' | 'LegalRepresentativeEmail' | 'LegalRepresentativeAddress' | 'HeadquartersAddress' | 'Tag'> */
@js.native
trait BaseUserLegalData extends js.Object {
  var CompanyNumber: js.UndefOr[String] = js.native
  var Email: js.UndefOr[String] = js.native
  var HeadquartersAddress: js.UndefOr[AddressType] = js.native
  var LegalPersonType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.user.LegalPersonType] = js.native
  var LegalRepresentativeAddress: js.UndefOr[AddressType] = js.native
  var LegalRepresentativeBirthday: js.UndefOr[Timestamp] = js.native
  var LegalRepresentativeCountryOfResidence: js.UndefOr[CountryISO] = js.native
  var LegalRepresentativeEmail: js.UndefOr[String] = js.native
  var LegalRepresentativeFirstName: js.UndefOr[String] = js.native
  var LegalRepresentativeLastName: js.UndefOr[String] = js.native
  var LegalRepresentativeNationality: js.UndefOr[CountryISO] = js.native
  var Name: js.UndefOr[String] = js.native
  var PersonType: LEGAL = js.native
  var Tag: js.UndefOr[String] = js.native
}

object BaseUserLegalData {
  @scala.inline
  def apply(PersonType: LEGAL): BaseUserLegalData = {
    val __obj = js.Dynamic.literal(PersonType = PersonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUserLegalData]
  }
  @scala.inline
  implicit class BaseUserLegalDataOps[Self <: BaseUserLegalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonType(value: LEGAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonType")(value.asInstanceOf[js.Any])
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
    def withEmail(value: String): Self = {
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
    def withLegalPersonType(value: LegalPersonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalPersonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalPersonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalPersonType")(js.undefined)
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
    def withLegalRepresentativeBirthday(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeBirthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalRepresentativeBirthday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeBirthday")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalRepresentativeCountryOfResidence(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeCountryOfResidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalRepresentativeCountryOfResidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeCountryOfResidence")(js.undefined)
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
    def withLegalRepresentativeFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeFirstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalRepresentativeFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeFirstName")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalRepresentativeLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeLastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalRepresentativeLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeLastName")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalRepresentativeNationality(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeNationality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalRepresentativeNationality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegalRepresentativeNationality")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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

