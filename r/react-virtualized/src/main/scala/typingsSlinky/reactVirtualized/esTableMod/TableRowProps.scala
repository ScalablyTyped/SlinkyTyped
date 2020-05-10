package typingsSlinky.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowProps extends js.Object {
  var className: String = js.native
  var columns: js.Array[_] = js.native
  var index: Double = js.native
  var isScrolling: Boolean = js.native
  var key: String = js.native
  var onRowClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var onRowDoubleClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var onRowMouseOut: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var onRowMouseOver: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var onRowRightClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  var rowData: js.Any = js.native
  var style: js.Any = js.native
}

object TableRowProps {
  @scala.inline
  def apply(
    className: String,
    columns: js.Array[_],
    index: Double,
    isScrolling: Boolean,
    key: String,
    rowData: js.Any,
    style: js.Any
  ): TableRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowProps]
  }
  @scala.inline
  implicit class TableRowPropsOps[Self <: TableRowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRowClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDoubleClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowMouseOut(value: /* params */ RowMouseEventHandlerParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowMouseOver(value: /* params */ RowMouseEventHandlerParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowRightClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowRightClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowRightClick")(js.undefined)
        ret
    }
  }
  
}

