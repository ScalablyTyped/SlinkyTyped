package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedOriginalEvent extends js.Object {
  
  var checked: Boolean = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var target: Checked = js.native
  
  var value: js.Any = js.native
}
object CheckedOriginalEvent {
  
  @scala.inline
  def apply(checked: Boolean, originalEvent: org.scalajs.dom.raw.Event, target: Checked, value: js.Any): CheckedOriginalEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedOriginalEvent]
  }
  
  @scala.inline
  implicit class CheckedOriginalEventOps[Self <: CheckedOriginalEvent] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Checked): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
