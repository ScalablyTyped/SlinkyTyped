package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationDelayUpdate extends StObject {
  
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  
  /**
    * The scope of the area is defined by `data`, which is an array
    * with two item, representing the left-top point and the right-bottom
    * point of rectangle area.
    * Each item can be defined as follows:
    *
    * 1.
    * Specify the coordinate in screen coordinate system using
    * [x](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.x)
    * ,
    * [y](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.y)
    * , where the unit is pixel (e.g.,
    * the value is `5`), or percent (e.g.,
    * the value is `'35%'`).
    *
    * 2.
    * Specify the coordinate in data coordinate system (i.e.,
    * cartesian) using
    * [coord](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.coord)
    * , which can be also set as `'min'`, `'max'`, `'average'`
    * (e.g,
    * `coord: [23, 'min']`, or `coord: ['average', 'max']`)。
    *
    * 1.
    * Locate the point on the min value or max value of `series.data`
    * using
    * [type](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.type)
    * , where
    * [valueIndex](https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0.valueIndex)
    * or
    * [valueDim](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.0.valueDim)
    * can be used to specify the dimension on which the min, max
    * or average are calculated.
    * 2.
    * If in cartesian, you can only specify `xAxis` or `yAxis`
    * to define a mark area based on only X or Y axis, see sample
    * [scatter-weight](https://echarts.apache.org/examples/en/editor.html?c=scatter-weight)
    *
    * The priority follows as above if more than one above definition
    * used.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data
    */
  var data: js.UndefOr[`1`] = js.native
  
  /**
    * Style of the mark area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.itemStyle
    */
  var itemStyle: js.UndefOr[Emphasis] = js.native
  
  /**
    * Label in mark area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.label
    */
  var label: js.UndefOr[FontFamily] = js.native
  
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
}
object AnimationDelayUpdate {
  
  @scala.inline
  def apply(): AnimationDelayUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDelayUpdate]
  }
  
  @scala.inline
  implicit class AnimationDelayUpdateMutableBuilder[Self <: AnimationDelayUpdate] (val x: Self) extends AnyVal {
    
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
    def setData(value: `1`): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setItemStyle(value: Emphasis): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: FontFamily): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
