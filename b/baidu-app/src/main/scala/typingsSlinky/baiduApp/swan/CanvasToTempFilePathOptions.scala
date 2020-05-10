package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 画布标识，传入 <canvas/> 的 cavas-id
  		 */
  var canvasId: String = js.native
  	// 输出图片宽度（默认为 width * 屏幕像素密度）
  var destHeight: js.UndefOr[Double] = js.native
  	// 画布高度（默认为 canvas 高度 - y）
  var destWidth: js.UndefOr[Double] = js.native
  	// 输出图片高度（默认为 height * 屏幕像素密度）
  var fileType: js.UndefOr[String] = js.native
  	// 画布宽度（默认为 canvas 宽度 - x）
  var height: js.UndefOr[Double] = js.native
  	// 画布 y 轴起点（默认 0 ）
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  	// 画布 x 轴起点（默认 0 ）
  var y: js.UndefOr[Double] = js.native
}

object CanvasToTempFilePathOptions {
  @scala.inline
  def apply(canvasId: String): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
  @scala.inline
  implicit class CanvasToTempFilePathOptionsOps[Self <: CanvasToTempFilePathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDestWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
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

