package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.AnonName
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotcomplete
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDoterror
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotinfo
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotnext
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotstart
import typingsSlinky.relayRuntime.relayRuntimeStrings.executeDotunsubscribe
import typingsSlinky.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayStoreTypesMod.LogEventQueryResourceFetch
  - typingsSlinky.relayRuntime.relayStoreTypesMod.LogEventExecuteInfo
  - typingsSlinky.relayRuntime.relayStoreTypesMod.LogEventExecuteStart
  - typingsSlinky.relayRuntime.relayStoreTypesMod.LogEventExecuteNext
  - typingsSlinky.relayRuntime.relayStoreTypesMod.LogEventExecuteError
  - typingsSlinky.relayRuntime.relayStoreTypesMod.LogEventExecuteComplete
  - typingsSlinky.relayRuntime.relayStoreTypesMod.LogEventExecuteUnsubscribe
*/
trait LogEvent extends js.Object

object LogEvent {
  @scala.inline
  def LogEventExecuteNext(name: executeDotnext, response: js.Any, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  @scala.inline
  def LogEventExecuteComplete(name: executeDotcomplete, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  @scala.inline
  def LogEventExecuteStart(name: executeDotstart, params: AnonName, transactionID: Double, variables: js.Object): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  @scala.inline
  def LogEventExecuteInfo(info: js.Any, name: executeDotinfo, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  @scala.inline
  def LogEventQueryResourceFetch(
    fetchPolicy: String,
    name: queryresourceDotfetch,
    operation: OperationDescriptor,
    queryAvailability: OperationAvailability,
    renderPolicy: String,
    shouldFetch: Boolean
  ): LogEvent = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  @scala.inline
  def LogEventExecuteError(error: js.Error, name: executeDoterror, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  @scala.inline
  def LogEventExecuteUnsubscribe(name: executeDotunsubscribe, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
}

