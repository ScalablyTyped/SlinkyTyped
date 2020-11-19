package typingsSlinky.reactstrap.components

import typingsSlinky.reactstrap.dropdownMod.UncontrolledDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UncontrolledDropdown {
  
  @JSImport("reactstrap", "UncontrolledDropdown")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: UncontrolledDropdownProps): SharedBuilder_UncontrolledDropdownProps515465412[typingsSlinky.reactstrap.mod.UncontrolledDropdown[T], T] = new SharedBuilder_UncontrolledDropdownProps515465412[typingsSlinky.reactstrap.mod.UncontrolledDropdown[T], T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](): SharedBuilder_UncontrolledDropdownProps515465412[typingsSlinky.reactstrap.mod.UncontrolledDropdown[T], T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_UncontrolledDropdownProps515465412[typingsSlinky.reactstrap.mod.UncontrolledDropdown[T], T](js.Array(this.component, __props.asInstanceOf[UncontrolledDropdownProps]))
  }
  
  implicit def make[T](companion: UncontrolledDropdown.type): SharedBuilder_UncontrolledDropdownProps515465412[typingsSlinky.reactstrap.mod.UncontrolledDropdown[T], T] = new SharedBuilder_UncontrolledDropdownProps515465412[typingsSlinky.reactstrap.mod.UncontrolledDropdown[T], T](js.Array(this.component, js.Dictionary.empty))()
}
