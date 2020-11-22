package typingsSlinky.reactstrap.components

import typingsSlinky.reactstrap.dropdownMod.DropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @JSImport("reactstrap/es", "Dropdown")
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownProps): SharedBuilder_DropdownProps303701658[typingsSlinky.reactstrap.mod.Dropdown] = new SharedBuilder_DropdownProps303701658[typingsSlinky.reactstrap.mod.Dropdown](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Dropdown.type): SharedBuilder_DropdownProps303701658[typingsSlinky.reactstrap.mod.Dropdown] = new SharedBuilder_DropdownProps303701658[typingsSlinky.reactstrap.mod.Dropdown](js.Array(this.component, js.Dictionary.empty))()
}
