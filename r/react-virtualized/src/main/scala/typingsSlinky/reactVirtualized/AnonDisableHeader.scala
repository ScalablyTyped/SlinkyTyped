package typingsSlinky.reactVirtualized

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

trait AnonDisableHeader extends js.Object {
  var disableHeader: `false`
  var estimatedRowSize: `30`
  var headerHeight: `0`
  var headerRowRenderer: TableHeaderRowRenderer
  var overscanRowCount: `10`
  var rowRenderer: TableRowRenderer
  var scrollToAlignment: auto
  var scrollToIndex: `-1`
  def noRowsRenderer(): Null
  def onRowsRendered(): Null
  def onScroll(): Null
}

object AnonDisableHeader {
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
  ): AnonDisableHeader = {
    val __obj = js.Dynamic.literal(disableHeader = disableHeader.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerRowRenderer = js.Any.fromFunction1(headerRowRenderer), noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanRowCount = overscanRowCount.asInstanceOf[js.Any], rowRenderer = js.Any.fromFunction1(rowRenderer), scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisableHeader]
  }
}

