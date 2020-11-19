package typingsSlinky.expo

import typingsSlinky.expo.anon.Data
import typingsSlinky.expo.anon.Day
import typingsSlinky.expo.anon.GcmSenderId
import typingsSlinky.expo.anon.Interval
import typingsSlinky.expo.anon.IntervalMs
import typingsSlinky.expo.notificationsTypesMod.ActionType
import typingsSlinky.expo.notificationsTypesMod.Channel
import typingsSlinky.expo.notificationsTypesMod.LocalNotification
import typingsSlinky.expo.notificationsTypesMod.LocalNotificationId
import typingsSlinky.expo.notificationsTypesMod.Notification
import typingsSlinky.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/Notifications/Notifications", JSImport.Namespace)
@js.native
object notificationsMod extends js.Object {
  
  def emitNotification(notification: js.Any): Unit = js.native
  
  @js.native
  object default extends js.Object {
    
    def _setInitialNotification(notification: Notification): Unit = js.native
    
    def addListener(listener: js.Function1[/* notification */ Notification, _]): EventSubscription = js.native
    
    def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
    
    def cancelScheduledNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
    
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = js.native
    def createCategoryAsync(categoryId: String, actions: js.Array[ActionType], previewPlaceholder: String): js.Promise[Unit] = js.native
    
    def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = js.native
    
    def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = js.native
    
    def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = js.native
    
    def dismissAllNotificationsAsync(): js.Promise[Unit] = js.native
    
    def dismissNotificationAsync(notificationId: LocalNotificationId): js.Promise[Unit] = js.native
    
    def getBadgeNumberAsync(): js.Promise[Double] = js.native
    
    def getDevicePushTokenAsync(config: GcmSenderId): js.Promise[Data] = js.native
    
    def getExpoPushTokenAsync(): js.Promise[String] = js.native
    
    def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    
    def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[LocalNotificationId] = js.native
    def scheduleLocalNotificationAsync(notification: LocalNotification, options: IntervalMs): js.Promise[LocalNotificationId] = js.native
    
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = js.native
    def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: Day): js.Promise[String] = js.native
    
    def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: Interval): js.Promise[String] = js.native
    
    def setBadgeNumberAsync(number: Double): js.Promise[Unit] = js.native
  }
}
