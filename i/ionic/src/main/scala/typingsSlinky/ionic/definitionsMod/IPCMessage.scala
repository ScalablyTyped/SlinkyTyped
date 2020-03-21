package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.AnonArgs
import typingsSlinky.ionic.ionicStrings.`update-check`
import typingsSlinky.ionic.ionicStrings.telemetry
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
  def TelemetryIPCMessage(data: AnonArgs, `type`: telemetry): IPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPCMessage]
  }
  @scala.inline
  def UpdateCheckIPCMessage(`type`: `update-check`): IPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPCMessage]
  }
}

