package typingsSlinky.reactDayPicker.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNames extends js.Object {
  var body: String = js.native
  var caption: String = js.native
  var container: String = js.native
  var day: String = js.native
  var disabled: String = js.native
  var footer: String = js.native
  var interactionDisabled: String = js.native
  var month: String = js.native
  var months: String = js.native
  var navBar: String = js.native
  var navButtonInteractionDisabled: String = js.native
  var navButtonNext: String = js.native
  var navButtonPrev: String = js.native
  var outside: String = js.native
  var selected: String = js.native
  var today: String = js.native
  var todayButton: String = js.native
  var week: String = js.native
  var weekNumber: String = js.native
  var weekday: String = js.native
  var weekdays: String = js.native
  var weekdaysRow: String = js.native
  var wrapper: String = js.native
}

object ClassNames {
  @scala.inline
  def apply(
    body: String,
    caption: String,
    container: String,
    day: String,
    disabled: String,
    footer: String,
    interactionDisabled: String,
    month: String,
    months: String,
    navBar: String,
    navButtonInteractionDisabled: String,
    navButtonNext: String,
    navButtonPrev: String,
    outside: String,
    selected: String,
    today: String,
    todayButton: String,
    week: String,
    weekNumber: String,
    weekday: String,
    weekdays: String,
    weekdaysRow: String,
    wrapper: String
  ): ClassNames = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], interactionDisabled = interactionDisabled.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any], navButtonInteractionDisabled = navButtonInteractionDisabled.asInstanceOf[js.Any], navButtonNext = navButtonNext.asInstanceOf[js.Any], navButtonPrev = navButtonPrev.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], todayButton = todayButton.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], weekNumber = weekNumber.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysRow = weekdaysRow.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNames]
  }
  @scala.inline
  implicit class ClassNamesOps[Self <: ClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractionDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavButtonInteractionDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navButtonInteractionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavButtonNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navButtonNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavButtonPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navButtonPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutside(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTodayButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdays(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdaysRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

