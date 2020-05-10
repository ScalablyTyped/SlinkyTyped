package typingsSlinky.materialUi.MaterialUI.Table

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowProps extends js.Object {
  // <tr/> is element that get the 'other' properties
  var className: js.UndefOr[String] = js.native
  var displayBorder: js.UndefOr[Boolean] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var hovered: js.UndefOr[Boolean] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[
    js.Function3[/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double, Unit]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[
    js.Function3[/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double, Unit]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[
    js.Function3[/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double, Unit]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowClick: js.UndefOr[js.Function2[/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[js.Function2[/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[js.Function2[/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, Unit]] = js.native
  var rowNumber: js.UndefOr[Double] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var striped: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TableRowProps {
  @scala.inline
  def apply(): TableRowProps = {
    val __obj = js.Dynamic.literal()
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
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(js.undefined)
        ret
    }
    @scala.inline
    def withHovered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHovered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClick(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellHover(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHover")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCellHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellHoverExit(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHoverExit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCellHoverExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHoverExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowClick(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowHover(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHover")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowHoverExit(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHoverExit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRowHoverExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowHoverExit")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumber")(js.undefined)
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
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withStriped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStriped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(js.undefined)
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

