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

@js.native
trait AnonCellRenderer extends js.Object {
  var cellDataGetter: TableCellDataGetter = js.native
  var cellRenderer: TableCellRenderer = js.native
  var flexGrow: `0` = js.native
  var flexShrink: `1` = js.native
  var headerRenderer: TableHeaderRenderer = js.native
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
  @scala.inline
  implicit class AnonCellRendererOps[Self <: AnonCellRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellDataGetter(value: /* params */ TableCellDataGetterParams => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDataGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellRenderer(value: /* props */ TableCellProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlexGrow(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexShrink(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRenderer(value: /* props */ TableHeaderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

