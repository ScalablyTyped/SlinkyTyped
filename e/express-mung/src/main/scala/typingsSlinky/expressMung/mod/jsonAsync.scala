package typingsSlinky.expressMung.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "jsonAsync")
@js.native
object jsonAsync extends js.Object {
  def apply(fn: TransformAsync): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(fn: TransformAsync, options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

