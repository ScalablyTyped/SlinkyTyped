package typingsSlinky.reactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ARTTextProps
import typingsSlinky.reactNative.reactNativeStrings.bevel
import typingsSlinky.reactNative.reactNativeStrings.butt
import typingsSlinky.reactNative.reactNativeStrings.miter
import typingsSlinky.reactNative.reactNativeStrings.round
import typingsSlinky.reactNative.reactNativeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ARTText {
  
  @JSImport("react-native", "ARTText")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.ARTText] {
    
    @scala.inline
    def alignment(value: String): this.type = set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def font(value: String): this.type = set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def originX(value: Double): this.type = set("originX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def originY(value: Double): this.type = set("originY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleX(value: Double): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleY(value: Double): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeCap(value: butt | square | round): this.type = set("strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDashVarargs(value: Double*): this.type = set("strokeDash", js.Array(value :_*))
    
    @scala.inline
    def strokeDash(value: js.Array[Double]): this.type = set("strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeJoin(value: bevel | miter | round): this.type = set("strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ARTTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ARTText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
