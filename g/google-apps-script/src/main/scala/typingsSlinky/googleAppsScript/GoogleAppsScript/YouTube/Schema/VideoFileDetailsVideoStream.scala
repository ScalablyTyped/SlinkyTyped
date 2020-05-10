package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoFileDetailsVideoStream extends js.Object {
  var aspectRatio: js.UndefOr[Double] = js.native
  var bitrateBps: js.UndefOr[String] = js.native
  var codec: js.UndefOr[String] = js.native
  var frameRateFps: js.UndefOr[Double] = js.native
  var heightPixels: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[String] = js.native
  var vendor: js.UndefOr[String] = js.native
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

