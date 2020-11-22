package typingsSlinky.nivoTooltip

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.nivoTooltip.anon.Actions
import typingsSlinky.nivoTooltip.contextMod.TooltipActionsContextData
import typingsSlinky.nivoTooltip.contextMod.TooltipStateContextData
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nivo/tooltip/dist/types/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  
  def useTooltip(): TooltipActionsContextData = js.native
  
  def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = js.native
  
  def useTooltipState(): TooltipStateContextData = js.native
}
