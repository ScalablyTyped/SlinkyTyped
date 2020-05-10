package typingsSlinky.reduxForm.reduxFormMod

import typingsSlinky.reduxForm.mod.FormErrors
import typingsSlinky.reduxForm.reduxFormStrings.blur
import typingsSlinky.reduxForm.reduxFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncValidateCallback[FormData, ErrorType] extends js.Object {
  var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.native
  var blurredField: js.UndefOr[String] = js.native
  var initialized: Boolean = js.native
  var pristine: Boolean = js.native
  var syncValidationPasses: Boolean = js.native
  var trigger: blur | submit = js.native
}

object AsyncValidateCallback {
  @scala.inline
  def apply[FormData, ErrorType](initialized: Boolean, pristine: Boolean, syncValidationPasses: Boolean, trigger: blur | submit): AsyncValidateCallback[FormData, ErrorType] = {
    val __obj = js.Dynamic.literal(initialized = initialized.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], syncValidationPasses = syncValidationPasses.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncValidateCallback[FormData, ErrorType]]
  }
  @scala.inline
  implicit class AsyncValidateCallbackOps[Self[formdata, errortype] <: AsyncValidateCallback[formdata, errortype], FormData, ErrorType] (val x: Self[FormData, ErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FormData, ErrorType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FormData, ErrorType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[FormData, ErrorType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[FormData, ErrorType]) with Other]
    @scala.inline
    def withInitialized(value: Boolean): Self[FormData, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPristine(value: Boolean): Self[FormData, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pristine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncValidationPasses(value: Boolean): Self[FormData, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncValidationPasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: blur | submit): Self[FormData, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncErrors(value: FormErrors[FormData, ErrorType]): Self[FormData, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncErrors: Self[FormData, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurredField(value: String): Self[FormData, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurredField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurredField: Self[FormData, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurredField")(js.undefined)
        ret
    }
  }
  
}

