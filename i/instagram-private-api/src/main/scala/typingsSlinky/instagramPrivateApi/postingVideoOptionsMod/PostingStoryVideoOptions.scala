package typingsSlinky.instagramPrivateApi.postingVideoOptionsMod

import typingsSlinky.instagramPrivateApi.postingOptionsMod.PostingStoryOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingStoryVideoOptions extends PostingStoryOptions {
  var coverImage: Buffer = js.native
  var transcodeDelay: js.UndefOr[Double] = js.native
  var video: Buffer = js.native
}

object PostingStoryVideoOptions {
  @scala.inline
  def apply(coverImage: Buffer, video: Buffer): PostingStoryVideoOptions = {
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingStoryVideoOptions]
  }
  @scala.inline
  implicit class PostingStoryVideoOptionsOps[Self <: PostingStoryVideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverImage(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
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
  }
  
}

