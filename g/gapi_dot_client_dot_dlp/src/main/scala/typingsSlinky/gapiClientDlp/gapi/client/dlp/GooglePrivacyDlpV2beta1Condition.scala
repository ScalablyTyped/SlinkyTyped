package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Condition extends js.Object {
  /** Field within the record this condition is evaluated against. [required] */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
  /** Operator used to compare the field or info type to the value. [required] */
  var operator: js.UndefOr[String] = js.native
  /** Value to compare against. [Required, except for `EXISTS` tests.] */
  var value: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
}

object GooglePrivacyDlpV2beta1Condition {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Condition]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ConditionOps[Self <: GooglePrivacyDlpV2beta1Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: GooglePrivacyDlpV2beta1FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: GooglePrivacyDlpV2beta1Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

