package typingsSlinky.expressMung.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "headers")
@js.native
object headers extends js.Object {
  def apply(fn: TransformHeader): RequestHandler[ParamsDictionary] = js.native
}

