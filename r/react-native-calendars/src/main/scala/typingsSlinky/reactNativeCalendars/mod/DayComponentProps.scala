package typingsSlinky.reactNativeCalendars.mod

import typingsSlinky.reactNativeCalendars.reactNativeCalendarsBooleans.`false`
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings._empty
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.disabled
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.selected
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.today
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayComponentProps extends StObject {
  
  var date: DateObject = js.native
  
  var marking: `false` | js.Array[Marking] = js.native
  
  def onLongPress(date: DateObject): js.Any = js.native
  
  def onPress(date: DateObject): js.Any = js.native
  
  var state: _empty | selected | disabled | today = js.native
  
  var theme: CalendarTheme = js.native
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
  implicit class DayComponentPropsMutableBuilder[Self <: DayComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: DateObject): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarking(value: `false` | js.Array[Marking]): Self = StObject.set(x, "marking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingVarargs(value: Marking*): Self = StObject.set(x, "marking", js.Array(value :_*))
    
    @scala.inline
    def setOnLongPress(value: DateObject => js.Any): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPress(value: DateObject => js.Any): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: _empty | selected | disabled | today): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: CalendarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
