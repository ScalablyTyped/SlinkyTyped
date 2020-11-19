package typingsSlinky.inversifyExpressUtils.mod

import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils", "all")
@js.native
object all extends js.Object {
  
  def apply(path: String, middleware: Middleware*): HandlerDecorator = js.native
}
