package typingsSlinky.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotosDataItem extends js.Object {
  /** 图片名 */
  var alt: String = js.native
  /** 图片id */
  var pid: js.UndefOr[Double] = js.native
  /** 原图地址 */
  var src: String = js.native
  /** 缩略图地址 */
  var thumb: String = js.native
}

object PhotosDataItem {
  @scala.inline
  def apply(alt: String, src: String, thumb: String): PhotosDataItem = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotosDataItem]
  }
  @scala.inline
  implicit class PhotosDataItemOps[Self <: PhotosDataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(js.undefined)
        ret
    }
  }
  
}

