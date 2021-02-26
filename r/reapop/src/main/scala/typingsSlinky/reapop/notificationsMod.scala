package typingsSlinky.reapop

import typingsSlinky.reapop.anon.PartialNotificationConfig
import typingsSlinky.reapop.typesMod.NewNotification
import typingsSlinky.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  @JSImport("reapop/dist/services/notifications", "generateId")
  @js.native
  def generateId(): String = js.native
  
  @JSImport("reapop/dist/services/notifications", "prepareNotification")
  @js.native
  def prepareNotification(notification: NewNotification): Notification = js.native
  
  @JSImport("reapop/dist/services/notifications", "resetNotificationsConfig")
  @js.native
  def resetNotificationsConfig(): Unit = js.native
  
  @JSImport("reapop/dist/services/notifications", "setUpNotifications")
  @js.native
  def setUpNotifications(props: PartialNotificationConfig): Unit = js.native
}
