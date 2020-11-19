package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.sliderMod.SliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("@ant-design/react-native", "Slider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Slider] {
    
    @scala.inline
    def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maximumTrackTintColor(value: String): this.type = set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumTrackTintColor(value: String): this.type = set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAfterChange(value: /* value */ js.UndefOr[Double] => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* value */ js.UndefOr[Double] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tipFormatter(value: /* value */ js.UndefOr[String] => ReactElement): this.type = set("tipFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
