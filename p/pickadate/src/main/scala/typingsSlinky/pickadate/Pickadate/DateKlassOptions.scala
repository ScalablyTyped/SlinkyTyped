package typingsSlinky.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateKlassOptions extends KlassOptions {
   // default 'picker__footer'
  // Today & close buttons
  var buttonClose: js.UndefOr[String] = js.native
   // default 'picker__button--close'
  var buttonToday: js.UndefOr[String] = js.native
   // default 'picker__weekday'
  // Day states
  var day: js.UndefOr[String] = js.native
   // default 'picker__day--outfocus'
  // The picker footer
  var footer: js.UndefOr[String] = js.native
  // The picker header
  var header: js.UndefOr[String] = js.native
   // default 'picker__day'
  var infocus: js.UndefOr[String] = js.native
   // default 'picker__nav--disabled'
  // Month & year labels
  var month: js.UndefOr[String] = js.native
   // default 'picker__nav--next'
  var navDisabled: js.UndefOr[String] = js.native
   // default 'picker__nav--prev'
  var navNext: js.UndefOr[String] = js.native
   // default 'picker__header'
  // Month navigation
  var navPrev: js.UndefOr[String] = js.native
   // default 'picker__day--infocus'
  var outfocus: js.UndefOr[String] = js.native
   // default 'picker__year'
  // Month & year dropdowns
  var selectMonth: js.UndefOr[String] = js.native
   // default 'picker__select--month'
  var selectYear: js.UndefOr[String] = js.native
   // default 'picker__select--year'
  // Table of dates
  var table: js.UndefOr[String] = js.native
   // default 'picker__table'
  // Weekday labels
  var weekdays: js.UndefOr[String] = js.native
   // default 'picker__month'
  var year: js.UndefOr[String] = js.native
}

object DateKlassOptions {
  @scala.inline
  def apply(): DateKlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateKlassOptions]
  }
  @scala.inline
  implicit class DateKlassOptionsOps[Self <: DateKlassOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClose")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonToday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonToday")(js.undefined)
        ret
    }
    @scala.inline
    def withDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withInfocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infocus")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withNavDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNavNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navNext")(js.undefined)
        ret
    }
    @scala.inline
    def withNavPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withOutfocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outfocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectYear")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdays(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

