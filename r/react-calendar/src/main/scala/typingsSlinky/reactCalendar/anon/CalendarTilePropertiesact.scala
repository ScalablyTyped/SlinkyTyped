package typingsSlinky.reactCalendar.anon

import typingsSlinky.reactCalendar.mod.Detail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-calendar.react-calendar.CalendarTileProperties & {  activeStartDate :std.Date} */
@js.native
trait CalendarTilePropertiesact extends js.Object {
  
  var activeStartDate: js.Date = js.native
  
  var date: js.Date = js.native
  
  var view: Detail = js.native
}
object CalendarTilePropertiesact {
  
  @scala.inline
  def apply(activeStartDate: js.Date, date: js.Date, view: Detail): CalendarTilePropertiesact = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarTilePropertiesact]
  }
  
  @scala.inline
  implicit class CalendarTilePropertiesactOps[Self <: CalendarTilePropertiesact] (val x: Self) extends AnyVal {
    
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
    def setActiveStartDate(value: js.Date): Self = this.set("activeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: Detail): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
