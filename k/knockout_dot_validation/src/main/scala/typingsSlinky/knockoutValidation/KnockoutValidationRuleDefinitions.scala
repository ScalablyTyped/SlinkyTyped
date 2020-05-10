package typingsSlinky.knockoutValidation

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationRuleDefinitions extends /* ruleName */ StringDictionary[KnockoutValidationRuleDefinition | KnockoutValidationAsyncRuleDefinition] {
  var date: KnockoutValidationRuleDefinition = js.native
  var dateISO: KnockoutValidationRuleDefinition = js.native
  var digit: KnockoutValidationRuleDefinition = js.native
  var email: KnockoutValidationRuleDefinition = js.native
  var equal: KnockoutValidationRuleDefinition = js.native
  var max: KnockoutValidationRuleDefinition = js.native
  var maxLength: KnockoutValidationRuleDefinition = js.native
  var min: KnockoutValidationRuleDefinition = js.native
  var minLength: KnockoutValidationRuleDefinition = js.native
  var notEqual: KnockoutValidationRuleDefinition = js.native
  var number: KnockoutValidationRuleDefinition = js.native
  var pattern: KnockoutValidationRuleDefinition = js.native
  var phoneUS: KnockoutValidationRuleDefinition = js.native
  var required: KnockoutValidationRuleDefinition = js.native
  var step: KnockoutValidationRuleDefinition = js.native
  var unique: KnockoutValidationRuleDefinition = js.native
}

object KnockoutValidationRuleDefinitions {
  @scala.inline
  def apply(
    date: KnockoutValidationRuleDefinition,
    dateISO: KnockoutValidationRuleDefinition,
    digit: KnockoutValidationRuleDefinition,
    email: KnockoutValidationRuleDefinition,
    equal: KnockoutValidationRuleDefinition,
    max: KnockoutValidationRuleDefinition,
    maxLength: KnockoutValidationRuleDefinition,
    min: KnockoutValidationRuleDefinition,
    minLength: KnockoutValidationRuleDefinition,
    notEqual: KnockoutValidationRuleDefinition,
    number: KnockoutValidationRuleDefinition,
    pattern: KnockoutValidationRuleDefinition,
    phoneUS: KnockoutValidationRuleDefinition,
    required: KnockoutValidationRuleDefinition,
    step: KnockoutValidationRuleDefinition,
    unique: KnockoutValidationRuleDefinition
  ): KnockoutValidationRuleDefinitions = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateISO = dateISO.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], notEqual = notEqual.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], phoneUS = phoneUS.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRuleDefinitions]
  }
  @scala.inline
  implicit class KnockoutValidationRuleDefinitionsOps[Self <: KnockoutValidationRuleDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateISO(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateISO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigit(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEqual(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLength(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotEqual(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneUS(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneUS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: KnockoutValidationRuleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

