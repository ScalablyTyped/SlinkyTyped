package typingsSlinky.instagramPrivateApi.postingIgtvOptionsMod

import typingsSlinky.instagramPrivateApi.AnonBottom
import typingsSlinky.instagramPrivateApi.PartialMediaConfigureToIg
import typingsSlinky.instagramPrivateApi.PartialUploadVideoOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingIgtvOptions extends js.Object {
  var audioMuted: js.UndefOr[Boolean] = js.native
  var caption: js.UndefOr[String] = js.native
  var configureOptions: js.UndefOr[PartialMediaConfigureToIg] = js.native
  var coverFrame: Buffer = js.native
  var feedPreviewCrop: js.UndefOr[AnonBottom] = js.native
  var maxTranscodeTries: js.UndefOr[Double] = js.native
  var shareToFeed: js.UndefOr[Boolean] = js.native
  var title: String = js.native
  var transcodeDelay: js.UndefOr[Double] = js.native
  var uploadOptions: js.UndefOr[PartialUploadVideoOptions] = js.native
  var video: Buffer = js.native
}

object PostingIgtvOptions {
  @scala.inline
  def apply(coverFrame: Buffer, title: String, video: Buffer): PostingIgtvOptions = {
    val __obj = js.Dynamic.literal(coverFrame = coverFrame.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingIgtvOptions]
  }
  @scala.inline
  implicit class PostingIgtvOptionsOps[Self <: PostingIgtvOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverFrame(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioMuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioMuted")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigureOptions(value: PartialMediaConfigureToIg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigureOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedPreviewCrop(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedPreviewCrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedPreviewCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedPreviewCrop")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTranscodeTries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTranscodeTries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTranscodeTries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTranscodeTries")(js.undefined)
        ret
    }
    @scala.inline
    def withShareToFeed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareToFeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareToFeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareToFeed")(js.undefined)
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
    def withUploadOptions(value: PartialUploadVideoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadOptions")(js.undefined)
        ret
    }
  }
  
}

