package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldConfig extends js.Object {
  var isBlacklisted: js.UndefOr[BlacklistValidator] = js.native
  var isEmail: js.UndefOr[SimpleValidator] = js.native
  var isEqual: js.UndefOr[ValueValidator[_]] = js.native
  var isExactLength: js.UndefOr[LengthValidator] = js.native
  var isGreaterThan: js.UndefOr[ValueValidator[Double]] = js.native
  var isLessThan: js.UndefOr[ValueValidator[Double]] = js.native
  var isMaxLength: js.UndefOr[LengthValidator] = js.native
  var isMinLength: js.UndefOr[LengthValidator] = js.native
  var isNumber: js.UndefOr[SimpleValidator] = js.native
  var isRegexMatch: js.UndefOr[RegexValidator] = js.native
  var isRequired: js.UndefOr[SimpleValidator] = js.native
  var isWhitelisted: js.UndefOr[WhitelistValidator] = js.native
}

object FieldConfig {
  @scala.inline
  def apply(): FieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldConfig]
  }
  @scala.inline
  implicit class FieldConfigOps[Self <: FieldConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBlacklistedFunction1(value: /* context */ ValidatorContext => BlacklistValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlacklisted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsBlacklisted(value: BlacklistValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlacklisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBlacklisted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlacklisted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmailFunction1(value: /* context */ ValidatorContext => SimpleValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmail(value: SimpleValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEqualFunction1(value: /* context */ ValidatorContext => ValueValidatorConfig[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEqual(value: ValueValidator[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExactLengthFunction1(value: /* context */ ValidatorContext => LengthValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExactLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsExactLength(value: LengthValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExactLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExactLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExactLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGreaterThanFunction1(value: /* context */ ValidatorContext => ValueValidatorConfig[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsGreaterThan(value: ValueValidator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGreaterThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThan")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLessThanFunction1(value: /* context */ ValidatorContext => ValueValidatorConfig[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLessThan(value: ValueValidator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLessThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThan")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMaxLengthFunction1(value: /* context */ ValidatorContext => LengthValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMaxLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMaxLength(value: LengthValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMinLengthFunction1(value: /* context */ ValidatorContext => LengthValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMinLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMinLength(value: LengthValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMinLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMinLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNumberFunction1(value: /* context */ ValidatorContext => SimpleValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsNumber(value: SimpleValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRegexMatchFunction1(value: /* context */ ValidatorContext => RegexValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegexMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRegexMatch(value: RegexValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegexMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRegexMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegexMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequiredFunction1(value: /* context */ ValidatorContext => SimpleValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRequired(value: SimpleValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWhitelistedFunction1(value: /* context */ ValidatorContext => RegexValidatorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWhitelisted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsWhitelisted(value: WhitelistValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWhitelisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWhitelisted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWhitelisted")(js.undefined)
        ret
    }
  }
  
}

