package typingsSlinky.rcSlider.components

import typingsSlinky.rcSlider.mod.default_
import typingsSlinky.rcSlider.sliderMod.SliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Default {
  
  @JSImport("rc-slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SliderProps): SharedBuilder_SliderProps88569986[default_] = new SharedBuilder_SliderProps88569986[default_](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Default.type): SharedBuilder_SliderProps88569986[default_] = new SharedBuilder_SliderProps88569986[default_](js.Array(this.component, js.Dictionary.empty))()
}
