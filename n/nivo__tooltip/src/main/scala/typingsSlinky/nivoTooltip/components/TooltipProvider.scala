package typingsSlinky.nivoTooltip.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nivoTooltip.tooltipProviderMod.TooltipProviderProps
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipProvider {
  
  @JSImport("@nivo/tooltip", "TooltipProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[TooltipProviderProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(container: MutableRefObject[HTMLDivElement]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[TooltipProviderProps]]))
  }
}
