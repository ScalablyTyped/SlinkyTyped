package typingsSlinky.reactRedux.mod

import typingsSlinky.react.mod.Context
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-redux", "createStoreHook")
@js.native
object createStoreHook extends js.Object {
  
  def apply[S, A /* <: Action[_] */](): js.Function0[Store[S, A]] = js.native
  def apply[S, A /* <: Action[_] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Store[S, A]] = js.native
}
