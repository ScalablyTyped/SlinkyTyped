package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDoterror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEventExecuteError extends LogEvent {
  val error: js.Error
  val name: executeDoterror
  val transactionID: Double
}

object LogEventExecuteError {
  @scala.inline
  def apply(error: js.Error, name: executeDoterror, transactionID: Double): LogEventExecuteError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventExecuteError]
  }
}

