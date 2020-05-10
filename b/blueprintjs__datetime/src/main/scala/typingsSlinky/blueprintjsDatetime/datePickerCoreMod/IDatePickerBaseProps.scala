package typingsSlinky.blueprintjsDatetime.datePickerCoreMod

import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerBaseProps extends js.Object {
  /**
    * The initial month the calendar displays.
    */
  var initialMonth: js.UndefOr[js.Date] = js.native
  /**
    * The locale name, which is passed to the functions in `localeUtils`
    * (and `formatDate` and `parseDate` if supported).
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Collection of functions that provide internationalization support.
    */
  var localeUtils: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  ] = js.native
  /**
    * The latest date the user can select.
    * @default Dec. 31st of this year.
    */
  var maxDate: js.UndefOr[js.Date] = js.native
  /**
    * The earliest date the user can select.
    * @default Jan. 1st, 20 years in the past.
    */
  var minDate: js.UndefOr[js.Date] = js.native
  /**
    * Collection of functions that determine which modifier classes get applied to which days.
    * Each function should accept a `Date` and return a boolean.
    * See the [**react-day-picker** documentation](http://react-day-picker.js.org/api/ModifiersUtils) to learn more.
    */
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.native
  /**
    * If `true`, the month menu will appear to the left of the year menu.
    * Otherwise, the month menu will apear to the right of the year menu.
    * @default false
    */
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
  /**
    * Further configure the `TimePicker` that appears beneath the calendar.
    * `onChange` and `value` are ignored in favor of the corresponding
    * top-level props on this component.
    *
    * Passing any defined value to this prop (even `{}`) will cause the
    * `TimePicker` to appear.
    */
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
  /**
    * The precision of time selection that accompanies the calendar. Passing a
    * `TimePrecision` value (or providing `timePickerProps`) shows a
    * `TimePicker` below the calendar. Time is preserved across date changes.
    *
    * This is shorthand for `timePickerProps.precision` and is a quick way to
    * enable time selection.
    */
  var timePrecision: js.UndefOr[TimePrecision] = js.native
}

object IDatePickerBaseProps {
  @scala.inline
  def apply(): IDatePickerBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerBaseProps]
  }
  @scala.inline
  implicit class IDatePickerBasePropsOps[Self <: IDatePickerBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialMonth(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeUtils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleUtils: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeUtils")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: IDatePickerModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseMonthAndYearMenus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMonthAndYearMenus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseMonthAndYearMenus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMonthAndYearMenus")(js.undefined)
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
    def withTimePrecision(value: TimePrecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePrecision")(js.undefined)
        ret
    }
  }
  
}

