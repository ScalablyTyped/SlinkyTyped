package typingsSlinky.echarts

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictunknownPropertyBorderColor
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ StringDictionary[js.Any] {
  /**
    * border color, whose format is similar to that of `color`.
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Border type, which can be `'solid'`, `'dashed'`, or `'dotted'`.
    * `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.borderType
    */
  var borderType: js.UndefOr[String] = js.native
  /**
    * border width. No border when it is set to be 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * color. Color is taken from
    * [option.color Palette](https://echarts.apache.org/en/option.html#color)
    * by default.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides single
    * colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.itemStyle)
    *
    * Supports callback functions, in the form of:
    *
    * ```
    * (params: Object) => Color
    *
    * ```
    *
    * Input parameters are `seriesIndex`, `dataIndex`, `data`,
    * `value`, and etc. of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.color
    */
  var color: js.UndefOr[String | js.Function] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}

object AnonDictunknownPropertyBorderColor {
  @scala.inline
  def apply(): AnonDictunknownPropertyBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictunknownPropertyBorderColor]
  }
  @scala.inline
  implicit class AnonDictunknownPropertyBorderColorOps[Self <: AnonDictunknownPropertyBorderColor] (val x: Self) extends AnyVal {
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
    def withColor(value: String | js.Function): Self = {
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
  }
  
}

