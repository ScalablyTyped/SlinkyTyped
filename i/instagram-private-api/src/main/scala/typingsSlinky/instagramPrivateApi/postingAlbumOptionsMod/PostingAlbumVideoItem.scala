package typingsSlinky.instagramPrivateApi.postingAlbumOptionsMod

import typingsSlinky.instagramPrivateApi.anon.Duration
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingAlbumVideoItem extends PostingAlbumItem {
  var coverImage: Buffer = js.native
  var transcodeDelay: js.UndefOr[Double] = js.native
  var video: Buffer = js.native
  var videoInfo: js.UndefOr[Duration] = js.native
}

object PostingAlbumVideoItem {
  @scala.inline
  def apply(coverImage: Buffer, video: Buffer): PostingAlbumVideoItem = {
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumVideoItem]
  }
  @scala.inline
  implicit class PostingAlbumVideoItemOps[Self <: PostingAlbumVideoItem] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withVideoInfo(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoInfo")(js.undefined)
        ret
    }
  }
  
}

