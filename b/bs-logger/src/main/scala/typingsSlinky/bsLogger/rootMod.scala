package typingsSlinky.bsLogger

import typingsSlinky.bsLogger.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bs-logger/dist/logger/root", JSImport.Namespace)
@js.native
object rootMod extends js.Object {
  
  val rootLogger: Logger = js.native
  
  def setup(): Unit = js.native
  def setup(factory: js.Function0[Logger]): Unit = js.native
}
