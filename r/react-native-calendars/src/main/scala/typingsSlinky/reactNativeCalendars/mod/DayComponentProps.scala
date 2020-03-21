package typingsSlinky.reactNativeCalendars.mod

import typingsSlinky.reactNativeCalendars.reactNativeCalendarsBooleans.`false`
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings._empty
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.disabled
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.selected
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.today
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayComponentProps extends js.Object {
  var date: DateObject
  var marking: `false` | js.Array[Marking]
  var state: _empty | selected | disabled | today
  var theme: CalendarTheme
  def onLongPress(date: DateObject): js.Any
  def onPress(date: DateObject): js.Any
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
}

