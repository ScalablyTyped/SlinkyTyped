package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleTypeDate extends js.Object {
  
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
    * if specifying a year/month where the day is not significant.
    */
  var day: js.UndefOr[Double] = js.native
  
  /** Month of year. Must be from 1 to 12. */
  var month: js.UndefOr[Double] = js.native
  
  /**
    * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
    * a year.
    */
  var year: js.UndefOr[Double] = js.native
}
object GoogleTypeDate {
  
  @scala.inline
  def apply(): GoogleTypeDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleTypeDate]
  }
  
  @scala.inline
  implicit class GoogleTypeDateOps[Self <: GoogleTypeDate] (val x: Self) extends AnyVal {
    
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
