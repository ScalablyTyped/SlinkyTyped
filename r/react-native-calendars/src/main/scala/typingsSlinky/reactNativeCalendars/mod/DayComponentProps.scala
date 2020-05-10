package typingsSlinky.reactNativeCalendars.mod

import typingsSlinky.reactNativeCalendars.reactNativeCalendarsBooleans.`false`
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings._empty
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.disabled
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.selected
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.today
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayComponentProps extends js.Object {
  var date: DateObject = js.native
  var marking: `false` | js.Array[Marking] = js.native
  var state: _empty | selected | disabled | today = js.native
  var theme: CalendarTheme = js.native
  def onLongPress(date: DateObject): js.Any = js.native
  def onPress(date: DateObject): js.Any = js.native
}

object DayComponentProps {
  @scala.inline
  def apply(
    date: DateObject,
    marking: `false` | js.Array[Marking],
    onLongPress: DateObject => js.Any,
    onPress: DateObject => js.Any,
    state: _empty | selected | disabled | today,
    theme: CalendarTheme
  ): DayComponentProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], marking = marking.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction1(onLongPress), onPress = js.Any.fromFunction1(onPress), state = state.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayComponentProps]
  }
  @scala.inline
  implicit class DayComponentPropsOps[Self <: DayComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: DateObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarking(value: `false` | js.Array[Marking]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnLongPress(value: DateObject => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPress(value: DateObject => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: _empty | selected | disabled | today): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: CalendarTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

