package typingsSlinky.reactVirtualized.anon

import slinky.core.TagMod
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeProps
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeRenderer
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsSlinky.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsSlinky.reactVirtualized.reactVirtualizedBooleans.`true`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`-1`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`100`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`10`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`30`
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.auto
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.grid
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.rowgroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ariareadonly extends js.Object {
  var `aria-label`: grid = js.native
  var `aria-readonly`: `true` = js.native
  var autoContainerWidth: `false` = js.native
  var autoHeight: `false` = js.native
  var autoWidth: `false` = js.native
  var cellRangeRenderer: GridCellRangeRenderer = js.native
  var containerRole: rowgroup = js.native
  var estimatedColumnSize: `100` = js.native
  var estimatedRowSize: `30` = js.native
  var overscanColumnCount: `0` = js.native
  var overscanIndicesGetter: OverscanIndicesGetter = js.native
  var overscanRowCount: `10` = js.native
  var role: grid = js.native
  var scrollToAlignment: auto = js.native
  var scrollToColumn: `-1` = js.native
  var scrollToRow: `-1` = js.native
  var scrollingResetTimeInterval: /* 150 */ Double = js.native
  var tabIndex: `0` = js.native
  def getScrollbarSize(): Double = js.native
  def noContentRenderer(): TagMod[Any] = js.native
  def onScroll(): Unit = js.native
  def onScrollbarPresenceChange(): Unit = js.native
  def onSectionRendered(): Unit = js.native
}

object Ariareadonly {
  @scala.inline
  def apply(
    `aria-label`: grid,
    `aria-readonly`: `true`,
    autoContainerWidth: `false`,
    autoHeight: `false`,
    autoWidth: `false`,
    cellRangeRenderer: /* params */ GridCellRangeProps => js.Array[TagMod[Any]],
    containerRole: rowgroup,
    estimatedColumnSize: `100`,
    estimatedRowSize: `30`,
    getScrollbarSize: () => Double,
    noContentRenderer: () => TagMod[Any],
    onScroll: () => Unit,
    onScrollbarPresenceChange: () => Unit,
    onSectionRendered: () => Unit,
    overscanColumnCount: `0`,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices,
    overscanRowCount: `10`,
    role: grid,
    scrollToAlignment: auto,
    scrollToColumn: `-1`,
    scrollToRow: `-1`,
    scrollingResetTimeInterval: /* 150 */ Double,
    tabIndex: `0`
  ): Ariareadonly = {
    val __obj = js.Dynamic.literal(autoContainerWidth = autoContainerWidth.asInstanceOf[js.Any], autoHeight = autoHeight.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], cellRangeRenderer = js.Any.fromFunction1(cellRangeRenderer), containerRole = containerRole.asInstanceOf[js.Any], estimatedColumnSize = estimatedColumnSize.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], getScrollbarSize = js.Any.fromFunction0(getScrollbarSize), noContentRenderer = js.Any.fromFunction0(noContentRenderer), onScroll = js.Any.fromFunction0(onScroll), onScrollbarPresenceChange = js.Any.fromFunction0(onScrollbarPresenceChange), onSectionRendered = js.Any.fromFunction0(onSectionRendered), overscanColumnCount = overscanColumnCount.asInstanceOf[js.Any], overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariareadonly]
  }
  @scala.inline
  implicit class AriareadonlyOps[Self <: Ariareadonly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAria-readonly`(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoContainerWidth(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoContainerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoHeight(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoWidth(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRangeRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainerRole(value: rowgroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedColumnSize(value: `100`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedColumnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedRowSize(value: `30`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetScrollbarSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollbarSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNoContentRenderer(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noContentRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnScrollbarPresenceChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSectionRendered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSectionRendered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverscanColumnCount(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOverscanRowCount(value: `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToAlignment(value: auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToColumn(value: `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToRow(value: `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollingResetTimeInterval(value: /* 150 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIndex(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

