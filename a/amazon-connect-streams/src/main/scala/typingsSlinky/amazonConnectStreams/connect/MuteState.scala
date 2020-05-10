package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuteState extends js.Object {
  var muted: Boolean = js.native
}

object MuteState {
  @scala.inline
  def apply(muted: Boolean): MuteState = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteState]
  }
  @scala.inline
  implicit class MuteStateOps[Self <: MuteState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

