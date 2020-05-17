package typingsSlinky.antvG2.anon

import typingsSlinky.antvG2.antvG2Numbers.`0.5`
import typingsSlinky.antvG2.antvG2Strings.`39Percentsign`
import typingsSlinky.antvG2.antvG2Strings.center
import typingsSlinky.antvG2.antvG2Strings.end
import typingsSlinky.antvG2.antvG2Strings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoRotate extends js.Object {
  /**
    * 是否沿线的角度排布，默认为 true
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  /**
    * 文本的内容
    */
  var content: js.UndefOr[String] = js.native
  /**
    * x 方向的偏移量
    */
  var offsetX: js.UndefOr[Double] = js.native
  /**
    * y 方向的偏移量
    */
  var offsetY: js.UndefOr[Double] = js.native
  /**
    * 文本的显示位置
    */
  var position: js.UndefOr[start | center | end | `39Percentsign` | `0.5`] = js.native
  /**
    * 文本图形样式配置
    */
  var style: js.UndefOr[js.Any] = js.native
}

object AutoRotate {
  @scala.inline
  def apply(): AutoRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRotate]
  }
  @scala.inline
  implicit class AutoRotateOps[Self <: AutoRotate] (val x: Self) extends AnyVal {
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
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: start | center | end | `39Percentsign` | `0.5`): Self = {
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
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

