package typingsSlinky.agGrid.rowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSelectedParams extends js.Object {
  var clearSelection: js.UndefOr[Boolean] = js.native
  var groupSelectsFiltered: js.UndefOr[Boolean] = js.native
  var newValue: Boolean = js.native
  var rangeSelect: js.UndefOr[Boolean] = js.native
  var suppressFinishActions: js.UndefOr[Boolean] = js.native
}

object SetSelectedParams {
  @scala.inline
  def apply(newValue: Boolean): SetSelectedParams = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSelectedParams]
  }
  @scala.inline
  implicit class SetSelectedParamsOps[Self <: SetSelectedParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSelectsFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectsFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSelectsFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectsFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressFinishActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFinishActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressFinishActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFinishActions")(js.undefined)
        ret
    }
  }
  
}

