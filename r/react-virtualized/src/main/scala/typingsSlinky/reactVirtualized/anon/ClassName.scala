package typingsSlinky.reactVirtualized.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Requireable
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esTableMod.Column
import typingsSlinky.reactVirtualized.esTableMod.HeaderMouseEventHandlerParams
import typingsSlinky.reactVirtualized.esTableMod.RowMouseEventHandlerParams
import typingsSlinky.reactVirtualized.esTableMod.SortDirectionType
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableRowProps
import typingsSlinky.reactVirtualized.mod.IndexRange
import typingsSlinky.reactVirtualized.mod.OverscanIndexRange
import typingsSlinky.reactVirtualized.mod.ScrollEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var `aria-label`: Requireable[String] = js.native
  var autoHeight: Requireable[Boolean] = js.native
  var children: Validator[Column] = js.native
  var className: Requireable[String] = js.native
  var disableHeader: Requireable[Boolean] = js.native
  var estimatedRowSize: Validator[Double] = js.native
  var gridClassName: Requireable[String] = js.native
  var gridStyle: Requireable[CSSProperties] = js.native
  var headerClassName: Requireable[String] = js.native
  var headerHeight: Validator[Double] = js.native
  var headerRowRenderer: Requireable[TableHeaderRowRenderer] = js.native
  var headerStyle: Requireable[CSSProperties] = js.native
  var height: Validator[Double] = js.native
  var id: Requireable[String] = js.native
  var noRowsRenderer: Requireable[js.Function0[ReactElement]] = js.native
  var onHeaderClick: Requireable[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]] = js.native
  var onRowClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var onRowDoubleClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var onRowMouseOut: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var onRowMouseOver: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var onRowsRendered: Requireable[js.Function1[/* params */ IndexRange with OverscanIndexRange, Unit]] = js.native
  var onScroll: Requireable[js.Function1[/* params */ ScrollEventData, Unit]] = js.native
  var overscanRowCount: Validator[Double] = js.native
  var rowClassName: Requireable[
    String | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, String])
  ] = js.native
  var rowCount: Validator[Double] = js.native
  var rowGetter: Validator[js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, _]] = js.native
  var rowHeight: Validator[
    Double | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, Double])
  ] = js.native
  var rowRenderer: Requireable[js.Function1[/* props */ TableRowProps, TagMod[Any]]] = js.native
  var rowStyle: Validator[
    CSSProperties | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, CSSProperties])
  ] = js.native
  var scrollToAlignment: Validator[typingsSlinky.reactVirtualized.mod.Alignment] = js.native
  var scrollToIndex: Validator[Double] = js.native
  var scrollTop: Requireable[Double] = js.native
  var sort: Requireable[js.Function1[/* params */ SortBy, Unit]] = js.native
  var sortBy: Requireable[String] = js.native
  var sortDirection: Validator[SortDirectionType] = js.native
  var style: Requireable[CSSProperties] = js.native
  var tabIndex: Requireable[Double] = js.native
  var width: Validator[Double] = js.native
}

object ClassName {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    autoHeight: Requireable[Boolean],
    children: Validator[Column],
    className: Requireable[String],
    disableHeader: Requireable[Boolean],
    estimatedRowSize: Validator[Double],
    gridClassName: Requireable[String],
    gridStyle: Requireable[CSSProperties],
    headerClassName: Requireable[String],
    headerHeight: Validator[Double],
    headerRowRenderer: Requireable[TableHeaderRowRenderer],
    headerStyle: Requireable[CSSProperties],
    height: Validator[Double],
    id: Requireable[String],
    noRowsRenderer: Requireable[js.Function0[ReactElement]],
    onHeaderClick: Requireable[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]],
    onRowClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowDoubleClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowMouseOut: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowMouseOver: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowsRendered: Requireable[js.Function1[/* params */ IndexRange with OverscanIndexRange, Unit]],
    onScroll: Requireable[js.Function1[/* params */ ScrollEventData, Unit]],
    overscanRowCount: Validator[Double],
    rowClassName: Requireable[
      String | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, String])
    ],
    rowCount: Validator[Double],
    rowGetter: Validator[js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, _]],
    rowHeight: Validator[
      Double | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, Double])
    ],
    rowRenderer: Requireable[js.Function1[/* props */ TableRowProps, TagMod[Any]]],
    rowStyle: Validator[
      CSSProperties | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, CSSProperties])
    ],
    scrollToAlignment: Validator[typingsSlinky.reactVirtualized.mod.Alignment],
    scrollToIndex: Validator[Double],
    scrollTop: Requireable[Double],
    sort: Requireable[js.Function1[/* params */ SortBy, Unit]],
    sortBy: Requireable[String],
    sortDirection: Validator[SortDirectionType],
    style: Requireable[CSSProperties],
    tabIndex: Requireable[Double],
    width: Validator[Double]
  ): ClassName = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disableHeader = disableHeader.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], gridClassName = gridClassName.asInstanceOf[js.Any], gridStyle = gridStyle.asInstanceOf[js.Any], headerClassName = headerClassName.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerRowRenderer = headerRowRenderer.asInstanceOf[js.Any], headerStyle = headerStyle.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], noRowsRenderer = noRowsRenderer.asInstanceOf[js.Any], onHeaderClick = onHeaderClick.asInstanceOf[js.Any], onRowClick = onRowClick.asInstanceOf[js.Any], onRowDoubleClick = onRowDoubleClick.asInstanceOf[js.Any], onRowMouseOut = onRowMouseOut.asInstanceOf[js.Any], onRowMouseOver = onRowMouseOver.asInstanceOf[js.Any], onRowsRendered = onRowsRendered.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], overscanRowCount = overscanRowCount.asInstanceOf[js.Any], rowClassName = rowClassName.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowGetter = rowGetter.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any], rowStyle = rowStyle.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoHeight(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Validator[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableHeader(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedRowSize(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridClassName(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridStyle(value: Requireable[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderClassName(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderHeight(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRowRenderer(value: Requireable[TableHeaderRowRenderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderStyle(value: Requireable[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoRowsRenderer(value: Requireable[js.Function0[ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnHeaderClick(value: Requireable[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRowClick(value: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRowDoubleClick(value: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRowMouseOut(value: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRowMouseOver(value: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRowsRendered(value: Requireable[js.Function1[/* params */ IndexRange with OverscanIndexRange, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsRendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnScroll(value: Requireable[js.Function1[/* params */ ScrollEventData, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscanRowCount(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowClassName(
      value: Requireable[
          String | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, String])
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowGetter(value: Validator[js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(
      value: Validator[
          Double | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, Double])
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowRenderer(value: Requireable[js.Function1[/* props */ TableRowProps, TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowStyle(
      value: Validator[
          CSSProperties | (js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.Index, CSSProperties])
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToAlignment(value: Validator[typingsSlinky.reactVirtualized.mod.Alignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToIndex(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTop(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: Requireable[js.Function1[/* params */ SortBy, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortBy(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDirection(value: Validator[SortDirectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Requireable[CSSProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIndex(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

