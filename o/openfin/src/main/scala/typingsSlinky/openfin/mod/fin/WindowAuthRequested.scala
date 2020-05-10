package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.AnonHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowAuthRequested extends WindowEvent {
  var authInfo: AnonHost = js.native
}

object WindowAuthRequested {
  @scala.inline
  def apply(authInfo: AnonHost, name: String, topic: String, `type`: OpenFinApplicationEventType, uuid: String): WindowAuthRequested = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequested]
  }
  @scala.inline
  implicit class WindowAuthRequestedOps[Self <: WindowAuthRequested] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthInfo(value: AnonHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

