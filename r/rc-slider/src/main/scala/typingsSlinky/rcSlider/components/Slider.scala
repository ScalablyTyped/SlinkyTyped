package typingsSlinky.rcSlider.components

import typingsSlinky.rcSlider.sliderMod.SliderProps
import typingsSlinky.rcSlider.sliderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SliderProps): SharedBuilder_SliderProps88569986[default] = new SharedBuilder_SliderProps88569986[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Slider.type): SharedBuilder_SliderProps88569986[default] = new SharedBuilder_SliderProps88569986[default](js.Array(this.component, js.Dictionary.empty))()
}
