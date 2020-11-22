package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gestalt.mod.ButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  
  @JSImport("gestalt", "ButtonGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonGroupProps): Default[tag.type, typingsSlinky.gestalt.mod.ButtonGroup] = new Default[tag.type, typingsSlinky.gestalt.mod.ButtonGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ButtonGroup.type): Default[tag.type, typingsSlinky.gestalt.mod.ButtonGroup] = new Default[tag.type, typingsSlinky.gestalt.mod.ButtonGroup](js.Array(this.component, js.Dictionary.empty))()
}
