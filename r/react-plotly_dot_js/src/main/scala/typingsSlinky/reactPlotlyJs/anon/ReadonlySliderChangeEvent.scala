package typingsSlinky.reactPlotlyJs.anon

import typingsSlinky.plotlyJs.mod.Slider
import typingsSlinky.plotlyJs.mod.SliderStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.SliderChangeEvent> */
@js.native
trait ReadonlySliderChangeEvent extends js.Object {
  val interaction: Boolean = js.native
  val previousActive: Double = js.native
  val slider: Slider = js.native
  val step: SliderStep = js.native
}

object ReadonlySliderChangeEvent {
  @scala.inline
  def apply(interaction: Boolean, previousActive: Double, slider: Slider, step: SliderStep): ReadonlySliderChangeEvent = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], previousActive = previousActive.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderChangeEvent]
  }
  @scala.inline
  implicit class ReadonlySliderChangeEventOps[Self <: ReadonlySliderChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousActive")(value.asInstanceOf[js.Any])
        ret
    }
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

