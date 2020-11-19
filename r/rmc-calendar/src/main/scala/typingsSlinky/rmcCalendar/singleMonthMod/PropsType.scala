package typingsSlinky.rmcCalendar.singleMonthMod

import typingsSlinky.rmcCalendar.dataTypesMod.Models.CellData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.dataTypesMod.Models.MonthData
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthData(value: MonthData): Self = this.set("monthData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDateExtra(value: /* date */ js.Date => ExtraData): Self = this.set("getDateExtra", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDateExtra: Self = this.set("getDateExtra", js.undefined)
    
    @scala.inline
    def setOnCellClick(value: (/* data */ CellData, /* monthData */ MonthData) => Unit): Self = this.set("onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setRowSize(value: normal | xl): Self = this.set("rowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSize: Self = this.set("rowSize", js.undefined)
  }
}
