package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstantSpeed extends js.Object {
  /**
    * The color of special effect symbol, which defaults to be
    * same with
    * [lineStyle.color](https://echarts.apache.org/en/option.html#series-lines.lineStyle.color)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * If symbol movement of special effect has a constant speed,
    * which unit is pixel per second.
    * [period](https://echarts.apache.org/en/option.html#series-lines.effect.period)
    * will be ignored if `constantSpeed` is larger than 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.constantSpeed
    */
  var constantSpeed: js.UndefOr[Double] = js.native
  /**
    * Effect animation delay.
    * Can be number or callback function.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.delay
    */
  var delay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Whether to loop the special effect animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.loop
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * The duration of special effect, which unit is second.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.period
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * Whether to show special effect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.show
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * The symbol of special effect.
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which
    * URL is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines.effect)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent from
    * jagging and blurring when scaled, and have a better control
    * over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines.effect)
    *
    * The above example uses a custom path of plane shape.
    *
    * **Tip:** Ahe angle of symbol changes as the tangent of track
    * changes.
    * If you use a custom path, you should make sure that the path
    * shape are upward oriented.
    * It would ensure that the symbol will always move toward the
    * right moving direction when the symbol moves along the track.
    *
    *
    * @default
    * "circle"
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.symbol
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * The symbol size of special effect, which could be set as
    * single number such as `10`.
    * What's more, arrays could be used to decribe the width and
    * height respectively.
    * For instance, `[20, 10]` indicates `20` for width and `10`
    * for height.
    *
    *
    * @default
    * 3
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.native
  /**
    * The length of trail of special effect.
    * The values from 0 to 1 could be set.
    * Trail would be longer as the the value becomes larger.
    *
    *
    * @default
    * 0.2
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.trailLength
    */
  var trailLength: js.UndefOr[Double] = js.native
}

object ConstantSpeed {
  @scala.inline
  def apply(): ConstantSpeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstantSpeed]
  }
  @scala.inline
  implicit class ConstantSpeedOps[Self <: ConstantSpeed] (val x: Self) extends AnyVal {
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
    def withConstantSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstantSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constantSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
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
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSize(value: js.Array[_] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailLength")(js.undefined)
        ret
    }
  }
  
}

