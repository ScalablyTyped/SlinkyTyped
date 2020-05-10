package typingsSlinky.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about the format and quality of an image. */
@js.native
trait ImageDetails extends js.Object {
  /** The format of the resulting image. Default is `"jpeg"`. */
  var format: js.UndefOr[ImageFormat] = js.native
  /**
    * When format is `"jpeg"`, controls the quality of the resulting image. This value is ignored for PNG images.
    * As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed
    * to store it will decrease.
    */
  var quality: js.UndefOr[Double] = js.native
}

object ImageDetails {
  @scala.inline
  def apply(): ImageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDetails]
  }
  @scala.inline
  implicit class ImageDetailsOps[Self <: ImageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: ImageFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
  }
  
}

