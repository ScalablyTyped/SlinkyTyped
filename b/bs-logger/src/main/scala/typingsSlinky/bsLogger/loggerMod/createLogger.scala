package typingsSlinky.bsLogger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bs-logger/dist/logger", "createLogger")
@js.native
object createLogger extends js.Object {
  
  def apply(): Logger = js.native
  def apply(hasContextTargetsTranslate: CreateLoggerOptions): Logger = js.native
}
