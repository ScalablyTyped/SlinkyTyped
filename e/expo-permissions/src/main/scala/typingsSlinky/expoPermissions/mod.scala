package typingsSlinky.expoPermissions

import typingsSlinky.expoPermissions.expoPermissionsStrings.audioRecording
import typingsSlinky.expoPermissions.expoPermissionsStrings.calendar
import typingsSlinky.expoPermissions.expoPermissionsStrings.camera
import typingsSlinky.expoPermissions.expoPermissionsStrings.cameraRoll
import typingsSlinky.expoPermissions.expoPermissionsStrings.contacts
import typingsSlinky.expoPermissions.expoPermissionsStrings.location
import typingsSlinky.expoPermissions.expoPermissionsStrings.notifications
import typingsSlinky.expoPermissions.expoPermissionsStrings.reminders
import typingsSlinky.expoPermissions.expoPermissionsStrings.systemBrightness
import typingsSlinky.expoPermissions.expoPermissionsStrings.userFacingNotifications
import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionResponse
import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val AUDIO_RECORDING: audioRecording = js.native
  val CALENDAR: calendar = js.native
  val CAMERA: camera = js.native
  val CAMERA_ROLL: cameraRoll = js.native
  val CONTACTS: contacts = js.native
  val LOCATION: location = js.native
  val NOTIFICATIONS: notifications = js.native
  val REMINDERS: reminders = js.native
  val SYSTEM_BRIGHTNESS: systemBrightness = js.native
  val USER_FACING_NOTIFICATIONS: userFacingNotifications = js.native
  def askAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  def getAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  @js.native
  object PermissionStatus extends js.Object {
    /* "denied" */ val DENIED: typingsSlinky.expoPermissions.permissionsTypesMod.PermissionStatus.DENIED with String = js.native
    /* "granted" */ val GRANTED: typingsSlinky.expoPermissions.permissionsTypesMod.PermissionStatus.GRANTED with String = js.native
    /* "undetermined" */ val UNDETERMINED: typingsSlinky.expoPermissions.permissionsTypesMod.PermissionStatus.UNDETERMINED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expoPermissions.permissionsTypesMod.PermissionStatus with String] = js.native
  }
  
}

