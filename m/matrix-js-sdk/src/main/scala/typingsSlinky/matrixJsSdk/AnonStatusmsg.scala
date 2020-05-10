package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStatusmsg extends js.Object {
  var presence: String = js.native
  // One of "online", "offline" or "unavailable"
  var status_msg: String = js.native
}

object AnonStatusmsg {
  @scala.inline
  def apply(presence: String, status_msg: String): AnonStatusmsg = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any], status_msg = status_msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatusmsg]
  }
  @scala.inline
  implicit class AnonStatusmsgOps[Self <: AnonStatusmsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPresence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus_msg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_msg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

