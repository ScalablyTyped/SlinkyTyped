package typingsSlinky.amapJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoords extends js.Object {
  /**
    *
    * 可点击区域组成元素数组，存放图形的像素坐标等信息，该数组元素由type决定：
    * - circle:coords格式为 [x1, y1, r]，x1，y1为圆心像素坐标，r为圆半径
    * - poly: coords格式为 [x1, y1, x2, y2 … xn, yn]，各x，y表示多边形边界像素坐标
    * - rect: coords格式为 [x1, y1, x2, y2]，x1，y1为矩形左上角像素坐标，x2，y2为矩形右下角像素坐标
    * Markshape的像素坐标是指相对于marker的左上角的像素坐标偏移量
    */
  var coords: js.UndefOr[js.Array[Double]] = js.native
  /**
    * 可点击区域类型，可选值：
    * - circle:圆形
    * - poly:多边形
    * - rect:矩形
    */
  var `type`: js.UndefOr[String] = js.native
}

object AnonCoords {
  @scala.inline
  def apply(): AnonCoords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCoords]
  }
  @scala.inline
  implicit class AnonCoordsOps[Self <: AnonCoords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoords(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

