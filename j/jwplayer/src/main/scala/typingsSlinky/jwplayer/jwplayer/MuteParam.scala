package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuteParam extends js.Object {
  var mute: Boolean = js.native
}

object MuteParam {
  @scala.inline
  def apply(mute: Boolean): MuteParam = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteParam]
  }
  @scala.inline
  implicit class MuteParamOps[Self <: MuteParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

