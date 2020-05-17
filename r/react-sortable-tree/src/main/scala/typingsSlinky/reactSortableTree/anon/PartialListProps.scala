package typingsSlinky.reactSortableTree.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeProps
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeRenderer
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typingsSlinky.reactVirtualized.esGridMod.SectionRenderedParams
import typingsSlinky.reactVirtualized.esListMod.ListRowProps
import typingsSlinky.reactVirtualized.esListMod.ListRowRenderer
import typingsSlinky.reactVirtualized.esListMod.RenderedRows
import typingsSlinky.reactVirtualized.mod.Alignment
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-virtualized.react-virtualized.ListProps> */
@js.native
trait PartialListProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var autoContainerWidth: js.UndefOr[Boolean] = js.native
  var autoHeight: js.UndefOr[Boolean] = js.native
  var autoWidth: js.UndefOr[Boolean] = js.native
  var cellRangeRenderer: js.UndefOr[GridCellRangeRenderer] = js.native
  var className: js.UndefOr[String] = js.native
  var containerProps: js.UndefOr[js.Object] = js.native
  var containerRole: js.UndefOr[String] = js.native
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.native
  var estimatedColumnSize: js.UndefOr[Double] = js.native
  var estimatedRowSize: js.UndefOr[Double] = js.native
  var getScrollbarSize: js.UndefOr[js.Function0[Double]] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var isScrolling: js.UndefOr[Boolean] = js.native
  var noContentRenderer: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var noRowsRenderer: js.UndefOr[js.Function0[ReactElement]] = js.native
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ RenderedRows, Unit]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, _]] = js.native
  var onScrollbarPresenceChange: js.UndefOr[js.Function1[/* params */ ScrollbarPresenceParams, _]] = js.native
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.native
  var overscanColumnCount: js.UndefOr[Double] = js.native
  var overscanIndicesGetter: js.UndefOr[OverscanIndicesGetter] = js.native
  var overscanRowCount: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var rowCount: js.UndefOr[Double] = js.native
  var rowHeight: js.UndefOr[Double | (js.Function1[/* params */ Index, Double])] = js.native
  var rowRenderer: js.UndefOr[ListRowRenderer] = js.native
  var scrollLeft: js.UndefOr[Double] = js.native
  var scrollToAlignment: js.UndefOr[Alignment with String] = js.native
  var scrollToColumn: js.UndefOr[Double] = js.native
  var scrollToIndex: js.UndefOr[Double] = js.native
  var scrollToRow: js.UndefOr[Double] = js.native
  var scrollTop: js.UndefOr[Double] = js.native
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialListProps {
  @scala.inline
  def apply(): PartialListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListProps]
  }
  @scala.inline
  implicit class PartialListPropsOps[Self <: PartialListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-readonly`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-readonly`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoContainerWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoContainerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoContainerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoContainerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRangeRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellRangeRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRangeRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerRole")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferredMeasurementCache(value: CellMeasurerCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredMeasurementCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredMeasurementCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredMeasurementCache")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedColumnSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedColumnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedColumnSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedColumnSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedRowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedRowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollbarSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollbarSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollbarSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollbarSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withNoContentRenderer(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noContentRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNoContentRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noContentRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRowsRenderer(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNoRowsRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowsRendered(value: /* info */ RenderedRows => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowsRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* params */ ScrollParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollbarPresenceChange(value: /* params */ ScrollbarPresenceParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollbarPresenceChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollbarPresenceChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSectionRendered(value: /* params */ SectionRenderedParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSectionRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSectionRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSectionRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverscanIndicesGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanIndicesGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscanRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscanRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeightFunction1(value: /* params */ Index => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowHeight(value: Double | (js.Function1[/* params */ Index, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowRenderer(value: /* props */ ListRowProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToAlignment(value: Alignment with String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRow")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingResetTimeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingResetTimeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

