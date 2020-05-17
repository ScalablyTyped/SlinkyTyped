package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.invalid
import typingsSlinky.devextreme.devextremeStrings.pending
import typingsSlinky.devextreme.devextremeStrings.valid
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxValidatorResult extends js.Object {
  /** A rule that failed to pass the check. Contains the first item from the brokenRules array. */
  var brokenRule: js.UndefOr[
    RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
  ] = js.native
  /** An array of the validationRules that failed to pass the check. */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  /** A promise that is fulfilled when all async rules are validated. */
  var complete: js.UndefOr[Promise[dxValidatorResult] | JQueryPromise[dxValidatorResult]] = js.native
  /** Indicates whether all the checked rules are satisfied. */
  var isValid: js.UndefOr[Boolean] = js.native
  /** An array of async rules whose promises are not fulfilled or rejected. Contains items only when the status is "pending". */
  var pendingRules: js.UndefOr[js.Array[AsyncRule]] = js.native
  /** Indicates the validation status. */
  var status: js.UndefOr[valid | invalid | pending] = js.native
  /** Validation rules specified for the Validator. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  /** The value being validated. */
  var value: js.UndefOr[js.Any] = js.native
}

object dxValidatorResult {
  @scala.inline
  def apply(): dxValidatorResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidatorResult]
  }
  @scala.inline
  implicit class dxValidatorResultOps[Self <: dxValidatorResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokenRule(
      value: RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenRule")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenRules")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: Promise[dxValidatorResult] | JQueryPromise[dxValidatorResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingRules(value: js.Array[AsyncRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingRules")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: valid | invalid | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    @scala.inline
    def withValue(value: js.Any): Self = {
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

