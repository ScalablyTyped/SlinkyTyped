package typingsSlinky.inversifyExpressUtils.mod

import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "httpPatch")
@js.native
object httpPatch extends js.Object {
  def apply(path: String, middleware: Middleware*): HandlerDecorator = js.native
}

