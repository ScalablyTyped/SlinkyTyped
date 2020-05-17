package typingsSlinky.reactVirtualized.anon

import typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsSlinky.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`-1`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`10`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`30`
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoHeight extends js.Object {
  var autoHeight: `false` = js.native
  var estimatedRowSize: `30` = js.native
  var overscanIndicesGetter: OverscanIndicesGetter = js.native
  var overscanRowCount: `10` = js.native
  var scrollToAlignment: auto = js.native
  var scrollToIndex: `-1` = js.native
  def noRowsRenderer(): Null = js.native
  def onRowsRendered(): Unit = js.native
  def onScroll(): Unit = js.native
}

object AutoHeight {
  @scala.inline
  def apply(
    autoHeight: `false`,
    estimatedRowSize: `30`,
    noRowsRenderer: () => Null,
    onRowsRendered: () => Unit,
    onScroll: () => Unit,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices,
    overscanRowCount: `10`,
    scrollToAlignment: auto,
    scrollToIndex: `-1`
  ): AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHeight]
  }
  @scala.inline
  implicit class AutoHeightOps[Self <: AutoHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHeight(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedRowSize(value: `30`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoRowsRenderer(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRowsRendered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsRendered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction0(value))
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
    def withScrollToAlignment(value: auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollToIndex(value: `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

