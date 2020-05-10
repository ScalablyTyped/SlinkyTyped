package typingsSlinky.blueprintjsTable

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.tableQuadrantMod.QuadrantType
import typingsSlinky.react.mod.EventHandler
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack.ITableQuadrantStackProps> */
@js.native
trait PartialITableQuadrantStac extends js.Object {
  var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ QuadrantType, 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  var className: js.UndefOr[String] = js.native
  var columnHeaderCellRenderer: js.UndefOr[
    js.Function4[
      /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], 
      /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], 
      /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  var columnHeaderRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
  var enableColumnInteractionBar: js.UndefOr[Boolean] = js.native
  var enableRowHeader: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[Grid] = js.native
  var handleColumnResizeGuide: js.UndefOr[js.Function1[/* verticalGuides */ js.Array[Double], Unit]] = js.native
  var handleColumnsReordering: js.UndefOr[js.Function1[/* verticalGuides */ js.Array[Double], Unit]] = js.native
  var handleRowResizeGuide: js.UndefOr[js.Function1[/* horizontalGuides */ js.Array[Double], Unit]] = js.native
  var handleRowsReordering: js.UndefOr[js.Function1[/* horizontalGuides */ js.Array[Double], Unit]] = js.native
  var isHorizontalScrollDisabled: js.UndefOr[Boolean] = js.native
  var isVerticalScrollDisabled: js.UndefOr[Boolean] = js.native
  var loadingOptions: js.UndefOr[js.Array[TableLoadingOption]] = js.native
  var menuRenderer: js.UndefOr[
    js.Function1[/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], ReactElement]
  ] = js.native
  var numColumns: js.UndefOr[Double] = js.native
  var numFrozenColumns: js.UndefOr[Double] = js.native
  var numFrozenRows: js.UndefOr[Double] = js.native
  var numRows: js.UndefOr[Double] = js.native
  var onScroll: js.UndefOr[EventHandler[SyntheticEvent[Event_, HTMLElement]]] = js.native
  var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
  var rowHeaderCellRenderer: js.UndefOr[
    js.Function4[
      /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], 
      /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], 
      /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  var rowHeaderRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  var throttleScrolling: js.UndefOr[Boolean] = js.native
  var viewSyncDelay: js.UndefOr[Double] = js.native
}

object PartialITableQuadrantStac {
  @scala.inline
  def apply(): PartialITableQuadrantStac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITableQuadrantStac]
  }
  @scala.inline
  implicit class PartialITableQuadrantStacOps[Self <: PartialITableQuadrantStac] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyRef(value: /* ref */ HTMLElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBodyRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRef")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyRenderer(
      value: (/* quadrantType */ QuadrantType, /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRenderer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBodyRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRenderer")(js.undefined)
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
    def withColumnHeaderCellRenderer(
      value: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutColumnHeaderCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderRef(value: /* ref */ HTMLElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnHeaderRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderRef")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnInteractionBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnInteractionBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnInteractionBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnInteractionBar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleColumnResizeGuide(value: /* verticalGuides */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleColumnResizeGuide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleColumnResizeGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleColumnResizeGuide")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleColumnsReordering(value: /* verticalGuides */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleColumnsReordering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleColumnsReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleColumnsReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleRowResizeGuide(value: /* horizontalGuides */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleRowResizeGuide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleRowResizeGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleRowResizeGuide")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleRowsReordering(value: /* horizontalGuides */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleRowsReordering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleRowsReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleRowsReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHorizontalScrollDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalScrollDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHorizontalScrollDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalScrollDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVerticalScrollDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerticalScrollDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVerticalScrollDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVerticalScrollDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingOptions(value: js.Array[TableLoadingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuRenderer(value: /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withNumColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFrozenColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFrozenColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFrozenRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFrozenRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNumRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRows")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: SyntheticEvent[Event_, HTMLElement] => Unit): Self = {
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
    def withQuadrantRef(value: /* ref */ HTMLElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadrantRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuadrantRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadrantRef")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeaderCellRenderer(
      value: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRowHeaderCellRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderCellRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeaderRef(value: /* ref */ HTMLElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowHeaderRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderRef")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollContainerRef(value: /* ref */ HTMLElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContainerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollContainerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContainerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withViewSyncDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSyncDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewSyncDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSyncDelay")(js.undefined)
        ret
    }
  }
  
}

