package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.middle
import typingsSlinky.gestalt.gestaltStrings.top
import typingsSlinky.gestalt.mod.BadgeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  @JSImport("gestalt", "Badge")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Badge] {
    
    @scala.inline
    def position(value: middle | top): this.type = set("position", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BadgeProps]))
  }
}
