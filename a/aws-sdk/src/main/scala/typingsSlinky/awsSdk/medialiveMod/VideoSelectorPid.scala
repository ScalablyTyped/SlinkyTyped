package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSelectorPid extends js.Object {
  /**
    * Selects a specific PID from within a video source.
    */
  var Pid: js.UndefOr[integerMin0Max8191] = js.native
}

object VideoSelectorPid {
  @scala.inline
  def apply(): VideoSelectorPid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorPid]
  }
  @scala.inline
  implicit class VideoSelectorPidOps[Self <: VideoSelectorPid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPid(value: integerMin0Max8191): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pid")(js.undefined)
        ret
    }
  }
  
}

