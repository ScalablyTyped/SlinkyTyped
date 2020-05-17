package typingsSlinky.relayRuntime.relayStoreTypesMod

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
  implicit def apply(value: LogEventExecuteComplete): LogEvent = value.asInstanceOf[LogEvent]
  @scala.inline
  implicit def apply(value: LogEventExecuteError): LogEvent = value.asInstanceOf[LogEvent]
  @scala.inline
  implicit def apply(value: LogEventExecuteInfo): LogEvent = value.asInstanceOf[LogEvent]
  @scala.inline
  implicit def apply(value: LogEventExecuteNext): LogEvent = value.asInstanceOf[LogEvent]
  @scala.inline
  implicit def apply(value: LogEventExecuteStart): LogEvent = value.asInstanceOf[LogEvent]
  @scala.inline
  implicit def apply(value: LogEventExecuteUnsubscribe): LogEvent = value.asInstanceOf[LogEvent]
  @scala.inline
  implicit def apply(value: LogEventQueryResourceFetch): LogEvent = value.asInstanceOf[LogEvent]
}

