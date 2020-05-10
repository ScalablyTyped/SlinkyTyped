package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowExternalProcessStartedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var processUuid: String = js.native
}

object WindowExternalProcessStartedEvent {
  @scala.inline
  def apply[Topic, Type](name: String, processUuid: String, topic: Topic, `type`: Type, uuid: String): WindowExternalProcessStartedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessStartedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowExternalProcessStartedEventOps[Self[topic, `type`] <: WindowExternalProcessStartedEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withProcessUuid(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processUuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

