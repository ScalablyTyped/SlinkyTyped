package typingsSlinky.openfin.eventsApplicationMod

import typingsSlinky.openfin.eventsBaseMod.ApplicationEvent
import typingsSlinky.openfin.openfinNumbers.`0`
import typingsSlinky.openfin.openfinNumbers.`1`
import typingsSlinky.openfin.openfinNumbers.`2`
import typingsSlinky.openfin.shapesMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrayIconClicked[Topic, Type] extends ApplicationEvent[Topic, Type] {
  var bounds: Bounds = js.native
  var button: `0` | `1` | `2` = js.native
  var monitorInfo: js.Any = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object TrayIconClicked {
  @scala.inline
  def apply[Topic, Type](
    bounds: Bounds,
    button: `0` | `1` | `2`,
    monitorInfo: js.Any,
    topic: Topic,
    `type`: Type,
    uuid: String,
    x: Double,
    y: Double
  ): TrayIconClicked[Topic, Type] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayIconClicked[Topic, Type]]
  }
  @scala.inline
  implicit class TrayIconClickedOps[Self[topic, `type`] <: TrayIconClicked[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withBounds(value: Bounds): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: `0` | `1` | `2`): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitorInfo(value: js.Any): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

