package typingsSlinky.expressMung.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "json")
@js.native
object json extends js.Object {
  def apply(fn: Transform): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(fn: Transform, options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

