package typingsSlinky.reactOverlays.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactOverlays.dropdownMenuMod.DropdownMenuProps
import typingsSlinky.reactOverlays.dropdownMenuMod.UseDropdownMenuValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  @JSImport("react-overlays/esm/DropdownMenu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps_2032938684 = new SharedBuilder_DropdownMenuProps_2032938684(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: UseDropdownMenuValue => ReactElement): SharedBuilder_DropdownMenuProps_2032938684 = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new SharedBuilder_DropdownMenuProps_2032938684(js.Array(this.component, __props.asInstanceOf[DropdownMenuProps]))
  }
}
