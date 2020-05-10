package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OS extends js.Object {
  var android: Boolean = js.native
  var androidNative: Boolean = js.native
     // Android native browser
  var iOS: Boolean = js.native
  var iPad: Boolean = js.native
  var iPhone: Boolean = js.native
  var mac: Boolean = js.native
  var mobile: Boolean = js.native
  var version: Version = js.native
  var windows: Boolean = js.native
}

object OS {
  @scala.inline
  def apply(
    android: Boolean,
    androidNative: Boolean,
    iOS: Boolean,
    iPad: Boolean,
    iPhone: Boolean,
    mac: Boolean,
    mobile: Boolean,
    version: Version,
    windows: Boolean
  ): OS = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], androidNative = androidNative.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], iPad = iPad.asInstanceOf[js.Any], iPhone = iPhone.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[OS]
  }
  @scala.inline
  implicit class OSOps[Self <: OS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIOS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

