package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.RadialGradientProps
import typingsSlinky.reactNativeSvg.mod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadialGradient {
  
  @JSImport("react-native-svg", "RadialGradient")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def cx(value: NumberProp): this.type = set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cy(value: NumberProp): this.type = set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fx(value: NumberProp): this.type = set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fy(value: NumberProp): this.type = set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gradientTransform(value: ColumnMajorTransformMatrix | String): this.type = set("gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gradientUnits(value: Units): this.type = set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def r(value: NumberProp): this.type = set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rx(value: NumberProp): this.type = set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ry(value: NumberProp): this.type = set("ry", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadialGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RadialGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
