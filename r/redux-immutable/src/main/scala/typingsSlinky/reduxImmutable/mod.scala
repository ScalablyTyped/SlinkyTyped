package typingsSlinky.reduxImmutable

import typingsSlinky.immutable.Immutable.Collection.Indexed
import typingsSlinky.immutable.Immutable.Collection.Keyed
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-immutable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def combineReducers[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
  def combineReducers[S](reducers: ReducersMapObject[S, _], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, AnyAction] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcardT[S, A /* <: Action[_] */, T](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcardT[S, A /* <: Action[_] */, T](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Keyed[T, S]]): Reducer[S, A] = js.native
}
