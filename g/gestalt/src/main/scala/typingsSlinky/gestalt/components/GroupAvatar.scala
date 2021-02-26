package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.Name
import typingsSlinky.gestalt.gestaltStrings.fit
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import typingsSlinky.gestalt.mod.GroupAvatarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroupAvatar {
  
  @scala.inline
  def apply(collaborators: js.Array[Name]): Builder = {
    val __props = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GroupAvatarProps]))
  }
  
  @JSImport("gestalt", "GroupAvatar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.GroupAvatar] {
    
    @scala.inline
    def outline(value: Boolean): this.type = set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: xs | sm | md | lg | xl | fit): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GroupAvatarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
