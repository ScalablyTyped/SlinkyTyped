package typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableFormatValue extends js.Object {
  var caseConversionType: js.UndefOr[String] = js.native
  var convertFalseToValue: js.UndefOr[Parameter] = js.native
  var convertNullToValue: js.UndefOr[Parameter] = js.native
  var convertTrueToValue: js.UndefOr[Parameter] = js.native
  var convertUndefinedToValue: js.UndefOr[Parameter] = js.native
}

object VariableFormatValue {
  @scala.inline
  def apply(): VariableFormatValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableFormatValue]
  }
  @scala.inline
  implicit class VariableFormatValueOps[Self <: VariableFormatValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseConversionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseConversionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseConversionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseConversionType")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertFalseToValue(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertFalseToValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertFalseToValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertFalseToValue")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertNullToValue(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertNullToValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertNullToValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertNullToValue")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertTrueToValue(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTrueToValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertTrueToValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTrueToValue")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertUndefinedToValue(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertUndefinedToValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertUndefinedToValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertUndefinedToValue")(js.undefined)
        ret
    }
  }
  
}

