package typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadVideoOptions extends js.Object {
  var duration: Double = js.native
  var forAlbum: js.UndefOr[Boolean] = js.native
  var forDirectStory: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var isDirect: js.UndefOr[Boolean] = js.native
  var isDirectVoice: js.UndefOr[Boolean] = js.native
  var isIgtvVideo: js.UndefOr[Boolean] = js.native
  var isSidecar: js.UndefOr[Boolean] = js.native
  var mediaType: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Double] = js.native
  var uploadId: js.UndefOr[String] = js.native
  var uploadName: js.UndefOr[String] = js.native
  var video: Buffer = js.native
  var waterfallId: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object UploadVideoOptions {
  @scala.inline
  def apply(duration: Double, video: Buffer): UploadVideoOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadVideoOptions]
  }
  @scala.inline
  implicit class UploadVideoOptionsOps[Self <: UploadVideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForAlbum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forAlbum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForAlbum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forAlbum")(js.undefined)
        ret
    }
    @scala.inline
    def withForDirectStory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forDirectStory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForDirectStory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forDirectStory")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirect")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirectVoice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectVoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDirectVoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectVoice")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIgtvVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIgtvVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIgtvVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIgtvVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSidecar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSidecar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSidecar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSidecar")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
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
    @scala.inline
    def withUploadName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadName")(js.undefined)
        ret
    }
    @scala.inline
    def withWaterfallId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaterfallId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterfallId")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

