package typingsSlinky.rrc.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rrc.mod.StatusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Status {
  @JSImport("rrc", "Status")
  @js.native
  object component extends js.Object
  
  def withProps(p: StatusProps): Default[tag.type, typingsSlinky.rrc.mod.Status] = new Default[tag.type, typingsSlinky.rrc.mod.Status](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(code: String): Default[tag.type, typingsSlinky.rrc.mod.Status] = {
    val __props = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.rrc.mod.Status](js.Array(this.component, __props.asInstanceOf[StatusProps]))
  }
}

