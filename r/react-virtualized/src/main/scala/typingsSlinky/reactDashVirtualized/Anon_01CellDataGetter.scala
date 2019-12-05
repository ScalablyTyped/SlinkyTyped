package typingsSlinky.reactDashVirtualized

import slinky.core.TagMod
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableCellDataGetter
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableCellDataGetterParams
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableCellProps
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableCellRenderer
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableHeaderProps
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableHeaderRenderer
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01CellDataGetter extends js.Object {
  var cellDataGetter: TableCellDataGetter
  var cellRenderer: TableCellRenderer
  var flexGrow: `0`
  var flexShrink: `1`
  var headerRenderer: TableHeaderRenderer
}

object Anon_01CellDataGetter {
  @scala.inline
  def apply(
    cellDataGetter: /* params */ TableCellDataGetterParams => js.Any,
    cellRenderer: /* props */ TableCellProps => TagMod[Any],
    flexGrow: `0`,
    flexShrink: `1`,
    headerRenderer: /* props */ TableHeaderProps => TagMod[Any]
  ): Anon_01CellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = js.Any.fromFunction1(cellDataGetter), cellRenderer = js.Any.fromFunction1(cellRenderer), flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerRenderer = js.Any.fromFunction1(headerRenderer))
  
    __obj.asInstanceOf[Anon_01CellDataGetter]
  }
}

