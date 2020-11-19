package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.drillupall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrillupAllEventObject extends js.Object {
  
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  
  /**
    * The event type.
    */
  var `type`: drillupall = js.native
}
object DrillupAllEventObject {
  
  @scala.inline
  def apply(preventDefault: js.Function, target: Chart_, `type`: drillupall): DrillupAllEventObject = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillupAllEventObject]
  }
  
  @scala.inline
  implicit class DrillupAllEventObjectOps[Self <: DrillupAllEventObject] (val x: Self) extends AnyVal {
    
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
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Chart_): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drillupall): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
