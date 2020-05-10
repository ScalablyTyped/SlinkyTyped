package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.windowOptionMod.WindowOption
import typingsSlinky.openfin.windowOptionMod.WindowOptionDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOptionsChangedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var diff: WindowOptionDiff = js.native
  var options: WindowOption = js.native
}

object WindowOptionsChangedEvent {
  @scala.inline
  def apply[Topic, Type](
    diff: WindowOptionDiff,
    name: String,
    options: WindowOption,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowOptionsChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptionsChangedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowOptionsChangedEventOps[Self[topic, `type`] <: WindowOptionsChangedEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withDiff(value: WindowOptionDiff): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: WindowOption): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

