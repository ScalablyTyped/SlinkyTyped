package typingsSlinky.screenfull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawEventNames extends js.Object {
  val exitFullscreen: String = js.native
  val fullscreenElement: String = js.native
  val fullscreenEnabled: String = js.native
  val fullscreenchange: String = js.native
  val fullscreenerror: String = js.native
  val requestFullscreen: String = js.native
}

object RawEventNames {
  @scala.inline
  def apply(
    exitFullscreen: String,
    fullscreenElement: String,
    fullscreenEnabled: String,
    fullscreenchange: String,
    fullscreenerror: String,
    requestFullscreen: String
  ): RawEventNames = {
    val __obj = js.Dynamic.literal(exitFullscreen = exitFullscreen.asInstanceOf[js.Any], fullscreenElement = fullscreenElement.asInstanceOf[js.Any], fullscreenEnabled = fullscreenEnabled.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], requestFullscreen = requestFullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawEventNames]
  }
  @scala.inline
  implicit class RawEventNamesOps[Self <: RawEventNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExitFullscreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenEnabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenchange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreenerror(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestFullscreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

