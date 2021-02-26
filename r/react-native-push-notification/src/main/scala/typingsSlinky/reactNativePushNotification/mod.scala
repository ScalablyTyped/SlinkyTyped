package typingsSlinky.reactNativePushNotification

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.reactNativePushNotification.anon.Id
import typingsSlinky.reactNativePushNotification.anon.Os
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.`private`
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.alert
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.badge
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.day
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.high
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.hour
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.low
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.max
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.min
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.minute
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.none
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.public
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.secret
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.sound
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.time
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.unspecified
import typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-push-notification", JSImport.Default)
  @js.native
  val default: PushNotification = js.native
  
  @JSImport("react-native-push-notification", "ChannelObject")
  @js.native
  class ChannelObject () extends StObject {
    
    var channelDescription: js.UndefOr[String] = js.native
    
    var channelId: String = js.native
    
    var channelName: String = js.native
    
    var importance: js.UndefOr[Double] = js.native
    
    var soundName: js.UndefOr[String] = js.native
    
    var vibrate: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("react-native-push-notification", "PushNotificationDeliveredObject")
  @js.native
  class PushNotificationDeliveredObject () extends StObject {
    
    var body: String = js.native
    
    var group: String = js.native
    
    var identifier: String = js.native
    
    var tag: String = js.native
    
    var title: String = js.native
  }
  
  @JSImport("react-native-push-notification", "PushNotificationObject")
  @js.native
  class PushNotificationObject () extends StObject {
    
    var actions: js.UndefOr[String] = js.native
    
    /* iOS only properties */
    var alertAction: js.UndefOr[js.Any] = js.native
    
    var allowWhileIdle: js.UndefOr[Boolean] = js.native
    
    var autoCancel: js.UndefOr[Boolean] = js.native
    
    var bigPictureUrl: js.UndefOr[String] = js.native
    
    var bigText: js.UndefOr[String] = js.native
    
    var category: js.UndefOr[js.Any] = js.native
    
    var channelId: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var group: js.UndefOr[String] = js.native
    
    var groupSummary: js.UndefOr[Boolean] = js.native
    
    /* iOS and Android properties */
    var id: js.UndefOr[Double] = js.native
    
    var ignoreInForeground: js.UndefOr[Boolean] = js.native
    
    var importance: js.UndefOr[
        typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.default | max | high | low | min | none | unspecified
      ] = js.native
    
    var invokeApp: js.UndefOr[Boolean] = js.native
    
    var largeIcon: js.UndefOr[String] = js.native
    
    var largeIconUrl: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    var messageId: js.UndefOr[String] = js.native
    
    var number: js.UndefOr[String | Double] = js.native
    
    var ongoing: js.UndefOr[Boolean] = js.native
    
    var onlyAlertOnce: js.UndefOr[Boolean] = js.native
    
    var playSound: js.UndefOr[Boolean] = js.native
    
    var priority: js.UndefOr[
        max | high | low | min | typingsSlinky.reactNativePushNotification.reactNativePushNotificationStrings.default
      ] = js.native
    
    var repeatTime: js.UndefOr[Double] = js.native
    
    var repeatType: js.UndefOr[week | day | hour | minute | time] = js.native
    
    var shortcutId: js.UndefOr[String] = js.native
    
    var showWhen: js.UndefOr[Boolean] = js.native
    
    var smallIcon: js.UndefOr[String] = js.native
    
    var soundName: js.UndefOr[String] = js.native
    
    var subText: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    /* Android only properties */
    var ticker: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var userInfo: js.UndefOr[js.Any] = js.native
    
    var vibrate: js.UndefOr[Boolean] = js.native
    
    var vibration: js.UndefOr[Double] = js.native
    
    var visibility: js.UndefOr[`private` | public | secret] = js.native
  }
  
  @JSImport("react-native-push-notification", "PushNotificationScheduleObject")
  @js.native
  class PushNotificationScheduleObject () extends PushNotificationObject {
    
    var date: js.Date = js.native
  }
  
  @JSImport("react-native-push-notification", "PushNotificationScheduledLocalObject")
  @js.native
  class PushNotificationScheduledLocalObject () extends StObject {
    
    var body: String = js.native
    
    var date: js.Date = js.native
    
    var id: Double = js.native
    
    var number: Double = js.native
    
    var repeatInterval: Double = js.native
    
    var soundName: String = js.native
    
    var title: String = js.native
  }
  
  @js.native
  trait PushNotification extends StObject {
    
    def abandonPermissions(): Unit = js.native
    
    var alert: js.Object = js.native
    
    var badge: Double = js.native
    
    def cancelAllLocalNotifications(): Unit = js.native
    
    def cancelLocalNotifications(details: Id): Unit = js.native
    
    def channelBlocked(channel_id: String, callback: js.Function1[/* blocked */ Boolean, Unit]): Unit = js.native
    
    def channelExists(channel_id: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    def checkPermissions(callback: js.Function1[/* permissions */ PushNotificationPermissions, Unit]): Unit = js.native
    
    def clearAllNotifications(): Unit = js.native
    
    def clearLocalNotification(tag: String, notificationID: Double): Unit = js.native
    
    def configure(options: PushNotificationOptions): Unit = js.native
    
    def createChannel(channel: ChannelObject, callback: js.Function1[/* created */ Boolean, Unit]): Unit = js.native
    
    var data: js.Object = js.native
    
    def deleteChannel(channel_id: String): Unit = js.native
    
    def finish(fetchResult: String): Unit = js.native
    
    var foreground: Boolean = js.native
    
    def getApplicationIconBadgeNumber(callback: js.Function1[/* badgeCount */ Double, Unit]): Unit = js.native
    
    def getChannels(callback: js.Function1[/* channel_ids */ js.Array[String], Unit]): Unit = js.native
    
    def getDeliveredNotifications(callback: js.Function1[/* notifications */ js.Array[PushNotificationDeliveredObject], Unit]): Unit = js.native
    
    def getScheduledLocalNotifications(callback: js.Function1[/* notifications */ js.Array[PushNotificationScheduledLocalObject], Unit]): Unit = js.native
    
    var id: Double = js.native
    
    def invokeApp(notification: PushNotificationObject): Unit = js.native
    
    def localNotification(notification: PushNotificationObject): Unit = js.native
    
    def localNotificationSchedule(notification: PushNotificationScheduleObject): Unit = js.native
    
    var message: String | js.Object = js.native
    
    def popInitialNotification(callback: js.Function1[/* notification */ this.type | Null, Unit]): Unit = js.native
    
    def presentLocalNotification(notification: PushNotificationObject): Unit = js.native
    
    def removeAllDeliveredNotifications(): Unit = js.native
    
    def removeDeliveredNotifications(identifiers: js.Array[String]): Unit = js.native
    
    def requestPermissions(): js.Promise[PushNotificationPermissions] = js.native
    def requestPermissions(permissions: js.Array[alert | badge | sound]): js.Promise[PushNotificationPermissions] = js.native
    
    def scheduleLocalNotification(notification: PushNotificationScheduleObject): Unit = js.native
    
    def setApplicationIconBadgeNumber(badgeCount: Double): Unit = js.native
    
    var sound: String = js.native
    
    var subText: js.UndefOr[String] = js.native
    
    def subscribeToTopic(topic: String): Unit = js.native
    
    def unregister(): Unit = js.native
    
    def unsubscribeFromTopic(topic: String): Unit = js.native
    
    var userInteraction: Boolean = js.native
  }
  
  @js.native
  trait PushNotificationOptions extends StObject {
    
    var onAction: js.UndefOr[js.Function1[/* notification */ PushNotification, Unit]] = js.native
    
    var onNotification: js.UndefOr[js.Function1[/* notification */ PushNotification, Unit]] = js.native
    
    var onRegister: js.UndefOr[js.Function1[/* token */ Os, Unit]] = js.native
    
    var onRegistrationError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
    
    var onRemoteFetch: js.UndefOr[js.Function1[/* notificationData */ js.Any, Unit]] = js.native
    
    var permissions: js.UndefOr[PushNotificationPermissions] = js.native
    
    var popInitialNotification: js.UndefOr[Boolean] = js.native
    
    var requestPermissions: js.UndefOr[Boolean] = js.native
  }
  object PushNotificationOptions {
    
    @scala.inline
    def apply(): PushNotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushNotificationOptions]
    }
    
    @scala.inline
    implicit class PushNotificationOptionsMutableBuilder[Self <: PushNotificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnAction(value: /* notification */ PushNotification => Unit): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
      
      @scala.inline
      def setOnNotification(value: /* notification */ PushNotification => Unit): Self = StObject.set(x, "onNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNotificationUndefined: Self = StObject.set(x, "onNotification", js.undefined)
      
      @scala.inline
      def setOnRegister(value: /* token */ Os => Unit): Self = StObject.set(x, "onRegister", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRegisterUndefined: Self = StObject.set(x, "onRegister", js.undefined)
      
      @scala.inline
      def setOnRegistrationError(value: /* error */ js.Any => Unit): Self = StObject.set(x, "onRegistrationError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRegistrationErrorUndefined: Self = StObject.set(x, "onRegistrationError", js.undefined)
      
      @scala.inline
      def setOnRemoteFetch(value: /* notificationData */ js.Any => Unit): Self = StObject.set(x, "onRemoteFetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoteFetchUndefined: Self = StObject.set(x, "onRemoteFetch", js.undefined)
      
      @scala.inline
      def setPermissions(value: PushNotificationPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setPopInitialNotification(value: Boolean): Self = StObject.set(x, "popInitialNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopInitialNotificationUndefined: Self = StObject.set(x, "popInitialNotification", js.undefined)
      
      @scala.inline
      def setRequestPermissions(value: Boolean): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
    }
  }
  
  @js.native
  trait PushNotificationPermissions extends StObject {
    
    var alert: js.UndefOr[Boolean] = js.native
    
    var badge: js.UndefOr[Boolean] = js.native
    
    var sound: js.UndefOr[Boolean] = js.native
  }
  object PushNotificationPermissions {
    
    @scala.inline
    def apply(): PushNotificationPermissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushNotificationPermissions]
    }
    
    @scala.inline
    implicit class PushNotificationPermissionsMutableBuilder[Self <: PushNotificationPermissions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    }
  }
  
  type _To = PushNotification
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PushNotification = default
}
