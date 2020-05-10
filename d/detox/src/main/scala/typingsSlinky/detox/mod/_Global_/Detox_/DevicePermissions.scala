package typingsSlinky.detox.mod._Global_.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Source for string definitions is https://github.com/wix/AppleSimulatorUtils
  */
@js.native
trait DevicePermissions extends js.Object {
  var calendar: js.UndefOr[CalendarPermission] = js.native
  var camera: js.UndefOr[CameraPermission] = js.native
  var contacts: js.UndefOr[ContactsPermission] = js.native
  var health: js.UndefOr[HealthPermission] = js.native
  var homekit: js.UndefOr[HomekitPermission] = js.native
  var location: js.UndefOr[LocationPermission] = js.native
  var medialibrary: js.UndefOr[MediaLibraryPermission] = js.native
  var microphone: js.UndefOr[MicrophonePermission] = js.native
  var motion: js.UndefOr[MotionPermission] = js.native
  var notifications: js.UndefOr[NotificationsPermission] = js.native
  var photos: js.UndefOr[PhotosPermission] = js.native
  var reminders: js.UndefOr[RemindersPermission] = js.native
  var siri: js.UndefOr[SiriPermission] = js.native
  var speech: js.UndefOr[SpeechPermission] = js.native
}

object DevicePermissions {
  @scala.inline
  def apply(): DevicePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePermissions]
  }
  @scala.inline
  implicit class DevicePermissionsOps[Self <: DevicePermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: CalendarPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera(value: CameraPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withContacts(value: ContactsPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(js.undefined)
        ret
    }
    @scala.inline
    def withHealth(value: HealthPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(js.undefined)
        ret
    }
    @scala.inline
    def withHomekit(value: HomekitPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homekit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomekit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homekit")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: LocationPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMedialibrary(value: MediaLibraryPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medialibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedialibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medialibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrophone(value: MicrophonePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrophone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphone")(js.undefined)
        ret
    }
    @scala.inline
    def withMotion(value: MotionPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifications(value: NotificationsPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotos(value: PhotosPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(js.undefined)
        ret
    }
    @scala.inline
    def withReminders(value: RemindersPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminders")(js.undefined)
        ret
    }
    @scala.inline
    def withSiri(value: SiriPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siri")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeech(value: SpeechPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speech")(js.undefined)
        ret
    }
  }
  
}

