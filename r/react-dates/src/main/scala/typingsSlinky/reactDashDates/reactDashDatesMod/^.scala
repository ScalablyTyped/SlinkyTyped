package typingsSlinky.reactDashDates.reactDashDatesMod

import slinky.core.ReactComponentClass
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.moment.momentMod.MomentFormatSpecification
import typingsSlinky.moment.momentMod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dates", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DateRangePicker: ReactComponentClass[DateRangePickerShape] = js.native
  var DayPickerRangeController: ReactComponentClass[DayPickerRangeControllerShape] = js.native
  var DayPickerSingleDateController: ReactComponentClass[DayPickerSingleDateControllerShape] = js.native
  var SingleDatePicker: ReactComponentClass[SingleDatePickerShape] = js.native
  // UTILS
  //
  // utils/isInclusivelyAfterDay.js
  var isInclusivelyAfterDay: js.Function2[/* a */ Moment, /* b */ Moment, Boolean] = js.native
  // utils/isInclusivelyBeforeDay.js
  var isInclusivelyBeforeDay: js.Function2[/* a */ Moment, /* b */ Moment, Boolean] = js.native
  // utils/isNextDay.js
  var isNextDay: js.Function2[/* a */ Moment, /* b */ Moment, Boolean] = js.native
  // utils/isSameDay.js
  var isSameDay: js.Function2[/* a */ Moment, /* b */ Moment, Boolean] = js.native
  // utils/toISODateString.js
  var toISODateString: js.Function2[/* date */ MomentInput, /* currentFormat */ MomentFormatSpecification, String | Null] = js.native
  // utils/toLocalizedDateString.js
  var toLocalizedDateString: js.Function2[/* date */ MomentInput, /* currentFormat */ MomentFormatSpecification, String | Null] = js.native
  // utils/toMomentObject.js
  var toMomentObject: js.Function2[
    /* dateString */ MomentInput, 
    /* customFormat */ MomentFormatSpecification, 
    Moment | Null
  ] = js.native
}

