package typingsSlinky.officeUiFabricReact.datePickerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerState extends js.Object {
  var errorMessage: js.UndefOr[String] = js.native
  var formattedDate: js.UndefOr[String] = js.native
  var isDatePickerShown: js.UndefOr[Boolean] = js.native
  var selectedDate: js.UndefOr[js.Date] = js.native
}

object IDatePickerState {
  @scala.inline
  def apply(): IDatePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerState]
  }
  @scala.inline
  implicit class IDatePickerStateOps[Self <: IDatePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDatePickerShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDatePickerShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDatePickerShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDatePickerShown")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(js.undefined)
        ret
    }
  }
  
}

