package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.ApplyValidationResults
import typingsSlinky.devextreme.anon.BrokenRule
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxValidatorOptions extends DOMComponentOptions[dxValidator] {
  /** An object that specifies what and when to validate, and how to apply the validation result. */
  var adapter: js.UndefOr[ApplyValidationResults] = js.native
  /** Specifies the editor name to be used in the validation default messages. */
  var name: js.UndefOr[String] = js.native
  /** A function that is executed after a value is validated. */
  var onValidated: js.UndefOr[js.Function1[/* validatedInfo */ BrokenRule, _]] = js.native
  /** Specifies the validation group the editor will be related to. */
  var validationGroup: js.UndefOr[String] = js.native
  /** An array of validation rules to be checked for the editor with which the dxValidator object is associated. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
}

object dxValidatorOptions {
  @scala.inline
  def apply(): dxValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidatorOptions]
  }
  @scala.inline
  implicit class dxValidatorOptionsOps[Self <: dxValidatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: ApplyValidationResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidated(value: /* validatedInfo */ BrokenRule => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValidated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidated")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
  }
  
}

