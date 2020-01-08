package typingsSlinky.reactDashNativeDashModalDashPopover.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopoverController
  extends ExternalComponentNoPropsWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashModalDashPopover.libPopoverControllerMod.PopoverController
    ] {
  @JSImport("react-native-modal-popover/lib/PopoverController", "PopoverController")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

