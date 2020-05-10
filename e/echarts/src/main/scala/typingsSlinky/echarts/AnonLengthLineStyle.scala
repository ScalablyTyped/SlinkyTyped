package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLengthLineStyle extends js.Object {
  /**
    * The length of split line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 30
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.length
    */
  var length: js.UndefOr[Double | String] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.native
  /**
    * Whether to show the split line.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine.show
    */
  var show: js.UndefOr[Boolean] = js.native
}

object AnonLengthLineStyle {
  @scala.inline
  def apply(): AnonLengthLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLengthLineStyle]
  }
  @scala.inline
  implicit class AnonLengthLineStyleOps[Self <: AnonLengthLineStyle] (val x: Self) extends AnyVal {
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
    def withLineStyle(value: AnonShadowBlur): Self = {
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
  }
  
}

