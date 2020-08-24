package typingsSlinky.reactVirtualized.anon

import slinky.core.facade.ReactElement
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
    headerRowRenderer: /* props */ TableHeaderRowProps => ReactElement,
    noRowsRenderer: () => Null,
    onRowsRendered: () => Null,
    onScroll: () => Null,
    overscanRowCount: `10`,
    rowRenderer: /* props */ TableRowProps => ReactElement,
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisableHeader(value: `false`): Self = this.set("disableHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimatedRowSize(value: `30`): Self = this.set("estimatedRowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderHeight(value: `0`): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderRowRenderer(value: /* props */ TableHeaderRowProps => ReactElement): Self = this.set("headerRowRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setNoRowsRenderer(value: () => Null): Self = this.set("noRowsRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def setOnRowsRendered(value: () => Null): Self = this.set("onRowsRendered", js.Any.fromFunction0(value))
    @scala.inline
    def setOnScroll(value: () => Null): Self = this.set("onScroll", js.Any.fromFunction0(value))
    @scala.inline
    def setOverscanRowCount(value: `10`): Self = this.set("overscanRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowRenderer(value: /* props */ TableRowProps => ReactElement): Self = this.set("rowRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollToAlignment(value: auto): Self = this.set("scrollToAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollToIndex(value: `-1`): Self = this.set("scrollToIndex", value.asInstanceOf[js.Any])
  }
  
}

