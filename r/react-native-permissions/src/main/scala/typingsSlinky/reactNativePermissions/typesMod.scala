package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNativePermissions.permissionsAndroidMod.AndroidPermissionMap
import typingsSlinky.reactNativePermissions.permissionsIosMod.IOSPermissionMap
import typingsSlinky.reactNativePermissions.permissionsWindowsMod.WindowsPermissionMap
import typingsSlinky.reactNativePermissions.resultsMod.ResultMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AndroidPermission = Values[AndroidPermissionMap]
  
  type IOSPermission = Values[IOSPermissionMap]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.full
    - typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.reduced
  */
  trait LocationAccuracy extends StObject
  object LocationAccuracy {
    
    @scala.inline
    def full: typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.full = "full".asInstanceOf[typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.full]
    
    @scala.inline
    def reduced: typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.reduced = "reduced".asInstanceOf[typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.reduced]
  }
  
  @js.native
  trait LocationAccuracyOptions extends StObject {
    
    var purposeKey: String = js.native
  }
  object LocationAccuracyOptions {
    
    @scala.inline
    def apply(purposeKey: String): LocationAccuracyOptions = {
      val __obj = js.Dynamic.literal(purposeKey = purposeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationAccuracyOptions]
    }
    
    @scala.inline
    implicit class LocationAccuracyOptionsMutableBuilder[Self <: LocationAccuracyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPurposeKey(value: String): Self = StObject.set(x, "purposeKey", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.alert
    - typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.badge
    - typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.sound
    - typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.carPlay
    - typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.criticalAlert
    - typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.provisional
  */
  trait NotificationOption extends StObject
  object NotificationOption {
    
    @scala.inline
    def alert: typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.alert = "alert".asInstanceOf[typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.alert]
    
    @scala.inline
    def badge: typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.badge = "badge".asInstanceOf[typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.badge]
    
    @scala.inline
    def carPlay: typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.carPlay = "carPlay".asInstanceOf[typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.carPlay]
    
    @scala.inline
    def criticalAlert: typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.criticalAlert = "criticalAlert".asInstanceOf[typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.criticalAlert]
    
    @scala.inline
    def provisional: typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.provisional = "provisional".asInstanceOf[typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.provisional]
    
    @scala.inline
    def sound: typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.sound = "sound".asInstanceOf[typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.sound]
  }
  
  @js.native
  trait NotificationSettings extends StObject {
    
    var alert: js.UndefOr[Boolean] = js.native
    
    var badge: js.UndefOr[Boolean] = js.native
    
    var carPlay: js.UndefOr[Boolean] = js.native
    
    var criticalAlert: js.UndefOr[Boolean] = js.native
    
    var lockScreen: js.UndefOr[Boolean] = js.native
    
    var notificationCenter: js.UndefOr[Boolean] = js.native
    
    var provisional: js.UndefOr[Boolean] = js.native
    
    var sound: js.UndefOr[Boolean] = js.native
  }
  object NotificationSettings {
    
    @scala.inline
    def apply(): NotificationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationSettings]
    }
    
    @scala.inline
    implicit class NotificationSettingsMutableBuilder[Self <: NotificationSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setCarPlay(value: Boolean): Self = StObject.set(x, "carPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarPlayUndefined: Self = StObject.set(x, "carPlay", js.undefined)
      
      @scala.inline
      def setCriticalAlert(value: Boolean): Self = StObject.set(x, "criticalAlert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCriticalAlertUndefined: Self = StObject.set(x, "criticalAlert", js.undefined)
      
      @scala.inline
      def setLockScreen(value: Boolean): Self = StObject.set(x, "lockScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockScreenUndefined: Self = StObject.set(x, "lockScreen", js.undefined)
      
      @scala.inline
      def setNotificationCenter(value: Boolean): Self = StObject.set(x, "notificationCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationCenterUndefined: Self = StObject.set(x, "notificationCenter", js.undefined)
      
      @scala.inline
      def setProvisional(value: Boolean): Self = StObject.set(x, "provisional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionalUndefined: Self = StObject.set(x, "provisional", js.undefined)
      
      @scala.inline
      def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    }
  }
  
  @js.native
  trait NotificationsResponse extends StObject {
    
    var settings: NotificationSettings = js.native
    
    var status: PermissionStatus = js.native
  }
  object NotificationsResponse {
    
    @scala.inline
    def apply(settings: NotificationSettings, status: PermissionStatus): NotificationsResponse = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationsResponse]
    }
    
    @scala.inline
    implicit class NotificationsResponseMutableBuilder[Self <: NotificationsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSettings(value: NotificationSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: PermissionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type Permission = AndroidPermission | IOSPermission | WindowsPermission
  
  type PermissionStatus = Values[ResultMap]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type WindowsPermission = Values[WindowsPermissionMap]
}
