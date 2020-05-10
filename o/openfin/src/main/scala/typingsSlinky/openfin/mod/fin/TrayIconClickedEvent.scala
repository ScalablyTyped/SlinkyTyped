package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrayIconClickedEvent extends ApplicationBaseEvent {
  var button: Double = js.native
   // 0 for left, 1 for middle, 2 for right
  var monitorInfo: MonitorInfo = js.native
  var x: Double = js.native
   // the cursor x coordinate
  var y: Double = js.native
}

object TrayIconClickedEvent {
  @scala.inline
  def apply(
    button: Double,
    monitorInfo: MonitorInfo,
    topic: String,
    `type`: OpenFinApplicationEventType,
    uuid: String,
    x: Double,
    y: Double
  ): TrayIconClickedEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayIconClickedEvent]
  }
  @scala.inline
  implicit class TrayIconClickedEventOps[Self <: TrayIconClickedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitorInfo(value: MonitorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

