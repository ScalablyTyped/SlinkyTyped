package typingsSlinky.officeUiFabricReact.calendarDayMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDayInfo extends js.Object {
  
  var date: String = js.native
  
  var isInBounds: Boolean = js.native
  
  var isInMonth: Boolean = js.native
  
  var isSelected: Boolean = js.native
  
  var isToday: Boolean = js.native
  
  var key: String = js.native
  
  def onSelected(ev: SyntheticEvent[Event, HTMLElement]): Unit = js.native
  
  var originalDate: js.Date = js.native
}
object IDayInfo {
  
  @scala.inline
  def apply(
    date: String,
    isInBounds: Boolean,
    isInMonth: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    key: String,
    onSelected: SyntheticEvent[Event, HTMLElement] => Unit,
    originalDate: js.Date
  ): IDayInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onSelected = js.Any.fromFunction1(onSelected), originalDate = originalDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDayInfo]
  }
  
  @scala.inline
  implicit class IDayInfoOps[Self <: IDayInfo] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInBounds(value: Boolean): Self = this.set("isInBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInMonth(value: Boolean): Self = this.set("isInMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToday(value: Boolean): Self = this.set("isToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelected(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = this.set("onSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriginalDate(value: js.Date): Self = this.set("originalDate", value.asInstanceOf[js.Any])
  }
}
