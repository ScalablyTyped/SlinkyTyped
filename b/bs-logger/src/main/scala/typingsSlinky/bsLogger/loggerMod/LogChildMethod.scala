package typingsSlinky.bsLogger.loggerMod

import typingsSlinky.bsLogger.contextMod.LogContext
import typingsSlinky.bsLogger.messageMod.LogMessageTranslator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogChildMethod extends js.Object {
  
  def apply(context: LogContext): Logger = js.native
  def apply(translate: LogMessageTranslator): Logger = js.native
}
