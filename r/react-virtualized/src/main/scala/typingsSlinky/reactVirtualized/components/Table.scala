package typingsSlinky.reactVirtualized.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.anon.SortBy
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeProps
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typingsSlinky.reactVirtualized.esGridMod.SectionRenderedParams
import typingsSlinky.reactVirtualized.esTableMod.HeaderMouseEventHandlerParams
import typingsSlinky.reactVirtualized.esTableMod.RowMouseEventHandlerParams
import typingsSlinky.reactVirtualized.esTableMod.SortDirectionType
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowProps
import typingsSlinky.reactVirtualized.esTableMod.TableProps
import typingsSlinky.reactVirtualized.esTableMod.TableRowProps
import typingsSlinky.reactVirtualized.mod.Alignment
import typingsSlinky.reactVirtualized.mod.Index
import typingsSlinky.reactVirtualized.mod.IndexRange
import typingsSlinky.reactVirtualized.mod.OverscanIndexRange
import typingsSlinky.reactVirtualized.mod.ScrollEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  @JSImport("react-virtualized", "Table")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Table] {
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
    def cellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[TagMod[Any]]): this.type = set("cellRangeRenderer", js.Any.fromFunction1(value))
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
    def disableHeader(value: Boolean): this.type = set("disableHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def estimatedColumnSize(value: Double): this.type = set("estimatedColumnSize", value.asInstanceOf[js.Any])
    @scala.inline
    def estimatedRowSize(value: Double): this.type = set("estimatedRowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def getScrollbarSize(value: () => Double): this.type = set("getScrollbarSize", js.Any.fromFunction0(value))
    @scala.inline
    def gridClassName(value: String): this.type = set("gridClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def gridStyle(value: js.Any): this.type = set("gridStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRowRenderer(value: /* props */ TableHeaderRowProps => TagMod[Any]): this.type = set("headerRowRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def headerStyle(value: js.Any): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def isScrolling(value: Boolean): this.type = set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def noContentRenderer(value: () => TagMod[Any]): this.type = set("noContentRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def noRowsRenderer(value: () => ReactElement | Null): this.type = set("noRowsRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def onHeaderClick(value: /* params */ HeaderMouseEventHandlerParams => Unit): this.type = set("onHeaderClick", js.Any.fromFunction1(value))
    @scala.inline
    def onRowClick(value: /* info */ RowMouseEventHandlerParams => Unit): this.type = set("onRowClick", js.Any.fromFunction1(value))
    @scala.inline
    def onRowDoubleClick(value: /* info */ RowMouseEventHandlerParams => Unit): this.type = set("onRowDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onRowMouseOut(value: /* info */ RowMouseEventHandlerParams => Unit): this.type = set("onRowMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def onRowMouseOver(value: /* info */ RowMouseEventHandlerParams => Unit): this.type = set("onRowMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def onRowsRendered(value: /* info */ IndexRange with OverscanIndexRange => Unit): this.type = set("onRowsRendered", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: (/* info */ ScrollEventData) | (/* params */ ScrollParams) => _ | Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
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
    def rowClassNameFunction1(value: /* info */ Index => String): this.type = set("rowClassName", js.Any.fromFunction1(value))
    @scala.inline
    def rowClassName(value: String | (js.Function1[/* info */ Index, String])): this.type = set("rowClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def rowGetter(value: /* info */ Index => _): this.type = set("rowGetter", js.Any.fromFunction1(value))
    @scala.inline
    def rowRenderer(value: /* props */ TableRowProps => TagMod[Any]): this.type = set("rowRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def rowStyleFunction1(value: /* info */ Index => CSSProperties): this.type = set("rowStyle", js.Any.fromFunction1(value))
    @scala.inline
    def rowStyle(value: CSSProperties | (js.Function1[/* info */ Index, CSSProperties])): this.type = set("rowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToAlignment(value: Alignment with String): this.type = set("scrollToAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToColumn(value: Double): this.type = set("scrollToColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToIndex(value: Double): this.type = set("scrollToIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToRow(value: Double): this.type = set("scrollToRow", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollingResetTimeInterval(value: Double): this.type = set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def sort(value: /* info */ SortBy => Unit): this.type = set("sort", js.Any.fromFunction1(value))
    @scala.inline
    def sortBy(value: String): this.type = set("sortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def sortDirection(value: SortDirectionType): this.type = set("sortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndexNull: this.type = set("tabIndex", null)
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    headerHeight: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double])
  ): Builder = {
    val __props = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
}

