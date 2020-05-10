package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSource extends js.Object {
  var heightPixels: js.UndefOr[Double] = js.native
  /**
    * Recommended sizes for the following dimensions (in px):
    * 480 x 320 for X_SMALL,
    * 720 x 480 for SMALL,
    * 960 x 640 for MEDIUM,
    * 1200 x 800 for LARGE,
    * 1920 x 1280 for X_LARGE
    */
  var size: js.UndefOr[ImageSourceSize] = js.native
  var url: String = js.native
  var widthPixels: js.UndefOr[Double] = js.native
}

object ImageSource {
  @scala.inline
  def apply(url: String): ImageSource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSource]
  }
  @scala.inline
  implicit class ImageSourceOps[Self <: ImageSource] (val x: Self) extends AnyVal {
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
    def withSize(value: ImageSourceSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
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

