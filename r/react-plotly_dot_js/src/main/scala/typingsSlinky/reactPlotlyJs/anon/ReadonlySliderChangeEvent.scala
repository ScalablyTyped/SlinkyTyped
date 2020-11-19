package typingsSlinky.reactPlotlyJs.anon

import typingsSlinky.plotlyJs.mod.Slider
import typingsSlinky.plotlyJs.mod.SliderStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInteraction(value: Boolean): Self = this.set("interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousActive(value: Double): Self = this.set("previousActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider(value: Slider): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: SliderStep): Self = this.set("step", value.asInstanceOf[js.Any])
  }
}
