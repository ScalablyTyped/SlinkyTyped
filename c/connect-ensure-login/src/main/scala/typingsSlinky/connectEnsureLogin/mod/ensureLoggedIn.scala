package typingsSlinky.connectEnsureLogin.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("connect-ensure-login", "ensureLoggedIn")
@js.native
object ensureLoggedIn extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: LoggedInOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
