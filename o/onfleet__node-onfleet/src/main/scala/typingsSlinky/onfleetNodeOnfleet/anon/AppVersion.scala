package typingsSlinky.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppVersion extends js.Object {
  var appVersion: String = js.native
  var batteryLevel: Double = js.native
  var deviceDescription: String = js.native
  var platform: String = js.native
}

object AppVersion {
  @scala.inline
  def apply(appVersion: String, batteryLevel: Double, deviceDescription: String, platform: String): AppVersion = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], batteryLevel = batteryLevel.asInstanceOf[js.Any], deviceDescription = deviceDescription.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppVersion]
  }
  @scala.inline
  implicit class AppVersionOps[Self <: AppVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatteryLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

