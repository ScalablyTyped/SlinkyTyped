package typingsSlinky.reduxPromiseListener.mod.ReduxPromiseListener

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.MiddlewareAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseListener extends js.Object {
  @JSName("middleware")
  var middleware_Original: Middleware[js.Object, AnyAction, Dispatch[AnyAction]] = js.native
  def createAsyncFunction[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn](
    // tslint:disable-next-line no-unnecessary-generics
  config: Config[StartAction, ResolveAction, RejectAction, TReturn]
  ): AsyncFunction[TReturn] = js.native
  def middleware(api: MiddlewareAPI[Dispatch[AnyAction], AnyAction]): js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ _, _]] = js.native
}

