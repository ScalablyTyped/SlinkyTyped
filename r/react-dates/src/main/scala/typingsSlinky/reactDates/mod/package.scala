package typingsSlinky.reactDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // COMPONENTS
  //
  // components/DateRangePicker.js
  type DateRangePicker = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DateRangePickerShape]
  type DayPickerRangeController = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DayPickerRangeControllerShape]
  type DayPickerSingleDateController = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.DayPickerSingleDateControllerShape]
  // shapes/DisabledShape.js
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.reactDates.reactDatesStrings.startDate
    - typingsSlinky.reactDates.reactDatesStrings.endDate
  */
  type DisabledShape = typingsSlinky.reactDates.mod._DisabledShape | scala.Boolean
  // components/SingleDatePicker.js
  type SingleDatePicker = slinky.core.ReactComponentClass[typingsSlinky.reactDates.mod.SingleDatePickerShape]
}
