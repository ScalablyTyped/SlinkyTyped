package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends js.Object {
  /**
    * boxplot border color, whose format is similar to
    * that of `color`.
    *
    *
    * @default
    * "rgba(255,255,255,0.7)"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Border type, which can be `'solid'`, `'dashed'`,
    * or `'dotted'`. `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderType
    */
  var borderType: js.UndefOr[String] = js.native
  /**
    * boxplot border width.
    * No border when it is set to be 0.
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * boxplot color.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle)
    *
    *
    * @default
    * "rgba(0,0,0,0.7)"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap.breadcrumb.emphasis.itemStyle)
    *
    *
    * @default
    * 3
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @default
    * "rgba(150,150,150,1)"
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle.textStyle
    */
  var textStyle: js.UndefOr[TextShadowOffsetY] = js.native
}

object TextStyle {
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderType")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
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
    def withTextStyle(value: TextShadowOffsetY): Self = {
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

