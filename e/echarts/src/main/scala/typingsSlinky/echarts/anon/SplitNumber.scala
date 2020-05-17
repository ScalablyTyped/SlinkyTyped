package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitNumber extends js.Object {
  /**
    * The length of tick line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 8
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.length
    */
  var length: js.UndefOr[Double | String] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
  /**
    * Whether to show the scale.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.show
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * The split scale number between split line.
    *
    *
    * @default
    * 5
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.native
}

object SplitNumber {
  @scala.inline
  def apply(): SplitNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitNumber]
  }
  @scala.inline
  implicit class SplitNumberOps[Self <: SplitNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: ShadowBlur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitNumber")(js.undefined)
        ret
    }
  }
  
}

