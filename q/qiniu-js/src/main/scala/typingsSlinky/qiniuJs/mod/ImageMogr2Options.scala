package typingsSlinky.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMogr2Options extends js.Object {
  var `auto-orient`: Boolean = js.native
  				// 新图的输出格式，取值范围：jpg，gif，png，webp等
  var blur: String = js.native
  			// 缩放操作参数
  var crop: String = js.native
  			// 旋转角度，取值范围1-360，缺省为不旋转。
  var format: String = js.native
  				// 裁剪操作参数
  var gravity: String = js.native
  			// 裁剪锚点参数
  var quality: Double = js.native
  			// 图片质量，取值范围1-100
  var rotate: Double = js.native
  		// 布尔值，是否根据原图EXIF信息自动旋正，便于后续处理，建议放在首位。
  var strip: Boolean = js.native
  				// 布尔值，是否去除图片中的元信息
  var thumbnail: String = js.native
}

object ImageMogr2Options {
  @scala.inline
  def apply(
    `auto-orient`: Boolean,
    blur: String,
    crop: String,
    format: String,
    gravity: String,
    quality: Double,
    rotate: Double,
    strip: Boolean,
    thumbnail: String
  ): ImageMogr2Options = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-orient")(`auto-orient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMogr2Options]
  }
  @scala.inline
  implicit class ImageMogr2OptionsOps[Self <: ImageMogr2Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAuto-orient`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto-orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlur(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

