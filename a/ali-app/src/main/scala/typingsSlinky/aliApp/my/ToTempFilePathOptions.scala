package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 画布 https://docs.alipay.com/mini/api/ui-canvas
@js.native
trait ToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 输出的图片宽度，默认为 width
  var destHeight: Double = js.native
  		// 画布高度，默认为 canvas 高度 - y
  var destWidth: Double = js.native
  		// 画布宽度，默认为 canvas 宽度 - x
  var height: Double = js.native
  			// 画布 y 轴起点，默认为 0
  var width: Double = js.native
  var x: Double = js.native
  			// 画布 x 轴起点，默认为 0
  var y: Double = js.native
}

object ToTempFilePathOptions {
  @scala.inline
  def apply(destHeight: Double, destWidth: Double, height: Double, width: Double, x: Double, y: Double): ToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(destHeight = destHeight.asInstanceOf[js.Any], destWidth = destWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToTempFilePathOptions]
  }
  @scala.inline
  implicit class ToTempFilePathOptionsOps[Self <: ToTempFilePathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

