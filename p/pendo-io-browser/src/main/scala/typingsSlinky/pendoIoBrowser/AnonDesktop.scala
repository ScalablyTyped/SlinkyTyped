package typingsSlinky.pendoIoBrowser

import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.desktop
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDesktop extends js.Object {
  var desktop: Boolean = js.native
  var mobile: Boolean = js.native
  var `type`: desktop | mobile = js.native
}

object AnonDesktop {
  @scala.inline
  def apply(desktop: Boolean, mobile: Boolean, `type`: desktop | mobile): AnonDesktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDesktop]
  }
  @scala.inline
  implicit class AnonDesktopOps[Self <: AnonDesktop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: desktop | mobile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

