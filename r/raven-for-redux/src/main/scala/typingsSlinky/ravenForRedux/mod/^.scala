package typingsSlinky.ravenForRedux.mod

import typingsSlinky.ravenJs.mod.RavenStatic
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven-for-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(raven: RavenStatic): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(raven: RavenStatic, options: RavenMiddlewareOptions[_]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

