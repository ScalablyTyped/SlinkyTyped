package typingsSlinky.chromeApps.chrome.audio

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioDeviceInfo extends js.Object {
  /** Device name. */
  var deviceName: String = js.native
  /** Type of the device. */
  var deviceType: DeviceType = js.native
  /** The user-friendly name (e.g. 'USB Microphone'). */
  var displayName: String = js.native
  /** The unique identifier of the audio device. */
  var id: String = js.native
  /** True if this is the current active device. */
  var isActive: Boolean = js.native
  /** The sound level of the device, volume for output, gain for input. */
  var level: integer = js.native
  /** The stable/persisted device id string when available. */
  var stableDeviceId: js.UndefOr[String] = js.native
  /** Stream type associated with this device. */
  var streamType: StreamType = js.native
}

object AudioDeviceInfo {
  @scala.inline
  def apply(
    deviceName: String,
    deviceType: DeviceType,
    displayName: String,
    id: String,
    isActive: Boolean,
    level: integer,
    streamType: StreamType
  ): AudioDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDeviceInfo]
  }
  @scala.inline
  implicit class AudioDeviceInfoOps[Self <: AudioDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceType(value: DeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamType(value: StreamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStableDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stableDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStableDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stableDeviceId")(js.undefined)
        ret
    }
  }
  
}

