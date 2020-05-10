package typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadBroadcastVideoOptions extends js.Object {
  var sampled: js.UndefOr[Boolean] = js.native
  var transcodeDelay: js.UndefOr[Double] = js.native
  var uploadId: js.UndefOr[String] = js.native
  var video: Buffer = js.native
}

object DirectThreadBroadcastVideoOptions {
  @scala.inline
  def apply(video: Buffer): DirectThreadBroadcastVideoOptions = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVideoOptions]
  }
  @scala.inline
  implicit class DirectThreadBroadcastVideoOptionsOps[Self <: DirectThreadBroadcastVideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideo(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampled")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscodeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscodeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(js.undefined)
        ret
    }
  }
  
}

