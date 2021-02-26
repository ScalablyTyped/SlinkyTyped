package typingsSlinky.reduxSeamlessImmutable

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.seamlessImmutable.mod.Immutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-seamless-immutable", "combineReducers")
  @js.native
  def combineReducers(reducers: SeamlessReducers): Reducer[_, AnyAction] = js.native
  
  @JSImport("redux-seamless-immutable", "routerReducer")
  @js.native
  def routerReducer[T /* <: Reducer[_, AnyAction] */](state: T, action: Action[_]): T = js.native
  
  @JSImport("redux-seamless-immutable", "stateTransformer")
  @js.native
  def stateTransformer[T](state: Immutable[T, js.Object]): T = js.native
  
  type SeamlessReducers = StringDictionary[Reducer[js.Any, js.Any]]
}
