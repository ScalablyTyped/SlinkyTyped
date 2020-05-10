package typingsSlinky.blueprintjsDatetime.dateRangeInputMod

import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateRangeInputState extends js.Object {
  var boundaryToModify: js.UndefOr[Boundary] = js.native
  var endHoverString: js.UndefOr[String] = js.native
  var endInputString: js.UndefOr[String] = js.native
  var formattedMaxDateString: js.UndefOr[String] = js.native
  var formattedMinDateString: js.UndefOr[String] = js.native
  var isEndInputFocused: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var isStartInputFocused: js.UndefOr[Boolean] = js.native
  var lastFocusedField: js.UndefOr[Boundary] = js.native
  var selectedEnd: js.UndefOr[js.Date] = js.native
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  var selectedStart: js.UndefOr[js.Date] = js.native
  var shouldSelectAfterUpdate: js.UndefOr[Boolean] = js.native
  var startHoverString: js.UndefOr[String] = js.native
  var startInputString: js.UndefOr[String] = js.native
  var wasLastFocusChangeDueToHover: js.UndefOr[Boolean] = js.native
}

object IDateRangeInputState {
  @scala.inline
  def apply(): IDateRangeInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateRangeInputState]
  }
  @scala.inline
  implicit class IDateRangeInputStateOps[Self <: IDateRangeInputState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundaryToModify(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryToModify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryToModify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryToModify")(js.undefined)
        ret
    }
    @scala.inline
    def withEndHoverString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHoverString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndHoverString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHoverString")(js.undefined)
        ret
    }
    @scala.inline
    def withEndInputString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInputString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndInputString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInputString")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedMaxDateString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedMaxDateString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedMaxDateString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedMaxDateString")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedMinDateString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedMinDateString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedMinDateString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedMinDateString")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEndInputFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEndInputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEndInputFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEndInputFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStartInputFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStartInputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStartInputFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStartInputFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFocusedField(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFocusedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFocusedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFocusedField")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedShortcutIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedShortcutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStart")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldSelectAfterUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSelectAfterUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldSelectAfterUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSelectAfterUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartHoverString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHoverString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartHoverString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHoverString")(js.undefined)
        ret
    }
    @scala.inline
    def withStartInputString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startInputString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartInputString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startInputString")(js.undefined)
        ret
    }
    @scala.inline
    def withWasLastFocusChangeDueToHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasLastFocusChangeDueToHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasLastFocusChangeDueToHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasLastFocusChangeDueToHover")(js.undefined)
        ret
    }
  }
  
}

