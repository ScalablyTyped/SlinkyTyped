package typingsSlinky.nivoTooltip

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.nivoTooltip.anon.Actions
import typingsSlinky.nivoTooltip.basicTooltipMod.BasicTooltipProps
import typingsSlinky.nivoTooltip.chipMod.ChipProps
import typingsSlinky.nivoTooltip.contextMod.TooltipActionsContextData
import typingsSlinky.nivoTooltip.contextMod.TooltipStateContextData
import typingsSlinky.nivoTooltip.contextMod.TooltipStateContextDataHidden
import typingsSlinky.nivoTooltip.crosshairMod.CrosshairProps
import typingsSlinky.nivoTooltip.tableTooltipMod.TableTooltipProps
import typingsSlinky.nivoTooltip.tooltipProviderMod.TooltipProviderProps
import typingsSlinky.nivoTooltip.tooltipWrapperMod.TooltipWrapperProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  val BasicTooltip: ReactComponentClass[BasicTooltipProps] = js.native
  
  @JSImport("@nivo/tooltip", "Chip")
  @js.native
  val Chip: ReactComponentClass[ChipProps] = js.native
  
  @JSImport("@nivo/tooltip", "Crosshair")
  @js.native
  val Crosshair: ReactComponentClass[js.Function1[/* hasWidthHeightTypeXY */ CrosshairProps, ReactElement]] = js.native
  
  @JSImport("@nivo/tooltip", "TableTooltip")
  @js.native
  val TableTooltip: ReactComponentClass[
    js.Function1[/* hasTitleRowsRenderContent */ TableTooltipProps, ReactElement | Null]
  ] = js.native
  
  @JSImport("@nivo/tooltip", "Tooltip")
  @js.native
  def Tooltip(): ReactElement | Null = js.native
  
  @JSImport("@nivo/tooltip", "TooltipActionsContext")
  @js.native
  val TooltipActionsContext: Context[TooltipActionsContextData] = js.native
  
  @JSImport("@nivo/tooltip", "TooltipProvider")
  @js.native
  def TooltipProvider(hasContainerChildren: PropsWithChildren[TooltipProviderProps]): ReactElement = js.native
  
  @JSImport("@nivo/tooltip", "TooltipStateContext")
  @js.native
  val TooltipStateContext: Context[TooltipStateContextData] = js.native
  
  @JSImport("@nivo/tooltip", "TooltipWrapper")
  @js.native
  val TooltipWrapper: ReactComponentClass[PropsWithChildren[TooltipWrapperProps]] = js.native
  
  @JSImport("@nivo/tooltip", "hiddenTooltipState")
  @js.native
  val hiddenTooltipState: TooltipStateContextDataHidden = js.native
  
  @JSImport("@nivo/tooltip", "isVisibleTooltipState")
  @js.native
  def isVisibleTooltipState(state: TooltipStateContextData): /* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean = js.native
  
  @JSImport("@nivo/tooltip", "useTooltip")
  @js.native
  def useTooltip(): TooltipActionsContextData = js.native
  
  @JSImport("@nivo/tooltip", "useTooltipHandlers")
  @js.native
  def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = js.native
  
  @JSImport("@nivo/tooltip", "useTooltipState")
  @js.native
  def useTooltipState(): TooltipStateContextData = js.native
}
