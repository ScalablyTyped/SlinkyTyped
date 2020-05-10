package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Strings.center
import typingsSlinky.antvG2.antvG2Strings.end
import typingsSlinky.antvG2.antvG2Strings.start
import typingsSlinky.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 坐标轴线
  */
@js.native
trait AxisTitle extends js.Object {
  /**
    * 是否需要自动旋转，默认为 `true`
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  /**
    * 数值，设置坐标轴标题距离坐标轴线的距离
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * 标题的显示位置（相对于坐标轴线）
    */
  var position: js.UndefOr[start | center | end] = js.native
  /**
    * 设置标题的文本样式
    */
  var textStyle: js.UndefOr[text] = js.native
}

object AxisTitle {
  @scala.inline
  def apply(): AxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisTitle]
  }
  @scala.inline
  implicit class AxisTitleOps[Self <: AxisTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: start | center | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
  }
  
}

