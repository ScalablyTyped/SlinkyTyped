package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationDelay extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger
    * than threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * Data array of marking line.
    * Every array item can be an array of one or two values, representing
    * starting and ending point of the line, and every item is
    * an object.
    * Here are several ways to assign the positions of starting
    * and ending point.
    *
    * 1. Assign coordinate according to container with
    * [x](https://echarts.apache.org/en/option.html#series-scatter.markLine.data.0.x)
    * ,
    * [y](https://echarts.apache.org/en/option.html#series-scatter.markLine.data.0.y)
    * attribute, in which pixel values and percentage are supported.
    *
    * 2. Assign coordinate position with
    * [coord](https://echarts.apache.org/en/option.html#series-scatter.markLine.data.0.coord)
    * attribute, in which `'min'`, `'max'`, `'average'` are supported
    * for each dimension.
    *
    * 3. Use
    * [type](https://echarts.apache.org/en/option.html#series-scatter.markLine.data.0.type)
    * attribute to mark the maximum and minimum values in the series,
    * in which
    * [valueIndex](https://echarts.apache.org/en/option.html#series-scatter.markLine.data.0.valueIndex)
    * or
    * [valueDim](https://echarts.apache.org/en/option.html#series-scatter.markLine.data.0.valueDim)
    * can be used to assign the dimension.
    *
    * 4.
    * You may also create a mark line in Cartesian coordinate at
    * a specific position in X or Y axis by assigning `xAxis` or
    * `yAxis`. See
    * [scatter-weight](https://echarts.apache.org/examples/en/editor.html?c=scatter-weight)
    * for example.
    *
    * When multiple attributes exist, priority is as the above
    * order.
    *
    * You may also set the type of mark line through `type`, stating
    * whether it is for the maximum value or average value.
    * Likewise, dimensions can be assigned through `valueIndex`.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data
    */
  var data: js.UndefOr[`0`] = js.native
  /**
    * Mark line text.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.label
    */
  var label: js.UndefOr[Position] = js.native
  /**
    * Mark line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.lineStyle
    */
  var lineStyle: js.UndefOr[Curveness] = js.native
  /**
    * Precison of marking line value, which is useful when displaying
    * average value mark line.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.precision
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Symbol type at the two ends of the mark line.
    * It can be an array for two ends, or assigned seperately.
    * See
    * [data.symbol](https://echarts.apache.org/en/option.html#series-scatter.markLine.data.0.symbol)
    * for more format information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | String] = js.native
  /**
    * Symbol size at the two ends of the mark line.
    * It can be an array for two ends, or assigned seperately.
    *
    * **Attention:** You cannot assgin width and height seperately
    * as normal `symbolSize`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.native
}

object AnimationDelay {
  @scala.inline
  def apply(): AnimationDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDelay]
  }
  @scala.inline
  implicit class AnimationDelayOps[Self <: AnimationDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
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
    @scala.inline
    def withAnimationDuration(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDurationUpdate(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasingUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: Curveness): Self = {
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
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: js.Array[_] | String): Self = {
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
  }
  
}

