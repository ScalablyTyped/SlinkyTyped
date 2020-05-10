package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseSelection extends js.Object {
  /** Specifies whether a user can select all rows at once. */
  var allowSelectAll: js.UndefOr[Boolean] = js.native
  /** Specifies the selection mode. */
  var mode: js.UndefOr[multiple | none | single_] = js.native
}

object GridBaseSelection {
  @scala.inline
  def apply(): GridBaseSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseSelection]
  }
  @scala.inline
  implicit class GridBaseSelectionOps[Self <: GridBaseSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: multiple | none | single_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

