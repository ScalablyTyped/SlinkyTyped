package typingsSlinky.reduxSagaRoutines

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionCreatorFunction[Payload, Meta] = typingsSlinky.reduxActions.mod.ActionFunctionAny[
    typingsSlinky.reduxActions.mod.Action[Payload] | (typingsSlinky.reduxActions.mod.ActionMeta[Payload, Meta])
  ]
  type BoundPromiseCreator[TPayload] = js.Function1[/* payload */ TPayload, js.Thenable[js.Any]]
  type PromiseCreator[TPayload] = js.Function2[
    /* payload */ TPayload, 
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[typingsSlinky.redux.mod.AnyAction], 
    js.Thenable[js.Any]
  ]
  type ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = (typingsSlinky.reduxActions.mod.ActionFunctionAny[typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction2[TArg1, TArg2, typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction1[TArg1, typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction0[typingsSlinky.reduxActions.mod.ActionMeta[js.Any, TMeta]])
  type ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = typingsSlinky.reduxActions.mod.ActionFunctionAny[typingsSlinky.reduxActions.mod.Action[TPayload]] | (typingsSlinky.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typingsSlinky.reduxActions.mod.Action[TPayload]]) | (typingsSlinky.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typingsSlinky.reduxActions.mod.Action[TPayload]]) | (typingsSlinky.reduxActions.mod.ActionFunction2[TArg1, TArg2, typingsSlinky.reduxActions.mod.Action[TPayload]]) | (typingsSlinky.reduxActions.mod.ActionFunction1[TArg1, typingsSlinky.reduxActions.mod.Action[TPayload]]) | typingsSlinky.reduxActions.mod.ActionFunction0[typingsSlinky.reduxActions.mod.Action[TPayload]]
  type ResolveActionCreatorByPayloadMeta[TPayloadCreator, TMetaCreator, TPayload, TMeta, TArg1, TArg2, TArg3, TArg4] = (typingsSlinky.reduxActions.mod.ActionFunctionAny[typingsSlinky.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typingsSlinky.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typingsSlinky.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction2[TArg1, TArg2, typingsSlinky.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction1[TArg1, typingsSlinky.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typingsSlinky.reduxActions.mod.ActionFunction0[typingsSlinky.reduxActions.mod.ActionMeta[TPayload, TMeta]])
  type ResolveFunctionArg1Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg2Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg3Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg4Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionReturnType[TFunction] = js.UndefOr[scala.Nothing]
  type Routine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] = TTriggerActionCreator with typingsSlinky.reduxSagaRoutines.anon.keyinRoutineStagesstring with (typingsSlinky.reduxSagaRoutines.anon.Failure[
    TTriggerActionCreator, 
    TRequestActionCreator, 
    TSuccessActionCreator, 
    TFailureActionCreator, 
    TFulfillActionCreator
  ])
  type UnifiedRoutine[TActionCreator] = typingsSlinky.reduxSagaRoutines.mod.Routine[TActionCreator, TActionCreator, TActionCreator, TActionCreator, TActionCreator]
}
