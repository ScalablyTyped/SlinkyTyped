package typingsSlinky.reduxForm.formMod

import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.reduxForm.mod.FormErrors
import typingsSlinky.reduxForm.reduxFormMod.FormSubmitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormSubmitProp[FormData, P, ErrorType] extends js.Object {
  var onSubmit: js.UndefOr[FormSubmitHandler[FormData, P, ErrorType]] = js.native
}

object FormSubmitProp {
  @scala.inline
  def apply[FormData, P, ErrorType](): FormSubmitProp[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormSubmitProp[FormData, P, ErrorType]]
  }
  @scala.inline
  implicit class FormSubmitPropOps[Self[formdata, p, errortype] <: FormSubmitProp[formdata, p, errortype], FormData, P, ErrorType] (val x: Self[FormData, P, ErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FormData, P, ErrorType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FormData, P, ErrorType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[FormData, P, ErrorType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[FormData, P, ErrorType]) with Other]
    @scala.inline
    def withOnSubmit(
      value: (FormData, /* dispatch */ Dispatch[js.Any], P) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
    ): Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self[FormData, P, ErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
  }
  
}

