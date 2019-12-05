package typingsSlinky.reduxDashObservable.reduxDashObservableMod

import typingsSlinky.redux.reduxMod.Action
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Dispatch
import typingsSlinky.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicMiddleware[T /* <: Action[_] */, O /* <: T */, S, D]
  extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
  def run(rootEpic: Epic[T, O, S, D]): Unit = js.native
}

