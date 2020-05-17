package typingsSlinky.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxActions.mod.ActionFunction0[TAction]
  - typingsSlinky.reduxActions.mod.ActionFunction1[js.Any, TAction]
  - typingsSlinky.reduxActions.mod.ActionFunction2[js.Any, js.Any, TAction]
  - typingsSlinky.reduxActions.mod.ActionFunction3[js.Any, js.Any, js.Any, TAction]
  - typingsSlinky.reduxActions.mod.ActionFunction4[js.Any, js.Any, js.Any, js.Any, TAction]
  - typingsSlinky.reduxActions.mod.ActionFunctionAny[TAction]
*/
trait BaseActionFunctions[TAction] extends js.Object

object BaseActionFunctions {
  @scala.inline
  implicit def apply[TAction](value: (ActionFunction1[js.Any, TAction]) | ActionFunctionAny[TAction]): BaseActionFunctions[TAction] = value.asInstanceOf[BaseActionFunctions[TAction]]
  @scala.inline
  implicit def apply[TAction](value: ActionFunction0[TAction]): BaseActionFunctions[TAction] = value.asInstanceOf[BaseActionFunctions[TAction]]
  @scala.inline
  implicit def apply[TAction](value: ActionFunction2[js.Any, js.Any, TAction]): BaseActionFunctions[TAction] = value.asInstanceOf[BaseActionFunctions[TAction]]
  @scala.inline
  implicit def apply[TAction](value: ActionFunction3[js.Any, js.Any, js.Any, TAction]): BaseActionFunctions[TAction] = value.asInstanceOf[BaseActionFunctions[TAction]]
  @scala.inline
  implicit def apply[TAction](value: ActionFunction4[js.Any, js.Any, js.Any, js.Any, TAction]): BaseActionFunctions[TAction] = value.asInstanceOf[BaseActionFunctions[TAction]]
}

