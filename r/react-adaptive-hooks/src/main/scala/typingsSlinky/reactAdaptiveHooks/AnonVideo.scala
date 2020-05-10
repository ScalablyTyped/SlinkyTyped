package typingsSlinky.reactAdaptiveHooks

import typingsSlinky.reactAdaptiveHooks.mediaCapabilitiesMod.VideoMediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVideo extends js.Object {
  var video: VideoMediaConfiguration = js.native
}

object AnonVideo {
  @scala.inline
  def apply(video: VideoMediaConfiguration): AnonVideo = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVideo]
  }
  @scala.inline
  implicit class AnonVideoOps[Self <: AnonVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideo(value: VideoMediaConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

