package typingsSlinky.reactstrap.components

import typingsSlinky.reactstrap.dropdownMod.DropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonDropdown {
  
  @JSImport("reactstrap/es", "ButtonDropdown")
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownProps): SharedBuilder_DropdownProps303701658[typingsSlinky.reactstrap.mod.ButtonDropdown] = new SharedBuilder_DropdownProps303701658[typingsSlinky.reactstrap.mod.ButtonDropdown](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ButtonDropdown.type): SharedBuilder_DropdownProps303701658[typingsSlinky.reactstrap.mod.ButtonDropdown] = new SharedBuilder_DropdownProps303701658[typingsSlinky.reactstrap.mod.ButtonDropdown](js.Array(this.component, js.Dictionary.empty))()
}
