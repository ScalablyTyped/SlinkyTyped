package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoFileDetailsVideoStream extends js.Object {
  /** The video content's display aspect ratio, which specifies the aspect ratio in which the video should be displayed. */
  var aspectRatio: js.UndefOr[Double] = js.native
  /** The video stream's bitrate, in bits per second. */
  var bitrateBps: js.UndefOr[String] = js.native
  /** The video codec that the stream uses. */
  var codec: js.UndefOr[String] = js.native
  /** The video stream's frame rate, in frames per second. */
  var frameRateFps: js.UndefOr[Double] = js.native
  /** The encoded video content's height in pixels. */
  var heightPixels: js.UndefOr[Double] = js.native
  /** The amount that YouTube needs to rotate the original source content to properly display the video. */
  var rotation: js.UndefOr[String] = js.native
  /** A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code. */
  var vendor: js.UndefOr[String] = js.native
  /** The encoded video content's width in pixels. You can calculate the video's encoding aspect ratio as width_pixels / height_pixels. */
  var widthPixels: js.UndefOr[Double] = js.native
}

object VideoFileDetailsVideoStream {
  @scala.inline
  def apply(): VideoFileDetailsVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFileDetailsVideoStream]
  }
  @scala.inline
  implicit class VideoFileDetailsVideoStreamOps[Self <: VideoFileDetailsVideoStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withBitrateBps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateBps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrateBps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateBps")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRateFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRateFps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRateFps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRateFps")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthPixels")(js.undefined)
        ret
    }
  }
  
}

