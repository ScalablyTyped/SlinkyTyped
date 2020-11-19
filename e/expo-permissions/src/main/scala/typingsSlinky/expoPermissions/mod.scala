package typingsSlinky.expoPermissions

import typingsSlinky.expoPermissions.permissionsHooksMod.PermissionsOptions
import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionResponse
import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-permissions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AUDIO_RECORDING: /* "audioRecording" */ String = js.native
  
  val CALENDAR: /* "calendar" */ String = js.native
  
  val CAMERA: /* "camera" */ String = js.native
  
  val CAMERA_ROLL: /* "cameraRoll" */ String = js.native
  
  val CONTACTS: /* "contacts" */ String = js.native
  
  val LOCATION: /* "location" */ String = js.native
  
  val MOTION: /* "motion" */ String = js.native
  
  val NOTIFICATIONS: /* "notifications" */ String = js.native
  
  val REMINDERS: /* "reminders" */ String = js.native
  
  val SYSTEM_BRIGHTNESS: /* "systemBrightness" */ String = js.native
  
  val USER_FACING_NOTIFICATIONS: /* "userFacingNotifications" */ String = js.native
  
  def askAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  
  def getAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  
  def usePermissions(`type`: js.Array[PermissionType]): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  def usePermissions(`type`: js.Array[PermissionType], options: PermissionsOptions): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  def usePermissions(`type`: PermissionType): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  def usePermissions(`type`: PermissionType, options: PermissionsOptions): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  
  @js.native
  object PermissionStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus with String] = js.native
    
    /* "denied" */ val DENIED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED with String = js.native
    
    /* "granted" */ val GRANTED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED with String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED with String = js.native
  }
}
