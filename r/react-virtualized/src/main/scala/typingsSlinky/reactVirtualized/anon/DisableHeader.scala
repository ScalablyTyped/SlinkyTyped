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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableHeader extends StObject {
  
  var disableHeader: `false` = js.native
  
  var estimatedRowSize: `30` = js.native
  
  var headerHeight: `0` = js.native
  
  var headerRowRenderer: TableHeaderRowRenderer = js.native
  
  def noRowsRenderer(): Null = js.native
  
  def onRowsRendered(): Null = js.native
  
  def onScroll(): Null = js.native
  
  var overscanRowCount: `10` = js.native
  
  var rowRenderer: TableRowRenderer = js.native
  
  var scrollToAlignment: auto = js.native
  
  var scrollToIndex: `-1` = js.native
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
  implicit class DisableHeaderMutableBuilder[Self <: DisableHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableHeader(value: `false`): Self = StObject.set(x, "disableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedRowSize(value: `30`): Self = StObject.set(x, "estimatedRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeight(value: `0`): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowRenderer(value: /* props */ TableHeaderRowProps => ReactElement): Self = StObject.set(x, "headerRowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoRowsRenderer(value: () => Null): Self = StObject.set(x, "noRowsRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRowsRendered(value: () => Null): Self = StObject.set(x, "onRowsRendered", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnScroll(value: () => Null): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverscanRowCount(value: `10`): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowRenderer(value: /* props */ TableRowProps => ReactElement): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollToAlignment(value: auto): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToIndex(value: `-1`): Self = StObject.set(x, "scrollToIndex", value.asInstanceOf[js.Any])
  }
}
