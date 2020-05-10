package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.`update-check`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCheckIPCMessage extends IPCMessage {
  var `type`: `update-check` = js.native
}

object UpdateCheckIPCMessage {
  @scala.inline
  def apply(`type`: `update-check`): UpdateCheckIPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCheckIPCMessage]
  }
  @scala.inline
  implicit class UpdateCheckIPCMessageOps[Self <: UpdateCheckIPCMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `update-check`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

