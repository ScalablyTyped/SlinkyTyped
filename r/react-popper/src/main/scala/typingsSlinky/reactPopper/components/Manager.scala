package typingsSlinky.reactPopper.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactPopper.mod.ManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Manager {
  
  @JSImport("react-popper", "Manager")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Manager.type): Default[tag.type, typingsSlinky.reactPopper.mod.Manager] = new Default[tag.type, typingsSlinky.reactPopper.mod.Manager](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ManagerProps): Default[tag.type, typingsSlinky.reactPopper.mod.Manager] = new Default[tag.type, typingsSlinky.reactPopper.mod.Manager](js.Array(this.component, p.asInstanceOf[js.Any]))
}
