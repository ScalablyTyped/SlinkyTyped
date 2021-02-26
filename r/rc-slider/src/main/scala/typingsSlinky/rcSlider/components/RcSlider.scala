package typingsSlinky.rcSlider.components

import typingsSlinky.rcSlider.handleMod.HandleProps
import typingsSlinky.rcSlider.mod.default
import typingsSlinky.rcSlider.mod.default.HandleCls
import typingsSlinky.rcSlider.rangeMod.RangeProps
import typingsSlinky.rcSlider.sliderMod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcSlider {
  
  object Handle {
    
    @JSImport("rc-slider", "default.Handle")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Handle.type): SharedBuilder_HandleProps_773947409[HandleCls] = new SharedBuilder_HandleProps_773947409[HandleCls](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HandleProps): SharedBuilder_HandleProps_773947409[HandleCls] = new SharedBuilder_HandleProps_773947409[HandleCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Range {
    
    @JSImport("rc-slider", "default.Range")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Range.type): SharedBuilder_RangeProps_652309511[typingsSlinky.rcSlider.mod.default.Range] = new SharedBuilder_RangeProps_652309511[typingsSlinky.rcSlider.mod.default.Range](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RangeProps): SharedBuilder_RangeProps_652309511[typingsSlinky.rcSlider.mod.default.Range] = new SharedBuilder_RangeProps_652309511[typingsSlinky.rcSlider.mod.default.Range](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-slider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcSlider.type): SharedBuilder_SliderProps88569986[default] = new SharedBuilder_SliderProps88569986[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderProps): SharedBuilder_SliderProps88569986[default] = new SharedBuilder_SliderProps88569986[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
