package typingsSlinky.reactstrap.components

import typingsSlinky.reactstrap.dropdownMod.UncontrolledDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UncontrolledDropdown {
  @JSImport("reactstrap", "UncontrolledDropdown")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: UncontrolledDropdownProps): SharedBuilder_UncontrolledDropdownProps1809112045[typingsSlinky.reactstrap.mod.UncontrolledDropdown[js.Any], T] = new SharedBuilder_UncontrolledDropdownProps1809112045[typingsSlinky.reactstrap.mod.UncontrolledDropdown[js.Any], T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): SharedBuilder_UncontrolledDropdownProps1809112045[typingsSlinky.reactstrap.mod.UncontrolledDropdown[js.Any], T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_UncontrolledDropdownProps1809112045[typingsSlinky.reactstrap.mod.UncontrolledDropdown[js.Any], T](js.Array(this.component, __props.asInstanceOf[UncontrolledDropdownProps]))
  }
  implicit def make[T](companion: UncontrolledDropdown.type): SharedBuilder_UncontrolledDropdownProps1809112045[typingsSlinky.reactstrap.mod.UncontrolledDropdown[js.Any], T] = new SharedBuilder_UncontrolledDropdownProps1809112045[typingsSlinky.reactstrap.mod.UncontrolledDropdown[js.Any], T](js.Array(this.component, js.Dictionary.empty))()
}

