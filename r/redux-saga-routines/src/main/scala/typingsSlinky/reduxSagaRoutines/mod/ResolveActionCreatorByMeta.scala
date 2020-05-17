package typingsSlinky.reduxSagaRoutines.mod

import typingsSlinky.reduxActions.mod.ActionFunction0
import typingsSlinky.reduxActions.mod.ActionFunction1
import typingsSlinky.reduxActions.mod.ActionFunction2
import typingsSlinky.reduxActions.mod.ActionFunction3
import typingsSlinky.reduxActions.mod.ActionFunction4
import typingsSlinky.reduxActions.mod.ActionFunctionAny
import typingsSlinky.reduxActions.mod.ActionMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxActions.mod.ActionFunctionAny[typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]
  - typingsSlinky.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]
  - typingsSlinky.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]
  - typingsSlinky.reduxActions.mod.ActionFunction2[TArg1, TArg2, typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]
  - typingsSlinky.reduxActions.mod.ActionFunction1[TArg1, typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]
  - typingsSlinky.reduxActions.mod.ActionFunction0[typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]
*/
trait ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] extends js.Object

object ResolveActionCreatorByMeta {
  @scala.inline
  implicit def apply[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4](
    value: (ActionFunction1[TArg1, ActionMeta[js.Any, TMeta]]) | (ActionFunctionAny[ActionMeta[js.Any, TMeta]])
  ): ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4]]
  @scala.inline
  implicit def apply[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4](value: ActionFunction0[ActionMeta[js.Any, TMeta]]): ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4]]
  @scala.inline
  implicit def apply[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4](value: ActionFunction2[TArg1, TArg2, ActionMeta[js.Any, TMeta]]): ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4]]
  @scala.inline
  implicit def apply[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4](value: ActionFunction3[TArg1, TArg2, TArg3, ActionMeta[js.Any, TMeta]]): ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4]]
  @scala.inline
  implicit def apply[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4](value: ActionFunction4[TArg1, TArg2, TArg3, TArg4, ActionMeta[js.Any, TMeta]]): ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = value.asInstanceOf[ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4]]
}

