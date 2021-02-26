package typingsSlinky.rrc.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rrc.mod.StatusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Status {
  
  @scala.inline
  def apply(code: String): Default[tag.type, typingsSlinky.rrc.mod.Status] = {
    val __props = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.rrc.mod.Status](js.Array(this.component, __props.asInstanceOf[StatusProps]))
  }
  
  @JSImport("rrc", "Status")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StatusProps): Default[tag.type, typingsSlinky.rrc.mod.Status] = new Default[tag.type, typingsSlinky.rrc.mod.Status](js.Array(this.component, p.asInstanceOf[js.Any]))
}
