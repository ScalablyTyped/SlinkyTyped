package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.blueprintjsCore.popoverArrowMod.IPopoverArrowProps
import typingsSlinky.popperJs.mod.Placement
import typingsSlinky.reactPopper.mod.PopperArrowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverArrow {
  
  @scala.inline
  def apply(arrowProps: PopperArrowProps, placement: Placement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IPopoverArrowProps]))
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverArrow", "PopoverArrow")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IPopoverArrowProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
