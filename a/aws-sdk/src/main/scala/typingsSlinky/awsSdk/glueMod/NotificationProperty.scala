package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationProperty extends StObject {
  
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var NotifyDelayAfter: js.UndefOr[typingsSlinky.awsSdk.glueMod.NotifyDelayAfter] = js.native
}
object NotificationProperty {
  
  @scala.inline
  def apply(): NotificationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationProperty]
  }
  
  @scala.inline
  implicit class NotificationPropertyMutableBuilder[Self <: NotificationProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyDelayAfter(value: NotifyDelayAfter): Self = StObject.set(x, "NotifyDelayAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyDelayAfterUndefined: Self = StObject.set(x, "NotifyDelayAfter", js.undefined)
  }
}
