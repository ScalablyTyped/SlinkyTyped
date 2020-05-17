package typingsSlinky.reactVirtualized.anon

import slinky.core.TagMod
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowProps
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableRowProps
import typingsSlinky.reactVirtualized.esTableMod.TableRowRenderer
import typingsSlinky.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`-1`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`10`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`30`
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableHeader extends js.Object {
  var disableHeader: `false` = js.native
  var estimatedRowSize: `30` = js.native
  var headerHeight: `0` = js.native
  var headerRowRenderer: TableHeaderRowRenderer = js.native
  var overscanRowCount: `10` = js.native
  var rowRenderer: TableRowRenderer = js.native
  var scrollToAlignment: auto = js.native
  var scrollToIndex: `-1` = js.native
  def noRowsRenderer(): Null = js.native
  def onRowsRendered(): Null = js.native
  def onScroll(): Null = js.native
}

object DisableHeader {
  @scala.inline
  def apply(
    disableHeader: `false`,
    estimatedRowSize: `30`,
    headerHeight: `0`,
    headerRowRenderer: /* props */ TableHeaderRowProps => TagMod[Any],
    noRowsRenderer: () => Null,
    onRowsRendered: () => Null,
    onScroll: () => Null,
    overscanRowCount: `10`,
    rowRenderer: /* props */ TableRowProps => TagMod[Any],
    scrollToAlignment: auto,
    scrollToIndex: `-1`
  ): DisableHeader = {
    val __obj = js.Dynamic.literal(disableHeader = disableHeader.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerRowRenderer = js.Any.fromFunction1(headerRowRenderer), noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], rowRenderer = js.Any.fromFunction1(rowRenderer), scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableHeader]
  }
  @scala.inline
  implicit class DisableHeaderOps[Self <: DisableHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableHeader(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedRowSize(value: `30`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedRowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderHeight(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRowRenderer(value: /* props */ TableHeaderRowProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNoRowsRenderer(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRowsRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRowsRendered(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsRendered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnScroll(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverscanRowCount(value: `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanRowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowRenderer(value: /* props */ TableRowProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(js.Any.fromFunction1(value))
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

