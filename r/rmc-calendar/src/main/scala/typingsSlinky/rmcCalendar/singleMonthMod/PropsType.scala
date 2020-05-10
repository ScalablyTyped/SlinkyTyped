package typingsSlinky.rmcCalendar.singleMonthMod

import typingsSlinky.rmcCalendar.dataTypesMod.Models.CellData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.dataTypesMod.Models.MonthData
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends js.Object {
  var getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.native
  var locale: Locale = js.native
  var monthData: MonthData = js.native
  var onCellClick: js.UndefOr[js.Function2[/* data */ CellData, /* monthData */ MonthData, Unit]] = js.native
  var rowSize: js.UndefOr[normal | xl] = js.native
}

object PropsType {
  @scala.inline
  def apply(locale: Locale, monthData: MonthData): PropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthData(value: MonthData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDateExtra(value: /* date */ js.Date => ExtraData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateExtra")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDateExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateExtra")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClick(value: (/* data */ CellData, /* monthData */ MonthData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSize(value: normal | xl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSize")(js.undefined)
        ret
    }
  }
  
}

