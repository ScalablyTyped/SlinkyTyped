package typingsSlinky.blueprintjsCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.rangeSliderMod.IRangeSliderProps
import typingsSlinky.blueprintjsCore.rangeSliderMod.NumberRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RangeSlider {
  
  @JSImport("@blueprintjs/core", "RangeSlider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.RangeSlider] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelPrecision(value: Double): this.type = set("labelPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelRenderer(value: Boolean | (js.Function1[/* value */ Double, String | ReactElement])): this.type = set("labelRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelRendererFunction1(value: /* value */ Double => String | ReactElement): this.type = set("labelRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelStepSize(value: Double): this.type = set("labelStepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelValues(value: js.Array[Double]): this.type = set("labelValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelValuesVarargs(value: Double*): this.type = set("labelValues", js.Array(value :_*))
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ NumberRange => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRelease(value: /* value */ NumberRange => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def showTrackFill(value: Boolean): this.type = set("showTrackFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepSize(value: Double): this.type = set("stepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: NumberRange): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RangeSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IRangeSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
