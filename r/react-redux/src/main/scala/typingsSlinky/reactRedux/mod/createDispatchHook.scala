package typingsSlinky.reactRedux.mod

import typingsSlinky.react.mod.Context
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-redux", "createDispatchHook")
@js.native
object createDispatchHook extends js.Object {
  
  def apply[S, A /* <: Action[_] */](): js.Function0[Dispatch[A]] = js.native
  def apply[S, A /* <: Action[_] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Dispatch[A]] = js.native
}
