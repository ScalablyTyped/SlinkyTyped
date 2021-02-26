package typingsSlinky.reactOverlays.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactOverlays.esmDropdownMenuMod.DropdownMenuProps
import typingsSlinky.reactOverlays.esmDropdownMenuMod.UseDropdownMenuValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  @scala.inline
  def apply(children: UseDropdownMenuValue => ReactElement): SharedBuilder_DropdownMenuProps1532764967 = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new SharedBuilder_DropdownMenuProps1532764967(js.Array(this.component, __props.asInstanceOf[DropdownMenuProps]))
  }
  
  @JSImport("react-overlays/esm/DropdownMenu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps1532764967 = new SharedBuilder_DropdownMenuProps1532764967(js.Array(this.component, p.asInstanceOf[js.Any]))
}
