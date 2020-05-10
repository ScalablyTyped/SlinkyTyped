package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableSelectCell extends js.Object {
  var checked: Boolean = js.native
  var classes: js.UndefOr[js.Object] = js.native
  var expandableOn: js.UndefOr[Boolean] = js.native
  var fixedHeader: Boolean = js.native
  var isHeaderCell: js.UndefOr[Boolean] = js.native
  var isRowExpanded: js.UndefOr[Boolean] = js.native
  var isRowSelectable: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var onExpand: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var otherProps: js.UndefOr[js.Any] = js.native
  var selectableOn: js.UndefOr[Boolean] = js.native
}

object MUIDataTableSelectCell {
  @scala.inline
  def apply(checked: Boolean, fixedHeader: Boolean): MUIDataTableSelectCell = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableSelectCell]
  }
  @scala.inline
  implicit class MUIDataTableSelectCellOps[Self <: MUIDataTableSelectCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandableOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableOn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHeaderCell(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHeaderCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderCell")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRowExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRowSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableOn")(js.undefined)
        ret
    }
  }
  
}

