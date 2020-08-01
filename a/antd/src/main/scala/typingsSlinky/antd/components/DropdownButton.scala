package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import typingsSlinky.antd.dropdownButtonMod.DropdownButtonProps
import typingsSlinky.antd.dropdownDropdownMod.OverlayFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownButton {
  @JSImport("antd/lib/dropdown/dropdown-button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownButtonProps): SharedBuilder_DropdownButtonProps_944754699 = new SharedBuilder_DropdownButtonProps_944754699(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(overlay: ReactElement | OverlayFunc): SharedBuilder_DropdownButtonProps_944754699 = {
    val __props = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    new SharedBuilder_DropdownButtonProps_944754699(js.Array(this.component, __props.asInstanceOf[DropdownButtonProps]))
  }
}

