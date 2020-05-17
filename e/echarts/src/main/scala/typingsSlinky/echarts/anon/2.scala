package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  /**
    * Specify the delay time before animation start.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.animationEasingUpdate.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Specify the delay time before update animation.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pictorialBar.animationEasingUpdate.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
}

object `2` {
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDelay(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelayUpdate(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelayUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(js.undefined)
        ret
    }
  }
  
}

