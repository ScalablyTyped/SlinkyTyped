package typingsSlinky.reactRangeslider.components

import org.scalablytyped.runtime.NumberDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRangeslider.mod.SliderProps
import typingsSlinky.reactRangeslider.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactRangeslider {
  
  @JSImport("react-rangeslider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: /* value */ Double => js.UndefOr[String | Double]): this.type = set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleLabel(value: String): this.type = set("handleLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labels(value: NumberDictionary[String]): this.type = set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeComplete(value: /* value */ Double => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeStart(value: /* value */ Double => Unit): this.type = set("onChangeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def orientation(value: String): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: Boolean): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SliderProps]))
  }
}
