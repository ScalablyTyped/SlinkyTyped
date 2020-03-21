package typingsSlinky.reactVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.AnonSortBy
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

object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVirtualized.mod.Table] {
  @JSImport("react-virtualized", "Table")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style, tabIndex */
  def apply(
    headerHeight: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    `aria-label`: String = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    autoContainerWidth: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    cellRangeRenderer: /* params */ GridCellRangeProps => js.Array[TagMod[Any]] = null,
    containerProps: js.Object = null,
    containerRole: String = null,
    containerStyle: CSSProperties = null,
    deferredMeasurementCache: CellMeasurerCache = null,
    disableHeader: js.UndefOr[Boolean] = js.undefined,
    estimatedColumnSize: Int | Double = null,
    estimatedRowSize: Int | Double = null,
    getScrollbarSize: () => Double = null,
    gridClassName: String = null,
    gridStyle: js.Any = null,
    headerClassName: String = null,
    headerRowRenderer: /* props */ TableHeaderRowProps => TagMod[Any] = null,
    headerStyle: js.Any = null,
    height: Int | Double = null,
    isScrolling: js.UndefOr[Boolean] = js.undefined,
    noContentRenderer: () => TagMod[Any] = null,
    noRowsRenderer: () => ReactElement | Null = null,
    onHeaderClick: /* params */ HeaderMouseEventHandlerParams => Unit = null,
    onRowClick: /* info */ RowMouseEventHandlerParams => Unit = null,
    onRowDoubleClick: /* info */ RowMouseEventHandlerParams => Unit = null,
    onRowMouseOut: /* info */ RowMouseEventHandlerParams => Unit = null,
    onRowMouseOver: /* info */ RowMouseEventHandlerParams => Unit = null,
    onRowsRendered: /* info */ IndexRange with OverscanIndexRange => Unit = null,
    onScroll: (/* info */ ScrollEventData) | (/* params */ ScrollParams) => _ | Unit = null,
    onScrollbarPresenceChange: /* params */ ScrollbarPresenceParams => _ = null,
    onSectionRendered: /* params */ SectionRenderedParams => _ = null,
    overscanColumnCount: Int | Double = null,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices = null,
    overscanRowCount: Int | Double = null,
    role: String = null,
    rowClassName: String | (js.Function1[/* info */ Index, String]) = null,
    rowGetter: /* info */ Index => _ = null,
    rowRenderer: /* props */ TableRowProps => TagMod[Any] = null,
    rowStyle: CSSProperties | (js.Function1[/* info */ Index, CSSProperties]) = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment with String = null,
    scrollToColumn: Int | Double = null,
    scrollToIndex: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    scrollingResetTimeInterval: Int | Double = null,
    sort: /* info */ AnonSortBy => Unit = null,
    sortBy: String = null,
    sortDirection: SortDirectionType = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Table] = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoContainerWidth)) __obj.updateDynamic("autoContainerWidth")(autoContainerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (cellRangeRenderer != null) __obj.updateDynamic("cellRangeRenderer")(js.Any.fromFunction1(cellRangeRenderer))
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (containerRole != null) __obj.updateDynamic("containerRole")(containerRole.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeader)) __obj.updateDynamic("disableHeader")(disableHeader.asInstanceOf[js.Any])
    if (estimatedColumnSize != null) __obj.updateDynamic("estimatedColumnSize")(estimatedColumnSize.asInstanceOf[js.Any])
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    if (getScrollbarSize != null) __obj.updateDynamic("getScrollbarSize")(js.Any.fromFunction0(getScrollbarSize))
    if (gridClassName != null) __obj.updateDynamic("gridClassName")(gridClassName.asInstanceOf[js.Any])
    if (gridStyle != null) __obj.updateDynamic("gridStyle")(gridStyle.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerRowRenderer != null) __obj.updateDynamic("headerRowRenderer")(js.Any.fromFunction1(headerRowRenderer))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (noRowsRenderer != null) __obj.updateDynamic("noRowsRenderer")(js.Any.fromFunction0(noRowsRenderer))
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(js.Any.fromFunction1(onHeaderClick))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1(onRowDoubleClick))
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(js.Any.fromFunction1(onRowMouseOut))
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(js.Any.fromFunction1(onRowMouseOver))
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1(onRowsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollbarPresenceChange != null) __obj.updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1(onScrollbarPresenceChange))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (overscanColumnCount != null) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.asInstanceOf[js.Any])
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(overscanIndicesGetter))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowGetter != null) __obj.updateDynamic("rowGetter")(js.Any.fromFunction1(rowGetter))
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1(rowRenderer))
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToIndex != null) __obj.updateDynamic("scrollToIndex")(scrollToIndex.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction1(sort))
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableProps
}

