package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.anon.Args
import typingsSlinky.ionic.ionicStrings.telemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelemetryIPCMessage extends IPCMessage {
  var data: Args = js.native
  var `type`: telemetry = js.native
}

object TelemetryIPCMessage {
  @scala.inline
  def apply(data: Args, `type`: telemetry): TelemetryIPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryIPCMessage]
  }
  @scala.inline
  implicit class TelemetryIPCMessageOps[Self <: TelemetryIPCMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Args): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: telemetry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

