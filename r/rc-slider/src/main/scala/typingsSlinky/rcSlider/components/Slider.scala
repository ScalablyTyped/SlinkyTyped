package typingsSlinky.rcSlider.components

import typingsSlinky.rcSlider.sliderMod.SliderProps
import typingsSlinky.rcSlider.sliderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Slider.type): SharedBuilder_SliderProps88569986[default] = new SharedBuilder_SliderProps88569986[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderProps): SharedBuilder_SliderProps88569986[default] = new SharedBuilder_SliderProps88569986[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
