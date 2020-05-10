package typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod

import typingsSlinky.instagramPrivateApi.AnonBuffer
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSegmentedVideoOptions extends UploadVideoOptions {
  var retryContext: js.UndefOr[UploadRetryContext] = js.native
  var segmentDivider: js.UndefOr[SegmentDivider] = js.native
  var segments: js.UndefOr[js.Array[Buffer]] = js.native
}

object UploadSegmentedVideoOptions {
  @scala.inline
  def apply(duration: Double, video: Buffer): UploadSegmentedVideoOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSegmentedVideoOptions]
  }
  @scala.inline
  implicit class UploadSegmentedVideoOptionsOps[Self <: UploadSegmentedVideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetryContext(value: UploadRetryContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentDivider(value: /* options */ AnonBuffer => js.Array[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentDivider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSegmentDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentDivider")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
  }
  
}

