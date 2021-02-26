package typingsSlinky.expoPermissions

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expoPermissions.expoPermissionsStrings.all
import typingsSlinky.expoPermissions.expoPermissionsStrings.always
import typingsSlinky.expoPermissions.expoPermissionsStrings.coarse
import typingsSlinky.expoPermissions.expoPermissionsStrings.fine
import typingsSlinky.expoPermissions.expoPermissionsStrings.limited
import typingsSlinky.expoPermissions.expoPermissionsStrings.none
import typingsSlinky.expoPermissions.expoPermissionsStrings.whenInUse
import typingsSlinky.unimodulesPermissionsInterface.mod.PermissionExpiration
import typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionsTypesMod {
  
  @JSImport("expo-permissions/build/Permissions.types", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus with String] = js.native
    
    /* "denied" */ val DENIED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED with String = js.native
    
    /* "granted" */ val GRANTED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED with String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED with String = js.native
  }
  
  @js.native
  trait PermissionDetailsLocationAndroid extends StObject {
    
    var accuracy: fine | coarse | none = js.native
  }
  object PermissionDetailsLocationAndroid {
    
    @scala.inline
    def apply(accuracy: fine | coarse | none): PermissionDetailsLocationAndroid = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionDetailsLocationAndroid]
    }
    
    @scala.inline
    implicit class PermissionDetailsLocationAndroidMutableBuilder[Self <: PermissionDetailsLocationAndroid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccuracy(value: fine | coarse | none): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PermissionInfo
    extends typingsSlinky.unimodulesPermissionsInterface.mod.PermissionResponse {
    
    var accessPrivileges: js.UndefOr[all | limited | none] = js.native
    
    var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.native
    
    var scope: js.UndefOr[whenInUse | always | none] = js.native
  }
  object PermissionInfo {
    
    @scala.inline
    def apply(canAskAgain: Boolean, expires: PermissionExpiration, granted: Boolean, status: PermissionStatus): PermissionInfo = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionInfo]
    }
    
    @scala.inline
    implicit class PermissionInfoMutableBuilder[Self <: PermissionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPrivileges(value: all | limited | none): Self = StObject.set(x, "accessPrivileges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPrivilegesUndefined: Self = StObject.set(x, "accessPrivileges", js.undefined)
      
      @scala.inline
      def setAndroid(value: PermissionDetailsLocationAndroid): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      @scala.inline
      def setScope(value: whenInUse | always | none): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  type PermissionMap = StringDictionary[PermissionInfo]
  
  @js.native
  trait PermissionResponse
    extends typingsSlinky.unimodulesPermissionsInterface.mod.PermissionResponse {
    
    var permissions: PermissionMap = js.native
  }
  object PermissionResponse {
    
    @scala.inline
    def apply(
      canAskAgain: Boolean,
      expires: PermissionExpiration,
      granted: Boolean,
      permissions: PermissionMap,
      status: PermissionStatus
    ): PermissionResponse = {
      val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionResponse]
    }
    
    @scala.inline
    implicit class PermissionResponseMutableBuilder[Self <: PermissionResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPermissions(value: PermissionMap): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expoPermissions.expoPermissionsStrings.camera
    - typingsSlinky.expoPermissions.expoPermissionsStrings.cameraRoll
    - typingsSlinky.expoPermissions.expoPermissionsStrings.audioRecording
    - typingsSlinky.expoPermissions.expoPermissionsStrings.location
    - typingsSlinky.expoPermissions.expoPermissionsStrings.userFacingNotifications
    - typingsSlinky.expoPermissions.expoPermissionsStrings.notifications
    - typingsSlinky.expoPermissions.expoPermissionsStrings.contacts
    - typingsSlinky.expoPermissions.expoPermissionsStrings.calendar
    - typingsSlinky.expoPermissions.expoPermissionsStrings.reminders
    - typingsSlinky.expoPermissions.expoPermissionsStrings.motion
    - typingsSlinky.expoPermissions.expoPermissionsStrings.systemBrightness
  */
  trait PermissionType extends StObject
  object PermissionType {
    
    @scala.inline
    def audioRecording: typingsSlinky.expoPermissions.expoPermissionsStrings.audioRecording = "audioRecording".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.audioRecording]
    
    @scala.inline
    def calendar: typingsSlinky.expoPermissions.expoPermissionsStrings.calendar = "calendar".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.calendar]
    
    @scala.inline
    def camera: typingsSlinky.expoPermissions.expoPermissionsStrings.camera = "camera".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.camera]
    
    @scala.inline
    def cameraRoll: typingsSlinky.expoPermissions.expoPermissionsStrings.cameraRoll = "cameraRoll".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.cameraRoll]
    
    @scala.inline
    def contacts: typingsSlinky.expoPermissions.expoPermissionsStrings.contacts = "contacts".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.contacts]
    
    @scala.inline
    def location: typingsSlinky.expoPermissions.expoPermissionsStrings.location = "location".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.location]
    
    @scala.inline
    def motion: typingsSlinky.expoPermissions.expoPermissionsStrings.motion = "motion".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.motion]
    
    @scala.inline
    def notifications: typingsSlinky.expoPermissions.expoPermissionsStrings.notifications = "notifications".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.notifications]
    
    @scala.inline
    def reminders: typingsSlinky.expoPermissions.expoPermissionsStrings.reminders = "reminders".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.reminders]
    
    @scala.inline
    def systemBrightness: typingsSlinky.expoPermissions.expoPermissionsStrings.systemBrightness = "systemBrightness".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.systemBrightness]
    
    @scala.inline
    def userFacingNotifications: typingsSlinky.expoPermissions.expoPermissionsStrings.userFacingNotifications = "userFacingNotifications".asInstanceOf[typingsSlinky.expoPermissions.expoPermissionsStrings.userFacingNotifications]
  }
}
