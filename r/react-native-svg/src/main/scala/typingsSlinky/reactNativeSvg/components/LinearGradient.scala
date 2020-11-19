package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsSlinky.reactNativeSvg.mod.LinearGradientCls
import typingsSlinky.reactNativeSvg.mod.LinearGradientProps
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearGradient {
  
  @JSImport("react-native-svg", "LinearGradient")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, LinearGradientCls] {
    
    @scala.inline
    def gradientTransform(value: ColumnMajorTransformMatrix | String): this.type = set("gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gradientUnits(value: Units): this.type = set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x1(value: NumberProp): this.type = set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x2(value: NumberProp): this.type = set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y1(value: NumberProp): this.type = set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y2(value: NumberProp): this.type = set("y2", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinearGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LinearGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
