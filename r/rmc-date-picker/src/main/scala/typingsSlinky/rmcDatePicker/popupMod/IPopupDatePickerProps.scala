package typingsSlinky.rmcDatePicker.popupMod

import slinky.core.facade.ReactElement
import typingsSlinky.rmcPicker.popupPickerTypesMod.IPopupPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupDatePickerProps extends IPopupPickerProps {
  var date: js.UndefOr[js.Any] = js.native
  var datePicker: ReactElement = js.native
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Any], Unit]] = js.native
}

object IPopupDatePickerProps {
  @scala.inline
  def apply(datePicker: ReactElement): IPopupDatePickerProps = {
    val __obj = js.Dynamic.literal(datePicker = datePicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupDatePickerProps]
  }
  @scala.inline
  implicit class IPopupDatePickerPropsOps[Self <: IPopupDatePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatePicker(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* date */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
  }
  
}

