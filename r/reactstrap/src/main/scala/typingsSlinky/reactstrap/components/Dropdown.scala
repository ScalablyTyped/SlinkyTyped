package typingsSlinky.reactstrap.components

import typingsSlinky.reactstrap.dropdownMod.DropdownProps
import typingsSlinky.reactstrap.dropdownMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown {
  @JSImport("reactstrap/lib/Dropdown", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[T](p: DropdownProps): SharedBuilder_DropdownProps_1611943600[default[js.Any], T] = new SharedBuilder_DropdownProps_1611943600[default[js.Any], T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): SharedBuilder_DropdownProps_1611943600[default[js.Any], T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_DropdownProps_1611943600[default[js.Any], T](js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  implicit def make[T](companion: Dropdown.type): SharedBuilder_DropdownProps_1611943600[default[js.Any], T] = new SharedBuilder_DropdownProps_1611943600[default[js.Any], T](js.Array(this.component, js.Dictionary.empty))()
}

