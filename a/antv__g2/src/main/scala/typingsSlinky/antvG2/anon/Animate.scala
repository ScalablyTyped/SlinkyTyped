package typingsSlinky.antvG2.anon

import typingsSlinky.antvG2.antvG2Strings.multiple
import typingsSlinky.antvG2.antvG2Strings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animate extends js.Object {
  /**
    * 选中是否执行动画，默认执行动画
    */
  var animate: Boolean = js.native
  /**
    * 选中之后是否允许取消选中，默认允许取消选中
    */
  var cancelable: Boolean = js.native
  /**
    * 选中模式，单选、多选
    */
  var mode: single | multiple = js.native
}

object Animate {
  @scala.inline
  def apply(animate: Boolean, cancelable: Boolean, mode: single | multiple): Animate = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animate]
  }
  @scala.inline
  implicit class AnimateOps[Self <: Animate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: single | multiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

