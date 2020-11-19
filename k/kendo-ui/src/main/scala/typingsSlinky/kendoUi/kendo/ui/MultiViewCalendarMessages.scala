package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiViewCalendarMessages extends js.Object {
  
  var weekColumnHeader: js.UndefOr[String] = js.native
}
object MultiViewCalendarMessages {
  
  @scala.inline
  def apply(): MultiViewCalendarMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiViewCalendarMessages]
  }
  
  @scala.inline
  implicit class MultiViewCalendarMessagesOps[Self <: MultiViewCalendarMessages] (val x: Self) extends AnyVal {
    
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
    def setWeekColumnHeader(value: String): Self = this.set("weekColumnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekColumnHeader: Self = this.set("weekColumnHeader", js.undefined)
  }
}
