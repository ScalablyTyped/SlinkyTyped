package typingsSlinky.relayCompiler.consoleReporterMod

import typingsSlinky.relayCompiler.reporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleReporter extends Reporter
object ConsoleReporter {
  
  @scala.inline
  def apply(
    reportError: (String, js.Error) => Unit,
    reportMessage: String => Unit,
    reportTime: (String, Double) => Unit
  ): ConsoleReporter = {
    val __obj = js.Dynamic.literal(reportError = js.Any.fromFunction2(reportError), reportMessage = js.Any.fromFunction1(reportMessage), reportTime = js.Any.fromFunction2(reportTime))
    __obj.asInstanceOf[ConsoleReporter]
  }
}
