package typingsSlinky.baiduApp

import typingsSlinky.baiduApp.baiduAppStrings.easeIn
import typingsSlinky.baiduApp.baiduAppStrings.easeInOut
import typingsSlinky.baiduApp.baiduAppStrings.easeOut
import typingsSlinky.baiduApp.baiduAppStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDuration extends js.Object {
  // 动画变化时间，默认0，单位：毫秒
  var duration: js.UndefOr[Double] = js.native
  /**
  			 * 动画变化方式，默认 linear
  			 * 值	说明
  			 * 有效值：
  			 * linear	动画从头到尾的速度是相同的。
  			 * easeIn	动画以低速开始
  			 * easeOut	动画以低速结束。
  			 * easeInOut	动画以低速开始和结束。
  			 */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.native
}

object AnonDuration {
  @scala.inline
  def apply(): AnonDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDuration]
  }
  @scala.inline
  implicit class AnonDurationOps[Self <: AnonDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunc")(js.undefined)
        ret
    }
  }
  
}

