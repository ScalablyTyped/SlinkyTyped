package typingsSlinky.reduxPromise.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-promise", "ReduxPromise")
@js.native
object ReduxPromise extends js.Object {
  
  type Promise = Middleware[js.Object, js.Any, Dispatch[AnyAction]]
}
