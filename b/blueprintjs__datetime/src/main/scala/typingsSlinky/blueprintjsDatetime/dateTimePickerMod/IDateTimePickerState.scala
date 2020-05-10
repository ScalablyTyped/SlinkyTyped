package typingsSlinky.blueprintjsDatetime.dateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimePickerState extends js.Object {
  var dateValue: js.UndefOr[js.Date] = js.native
  var timeValue: js.UndefOr[js.Date] = js.native
}

object IDateTimePickerState {
  @scala.inline
  def apply(): IDateTimePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateTimePickerState]
  }
  @scala.inline
  implicit class IDateTimePickerStateOps[Self <: IDateTimePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeValue")(js.undefined)
        ret
    }
  }
  
}

