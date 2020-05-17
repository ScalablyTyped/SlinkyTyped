package typingsSlinky.reduxSagaTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionMatchingPattern[P /* <: typingsSlinky.reduxSagaTypes.mod.ActionPattern[typingsSlinky.redux.mod.Action[_]] */] = typingsSlinky.reduxSagaTypes.mod.ActionMatchingSubPattern[
    (/* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any) | P
  ]
  type ActionMatchingSubPattern[P /* <: typingsSlinky.reduxSagaTypes.mod.ActionSubPattern[typingsSlinky.redux.mod.Action[_]] */] = typingsSlinky.redux.mod.Action[js.Any]
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ scala.Boolean]
  type Predicate[T] = js.Function1[/* arg */ T, scala.Boolean]
  type Saga[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, typingsSlinky.std.IterableIterator[js.Any]]
  type SagaIterator = typingsSlinky.std.IterableIterator[typingsSlinky.reduxSagaTypes.mod.StrictEffect[js.Any]]
}
