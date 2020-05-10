package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppMode extends js.Object {
  var appMode: Boolean = js.native
  var browser: String = js.native
  var device: String = js.native
  var flatVersion: Double = js.native
  var majorVersion: String = js.native
  var minorVersion: String = js.native
  var name: String = js.native
  var tablet: js.Any = js.native
}

object AnonAppMode {
  @scala.inline
  def apply(
    appMode: Boolean,
    browser: String,
    device: String,
    flatVersion: Double,
    majorVersion: String,
    minorVersion: String,
    name: String,
    tablet: js.Any
  ): AnonAppMode = {
    val __obj = js.Dynamic.literal(appMode = appMode.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], flatVersion = flatVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppMode]
  }
  @scala.inline
  implicit class AnonAppModeOps[Self <: AnonAppMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlatVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTablet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

