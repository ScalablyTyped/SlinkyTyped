package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.OriginalEventEventValue
import typingsSlinky.primereact.sliderMod.SliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("primereact/slider", "Slider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactSliderMod.Slider] {
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ OriginalEventEventValue => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSlideEnd(value: /* e */ OriginalEventEventValue => Unit): this.type = set("onSlideEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def orientation(value: String): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def range(value: Boolean): this.type = set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double | (js.Tuple2[Double, Double])): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
