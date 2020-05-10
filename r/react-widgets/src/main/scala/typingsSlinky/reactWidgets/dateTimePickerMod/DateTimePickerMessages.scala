package typingsSlinky.reactWidgets.dateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimePickerMessages extends js.Object {
  /**
    * Title and screen reader text for the left arrow button.
    * @default "Select Date"
    */
  var dateButton: js.UndefOr[String] = js.native
  /**
    * Title and screen reader text for the right arrow button.
    * @default "Select Time"
    */
  var timeButton: js.UndefOr[String] = js.native
}

object DateTimePickerMessages {
  @scala.inline
  def apply(): DateTimePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerMessages]
  }
  @scala.inline
  implicit class DateTimePickerMessagesOps[Self <: DateTimePickerMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeButton")(js.undefined)
        ret
    }
  }
  
}

