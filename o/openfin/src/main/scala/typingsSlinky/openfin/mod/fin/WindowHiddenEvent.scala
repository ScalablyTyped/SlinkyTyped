package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`hide-on-close`
import typingsSlinky.openfin.openfinStrings.hidden
import typingsSlinky.openfin.openfinStrings.hide
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowHiddenEvent extends WindowBaseEvent {
  
  /**
    * What action prompted the close.
    * The reasons are: "hide", "hide-on-close"
    */
  var reason: hide | `hide-on-close` = js.native
  
  @JSName("type")
  var type_WindowHiddenEvent: hidden = js.native
}
object WindowHiddenEvent {
  
  @scala.inline
  def apply(name: String, reason: hide | `hide-on-close`, topic: window, `type`: hidden, uuid: String): WindowHiddenEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHiddenEvent]
  }
  
  @scala.inline
  implicit class WindowHiddenEventOps[Self <: WindowHiddenEvent] (val x: Self) extends AnyVal {
    
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
    def setReason(value: hide | `hide-on-close`): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: hidden): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
