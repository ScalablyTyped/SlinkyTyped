package typingsSlinky.expoPermissions

import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionResponse
import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionsMod {
  
  @JSImport("expo-permissions/build/Permissions", "AUDIO_RECORDING")
  @js.native
  val AUDIO_RECORDING: /* "audioRecording" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "CALENDAR")
  @js.native
  val CALENDAR: /* "calendar" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "CAMERA")
  @js.native
  val CAMERA: /* "camera" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "CAMERA_ROLL")
  @js.native
  val CAMERA_ROLL: /* "cameraRoll" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "CONTACTS")
  @js.native
  val CONTACTS: /* "contacts" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "LOCATION")
  @js.native
  val LOCATION: /* "location" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "MOTION")
  @js.native
  val MOTION: /* "motion" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "NOTIFICATIONS")
  @js.native
  val NOTIFICATIONS: /* "notifications" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "PermissionStatus")
  @js.native
  object PermissionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus with String] = js.native
    
    /* "denied" */ val DENIED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED with String = js.native
    
    /* "granted" */ val GRANTED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED with String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED with String = js.native
  }
  
  @JSImport("expo-permissions/build/Permissions", "REMINDERS")
  @js.native
  val REMINDERS: /* "reminders" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "SYSTEM_BRIGHTNESS")
  @js.native
  val SYSTEM_BRIGHTNESS: /* "systemBrightness" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "USER_FACING_NOTIFICATIONS")
  @js.native
  val USER_FACING_NOTIFICATIONS: /* "userFacingNotifications" */ String = js.native
  
  @JSImport("expo-permissions/build/Permissions", "askAsync")
  @js.native
  def askAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  
  @JSImport("expo-permissions/build/Permissions", "getAsync")
  @js.native
  def getAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
}
