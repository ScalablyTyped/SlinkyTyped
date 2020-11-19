package typingsSlinky.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttDateHelpers extends js.Object {
  
  def add(origin: js.Date, count: Double, unit: String): js.Date = js.native
  
  def convert_to_utc(origin: js.Date): js.Date = js.native
  
  def copy(origin: js.Date): js.Date = js.native
  
  def date_part(origin: js.Date): js.Date = js.native
  
  def date_to_str(format: String): js.Any = js.native
  
  def day_start(origin: js.Date): js.Date = js.native
  
  def getISOWeek(origin: js.Date): Double = js.native
  
  def getUTCISOWeek(origin: js.Date): Double = js.native
  
  def month_start(origin: js.Date): js.Date = js.native
  
  def str_to_date(format: String): js.Any = js.native
  
  def time_part(origin: js.Date): js.Date = js.native
  
  def to_fixed(value: Double): String = js.native
  
  def week_start(origin: js.Date): js.Date = js.native
  
  def year_start(origin: js.Date): js.Date = js.native
}
object GanttDateHelpers {
  
  @scala.inline
  def apply(
    add: (js.Date, Double, String) => js.Date,
    convert_to_utc: js.Date => js.Date,
    copy: js.Date => js.Date,
    date_part: js.Date => js.Date,
    date_to_str: String => js.Any,
    day_start: js.Date => js.Date,
    getISOWeek: js.Date => Double,
    getUTCISOWeek: js.Date => Double,
    month_start: js.Date => js.Date,
    str_to_date: String => js.Any,
    time_part: js.Date => js.Date,
    to_fixed: Double => String,
    week_start: js.Date => js.Date,
    year_start: js.Date => js.Date
  ): GanttDateHelpers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), convert_to_utc = js.Any.fromFunction1(convert_to_utc), copy = js.Any.fromFunction1(copy), date_part = js.Any.fromFunction1(date_part), date_to_str = js.Any.fromFunction1(date_to_str), day_start = js.Any.fromFunction1(day_start), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), month_start = js.Any.fromFunction1(month_start), str_to_date = js.Any.fromFunction1(str_to_date), time_part = js.Any.fromFunction1(time_part), to_fixed = js.Any.fromFunction1(to_fixed), week_start = js.Any.fromFunction1(week_start), year_start = js.Any.fromFunction1(year_start))
    __obj.asInstanceOf[GanttDateHelpers]
  }
  
  @scala.inline
  implicit class GanttDateHelpersOps[Self <: GanttDateHelpers] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (js.Date, Double, String) => js.Date): Self = this.set("add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConvert_to_utc(value: js.Date => js.Date): Self = this.set("convert_to_utc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopy(value: js.Date => js.Date): Self = this.set("copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate_part(value: js.Date => js.Date): Self = this.set("date_part", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate_to_str(value: String => js.Any): Self = this.set("date_to_str", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDay_start(value: js.Date => js.Date): Self = this.set("day_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetISOWeek(value: js.Date => Double): Self = this.set("getISOWeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUTCISOWeek(value: js.Date => Double): Self = this.set("getUTCISOWeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonth_start(value: js.Date => js.Date): Self = this.set("month_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStr_to_date(value: String => js.Any): Self = this.set("str_to_date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTime_part(value: js.Date => js.Date): Self = this.set("time_part", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo_fixed(value: Double => String): Self = this.set("to_fixed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeek_start(value: js.Date => js.Date): Self = this.set("week_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYear_start(value: js.Date => js.Date): Self = this.set("year_start", js.Any.fromFunction1(value))
  }
}
