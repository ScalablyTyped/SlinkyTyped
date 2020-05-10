package typingsSlinky.officeUiFabricReact.datePickerTypesMod

import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerStrings extends ICalendarStrings {
  /**
    * Error message to render for TextField if input date string parsing fails.
    */
  var invalidInputErrorMessage: js.UndefOr[String] = js.native
  /**
    * Error message to render for TextField if date boundary (minDate, maxDate) validation fails.
    */
  var isOutOfBoundsErrorMessage: js.UndefOr[String] = js.native
  /**
    * Error message to render for TextField if isRequired validation fails.
    */
  var isRequiredErrorMessage: js.UndefOr[String] = js.native
}

object IDatePickerStrings {
  @scala.inline
  def apply(
    days: js.Array[String],
    goToToday: String,
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): IDatePickerStrings = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerStrings]
  }
  @scala.inline
  implicit class IDatePickerStringsOps[Self <: IDatePickerStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidInputErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidInputErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidInputErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidInputErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutOfBoundsErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBoundsErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOutOfBoundsErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBoundsErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequiredErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequiredErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequiredErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequiredErrorMessage")(js.undefined)
        ret
    }
  }
  
}

