package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a watermark image to the CDN (Content Delivery Network) live stream in {@link setLiveTranscoding}.
  *
  * **Since**
  * <br>&emsp;&emsp;&emsp;*3.0.0*
  */
@js.native
trait TranscodingWatermark extends js.Object {
  /**
    * The height of the watermark image.
    *
    * Integer only. The value range is [0,10000]. The default value is 160.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The HTTP/HTTPS URL address of the image on the broadcasting video.
    *
    * ASCII characters only. The maximum length of this parameter is 1024 bytes. Only supports online PNG files.
    */
  var url: String = js.native
  /**
    * The width of the watermark image.
    *
    * Integer only. The value range is [0,10000]. The default value is 160.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The position of the image on the upper left of the broadcasting video on the horizontal axis.
    *
    * Integer only. The value range is [0,10000]. The default value is 0.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The position of the image on the upper left of the broadcasting video on the vertical axis.
    *
    * Integer only. The value range is [0,10000]. The default value is 0.
    */
  var y: js.UndefOr[Double] = js.native
}

object TranscodingWatermark {
  @scala.inline
  def apply(url: String): TranscodingWatermark = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodingWatermark]
  }
  @scala.inline
  implicit class TranscodingWatermarkOps[Self <: TranscodingWatermark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

