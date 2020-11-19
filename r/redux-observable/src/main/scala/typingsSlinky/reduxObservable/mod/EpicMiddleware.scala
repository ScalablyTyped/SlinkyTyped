package typingsSlinky.reduxObservable.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D]
  extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
  
  def run(rootEpic: Epic[T, O, S, D]): Unit = js.native
}
