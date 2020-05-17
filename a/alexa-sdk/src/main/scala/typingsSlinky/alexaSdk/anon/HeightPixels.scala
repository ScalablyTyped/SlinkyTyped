package typingsSlinky.alexaSdk.anon

import typingsSlinky.alexaSdk.mod.ImageSourceSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightPixels extends js.Object {
  var heightPixels: js.UndefOr[Double] = js.native
  var size: ImageSourceSize = js.native
  var url: String = js.native
  var widthPixels: js.UndefOr[Double] = js.native
}

object HeightPixels {
  @scala.inline
  def apply(size: ImageSourceSize, url: String): HeightPixels = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightPixels]
  }
  @scala.inline
  implicit class HeightPixelsOps[Self <: HeightPixels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: ImageSourceSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
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

