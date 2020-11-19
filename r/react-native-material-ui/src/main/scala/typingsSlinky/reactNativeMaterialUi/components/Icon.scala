package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.mod.IconProps
import typingsSlinky.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  @JSImport("react-native-material-ui", "Icon")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Icon] {
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleVarargs(value: ViewStyle*): this.type = set("style", js.Array(value :_*))
    
    @scala.inline
    def style(value: ViewStyle | js.Array[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
}
