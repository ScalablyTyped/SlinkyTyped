package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.avatarMod.AvatarProps
import typingsSlinky.cathoQuantum.avatarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  @JSImport("@catho/quantum/Avatar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def hasNotification(value: Boolean): this.type = set("hasNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasToggle(value: Boolean): this.type = set("hasToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: () => js.Object): this.type = set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def picture(value: String): this.type = set("picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
