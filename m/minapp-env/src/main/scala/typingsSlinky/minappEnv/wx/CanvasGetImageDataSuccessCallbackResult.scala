package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasGetImageDataSuccessCallbackResult extends js.Object {
  /** 图像数据矩形的高度 */
  var height: Double = js.native
  /** 图像数据矩形的宽度 */
  var width: Double = js.native
}

object CanvasGetImageDataSuccessCallbackResult {
  @scala.inline
  def apply(height: Double, width: Double): CanvasGetImageDataSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataSuccessCallbackResult]
  }
  @scala.inline
  implicit class CanvasGetImageDataSuccessCallbackResultOps[Self <: CanvasGetImageDataSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

