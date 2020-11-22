package typingsSlinky.reactstrap.components

import typingsSlinky.reactstrap.dropdownMod.UncontrolledDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UncontrolledDropdown {
  
  @JSImport("reactstrap/es", "UncontrolledDropdown")
  @js.native
  object component extends js.Object
  
  def withProps(p: UncontrolledDropdownProps): SharedBuilder_UncontrolledDropdownProps_1802600603[typingsSlinky.reactstrap.mod.UncontrolledDropdown] = new SharedBuilder_UncontrolledDropdownProps_1802600603[typingsSlinky.reactstrap.mod.UncontrolledDropdown](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: UncontrolledDropdown.type): SharedBuilder_UncontrolledDropdownProps_1802600603[typingsSlinky.reactstrap.mod.UncontrolledDropdown] = new SharedBuilder_UncontrolledDropdownProps_1802600603[typingsSlinky.reactstrap.mod.UncontrolledDropdown](js.Array(this.component, js.Dictionary.empty))()
}
