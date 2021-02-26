package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationDurationUpdate extends StObject {
  
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot.markLine)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot.markLine)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot.markLine)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot.markLine)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.animationThreshold
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
    * [x](https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0.x)
    * ,
    * [y](https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0.y)
    * attribute, in which pixel values and percentage are supported.
    *
    * 2. Assign coordinate position with
    * [coord](https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0.coord)
    * attribute, in which `'min'`, `'max'`, `'average'` are supported
    * for each dimension.
    *
    * 3. Use
    * [type](https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0.type)
    * attribute to mark the maximum and minimum values in the series,
    * in which
    * [valueIndex](https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0.valueIndex)
    * or
    * [valueDim](https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0.valueDim)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot.markLine)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data
    */
  var data: js.UndefOr[`01`] = js.native
  
  /**
    * Mark line text.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.label
    */
  var label: js.UndefOr[Position] = js.native
  
  /**
    * Mark line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.lineStyle
    */
  var lineStyle: js.UndefOr[Curveness] = js.native
  
  /**
    * Precison of marking line value, which is useful when displaying
    * average value mark line.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.precision
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Symbol type at the two ends of the mark line.
    * It can be an array for two ends, or assigned seperately.
    * See
    * [data.symbol](https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0.symbol)
    * for more format information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.symbol
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
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.native
}
object AnimationDurationUpdate {
  
  @scala.inline
  def apply(): AnimationDurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDurationUpdate]
  }
  
  @scala.inline
  implicit class AnimationDurationUpdateMutableBuilder[Self <: AnimationDurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelay(value: js.Function | Double): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
    
    @scala.inline
    def setAnimationDelayUpdate(value: js.Function | Double): Self = StObject.set(x, "animationDelayUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelayUpdateUndefined: Self = StObject.set(x, "animationDelayUpdate", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: js.Function | Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationDurationUpdate(value: js.Function | Double): Self = StObject.set(x, "animationDurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUpdateUndefined: Self = StObject.set(x, "animationDurationUpdate", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: String): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    @scala.inline
    def setAnimationEasingUpdate(value: String): Self = StObject.set(x, "animationEasingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingUpdateUndefined: Self = StObject.set(x, "animationEasingUpdate", js.undefined)
    
    @scala.inline
    def setAnimationThreshold(value: Double): Self = StObject.set(x, "animationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationThresholdUndefined: Self = StObject.set(x, "animationThreshold", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setData(value: `01`): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLabel(value: Position): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLineStyle(value: Curveness): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setSymbol(value: js.Array[_] | String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSize(value: js.Array[_] | Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = StObject.set(x, "symbolSize", js.Array(value :_*))
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: js.Any*): Self = StObject.set(x, "symbol", js.Array(value :_*))
  }
}
