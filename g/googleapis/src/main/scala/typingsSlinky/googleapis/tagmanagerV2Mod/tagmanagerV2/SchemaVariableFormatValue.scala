package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVariableFormatValue extends js.Object {
  /**
    * The option to convert a string-type variable value to either lowercase or
    * uppercase.
    */
  var caseConversionType: js.UndefOr[String] = js.native
  /**
    * The value to convert if a variable value is false.
    */
  var convertFalseToValue: js.UndefOr[SchemaParameter] = js.native
  /**
    * The value to convert if a variable value is null.
    */
  var convertNullToValue: js.UndefOr[SchemaParameter] = js.native
  /**
    * The value to convert if a variable value is true.
    */
  var convertTrueToValue: js.UndefOr[SchemaParameter] = js.native
  /**
    * The value to convert if a variable value is undefined.
    */
  var convertUndefinedToValue: js.UndefOr[SchemaParameter] = js.native
}

object SchemaVariableFormatValue {
  @scala.inline
  def apply(): SchemaVariableFormatValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariableFormatValue]
  }
  @scala.inline
  implicit class SchemaVariableFormatValueOps[Self <: SchemaVariableFormatValue] (val x: Self) extends AnyVal {
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
    def withConvertFalseToValue(value: SchemaParameter): Self = {
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
    def withConvertNullToValue(value: SchemaParameter): Self = {
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
    def withConvertTrueToValue(value: SchemaParameter): Self = {
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
    def withConvertUndefinedToValue(value: SchemaParameter): Self = {
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

