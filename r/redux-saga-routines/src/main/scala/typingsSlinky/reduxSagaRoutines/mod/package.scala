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
  type Routine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] = TTriggerActionCreator with typingsSlinky.reduxSagaRoutines.anon.keyinRoutineStagesstring with (typingsSlinky.reduxSagaRoutines.anon.Failure[
    TTriggerActionCreator, 
    TRequestActionCreator, 
    TSuccessActionCreator, 
    TFailureActionCreator, 
    TFulfillActionCreator
  ])
  type UnifiedRoutine[TActionCreator] = typingsSlinky.reduxSagaRoutines.mod.Routine[TActionCreator, TActionCreator, TActionCreator, TActionCreator, TActionCreator]
}
