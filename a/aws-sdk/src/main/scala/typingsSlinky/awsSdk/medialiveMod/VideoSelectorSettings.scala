package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSelectorSettings extends js.Object {
  var VideoSelectorPid: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.VideoSelectorPid] = js.native
  var VideoSelectorProgramId: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.VideoSelectorProgramId] = js.native
}

object VideoSelectorSettings {
  @scala.inline
  def apply(): VideoSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorSettings]
  }
  @scala.inline
  implicit class VideoSelectorSettingsOps[Self <: VideoSelectorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideoSelectorPid(value: VideoSelectorPid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSelectorPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSelectorPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSelectorPid")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoSelectorProgramId(value: VideoSelectorProgramId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSelectorProgramId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoSelectorProgramId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoSelectorProgramId")(js.undefined)
        ret
    }
  }
  
}

