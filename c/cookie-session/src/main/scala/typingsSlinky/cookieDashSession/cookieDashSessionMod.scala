package typingsSlinky.cookieDashSession

import typingsSlinky.cookieDashSession.CookieSessionInterfaces.CookieSessionOptions
import typingsSlinky.express.expressMod.RequestHandler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-session", JSImport.Namespace)
@js.native
object cookieDashSessionMod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: CookieSessionOptions): RequestHandler[ParamsDictionary] = js.native
}

