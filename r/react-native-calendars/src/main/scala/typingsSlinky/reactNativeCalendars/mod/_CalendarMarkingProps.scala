package typingsSlinky.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.custom
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.period
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _CalendarMarkingProps extends js.Object
object _CalendarMarkingProps {
  
  @scala.inline
  def DotMarkingProps(markedDates: StringDictionary[DotMarking]): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
  
  @scala.inline
  def MultiDotMarkingProps(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
  
  @scala.inline
  def CustomMarkingProps(markedDates: StringDictionary[CustomMarking], markingType: custom): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
  
  @scala.inline
  def MultiPeriodMarkingProps(markedDates: StringDictionary[MultiPeriodMarking], markingType: `multi-period`): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
  
  @scala.inline
  def PeriodMarkingProps(markedDates: StringDictionary[PeriodMarking], markingType: period): _CalendarMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CalendarMarkingProps]
  }
}
