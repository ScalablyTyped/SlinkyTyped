package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gestalt.mod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label {
  @JSImport("gestalt", "Label")
  @js.native
  object component extends js.Object
  
  def withProps(p: LabelProps): Default[tag.type, typingsSlinky.gestalt.mod.Label] = new Default[tag.type, typingsSlinky.gestalt.mod.Label](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(htmlFor: String): Default[tag.type, typingsSlinky.gestalt.mod.Label] = {
    val __props = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.gestalt.mod.Label](js.Array(this.component, __props.asInstanceOf[LabelProps]))
  }
}

