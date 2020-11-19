package typingsSlinky.inversifyExpressUtils.mod

import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils", "httpGet")
@js.native
object httpGet extends js.Object {
  
  def apply(path: String, middleware: Middleware*): HandlerDecorator = js.native
}
