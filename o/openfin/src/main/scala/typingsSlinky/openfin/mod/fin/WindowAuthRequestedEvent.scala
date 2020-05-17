package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.anon.Host
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowAuthRequestedEvent extends WindowBaseEvent {
  var authInfo: Host = js.native
}

object WindowAuthRequestedEvent {
  @scala.inline
  def apply(authInfo: Host, name: String, topic: window, `type`: OpenFinWindowEventType, uuid: String): WindowAuthRequestedEvent = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent]
  }
  @scala.inline
  implicit class WindowAuthRequestedEventOps[Self <: WindowAuthRequestedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthInfo(value: Host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

