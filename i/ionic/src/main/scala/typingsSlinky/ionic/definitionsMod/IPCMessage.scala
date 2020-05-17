package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.TelemetryIPCMessage
  - typingsSlinky.ionic.definitionsMod.UpdateCheckIPCMessage
*/
trait IPCMessage extends js.Object

object IPCMessage {
  @scala.inline
  implicit def apply(value: TelemetryIPCMessage): IPCMessage = value.asInstanceOf[IPCMessage]
  @scala.inline
  implicit def apply(value: UpdateCheckIPCMessage): IPCMessage = value.asInstanceOf[IPCMessage]
}

