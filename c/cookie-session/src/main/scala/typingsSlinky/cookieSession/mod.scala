package typingsSlinky.cookieSession

import typingsSlinky.cookieSession.CookieSessionInterfaces.CookieSessionOptions
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-session", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: CookieSessionOptions): RequestHandler[ParamsDictionary] = js.native
}

