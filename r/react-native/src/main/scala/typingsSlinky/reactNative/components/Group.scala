package typingsSlinky.reactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ART.GroupCls
import typingsSlinky.reactNative.mod.ARTGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  @JSImport("react-native", "ART.Group")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, GroupCls] {
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
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
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Group.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ARTGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
