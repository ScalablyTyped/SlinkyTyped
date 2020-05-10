package typingsSlinky.officeUiFabricReact.calendarButtonExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarButtonExampleProps extends js.Object {
  var buttonString: js.UndefOr[String] = js.native
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.native
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.native
  var isDayPickerVisible: js.UndefOr[Boolean] = js.native
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  var showGoToToday: js.UndefOr[Boolean] = js.native
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.native
}

object ICalendarButtonExampleProps {
  @scala.inline
  def apply(): ICalendarButtonExampleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarButtonExampleProps]
  }
  @scala.inline
  implicit class ICalendarButtonExamplePropsOps[Self <: ICalendarButtonExampleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonString")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCurrentMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCurrentMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSelectedMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSelectedMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDayPickerVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayPickerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDayPickerVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayPickerVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMonthPickerVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonthPickerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMonthPickerVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonthPickerVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGoToToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGoToToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGoToToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGoToToday")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonthPickerAsOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthPickerAsOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonthPickerAsOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthPickerAsOverlay")(js.undefined)
        ret
    }
  }
  
}

