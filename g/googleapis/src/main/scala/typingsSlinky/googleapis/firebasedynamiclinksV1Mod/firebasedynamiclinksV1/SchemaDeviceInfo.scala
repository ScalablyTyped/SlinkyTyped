package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals associated with the device making the request.
  */
@js.native
trait SchemaDeviceInfo extends js.Object {
  /**
    * Device model name.
    */
  var deviceModelName: js.UndefOr[String] = js.native
  /**
    * Device language code setting.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Device language code setting obtained by executing JavaScript code in
    * WebView.
    */
  var languageCodeFromWebview: js.UndefOr[String] = js.native
  /**
    * Device language code raw setting. iOS does returns language code in
    * different format than iOS WebView. For example WebView returns en_US, but
    * iOS returns en-US. Field below will return raw value returned by iOS.
    */
  var languageCodeRaw: js.UndefOr[String] = js.native
  /**
    * Device display resolution height.
    */
  var screenResolutionHeight: js.UndefOr[String] = js.native
  /**
    * Device display resolution width.
    */
  var screenResolutionWidth: js.UndefOr[String] = js.native
  /**
    * Device timezone setting.
    */
  var timezone: js.UndefOr[String] = js.native
}

object SchemaDeviceInfo {
  @scala.inline
  def apply(): SchemaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceInfo]
  }
  @scala.inline
  implicit class SchemaDeviceInfoOps[Self <: SchemaDeviceInfo] (val x: Self) extends AnyVal {
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
    def withLanguageCodeFromWebview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodeFromWebview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCodeFromWebview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodeFromWebview")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCodeRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodeRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCodeRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodeRaw")(js.undefined)
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

