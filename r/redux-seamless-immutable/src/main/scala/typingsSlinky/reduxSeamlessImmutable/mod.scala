package typingsSlinky.reduxSeamlessImmutable

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.seamlessImmutable.mod.Immutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-seamless-immutable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def combineReducers(reducers: SeamlessReducers): Reducer[_, AnyAction] = js.native
  
  def routerReducer[T /* <: Reducer[_, AnyAction] */](state: T, action: Action[_]): T = js.native
  
  def stateTransformer[T](state: Immutable[T, js.Object]): T = js.native
  
  type SeamlessReducers = StringDictionary[Reducer[js.Any, js.Any]]
}
