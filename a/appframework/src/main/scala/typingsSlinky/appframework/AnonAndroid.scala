package typingsSlinky.appframework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAndroid extends js.Object {
  var android: Boolean = js.native
  var androidICS: Boolean = js.native
  var blackberry: Boolean = js.native
  var blackberry10: Boolean = js.native
  var chrome: Boolean = js.native
  var fennec: Boolean = js.native
  var ie: Boolean = js.native
  var ieTouch: Boolean = js.native
  var ios: Boolean = js.native
  var ios7: Boolean = js.native
  var ipad: Boolean = js.native
  var iphone: Boolean = js.native
  var opera: Boolean = js.native
  var playbook: Boolean = js.native
  var supportsTouch: Boolean = js.native
  var touchpad: Boolean = js.native
  var webkit: Boolean = js.native
  var webos: Boolean = js.native
}

object AnonAndroid {
  @scala.inline
  def apply(
    android: Boolean,
    androidICS: Boolean,
    blackberry: Boolean,
    blackberry10: Boolean,
    chrome: Boolean,
    fennec: Boolean,
    ie: Boolean,
    ieTouch: Boolean,
    ios: Boolean,
    ios7: Boolean,
    ipad: Boolean,
    iphone: Boolean,
    opera: Boolean,
    playbook: Boolean,
    supportsTouch: Boolean,
    touchpad: Boolean,
    webkit: Boolean,
    webos: Boolean
  ): AnonAndroid = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], androidICS = androidICS.asInstanceOf[js.Any], blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], fennec = fennec.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], ieTouch = ieTouch.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], ios7 = ios7.asInstanceOf[js.Any], ipad = ipad.asInstanceOf[js.Any], iphone = iphone.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], playbook = playbook.asInstanceOf[js.Any], supportsTouch = supportsTouch.asInstanceOf[js.Any], touchpad = touchpad.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any], webos = webos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndroid]
  }
  @scala.inline
  implicit class AnonAndroidOps[Self <: AnonAndroid] (val x: Self) extends AnyVal {
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
    def withAndroidICS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidICS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlackberry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackberry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlackberry10(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackberry10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFennec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fennec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIeTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIos7(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIphone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaybook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchpad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

