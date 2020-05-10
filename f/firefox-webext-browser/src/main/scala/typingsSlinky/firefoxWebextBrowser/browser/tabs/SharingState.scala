package typingsSlinky.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tab sharing state for screen, microphone and camera. */
@js.native
trait SharingState extends js.Object {
  /** True if the tab is using the camera. */
  var camera: Boolean = js.native
  /** True if the tab is using the microphone. */
  var microphone: Boolean = js.native
  /**
    * If the tab is sharing the screen the value will be one of "Screen", "Window", or "Application", or undefined
    * if not screen sharing.
    */
  var screen: js.UndefOr[String] = js.native
}

object SharingState {
  @scala.inline
  def apply(camera: Boolean, microphone: Boolean): SharingState = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingState]
  }
  @scala.inline
  implicit class SharingStateOps[Self <: SharingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMicrophone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(js.undefined)
        ret
    }
  }
  
}

