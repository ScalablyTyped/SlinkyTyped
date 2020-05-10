package typingsSlinky.blueprintjsDatetime.timePickerMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimePickerProps extends IProps {
  /**
    * Initial time the `TimePicker` will display.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[js.Date] = js.native
  /**
    * Whether the time picker is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The latest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `maxTime` will be later than the `minTime` in the basic case,
    * it is also allowed to be earlier than the `minTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var maxTime: js.UndefOr[js.Date] = js.native
  /**
    * The earliest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `minTime` will be earlier than the `maxTime` in the basic case,
    * it is also allowed to be later than the `maxTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var minTime: js.UndefOr[js.Date] = js.native
  /**
    * Callback invoked when the user changes the time.
    */
  var onChange: js.UndefOr[js.Function1[/* newTime */ js.Date, Unit]] = js.native
  /**
    * The precision of time the user can set.
    * @default TimePrecision.MINUTE
    */
  var precision: js.UndefOr[TimePrecision] = js.native
  /**
    * Whether all the text in each input should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show arrows buttons for changing the time.
    * @default false
    */
  var showArrowButtons: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use a 12 hour format with an AM/PM dropdown.
    * @default false
    */
  var useAmPm: js.UndefOr[Boolean] = js.native
  /**
    * The currently set time.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[js.Date] = js.native
}

object ITimePickerProps {
  @scala.inline
  def apply(): ITimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimePickerProps]
  }
  @scala.inline
  implicit class ITimePickerPropsOps[Self <: ITimePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* newTime */ js.Date => Unit): Self = {
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
    @scala.inline
    def withPrecision(value: TimePrecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArrowButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrowButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArrowButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrowButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAmPm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAmPm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAmPm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAmPm")(js.undefined)
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

