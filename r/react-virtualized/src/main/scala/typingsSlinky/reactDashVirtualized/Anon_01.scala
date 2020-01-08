package typingsSlinky.reactDashVirtualized

import slinky.core.TagMod
import typingsSlinky.reactDashVirtualized.distEsGridMod.GridCellRangeProps
import typingsSlinky.reactDashVirtualized.distEsGridMod.GridCellRangeRenderer
import typingsSlinky.reactDashVirtualized.distEsGridMod.OverscanIndices
import typingsSlinky.reactDashVirtualized.distEsGridMod.OverscanIndicesGetter
import typingsSlinky.reactDashVirtualized.distEsGridMod.OverscanIndicesGetterParams
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedBooleans.`false`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedBooleans.`true`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`-1`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`100`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`10`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`30`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedStrings.auto
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedStrings.grid
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedStrings.rowgroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  var `aria-label`: grid
  var `aria-readonly`: `true`
  var autoContainerWidth: `false`
  var autoHeight: `false`
  var autoWidth: `false`
  var cellRangeRenderer: GridCellRangeRenderer
  var containerRole: rowgroup
  var estimatedColumnSize: `100`
  var estimatedRowSize: `30`
  var overscanColumnCount: `0`
  var overscanIndicesGetter: OverscanIndicesGetter
  var overscanRowCount: `10`
  var role: grid
  var scrollToAlignment: auto
  var scrollToColumn: `-1`
  var scrollToRow: `-1`
  var scrollingResetTimeInterval: `150`
  var tabIndex: `0`
  def getScrollbarSize(): Double
  def noContentRenderer(): TagMod[Any]
  def onScroll(): Unit
  def onScrollbarPresenceChange(): Unit
  def onSectionRendered(): Unit
}

object Anon_01 {
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
    scrollingResetTimeInterval: `150`,
    tabIndex: `0`
  ): Anon_01 = {
    val __obj = js.Dynamic.literal(autoContainerWidth = autoContainerWidth.asInstanceOf[js.Any], autoHeight = autoHeight.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], cellRangeRenderer = js.Any.fromFunction1(cellRangeRenderer), containerRole = containerRole.asInstanceOf[js.Any], estimatedColumnSize = estimatedColumnSize.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], getScrollbarSize = js.Any.fromFunction0(getScrollbarSize), noContentRenderer = js.Any.fromFunction0(noContentRenderer), onScroll = js.Any.fromFunction0(onScroll), onScrollbarPresenceChange = js.Any.fromFunction0(onScrollbarPresenceChange), onSectionRendered = js.Any.fromFunction0(onSectionRendered), overscanColumnCount = overscanColumnCount.asInstanceOf[js.Any], overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01]
  }
}

