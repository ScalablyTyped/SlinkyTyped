package typingsSlinky.relayCompiler.reporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def reportError(caughtLocation: String, error: js.Error): Unit
  def reportMessage(message: String): Unit
  def reportTime(name: String, ms: Double): Unit
}

object Reporter {
  @scala.inline
  def apply(
    reportError: (String, js.Error) => Unit,
    reportMessage: String => Unit,
    reportTime: (String, Double) => Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(reportError = js.Any.fromFunction2(reportError), reportMessage = js.Any.fromFunction1(reportMessage), reportTime = js.Any.fromFunction2(reportTime))
  
    __obj.asInstanceOf[Reporter]
  }
}

