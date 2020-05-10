package typingsSlinky.materialUi.MaterialUI.Table

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBodyProps extends js.Object {
  /** @deprecated Instead, use property on Table */
  var allRowsSelected: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var deselectOnClickaway: js.UndefOr[Boolean] = js.native
  var displayRowCheckbox: js.UndefOr[Boolean] = js.native
  /** @deprecated Instead, use property on Table */
  var multiSelectable: js.UndefOr[Boolean] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | String, Unit]] = js.native
  var preScanRows: js.UndefOr[Boolean] = js.native
  /** @deprecated Instead, use property on Table */
  var selectable: js.UndefOr[Boolean] = js.native
  var showRowHover: js.UndefOr[Boolean] = js.native
  var stripedRows: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TableBodyProps {
  @scala.inline
  def apply(): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBodyProps]
  }
  @scala.inline
  implicit class TableBodyPropsOps[Self <: TableBodyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllRowsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRowsSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllRowsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRowsSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectOnClickaway(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectOnClickaway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectOnClickaway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectOnClickaway")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayRowCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRowCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayRowCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRowCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClick(value: (/* row */ Double, /* column */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellHover(value: (/* row */ Double, /* column */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHover")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCellHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellHoverExit(value: (/* row */ Double, /* column */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHoverExit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCellHoverExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHoverExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowHover(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowHoverExit(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHoverExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowHoverExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHoverExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowSelection(value: /* selectedRows */ js.Array[Double] | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withPreScanRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preScanRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreScanRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preScanRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowHover")(js.undefined)
        ret
    }
    @scala.inline
    def withStripedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

