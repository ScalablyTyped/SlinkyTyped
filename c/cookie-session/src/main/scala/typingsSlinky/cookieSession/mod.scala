package typingsSlinky.cookieSession

import typingsSlinky.cookieSession.CookieSessionInterfaces.CookieSessionOptions
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-session", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: CookieSessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

