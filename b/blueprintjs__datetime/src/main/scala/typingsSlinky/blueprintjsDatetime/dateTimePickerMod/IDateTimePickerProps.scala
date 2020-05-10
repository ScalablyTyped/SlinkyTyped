package typingsSlinky.blueprintjsDatetime.dateTimePickerMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimePickerProps extends IProps {
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[Boolean] = js.native
  /**
    * Any props to be passed on to the `DatePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var datePickerProps: js.UndefOr[IDatePickerProps] = js.native
  /**
    * The initial date and time value that will be set.
    * This will be ignored if `value` is set.
    * @default Date.now()
    */
  var defaultValue: js.UndefOr[js.Date] = js.native
  /**
    * Callback invoked when the user changes the date or time.
    */
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.native
  /**
    * Any props to be passed on to the `TimePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
  /**
    * The currently set date and time. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[js.Date] = js.native
}

object IDateTimePickerProps {
  @scala.inline
  def apply(): IDateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateTimePickerProps]
  }
  @scala.inline
  implicit class IDateTimePickerPropsOps[Self <: IDateTimePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanClearSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canClearSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanClearSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canClearSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePickerProps(value: IDatePickerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePickerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePickerProps(value: ITimePickerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

