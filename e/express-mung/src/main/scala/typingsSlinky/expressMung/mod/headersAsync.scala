package typingsSlinky.expressMung.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "headersAsync")
@js.native
object headersAsync extends js.Object {
  def apply(fn: TransformHeaderAsync): RequestHandler[ParamsDictionary] = js.native
}

