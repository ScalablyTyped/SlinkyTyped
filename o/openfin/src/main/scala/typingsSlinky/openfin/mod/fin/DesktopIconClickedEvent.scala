package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.AnonLeft
import typingsSlinky.openfin.openfinStrings.`desktop-icon-clicked`
import typingsSlinky.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesktopIconClickedEvent extends js.Object {
  var mouse: AnonLeft = js.native
  /**
    * the number of milliseconds that have elapsed since the system was started,
    */
  var tickCount: Double = js.native
  var topic: system = js.native
  var `type`: `desktop-icon-clicked` = js.native
}

object DesktopIconClickedEvent {
  @scala.inline
  def apply(mouse: AnonLeft, tickCount: Double, topic: system, `type`: `desktop-icon-clicked`): DesktopIconClickedEvent = {
    val __obj = js.Dynamic.literal(mouse = mouse.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopIconClickedEvent]
  }
  @scala.inline
  implicit class DesktopIconClickedEventOps[Self <: DesktopIconClickedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMouse(value: AnonLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: system): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `desktop-icon-clicked`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

