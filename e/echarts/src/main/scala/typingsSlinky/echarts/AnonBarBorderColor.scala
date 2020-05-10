package typingsSlinky.echarts

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBarBorderColor
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ StringDictionary[js.Any] {
  /**
    * The bodrder color of bar.
    *
    *
    * @default
    * '#000'
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.barBorderColor
    */
  var barBorderColor: js.UndefOr[String] = js.native
  /**
    * The radius of rounded corner.
    * Its unit is px.
    * And it supports use array to respectively specify the 4 corner
    * radiuses.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-bar.bar.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.barBorderRadius
    */
  var barBorderRadius: js.UndefOr[js.Array[_] | Double] = js.native
  /**
    * The bodrder width of bar. defaults to have no border.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.barBorderWidth
    */
  var barBorderWidth: js.UndefOr[Double] = js.native
  /**
    * Bar color. defaults to acquire colors from global palette
    * [option.color](https://echarts.apache.org/en/option.html#color)
    * .
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.color
    */
  var color: js.UndefOr[String | AnonColorStops | AnonGlobal] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-bar.bar.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}

object AnonBarBorderColor {
  @scala.inline
  def apply(): AnonBarBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBarBorderColor]
  }
  @scala.inline
  implicit class AnonBarBorderColorOps[Self <: AnonBarBorderColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarBorderRadius(value: js.Array[_] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBarBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String | AnonColorStops | AnonGlobal): Self = {
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

