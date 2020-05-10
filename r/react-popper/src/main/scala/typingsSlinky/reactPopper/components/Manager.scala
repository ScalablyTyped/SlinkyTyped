package typingsSlinky.reactPopper.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactPopper.mod.ManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Manager {
  @JSImport("react-popper", "Manager")
  @js.native
  object component extends js.Object
  
  def withProps(p: ManagerProps): Default[tag.type, typingsSlinky.reactPopper.mod.Manager] = new Default[tag.type, typingsSlinky.reactPopper.mod.Manager](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Manager.type): Default[tag.type, typingsSlinky.reactPopper.mod.Manager] = new Default[tag.type, typingsSlinky.reactPopper.mod.Manager](js.Array(this.component, js.Dictionary.empty))()
}

