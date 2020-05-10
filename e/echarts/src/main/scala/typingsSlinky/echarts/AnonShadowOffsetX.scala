package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShadowOffsetX extends js.Object {
  /**
    * Line color.
    *
    * > Color can be represented in RGB, for example
    * `'rgb(128, 128, 128)'`.
    * RGBA can be used when you need alpha channel,
    * for example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported
    * besides single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.lineStyle)
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Edge curvature, which supports value from 0 to
    * 1.
    * The larger the value, the greater the curvature.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.curveness
    */
  var curveness: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis
    */
  var emphasis: js.UndefOr[AnonShadowColor] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component
    * will not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.lineStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * line type.
    *
    * Options are:
    *
    * + `'solid'`
    * + `'dashed'`
    * + `'dotted'`
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * line width.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.width
    */
  var width: js.UndefOr[Double] = js.native
}

object AnonShadowOffsetX {
  @scala.inline
  def apply(): AnonShadowOffsetX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonShadowOffsetX]
  }
  @scala.inline
  implicit class AnonShadowOffsetXOps[Self <: AnonShadowOffsetX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCurveness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurveness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveness")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: AnonShadowColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

