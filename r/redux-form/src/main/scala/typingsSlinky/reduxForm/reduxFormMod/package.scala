package typingsSlinky.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxFormMod {
  type FormDecorator[FormData, P, Config, ErrorType] = js.Function1[
    /* component */ slinky.core.ReactComponentClass[
      P with (typingsSlinky.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType])
    ], 
    typingsSlinky.reduxForm.reduxFormMod.DecoratedComponentClass[FormData, P with Config, ErrorType]
  ]
  type FormSubmitHandler[FormData, P, ErrorType] = js.Function3[
    /* values */ FormData, 
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[js.Any], 
    /* props */ P, 
    scala.Unit | (typingsSlinky.reduxForm.mod.FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
  ]
  type GetFormState = js.Function1[/* state */ js.Any, typingsSlinky.reduxForm.reducerMod.FormStateMap]
}
