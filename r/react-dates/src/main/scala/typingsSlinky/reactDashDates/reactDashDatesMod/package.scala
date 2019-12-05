package typingsSlinky.reactDashDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDatesMod {
  import slinky.core.ReactComponentClass

  // COMPONENTS
  //
  // components/DateRangePicker.js
  type DateRangePicker = ReactComponentClass[DateRangePickerShape]
  type DayPickerRangeController = ReactComponentClass[DayPickerRangeControllerShape]
  type DayPickerSingleDateController = ReactComponentClass[DayPickerSingleDateControllerShape]
  // shapes/DisabledShape.js
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.reactDashDates.reactDashDatesStrings.startDate
    - typings.reactDashDates.reactDashDatesStrings.endDate
  */
  type DisabledShape = _DisabledShape | Boolean
  // components/SingleDatePicker.js
  type SingleDatePicker = ReactComponentClass[SingleDatePickerShape]
}
