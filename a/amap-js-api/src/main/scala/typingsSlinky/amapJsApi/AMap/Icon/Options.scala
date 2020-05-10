package typingsSlinky.amapJsApi.AMap.Icon

import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApi.AMap.SizeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 图标的取图地址
    */
  var image: js.UndefOr[String] = js.native
  /**
    * 图标取图偏移量
    */
  var imageOffset: js.UndefOr[Pixel] = js.native
  /**
    * 图标所用图片大小
    */
  var imageSize: js.UndefOr[SizeValue] = js.native
  /**
    * 图标尺寸
    */
  var size: js.UndefOr[SizeValue] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImageOffset(value: Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSize(value: SizeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SizeValue): Self = {
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
  }
  
}

