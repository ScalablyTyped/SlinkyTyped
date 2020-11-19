package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.avatarMod.AvatarOverrides
import typingsSlinky.baseui.avatarMod.AvatarProps
import typingsSlinky.baseui.avatarMod.StyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  @JSImport("baseui/avatar", "Avatar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.avatarMod.Avatar] {
    
    @scala.inline
    def overrides(value: AvatarOverrides[StyleProps]): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarProps]))
  }
}
