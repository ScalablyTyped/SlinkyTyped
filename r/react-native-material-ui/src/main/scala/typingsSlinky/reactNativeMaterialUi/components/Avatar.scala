package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Image
import typingsSlinky.reactNativeMaterialUi.anon.Content
import typingsSlinky.reactNativeMaterialUi.mod.AvatarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  @JSImport("react-native-material-ui", "Avatar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Avatar] {
    
    @scala.inline
    def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconColor(value: String): this.type = set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def image(value: Image): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: Content): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
