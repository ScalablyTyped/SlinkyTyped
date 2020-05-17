package typingsSlinky.ismobilejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blackberry extends js.Object {
  var blackberry: Boolean = js.native
  var blackberry10: Boolean = js.native
  var chrome: Boolean = js.native
  var device: Boolean = js.native
  var firefox: Boolean = js.native
  var opera: Boolean = js.native
}

object Blackberry {
  @scala.inline
  def apply(
    blackberry: Boolean,
    blackberry10: Boolean,
    chrome: Boolean,
    device: Boolean,
    firefox: Boolean,
    opera: Boolean
  ): Blackberry = {
    val __obj = js.Dynamic.literal(blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blackberry]
  }
  @scala.inline
  implicit class BlackberryOps[Self <: Blackberry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opera")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

