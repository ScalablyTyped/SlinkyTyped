package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.qiniuJsStrings.bmp
import typingsSlinky.qiniuJs.qiniuJsStrings.gif
import typingsSlinky.qiniuJs.qiniuJsStrings.jpeg
import typingsSlinky.qiniuJs.qiniuJsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInfo_ extends js.Object {
  							// 图片高度，单位：像素(px) 。
  var colorModel: String = js.native
  							// 文件大小，单位：Bytes
  var format: png | jpeg | gif | bmp = js.native
  						// 彩色空间，如palette16、ycbcr等。
  var frameNumber: Double = js.native
  							// 图片宽度，单位：像素(px) 。
  var height: Double = js.native
  var size: Double = js.native
  	// 图片类型，如png、jpeg、gif、bmp等。
  var width: Double = js.native
}

object ImageInfo_ {
  @scala.inline
  def apply(
    colorModel: String,
    format: png | jpeg | gif | bmp,
    frameNumber: Double,
    height: Double,
    size: Double,
    width: Double
  ): ImageInfo_ = {
    val __obj = js.Dynamic.literal(colorModel = colorModel.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], frameNumber = frameNumber.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo_]
  }
  @scala.inline
  implicit class ImageInfo_Ops[Self <: ImageInfo_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: png | jpeg | gif | bmp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

