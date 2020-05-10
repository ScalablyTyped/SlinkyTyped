package typingsSlinky.doubleclickGpt.googletag.events

import typingsSlinky.doubleclickGpt.googletag.Slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotVisibilityChangedEvent extends Event {
  var inViewPercentage: Double = js.native
}

object SlotVisibilityChangedEvent {
  @scala.inline
  def apply(inViewPercentage: Double, serviceName: String, slot: Slot): SlotVisibilityChangedEvent = {
    val __obj = js.Dynamic.literal(inViewPercentage = inViewPercentage.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotVisibilityChangedEvent]
  }
  @scala.inline
  implicit class SlotVisibilityChangedEventOps[Self <: SlotVisibilityChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInViewPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inViewPercentage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

