package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cornerPoints extends js.Object {
  var leftBottom: point = js.native
  var leftTop: point = js.native
  var rightBottom: point = js.native
  var rightTop: point = js.native
}

object cornerPoints {
  @scala.inline
  def apply(leftBottom: point, leftTop: point, rightBottom: point, rightTop: point): cornerPoints = {
    val __obj = js.Dynamic.literal(leftBottom = leftBottom.asInstanceOf[js.Any], leftTop = leftTop.asInstanceOf[js.Any], rightBottom = rightBottom.asInstanceOf[js.Any], rightTop = rightTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[cornerPoints]
  }
  @scala.inline
  implicit class cornerPointsOps[Self <: cornerPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftBottom(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftTop(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightBottom(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightTop(value: point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

