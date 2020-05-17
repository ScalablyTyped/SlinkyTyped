package typingsSlinky.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndAngle extends js.Object {
  /**
    * 极坐标的结束角度，单位为弧度
    */
  var endAngle: js.UndefOr[Double] = js.native
  /**
    * 空心圆的半径，值范围为 0 至 1
    */
  var innerRadius: js.UndefOr[Double] = js.native
  /**
    * 设置半径，值范围为 0 至 1
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * 极坐标的起始角度，单位为弧度
    */
  var startAngle: js.UndefOr[Double] = js.native
}

object EndAngle {
  @scala.inline
  def apply(): EndAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndAngle]
  }
  @scala.inline
  implicit class EndAngleOps[Self <: EndAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
  }
  
}

