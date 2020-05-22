package typingsSlinky.reactPlotlyJs.anon

import typingsSlinky.plotlyJs.mod.Slider
import typingsSlinky.plotlyJs.mod.SliderStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.SliderEndEvent> */
trait ReadonlySliderEndEvent extends js.Object {
  val slider: Slider
  val step: SliderStep
}

object ReadonlySliderEndEvent {
  @scala.inline
  def apply(slider: Slider, step: SliderStep): ReadonlySliderEndEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderEndEvent]
  }
}

