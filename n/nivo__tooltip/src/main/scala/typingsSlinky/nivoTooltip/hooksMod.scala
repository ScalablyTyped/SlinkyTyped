package typingsSlinky.nivoTooltip

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.nivoTooltip.anon.Actions
import typingsSlinky.nivoTooltip.contextMod.TooltipActionsContextData
import typingsSlinky.nivoTooltip.contextMod.TooltipStateContextData
import typingsSlinky.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/tooltip/dist/types/hooks", "useTooltip")
  @js.native
  def useTooltip(): TooltipActionsContextData = js.native
  
  @JSImport("@nivo/tooltip/dist/types/hooks", "useTooltipHandlers")
  @js.native
  def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = js.native
  
  @JSImport("@nivo/tooltip/dist/types/hooks", "useTooltipState")
  @js.native
  def useTooltipState(): TooltipStateContextData = js.native
}
