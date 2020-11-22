package typingsSlinky.reactDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CalendarDay = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.CalendarDayShape]
  
  type CalendarMonth = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.CalendarMonthShape]
  
  type CalendarMonthGrid = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.CalendarMonthGridShape]
  
  type CalendarMonthGridShape = typingsSlinky.reactDates.mod.RenderMonthProps with typingsSlinky.reactDates.anon.PickCalendarMonthShapeena with typingsSlinky.reactDates.anon.FirstVisibleMonthIndex
  
  type CalendarMonthShape = typingsSlinky.reactDates.mod.RenderMonthProps with typingsSlinky.reactDates.anon.PickCalendarDayShapedaySi with typingsSlinky.reactDates.anon.DayAriaLabelFormat
  
  type DateRangePicker = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DateRangePickerShape]
  
  type DateRangePickerInput = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DateRangePickerInputShape]
  
  type DateRangePickerInputController = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DateRangePickerInputControllerShape]
  
  type DateRangePickerShape = typingsSlinky.reactDates.mod.RenderMonthProps with typingsSlinky.reactDates.anon.AnchorDirection
  
  type DayPicker = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DayPickerShape]
  
  type DayPickerRangeController = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DayPickerRangeControllerShape]
  
  type DayPickerRangeControllerShape = typingsSlinky.reactDates.mod.RenderMonthProps with typingsSlinky.reactDates.anon.PickDayPickerShaperenderW with typingsSlinky.reactDates.anon.DaysViolatingMinNightsCanBeClicked
  
  type DayPickerShape = typingsSlinky.reactDates.mod.RenderMonthProps with typingsSlinky.reactDates.anon.PickCalendarMonthGridShap with (typingsSlinky.reactDates.anon.OnGetNextScrollableMonths | typingsSlinky.reactDates.anon.OnGetPrevScrollableMonths) with typingsSlinky.reactDates.anon.CalendarInfoPosition
  
  type DayPickerSingleDateController = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DayPickerSingleDateControllerShape]
  
  type DayPickerSingleDateControllerShape = typingsSlinky.reactDates.mod.RenderMonthProps with typingsSlinky.reactDates.anon.PickDayPickerShaperenderWCalendarInfoPosition with typingsSlinky.reactDates.anon.InitialVisibleMonth
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.reactDates.reactDatesStrings.startDate
    - typingsSlinky.reactDates.reactDatesStrings.endDate
  */
  type DisabledShape = typingsSlinky.reactDates.mod._DisabledShape | scala.Boolean
  
  type ModifiersShape = typingsSlinky.std.Set[java.lang.String]
  
  type SingleDatePicker = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.SingleDatePickerShape]
  
  type SingleDatePickerInput = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.SingleDatePickerInputShape]
  
  type SingleDatePickerShape = typingsSlinky.reactDates.mod.RenderMonthProps with typingsSlinky.reactDates.anon.AppendToBody
}
