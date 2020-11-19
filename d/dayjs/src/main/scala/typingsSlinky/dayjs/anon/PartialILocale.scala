package typingsSlinky.dayjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<dayjs.ILocale> */
@js.native
trait PartialILocale extends js.Object {
  
  var formats: js.UndefOr[PartialLTstringLTSstringL] = js.native
  
  var months: js.UndefOr[js.Array[String]] = js.native
  
  var monthsShort: js.UndefOr[js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, Double | String]] = js.native
  
  var relativeTime: js.UndefOr[Partialfuturestringpastst] = js.native
  
  var weekStart: js.UndefOr[Double] = js.native
  
  var weekdays: js.UndefOr[js.Array[String]] = js.native
  
  var weekdaysMin: js.UndefOr[js.Array[String]] = js.native
  
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}
object PartialILocale {
  
  @scala.inline
  def apply(): PartialILocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialILocale]
  }
  
  @scala.inline
  implicit class PartialILocaleOps[Self <: PartialILocale] (val x: Self) extends AnyVal {
    
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
    def setFormats(value: PartialLTstringLTSstringL): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = this.set("monthsShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthsShort(value: js.Array[String]): Self = this.set("monthsShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthsShort: Self = this.set("monthsShort", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrdinal(value: /* n */ Double => Double | String): Self = this.set("ordinal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    
    @scala.inline
    def setRelativeTime(value: Partialfuturestringpastst): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeTime: Self = this.set("relativeTime", js.undefined)
    
    @scala.inline
    def setWeekStart(value: Double): Self = this.set("weekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStart: Self = this.set("weekStart", js.undefined)
    
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    
    @scala.inline
    def setWeekdaysMinVarargs(value: String*): Self = this.set("weekdaysMin", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysMin(value: js.Array[String]): Self = this.set("weekdaysMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdaysMin: Self = this.set("weekdaysMin", js.undefined)
    
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysShort(value: js.Array[String]): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdaysShort: Self = this.set("weekdaysShort", js.undefined)
  }
}
