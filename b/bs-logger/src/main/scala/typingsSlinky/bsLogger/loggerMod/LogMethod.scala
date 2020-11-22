package typingsSlinky.bsLogger.loggerMod

import typingsSlinky.bsLogger.contextMod.LogContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogMethod extends js.Object {
  
  def apply(context: LogContext, message: String, args: js.Any*): Unit = js.native
  def apply(message: String, args: js.Any*): Unit = js.native
  
  var isEmptyFunction: js.UndefOr[Boolean] = js.native
}
