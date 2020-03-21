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

trait PropsType extends js.Object {
  var getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.undefined
  var locale: Locale
  var monthData: MonthData
  var onCellClick: js.UndefOr[js.Function2[/* data */ CellData, /* monthData */ MonthData, Unit]] = js.undefined
  var rowSize: js.UndefOr[normal | xl] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    locale: Locale,
    monthData: MonthData,
    getDateExtra: /* date */ js.Date => ExtraData = null,
    onCellClick: (/* data */ CellData, /* monthData */ MonthData) => Unit = null,
    rowSize: normal | xl = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1(getDateExtra))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

