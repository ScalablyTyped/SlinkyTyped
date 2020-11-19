package typingsSlinky.reactNotificationSystemRedux.mod

import typingsSlinky.reactNotificationSystem.mod.Attributes
import typingsSlinky.reactNotificationSystem.mod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsProps extends Attributes {
  
  var notifications: js.UndefOr[js.Array[Notification]] = js.native
}
object NotificationsProps {
  
  @scala.inline
  def apply(): NotificationsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationsProps]
  }
  
  @scala.inline
  implicit class NotificationsPropsOps[Self <: NotificationsProps] (val x: Self) extends AnyVal {
    
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
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
  }
}
