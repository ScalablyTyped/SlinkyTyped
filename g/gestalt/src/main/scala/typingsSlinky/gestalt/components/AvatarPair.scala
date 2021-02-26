package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.Name
import typingsSlinky.gestalt.gestaltStrings.fit
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.mod.AvatarPairProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AvatarPair {
  
  @scala.inline
  def apply(collaborators: js.Array[Name]): Builder = {
    val __props = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarPairProps]))
  }
  
  @JSImport("gestalt", "AvatarPair")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.AvatarPair] {
    
    @scala.inline
    def size(value: md | lg | fit): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarPairProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
