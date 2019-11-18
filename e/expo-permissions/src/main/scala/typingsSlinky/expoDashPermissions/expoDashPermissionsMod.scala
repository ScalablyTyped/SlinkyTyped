package typingsSlinky.expoDashPermissions

import typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionResponse
import typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionType
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.audioRecording
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.calendar
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.camera
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.cameraRoll
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.contacts
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.location
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.notifications
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.reminders
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.systemBrightness
import typingsSlinky.expoDashPermissions.expoDashPermissionsStrings.userFacingNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions", JSImport.Namespace)
@js.native
object expoDashPermissionsMod extends js.Object {
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
    /* "denied" */ val DENIED: typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.DENIED with String = js.native
    /* "granted" */ val GRANTED: typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.GRANTED with String = js.native
    /* "undetermined" */ val UNDETERMINED: typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.UNDETERMINED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus with String
      ] = js.native
  }
  
}

