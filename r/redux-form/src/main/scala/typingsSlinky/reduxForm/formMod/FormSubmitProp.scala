package typingsSlinky.reduxForm.formMod

import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.reduxForm.mod.FormErrors
import typingsSlinky.reduxForm.reduxFormMod.DecoratedFormProps
import typingsSlinky.reduxForm.reduxFormMod.FormSubmitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSubmitProp[FormData, P, ErrorType] extends js.Object {
  var onSubmit: js.UndefOr[FormSubmitHandler[FormData, P, ErrorType]] = js.undefined
}

object FormSubmitProp {
  @scala.inline
  def apply[FormData, P, ErrorType](
    onSubmit: (FormData, /* dispatch */ Dispatch[js.Any], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any] = null
  ): FormSubmitProp[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal()
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3(onSubmit))
    __obj.asInstanceOf[FormSubmitProp[FormData, P, ErrorType]]
  }
}

