package typingsSlinky.reduxSagaTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionMatchingPattern[P /* <: typingsSlinky.reduxSagaTypes.mod.ActionPattern[typingsSlinky.redux.mod.Action[_]] */] = typingsSlinky.reduxSagaTypes.mod.ActionMatchingSubPattern[
    (/* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any) | P
  ]
  
  type ActionMatchingSubPattern[P /* <: typingsSlinky.reduxSagaTypes.mod.ActionSubPattern[typingsSlinky.redux.mod.Action[_]] */] = typingsSlinky.redux.mod.Action[js.Any]
  
  type ActionPattern[Guard /* <: typingsSlinky.redux.mod.Action[_] */] = typingsSlinky.reduxSagaTypes.mod.ActionSubPattern[Guard] | js.Array[typingsSlinky.reduxSagaTypes.mod.ActionSubPattern[Guard]]
  
  type ActionSubPattern[Guard /* <: typingsSlinky.redux.mod.Action[_] */] = (typingsSlinky.reduxSagaTypes.mod.GuardPredicate[Guard, typingsSlinky.redux.mod.Action[js.Any]]) | typingsSlinky.reduxSagaTypes.mod.StringableActionCreator[Guard] | typingsSlinky.reduxSagaTypes.mod.Predicate[typingsSlinky.redux.mod.Action[js.Any]] | typingsSlinky.reduxSagaTypes.mod.ActionType
  
  type ActionType = java.lang.String | scala.Double | js.Symbol
  
  type CombinatorEffectDescriptor[E] = org.scalablytyped.runtime.StringDictionary[E] | js.Array[E]
  
  type Effect[T] = (typingsSlinky.reduxSagaTypes.mod.SimpleEffect[T, js.Any]) | (typingsSlinky.reduxSagaTypes.mod.CombinatorEffect[T, js.Any])
  
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ scala.Boolean]
  
  type Pattern[T] = typingsSlinky.reduxSagaTypes.mod.SubPattern[T] | js.Array[typingsSlinky.reduxSagaTypes.mod.SubPattern[T]]
  
  type Predicate[T] = js.Function1[/* arg */ T, scala.Boolean]
  
  type Saga[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, typingsSlinky.std.IterableIterator[js.Any]]
  
  type SagaIterator = typingsSlinky.std.IterableIterator[typingsSlinky.reduxSagaTypes.mod.StrictEffect[js.Any]]
  
  type StrictEffect[T] = (typingsSlinky.reduxSagaTypes.mod.SimpleEffect[T, js.Any]) | typingsSlinky.reduxSagaTypes.mod.StrictCombinatorEffect[T]
  
  type SubPattern[T] = typingsSlinky.reduxSagaTypes.mod.Predicate[T] | typingsSlinky.reduxSagaTypes.mod.StringableActionCreator[typingsSlinky.redux.mod.Action[js.Any]] | typingsSlinky.reduxSagaTypes.mod.ActionType
}
