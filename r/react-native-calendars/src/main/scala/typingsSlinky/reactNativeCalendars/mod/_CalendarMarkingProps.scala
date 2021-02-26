package typingsSlinky.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.custom
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.period
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _CalendarMarkingProps extends StObject
object _CalendarMarkingProps {
  
  @scala.inline
  def CustomMarkingProps(markedDates: StringDictionary[CustomMarking], markingType: custom): typingsSlinky.reactNativeCalendars.mod.CustomMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.CustomMarkingProps]
  }
  
  @scala.inline
  def DotMarkingProps(markedDates: StringDictionary[DotMarking]): typingsSlinky.reactNativeCalendars.mod.DotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.DotMarkingProps]
  }
  
  @scala.inline
  def MultiDotMarkingProps(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): typingsSlinky.reactNativeCalendars.mod.MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.MultiDotMarkingProps]
  }
  
  @scala.inline
  def MultiPeriodMarkingProps(markedDates: StringDictionary[MultiPeriodMarking], markingType: `multi-period`): typingsSlinky.reactNativeCalendars.mod.MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.MultiPeriodMarkingProps]
  }
  
  @scala.inline
  def PeriodMarkingProps(markedDates: StringDictionary[PeriodMarking], markingType: period): typingsSlinky.reactNativeCalendars.mod.PeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.PeriodMarkingProps]
  }
}
