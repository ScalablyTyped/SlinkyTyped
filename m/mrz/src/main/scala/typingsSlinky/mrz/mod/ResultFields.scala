package typingsSlinky.mrz.mod

import typingsSlinky.mrz.mrzStrings.female
import typingsSlinky.mrz.mrzStrings.male
import typingsSlinky.mrz.mrzStrings.nonspecified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultFields extends js.Object {
  // french national id only
  var administrativeCode: js.UndefOr[String] = js.native
  var administrativeCode2: js.UndefOr[String] = js.native
  var birthDate: String | Null = js.native
  var birthDateCheckDigit: String | Null = js.native
  var compositeCheckDigit: String | Null = js.native
  var documentCode: String | Null = js.native
  var documentNumber: String | Null = js.native
  var documentNumberCheckDigit: String | Null = js.native
  var expirationDate: String | Null = js.native
  var expirationDateCheckDigit: String | Null = js.native
  var firstName: String | Null = js.native
  var issueDate: String | Null = js.native
  var issuingState: String | Null = js.native
  // swiss driving license only
  var languageCode: js.UndefOr[String] = js.native
  var lastName: String | Null = js.native
  var nationality: String | Null = js.native
  // td2 only
  var optional: js.UndefOr[String] = js.native
  // td1 only
  var optional1: js.UndefOr[String] = js.native
  var optional2: js.UndefOr[String] = js.native
  // td3 only
  var personalNumber: js.UndefOr[String] = js.native
  var personalNumberCheckDigit: js.UndefOr[String] = js.native
  var pinCode: js.UndefOr[String] = js.native
  var sex: male | female | nonspecified | Null = js.native
  var versionNumber: js.UndefOr[String] = js.native
}

object ResultFields {
  @scala.inline
  def apply(): ResultFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultFields]
  }
  @scala.inline
  implicit class ResultFieldsOps[Self <: ResultFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrativeCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrativeCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAdministrativeCode2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeCode2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrativeCode2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeCode2")(js.undefined)
        ret
    }
    @scala.inline
    def withBirthDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDate")(null)
        ret
    }
    @scala.inline
    def withBirthDateCheckDigit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDateCheckDigit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthDateCheckDigitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDateCheckDigit")(null)
        ret
    }
    @scala.inline
    def withCompositeCheckDigit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeCheckDigit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompositeCheckDigitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeCheckDigit")(null)
        ret
    }
    @scala.inline
    def withDocumentCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentCode")(null)
        ret
    }
    @scala.inline
    def withDocumentNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentNumber")(null)
        ret
    }
    @scala.inline
    def withDocumentNumberCheckDigit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentNumberCheckDigit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentNumberCheckDigitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentNumberCheckDigit")(null)
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(null)
        ret
    }
    @scala.inline
    def withExpirationDateCheckDigit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateCheckDigit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDateCheckDigitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateCheckDigit")(null)
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(null)
        ret
    }
    @scala.inline
    def withIssueDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssueDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueDate")(null)
        ret
    }
    @scala.inline
    def withIssuingState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuingStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuingState")(null)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(null)
        ret
    }
    @scala.inline
    def withNationality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNationalityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationality")(null)
        ret
    }
    @scala.inline
    def withOptional(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional1")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional2")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalNumberCheckDigit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalNumberCheckDigit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalNumberCheckDigit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalNumberCheckDigit")(js.undefined)
        ret
    }
    @scala.inline
    def withPinCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSex(value: male | female | nonspecified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sex")(null)
        ret
    }
    @scala.inline
    def withVersionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(js.undefined)
        ret
    }
  }
  
}

