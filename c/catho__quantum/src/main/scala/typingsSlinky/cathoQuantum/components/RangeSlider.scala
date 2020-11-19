package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.BaseFontSizeColors
import typingsSlinky.cathoQuantum.anon.From
import typingsSlinky.cathoQuantum.anon.LabelValue
import typingsSlinky.cathoQuantum.cathoQuantumBooleans.`false`
import typingsSlinky.cathoQuantum.cathoQuantumStrings.auto
import typingsSlinky.cathoQuantum.cathoQuantumStrings.inverted
import typingsSlinky.cathoQuantum.cathoQuantumStrings.normal
import typingsSlinky.cathoQuantum.cathoQuantumStrings.off
import typingsSlinky.cathoQuantum.cathoQuantumStrings.on
import typingsSlinky.cathoQuantum.rangeSliderMod.RangeSliderProps
import typingsSlinky.cathoQuantum.rangeSliderMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangeSlider {
  
  @JSImport("@catho/quantum/RangeSlider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: Double | From): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marksVarargs(value: LabelValue*): this.type = set("marks", js.Array(value :_*))
    
    @scala.inline
    def marks(value: js.Array[LabelValue]): this.type = set("marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeCommitted(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChangeCommitted", js.Any.fromFunction1(value))
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: BaseFontSizeColors): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tipFormatter(value: (/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double]) => String): this.type = set("tipFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def track(value: normal | `false` | inverted): this.type = set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double | From): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueLabelDisplay(value: auto | on | off): this.type = set("valueLabelDisplay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RangeSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RangeSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
