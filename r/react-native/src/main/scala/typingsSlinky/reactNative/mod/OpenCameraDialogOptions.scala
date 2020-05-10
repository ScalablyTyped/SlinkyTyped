package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenCameraDialogOptions extends js.Object {
  /** Defaults to false */
  var videoMode: js.UndefOr[Boolean] = js.native
}

object OpenCameraDialogOptions {
  @scala.inline
  def apply(): OpenCameraDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenCameraDialogOptions]
  }
  @scala.inline
  implicit class OpenCameraDialogOptionsOps[Self <: OpenCameraDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideoMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoMode")(js.undefined)
        ret
    }
  }
  
}

