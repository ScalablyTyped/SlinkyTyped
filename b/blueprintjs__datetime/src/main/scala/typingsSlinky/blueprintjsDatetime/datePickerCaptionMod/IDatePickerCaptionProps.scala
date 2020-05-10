package typingsSlinky.blueprintjsDatetime.datePickerCaptionMod

import typingsSlinky.reactDayPicker.commonMod.ClassNames
import typingsSlinky.reactDayPicker.propsMod.CaptionElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerCaptionProps extends CaptionElementProps {
  var maxDate: js.Date = js.native
  var minDate: js.Date = js.native
  /** Callback invoked when the month or year `<select>` is changed. */
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
  var onMonthChange: js.UndefOr[js.Function1[/* month */ Double, Unit]] = js.native
  var onYearChange: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.native
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
}

object IDatePickerCaptionProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    date: js.Date,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    maxDate: js.Date,
    minDate: js.Date
  ): IDatePickerCaptionProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerCaptionProps]
  }
  @scala.inline
  implicit class IDatePickerCaptionPropsOps[Self <: IDatePickerCaptionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDateChange(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMonthChange(value: /* month */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMonthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnYearChange(value: /* year */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnYearChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(js.undefined)
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
  }
  
}

