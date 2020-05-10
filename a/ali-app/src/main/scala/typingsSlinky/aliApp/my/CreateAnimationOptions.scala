package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAnimationOptions extends js.Object {
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: Double = js.native
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: Double = js.native
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timeFunction: TimingFunction = js.native
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: String = js.native
}

object CreateAnimationOptions {
  @scala.inline
  def apply(delay: Double, duration: Double, timeFunction: TimingFunction, transformOrigin: String): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timeFunction = timeFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnimationOptions]
  }
  @scala.inline
  implicit class CreateAnimationOptionsOps[Self <: CreateAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeFunction(value: TimingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

