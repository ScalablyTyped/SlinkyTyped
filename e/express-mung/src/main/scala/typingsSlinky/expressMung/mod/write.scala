package typingsSlinky.expressMung.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "write")
@js.native
object write extends js.Object {
  def apply(fn: TransformChunk): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(fn: TransformChunk, options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

