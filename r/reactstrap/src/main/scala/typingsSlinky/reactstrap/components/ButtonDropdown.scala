package typingsSlinky.reactstrap.components

import typingsSlinky.reactstrap.dropdownMod.DropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonDropdown {
  
  @JSImport("reactstrap", "ButtonDropdown")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: DropdownProps): SharedBuilder_DropdownProps_1846249806[typingsSlinky.reactstrap.mod.ButtonDropdown[T], T] = new SharedBuilder_DropdownProps_1846249806[typingsSlinky.reactstrap.mod.ButtonDropdown[T], T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](): SharedBuilder_DropdownProps_1846249806[typingsSlinky.reactstrap.mod.ButtonDropdown[T], T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_DropdownProps_1846249806[typingsSlinky.reactstrap.mod.ButtonDropdown[T], T](js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  
  implicit def make[T](companion: ButtonDropdown.type): SharedBuilder_DropdownProps_1846249806[typingsSlinky.reactstrap.mod.ButtonDropdown[T], T] = new SharedBuilder_DropdownProps_1846249806[typingsSlinky.reactstrap.mod.ButtonDropdown[T], T](js.Array(this.component, js.Dictionary.empty))()
}
