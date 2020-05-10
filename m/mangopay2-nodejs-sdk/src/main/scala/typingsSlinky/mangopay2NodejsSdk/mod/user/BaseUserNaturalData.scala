package typingsSlinky.mangopay2NodejsSdk.mod.user

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.UserNaturalData, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.user.RequiredUserNaturalData | 'Address' | 'Occupation' | 'IncomeRange' | 'Tag'> */
@js.native
trait BaseUserNaturalData extends js.Object {
  var Address: js.UndefOr[String | AddressData] = js.native
  var Birthday: js.UndefOr[Timestamp] = js.native
  var CountryOfResidence: js.UndefOr[CountryISO] = js.native
  var Email: js.UndefOr[String] = js.native
  var FirstName: js.UndefOr[String] = js.native
  var IncomeRange: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.user.IncomeRange] = js.native
  var LastName: js.UndefOr[String] = js.native
  var Nationality: js.UndefOr[CountryISO] = js.native
  var Occupation: js.UndefOr[String] = js.native
  var PersonType: NATURAL = js.native
  var Tag: js.UndefOr[String] = js.native
}

object BaseUserNaturalData {
  @scala.inline
  def apply(PersonType: NATURAL): BaseUserNaturalData = {
    val __obj = js.Dynamic.literal(PersonType = PersonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUserNaturalData]
  }
  @scala.inline
  implicit class BaseUserNaturalDataOps[Self <: BaseUserNaturalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonType(value: NATURAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonType")(value.asInstanceOf[js.Any])
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
    def withBirthday(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBirthday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Birthday")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryOfResidence(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryOfResidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryOfResidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryOfResidence")(js.undefined)
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
    def withFirstName(value: String): Self = {
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
    def withLastName(value: String): Self = {
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
    def withNationality(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nationality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNationality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nationality")(js.undefined)
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

