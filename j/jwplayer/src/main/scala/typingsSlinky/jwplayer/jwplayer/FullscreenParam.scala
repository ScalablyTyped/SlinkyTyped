package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenParam extends js.Object {
  var fullscreen: Boolean = js.native
}

object FullscreenParam {
  @scala.inline
  def apply(fullscreen: Boolean): FullscreenParam = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullscreenParam]
  }
  @scala.inline
  implicit class FullscreenParamOps[Self <: FullscreenParam] (val x: Self) extends AnyVal {
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

