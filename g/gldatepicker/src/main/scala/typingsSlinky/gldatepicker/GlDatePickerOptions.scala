package typingsSlinky.gldatepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlDatePickerOptions extends js.Object {
  var allowMonthSelect: js.UndefOr[Boolean] = js.native
  var allowYearSelect: js.UndefOr[Boolean] = js.native
  var borderSize: js.UndefOr[Double] = js.native
  var calendarOffset: js.UndefOr[GlDatePickerOffset] = js.native
  var cssName: js.UndefOr[String] = js.native
  var dowNames: js.UndefOr[js.Array[String]] = js.native
  var dowOffset: js.UndefOr[Double] = js.native
  var hideOnClick: js.UndefOr[Boolean] = js.native
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  var nextArrow: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[
    js.Function4[
      /* inputElement */ JQuery, 
      /* cell */ JQuery, 
      /* date */ js.Date, 
      /* data */ js.Any, 
      Unit
    ]
  ] = js.native
  var onHide: js.UndefOr[js.Function1[/* calendar */ JQuery, Unit]] = js.native
  var onHover: js.UndefOr[
    js.Function4[
      /* inputElement */ JQuery, 
      /* cell */ JQuery, 
      /* date */ js.Date, 
      /* data */ js.Any, 
      Unit
    ]
  ] = js.native
  var onShow: js.UndefOr[js.Function1[/* calendar */ JQuery, Unit]] = js.native
  var prevArrow: js.UndefOr[String] = js.native
  var selectableDOW: js.UndefOr[js.Array[Double]] = js.native
  var selectableDateRange: js.UndefOr[js.Array[GlDatePickerDateRange]] = js.native
  var selectableDates: js.UndefOr[js.Array[GlDatePickerDate]] = js.native
  var selectableMonths: js.UndefOr[js.Array[Double]] = js.native
  var selectableYears: js.UndefOr[js.Array[Double]] = js.native
  var selectedDate: js.UndefOr[js.Date] = js.native
  var showAlways: js.UndefOr[Boolean] = js.native
  var specialDates: js.UndefOr[js.Array[GlDatePickerSpecialDate]] = js.native
  var todayDate: js.UndefOr[js.Date] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object GlDatePickerOptions {
  @scala.inline
  def apply(): GlDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlDatePickerOptions]
  }
  @scala.inline
  implicit class GlDatePickerOptionsOps[Self <: GlDatePickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMonthSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMonthSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMonthSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMonthSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowYearSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowYearSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowYearSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowYearSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarOffset(value: GlDatePickerOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCssName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssName")(js.undefined)
        ret
    }
    @scala.inline
    def withDowNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dowNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDowNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dowNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDowOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withNextArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* inputElement */ JQuery, /* cell */ JQuery, /* date */ js.Date, /* data */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: /* calendar */ JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHover(
      value: (/* inputElement */ JQuery, /* cell */ JQuery, /* date */ js.Date, /* data */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* calendar */ JQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableDOW(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableDOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableDOW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableDOW")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableDateRange(value: js.Array[GlDatePickerDateRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableDateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableDateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableDates(value: js.Array[GlDatePickerDate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableDates")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableMonths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableYears(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableYears")(js.undefined)
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
    @scala.inline
    def withShowAlways(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlways")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialDates(value: js.Array[GlDatePickerSpecialDate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialDates")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayDate")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

