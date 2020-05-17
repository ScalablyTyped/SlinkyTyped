package typingsSlinky.reactPlotlyJs.anon

import typingsSlinky.plotlyJs.mod.Slider
import typingsSlinky.plotlyJs.mod.SliderStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.SliderEndEvent> */
@js.native
trait ReadonlySliderEndEvent extends js.Object {
  val slider: Slider = js.native
  val step: SliderStep = js.native
}

object ReadonlySliderEndEvent {
  @scala.inline
  def apply(slider: Slider, step: SliderStep): ReadonlySliderEndEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderEndEvent]
  }
  @scala.inline
  implicit class ReadonlySliderEndEventOps[Self <: ReadonlySliderEndEvent] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withStep(value: SliderStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

