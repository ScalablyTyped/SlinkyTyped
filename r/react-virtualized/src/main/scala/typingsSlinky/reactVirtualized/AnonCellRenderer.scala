package typingsSlinky.reactVirtualized

import slinky.core.TagMod
import typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetter
import typingsSlinky.reactVirtualized.esTableMod.TableCellDataGetterParams
import typingsSlinky.reactVirtualized.esTableMod.TableCellProps
import typingsSlinky.reactVirtualized.esTableMod.TableCellRenderer
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderProps
import typingsSlinky.reactVirtualized.esTableMod.TableHeaderRenderer
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellRenderer extends js.Object {
  var cellDataGetter: TableCellDataGetter
  var cellRenderer: TableCellRenderer
  var flexGrow: `0`
  var flexShrink: `1`
  var headerRenderer: TableHeaderRenderer
}

object AnonCellRenderer {
  @scala.inline
  def apply(
    cellDataGetter: /* params */ TableCellDataGetterParams => js.Any,
    cellRenderer: /* props */ TableCellProps => TagMod[Any],
    flexGrow: `0`,
    flexShrink: `1`,
    headerRenderer: /* props */ TableHeaderProps => TagMod[Any]
  ): AnonCellRenderer = {
    val __obj = js.Dynamic.literal(cellDataGetter = js.Any.fromFunction1(cellDataGetter), cellRenderer = js.Any.fromFunction1(cellRenderer), flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerRenderer = js.Any.fromFunction1(headerRenderer))
  
    __obj.asInstanceOf[AnonCellRenderer]
  }
}

