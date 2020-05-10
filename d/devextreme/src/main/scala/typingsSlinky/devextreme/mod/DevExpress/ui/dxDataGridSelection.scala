package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.allPages
import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onClick
import typingsSlinky.devextreme.devextremeStrings.onLongTap
import typingsSlinky.devextreme.devextremeStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGridSelection extends GridBaseSelection {
  /** Makes selection deferred. */
  var deferred: js.UndefOr[Boolean] = js.native
  /** Specifies the mode in which all the records are selected. Applies only if selection.allowSelectAll is true. */
  var selectAllMode: js.UndefOr[allPages | page] = js.native
  /** Specifies when to display check boxes in rows. Applies only if selection.mode is "multiple". */
  var showCheckBoxesMode: js.UndefOr[always | none | onClick | onLongTap] = js.native
}

object dxDataGridSelection {
  @scala.inline
  def apply(): dxDataGridSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridSelection]
  }
  @scala.inline
  implicit class dxDataGridSelectionOps[Self <: dxDataGridSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllMode(value: allPages | page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckBoxesMode(value: always | none | onClick | onLongTap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckBoxesMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckBoxesMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckBoxesMode")(js.undefined)
        ret
    }
  }
  
}

