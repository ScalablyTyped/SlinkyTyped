package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The field type of `value` and `field` do not need to match to be considered
  * equal, but not all comparisons are possible. EQUAL_TO and NOT_EQUAL_TO
  * attempt to compare even with incompatible types, but all other comparisons
  * are invalid with incompatible types. A `value` of type:  - `string` can be
  * compared against all other types - `boolean` can only be compared against
  * other booleans - `integer` can be compared against doubles or a string if
  * the string value can be parsed as an integer. - `double` can be compared
  * against integers or a string if the string can be parsed as a double. -
  * `Timestamp` can be compared against strings in RFC 3339 date string format.
  * - `TimeOfDay` can be compared against timestamps and strings in the format
  * of &#39;HH:mm:ss&#39;.  If we fail to compare do to type mismatch, a
  * warning will be given and the condition will evaluate to false.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Condition extends js.Object {
  /**
    * Field within the record this condition is evaluated against. [required]
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * Operator used to compare the field or infoType to the value. [required]
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * Value to compare against. [Required, except for `EXISTS` tests.]
    */
  var value: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}

object SchemaGooglePrivacyDlpV2Condition {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Condition]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ConditionOps[Self <: SchemaGooglePrivacyDlpV2Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: SchemaGooglePrivacyDlpV2FieldId): Self = {
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
    def withValue(value: SchemaGooglePrivacyDlpV2Value): Self = {
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

