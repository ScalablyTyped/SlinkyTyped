package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.KeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalProperties extends js.Object {
  /** @deprecated Unknown platform name */
  var additionalProperties: js.UndefOr[String] = js.native
  var android: js.UndefOr[String] = js.native
  var chromeos: js.UndefOr[String] = js.native
  var default: js.UndefOr[KeyName] = js.native
  var ios: js.UndefOr[String] = js.native
  var linux: js.UndefOr[KeyName] = js.native
  var mac: js.UndefOr[KeyName] = js.native
  var windows: js.UndefOr[KeyName] = js.native
}

object AdditionalProperties {
  @scala.inline
  def apply(): AdditionalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalProperties]
  }
  @scala.inline
  implicit class AdditionalPropertiesOps[Self <: AdditionalProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withChromeos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeos")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: KeyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withIos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
    @scala.inline
    def withLinux(value: KeyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinux: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(js.undefined)
        ret
    }
    @scala.inline
    def withMac(value: KeyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(js.undefined)
        ret
    }
    @scala.inline
    def withWindows(value: KeyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(js.undefined)
        ret
    }
  }
  
}

