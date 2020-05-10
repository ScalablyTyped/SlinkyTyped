package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.maximized
import typingsSlinky.openfin.openfinStrings.minimized
import typingsSlinky.openfin.openfinStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEndBoundsChangingEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var height: Double = js.native
  var left: Double = js.native
  var top: Double = js.native
  var width: Double = js.native
  var windowState: minimized | normal | maximized = js.native
}

object WindowEndBoundsChangingEvent {
  @scala.inline
  def apply[Topic, Type](
    height: Double,
    left: Double,
    name: String,
    top: Double,
    topic: Topic,
    `type`: Type,
    uuid: String,
    width: Double,
    windowState: minimized | normal | maximized
  ): WindowEndBoundsChangingEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], windowState = windowState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndBoundsChangingEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowEndBoundsChangingEventOps[Self[topic, `type`] <: WindowEndBoundsChangingEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withHeight(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowState(value: minimized | normal | maximized): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

