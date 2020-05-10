package typingsSlinky.easySession.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", "checkRole")
@js.native
object checkRole extends js.Object {
  def apply(role: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(role: String, errorCallback: js.Function): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

