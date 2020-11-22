package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerActionNotificationProperty extends js.Object {
  
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var notifyDelayAfter: js.UndefOr[Double] = js.native
}
object TriggerActionNotificationProperty {
  
  @scala.inline
  def apply(): TriggerActionNotificationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerActionNotificationProperty]
  }
  
  @scala.inline
  implicit class TriggerActionNotificationPropertyOps[Self <: TriggerActionNotificationProperty] (val x: Self) extends AnyVal {
    
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
    def setNotifyDelayAfter(value: Double): Self = this.set("notifyDelayAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyDelayAfter: Self = this.set("notifyDelayAfter", js.undefined)
  }
}
