package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceInfo extends js.Object {
  /** Device model name. */
  var deviceModelName: js.UndefOr[String] = js.native
  /** Device language code setting. */
  var languageCode: js.UndefOr[String] = js.native
  /** Device display resolution height. */
  var screenResolutionHeight: js.UndefOr[String] = js.native
  /** Device display resolution width. */
  var screenResolutionWidth: js.UndefOr[String] = js.native
  /** Device timezone setting. */
  var timezone: js.UndefOr[String] = js.native
}

object DeviceInfo {
  @scala.inline
  def apply(): DeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInfo]
  }
  @scala.inline
  implicit class DeviceInfoOps[Self <: DeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceModelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModelName")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenResolutionHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenResolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenResolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenResolutionWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenResolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenResolutionWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
  }
  
}

