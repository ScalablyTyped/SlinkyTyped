package typingsSlinky.reduxApiMiddleware.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.MiddlewareAPI
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-api-middleware", "apiMiddleware")
@js.native
object apiMiddleware extends js.Object {
  
  def apply(api: MiddlewareAPI[Dispatch[AnyAction], _]): ReturnType[Middleware[js.Object, _, Dispatch[AnyAction]]] = js.native
}
