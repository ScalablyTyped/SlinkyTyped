package typingsSlinky.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFullscreen extends js.Object {
  var fullscreen: Boolean = js.native
}

object AnonFullscreen {
  @scala.inline
  def apply(fullscreen: Boolean): AnonFullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullscreen]
  }
  @scala.inline
  implicit class AnonFullscreenOps[Self <: AnonFullscreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

