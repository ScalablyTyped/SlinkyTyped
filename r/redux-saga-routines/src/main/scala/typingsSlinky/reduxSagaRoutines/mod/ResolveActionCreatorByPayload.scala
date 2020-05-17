package typingsSlinky.reduxSagaRoutines.mod

import typingsSlinky.reduxActions.mod.Action
import typingsSlinky.reduxActions.mod.ActionFunction0
import typingsSlinky.reduxActions.mod.ActionFunction1
import typingsSlinky.reduxActions.mod.ActionFunction2
import typingsSlinky.reduxActions.mod.ActionFunction3
import typingsSlinky.reduxActions.mod.ActionFunction4
import typingsSlinky.reduxActions.mod.ActionFunctionAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxActions.mod.ActionFunctionAny[typingsSlinky.reduxActions.mod.Action[TPayload]]
  - typingsSlinky.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typingsSlinky.reduxActions.mod.Action[TPayload]]
  - typingsSlinky.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typingsSlinky.reduxActions.mod.Action[TPayload]]
  - typingsSlinky.reduxActions.mod.ActionFunction2[TArg1, TArg2, typingsSlinky.reduxActions.mod.Action[TPayload]]
  - typingsSlinky.reduxActions.mod.ActionFunction1[TArg1, typingsSlinky.reduxActions.mod.Action[TPayload]]
  - typingsSlinky.reduxActions.mod.ActionFunction0[typingsSlinky.reduxActions.mod.Action[TPayload]]
*/
trait ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] extends js.Object

object ResolveActionCreatorByPayload {
  @scala.inline
  implicit def apply[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4](value: (ActionFunction1[TArg1, Action[TPayload]]) | ActionFunctionAny[Action[TPayload]]): ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4]]
  @scala.inline
  implicit def apply[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4](value: ActionFunction0[Action[TPayload]]): ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4]]
  @scala.inline
  implicit def apply[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4](value: ActionFunction2[TArg1, TArg2, Action[TPayload]]): ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4]]
  @scala.inline
  implicit def apply[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4](value: ActionFunction3[TArg1, TArg2, TArg3, Action[TPayload]]): ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4]]
  @scala.inline
  implicit def apply[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4](value: ActionFunction4[TArg1, TArg2, TArg3, TArg4, Action[TPayload]]): ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4]]
}

