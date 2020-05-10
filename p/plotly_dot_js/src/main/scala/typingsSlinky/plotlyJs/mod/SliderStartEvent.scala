package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderStartEvent extends js.Object {
  var slider: Slider = js.native
}

object SliderStartEvent {
  @scala.inline
  def apply(slider: Slider): SliderStartEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStartEvent]
  }
  @scala.inline
  implicit class SliderStartEventOps[Self <: SliderStartEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlider(value: Slider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

