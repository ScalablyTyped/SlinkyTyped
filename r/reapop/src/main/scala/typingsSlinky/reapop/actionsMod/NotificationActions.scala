package typingsSlinky.reapop.actionsMod

import typingsSlinky.reapop.notificationsConstantsMod.NotificationAction.DismissNotification
import typingsSlinky.reapop.notificationsConstantsMod.NotificationAction.DismissNotifications
import typingsSlinky.reapop.notificationsConstantsMod.NotificationAction.UpsertNotification
import typingsSlinky.reapop.typesMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reapop.actionsMod.UpsertNotificationAction
  - typingsSlinky.reapop.actionsMod.DismissNotificationAction
  - typingsSlinky.reapop.actionsMod.DismissNotificationsAction
*/
trait NotificationActions extends js.Object
object NotificationActions {
  
  @scala.inline
  def UpsertNotificationAction(payload: Notification, `type`: UpsertNotification): NotificationActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationActions]
  }
  
  @scala.inline
  def DismissNotificationAction(payload: String, `type`: DismissNotification): NotificationActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationActions]
  }
  
  @scala.inline
  def DismissNotificationsAction(`type`: DismissNotifications): NotificationActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationActions]
  }
}
