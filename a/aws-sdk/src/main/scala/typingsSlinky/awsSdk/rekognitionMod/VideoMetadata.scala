package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoMetadata extends js.Object {
  /**
    * Type of compression used in the analyzed video. 
    */
  var Codec: js.UndefOr[String] = js.native
  /**
    * Length of the video in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.native
  /**
    * Format of the analyzed video. Possible values are MP4, MOV and AVI. 
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * Vertical pixel dimension of the video.
    */
  var FrameHeight: js.UndefOr[ULong] = js.native
  /**
    * Number of frames per second in the video.
    */
  var FrameRate: js.UndefOr[Float] = js.native
  /**
    * Horizontal pixel dimension of the video.
    */
  var FrameWidth: js.UndefOr[ULong] = js.native
}

object VideoMetadata {
  @scala.inline
  def apply(): VideoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoMetadata]
  }
  @scala.inline
  implicit class VideoMetadataOps[Self <: VideoMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMillis(value: ULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameHeight(value: ULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameWidth(value: ULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameWidth")(js.undefined)
        ret
    }
  }
  
}

