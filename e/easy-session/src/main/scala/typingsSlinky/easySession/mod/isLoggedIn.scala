package typingsSlinky.easySession.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", "isLoggedIn")
@js.native
object isLoggedIn extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(errorCallback: js.Function): RequestHandler[ParamsDictionary] = js.native
}

