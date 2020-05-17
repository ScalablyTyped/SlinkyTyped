package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.anon.Host
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowAuthRequestedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var authInfo: Host = js.native
}

object WindowAuthRequestedEvent {
  @scala.inline
  def apply[Topic, Type](authInfo: Host, name: String, topic: Topic, `type`: Type, uuid: String): WindowAuthRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowAuthRequestedEventOps[Self[topic, `type`] <: WindowAuthRequestedEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withAuthInfo(value: Host): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

