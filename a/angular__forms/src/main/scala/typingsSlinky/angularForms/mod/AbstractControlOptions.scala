package typingsSlinky.angularForms.mod

import typingsSlinky.angularForms.angularFormsStrings.blur
import typingsSlinky.angularForms.angularFormsStrings.change
import typingsSlinky.angularForms.angularFormsStrings.submit
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractControlOptions extends js.Object {
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | Null] = js.native
  /**
    * @description
    * The event name for control to update upon.
    */
  var updateOn: js.UndefOr[change | blur | submit] = js.native
  /**
    * @description
    * The list of validators applied to a control.
    */
  var validators: js.UndefOr[ValidatorFn | js.Array[ValidatorFn] | Null] = js.native
}

object AbstractControlOptions {
  @scala.inline
  def apply(): AbstractControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractControlOptions]
  }
  @scala.inline
  implicit class AbstractControlOptionsOps[Self <: AbstractControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncValidatorsFunction1(
      value: /* control */ AbstractControl => (js.Promise[ValidationErrors | Null]) | (Observable_[ValidationErrors | Null])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAsyncValidators(value: AsyncValidatorFn | js.Array[AsyncValidatorFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncValidatorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncValidators")(null)
        ret
    }
    @scala.inline
    def withUpdateOn(value: change | blur | submit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatorsFunction1(value: /* control */ AbstractControl => ValidationErrors | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidators(value: ValidatorFn | js.Array[ValidatorFn]): Self = {
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
    @scala.inline
    def withValidatorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(null)
        ret
    }
  }
  
}

