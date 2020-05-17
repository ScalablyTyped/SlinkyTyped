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
trait dxValidationGroupResult extends js.Object {
  /** An array of the validation rules that failed. */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  /** A promise that is fulfilled when all async rules are validated. */
  var complete: js.UndefOr[Promise[dxValidationGroupResult] | JQueryPromise[dxValidationGroupResult]] = js.native
  /** Indicates whether all the rules checked for the group are satisfied. */
  var isValid: js.UndefOr[Boolean] = js.native
  /** Indicates the validation status. */
  var status: js.UndefOr[valid | invalid | pending] = js.native
  /** Validator widgets included in the validated group. */
  var validators: js.UndefOr[js.Array[_]] = js.native
}

object dxValidationGroupResult {
  @scala.inline
  def apply(): dxValidationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidationGroupResult]
  }
  @scala.inline
  implicit class dxValidationGroupResultOps[Self <: dxValidationGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withComplete(value: Promise[dxValidationGroupResult] | JQueryPromise[dxValidationGroupResult]): Self = {
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
    def withValidators(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
  }
  
}

