package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.anon.Args
import typingsSlinky.ionic.ionicStrings.`update-check`
import typingsSlinky.ionic.ionicStrings.telemetry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.TelemetryIPCMessage
  - typingsSlinky.ionic.definitionsMod.UpdateCheckIPCMessage
*/
trait IPCMessage extends StObject
object IPCMessage {
  
  @scala.inline
  def TelemetryIPCMessage(data: Args, `type`: telemetry): typingsSlinky.ionic.definitionsMod.TelemetryIPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.TelemetryIPCMessage]
  }
  
  @scala.inline
  def UpdateCheckIPCMessage(`type`: `update-check`): typingsSlinky.ionic.definitionsMod.UpdateCheckIPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.UpdateCheckIPCMessage]
  }
}
