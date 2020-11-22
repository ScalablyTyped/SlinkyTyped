package typingsSlinky.nivoTooltip.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nivoTooltip.tooltipWrapperMod.TooltipWrapperProps
import typingsSlinky.nivoTooltip.typesMod.TooltipAnchor
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipWrapper {
  
  @JSImport("@nivo/tooltip", "TooltipWrapper")
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[TooltipWrapperProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(anchor: TooltipAnchor, position: js.Tuple2[Double, Double]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[TooltipWrapperProps]]))
  }
}
