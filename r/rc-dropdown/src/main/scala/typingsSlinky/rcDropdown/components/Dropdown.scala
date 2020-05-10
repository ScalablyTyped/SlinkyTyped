package typingsSlinky.rcDropdown.components

import typingsSlinky.rcDropdown.dropdownMod.DropdownProps
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown {
  @JSImport("rc-dropdown/lib/Dropdown", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownProps with RefAttributes[js.Any]): `SharedBuilder_<intersection>821852308`[Ref[js.Any] with js.Object] = new `SharedBuilder_<intersection>821852308`[Ref[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(getPopupContainer: js.Any): `SharedBuilder_<intersection>821852308`[Ref[js.Any] with js.Object] = {
    val __props = js.Dynamic.literal(getPopupContainer = getPopupContainer.asInstanceOf[js.Any])
    new `SharedBuilder_<intersection>821852308`[Ref[js.Any] with js.Object](js.Array(this.component, __props.asInstanceOf[DropdownProps with RefAttributes[js.Any]]))
  }
}

