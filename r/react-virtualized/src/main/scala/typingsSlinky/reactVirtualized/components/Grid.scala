package typingsSlinky.reactVirtualized.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsSlinky.reactVirtualized.esGridMod.GridCellProps
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeProps
import typingsSlinky.reactVirtualized.esGridMod.GridProps
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typingsSlinky.reactVirtualized.esGridMod.SectionRenderedParams
import typingsSlinky.reactVirtualized.mod.Alignment
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("react-virtualized", "Grid")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Grid] {
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoContainerWidth(value: Boolean): this.type = set("autoContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoHeight(value: Boolean): this.type = set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[ReactElement]): this.type = set("cellRangeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerProps(value: js.Object): this.type = set("containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerRole(value: String): this.type = set("containerRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deferredMeasurementCache(value: CellMeasurerCache): this.type = set("deferredMeasurementCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def estimatedColumnSize(value: Double): this.type = set("estimatedColumnSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def estimatedRowSize(value: Double): this.type = set("estimatedRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getScrollbarSize(value: () => Double): this.type = set("getScrollbarSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isScrolling(value: Boolean): this.type = set("isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noContentRenderer(value: () => ReactElement): this.type = set("noContentRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def onScroll(value: /* params */ ScrollParams => _): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScrollbarPresenceChange(value: /* params */ ScrollbarPresenceParams => _): this.type = set("onScrollbarPresenceChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSectionRendered(value: /* params */ SectionRenderedParams => _): this.type = set("onSectionRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def overscanColumnCount(value: Double): this.type = set("overscanColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): this.type = set("overscanIndicesGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def overscanRowCount(value: Double): this.type = set("overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollToAlignment(value: Alignment): this.type = set("scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollToColumn(value: Double): this.type = set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollToRow(value: Double): this.type = set("scrollToRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollingResetTimeInterval(value: Double): this.type = set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndexNull: this.type = set("tabIndex", null)
  }
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    cellRenderer: /* props */ GridCellProps => ReactElement,
    columnCount: Double,
    columnWidth: Double | (js.Function1[/* params */ Index, Double]),
    height: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GridProps]))
  }
}
