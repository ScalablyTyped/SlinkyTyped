package typingsSlinky.reactNativePercentageCircle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativePercentageCircle.mod.PercentageCircleProps
import typingsSlinky.reactNativePercentageCircle.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativePercentageCircle {
  
  @JSImport("react-native-percentage-circle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def bgcolor(value: String): this.type = set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerColor(value: String): this.type = set("innerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyle(value: js.Array[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyleVarargs(value: TextStyle*): this.type = set("textStyle", js.Array(value :_*))
  }
  
  implicit def make(companion: ReactNativePercentageCircle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PercentageCircleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
