package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdUtils.gridCellMod.GridCellProps
import typingsSlinky.reactMdUtils.gridListCellMod.GridListCellProps
import typingsSlinky.reactMdUtils.gridListMod.GridListProps
import typingsSlinky.reactMdUtils.gridMod.GridProps
import typingsSlinky.reactMdUtils.typesTypesMod.PropsWithRef
import typingsSlinky.reactMdUtils.useGridListMod.GridListSize
import typingsSlinky.reactMdUtils.useGridListMod.UseGridListOptions
import typingsSlinky.reactMdUtils.useGridListMod.UseGridListReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/layout", JSImport.Namespace)
@js.native
object layoutMod extends js.Object {
  
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  val Grid: ForwardRefExoticComponent[GridProps with RefAttributes[HTMLDivElement]] = js.native
  
  val GridCell: ForwardRefExoticComponent[GridCellProps with RefAttributes[HTMLDivElement]] = js.native
  
  val GridList: ForwardRefExoticComponent[GridListProps with RefAttributes[HTMLDivElement]] = js.native
  
  val GridListCell: ForwardRefExoticComponent[GridListCellProps with RefAttributes[HTMLDivElement]] = js.native
  
  val GridListSizeProvider: ReactComponentClass[ProviderProps[GridListSize]] = js.native
  
  def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = js.native
  def useGridList[E /* <: HTMLElement */](
    hasRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = js.native
  
  def useGridListSize(): GridListSize = js.native
}
