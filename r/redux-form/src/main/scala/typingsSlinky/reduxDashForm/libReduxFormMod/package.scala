package typingsSlinky.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libReduxFormMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.redux.reduxMod.Dispatch
  import typingsSlinky.reduxDashForm.libReducerMod.FormStateMap
  import typingsSlinky.reduxDashForm.reduxDashFormMod.FormErrors

  type FormDecorator[FormData, P, Config, ErrorType] = js.Function1[
    /* component */ ReactComponentClass[P with (InjectedFormProps[FormData, P, ErrorType])], 
    DecoratedComponentClass[FormData, P with Config, ErrorType]
  ]
  type FormSubmitHandler[FormData, P, ErrorType] = js.Function3[
    /* values */ FormData, 
    /* dispatch */ Dispatch[js.Any], 
    /* props */ P, 
    Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
  ]
  type GetFormState = js.Function1[/* state */ js.Any, FormStateMap]
}
