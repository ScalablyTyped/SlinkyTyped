package typingsSlinky.jwtExpress.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-express", "require")
@js.native
object require extends js.Object {
  def apply(key: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(key: String, operator: js.UndefOr[scala.Nothing], value: js.Any): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(key: String, operator: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(key: String, operator: String, value: js.Any): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

