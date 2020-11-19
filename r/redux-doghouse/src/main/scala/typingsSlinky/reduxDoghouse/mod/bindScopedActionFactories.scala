package typingsSlinky.reduxDoghouse.mod

import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.reduxDoghouse.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-doghouse", "bindScopedActionFactories")
@js.native
object bindScopedActionFactories extends js.Object {
  
  def apply[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S]): M = js.native
  def apply[M /* <: ActionFactoriesMap */, S](actionFactories: M, dispatch: Dispatch[S], bindFn: FnCall): M = js.native
}
