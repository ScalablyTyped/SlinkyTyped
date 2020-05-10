package typingsSlinky.echarts.echarts.EChartOption

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.echarts.echarts.EChartOption.Tooltip.Format
import typingsSlinky.echarts.echarts.EChartOption.Tooltip.Formatter
import typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Obj
import typingsSlinky.echarts.echarts.EChartOption.Tooltip.Position.Type
import typingsSlinky.echarts.echartsStrings.axis
import typingsSlinky.echarts.echartsStrings.click
import typingsSlinky.echarts.echartsStrings.html
import typingsSlinky.echarts.echartsStrings.item
import typingsSlinky.echarts.echartsStrings.mousemove
import typingsSlinky.echarts.echartsStrings.mousemoveVerticallineclick
import typingsSlinky.echarts.echartsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip_ extends js.Object {
  /**
    * Whether to show tooltip content all the time.
    * By default, it will be hidden after `tooltip.hideDelay`.
    * It can be set to be true to preserve displaying.
    * This attribute is newly added to ECharts 3.0.
    *
    * @default false
    */
  var alwaysShowContent: js.UndefOr[Boolean] = js.native
  /**
    * `axisPointer` is a tool for displaying reference line
    * and axis value under mouse pointer.
    *
    * Configuration item for axis indicator.
    * `tooltip.axisPointer` is like syntactic sugar
    * of `axisPointer` settings on axes
    * (for example, `xAxis.axisPointer` or `angleAxis.axisPointer`).
    * More detailed features can be configured
    * on `someAxis.axisPointer`.
    * But in common cases, using `tooltip.axisPinter`
    * is more convenient.
    * Notice: configurations of `tooltip.axisPointer` has
    * lower priority than that of `someAxis.axisPointer`.
    *
    * @see https://echarts.apache.org/en/option.html#tooltip.axisPointer
    */
  var axisPointer: js.UndefOr[typingsSlinky.echarts.echarts.EChartOption.Tooltip.AxisPointer] = js.native
  /**
    * The background color of tooltip's floating layer.
    *
    * @default 'rgba(50, 50, 50, 0.7)'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The border color of tooltip's floating layer.
    *
    * @default '#333'
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * The border width of tooltip's floating layer.
    *
    * @default 0
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * Whether confine tooltip content in the view rect
    * of chart instance.
    * Useful when tooltip is cut because of `'overflow: hidden'`
    * set on outer dom of chart instance, or because of narrow
    * screen on mobile.
    *
    * @default false
    */
  var confine: js.UndefOr[Boolean] = js.native
  /**
    * Whether mouse is allowed to enter the floating layer
    * of tooltip, whose default value is false.
    * If you need to interact in the tooltip like with links
    * or buttons, it can be set as `true`.
    *
    * @default true
    */
  var enterable: js.UndefOr[Boolean] = js.native
  /**
    * Extra CSS style for floating layer.
    * The following is an example for adding shadow.
    *
    * @example
    * extraCssText: 'box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);'
    */
  var extraCssText: js.UndefOr[String] = js.native
  /**
    * The content formatter of tooltip's floating layer
    * which supports string template and callback function.
    *
    * Types:
    * 1. String.
    * The template variables are `{a}`, `{b}`, `{c}`, `{d}` and `{e}`,
    * which stands for series name, data name and data value and ect.
    * When trigger is set to be `'axis'`, there may be data
    * from multiple series. In this time, series index can be refered
    * as `{a0}`, `{a1}`, or `{a2}`.
    * `{a}`, `{b}`, `{c}`, `{d}` have different meanings
    * for different series types:
    *   + Line (area) charts, bar (column) charts, K charts:
    *   `{a}` for series name,
    *   `{b}` for category name,
    *   `{c}` for data value,
    *   `{d}` for none;
    *   + Scatter (bubble) charts:
    *   `{a}` for series name,
    *   `{b}` for data name,
    *   `{c}` for data value,
    *   `{d}` for none;
    *   + Map:
    *   `{a}` for series name,
    *   `{b}` for area name,
    *   `{c}` for merging data,
    *   `{d}` for none;
    *   + Pie charts, gauge charts, funnel charts:
    *   `{a}` for series name,
    *   `{b}` for data item name,
    *   `{c}` for data value,
    *   `{d}` for percentage.
    *
    * 2. Function.
    * The first parameter params is the data that the formatter needs.
    * Its format is shown as {Format}
    * When trigger is `'axis'`, or when tooltip is triggered by
    * `axisPointer`, params is the data array of multiple series.
    * `Note`: Using array to present all the parameters in ECharts 2.x
    * is not supported anymore.
    * The second parameter ticket is the asynchronous callback flag
    * which should be used along with the third parameter callback
    * when it is used.
    * The third parameter callback is asynchronous callback.
    * When the content of tooltip is acquired asynchronously,
    * ticket and htm as introduced above can be used to update tooltip
    * with callback.
    *
    * @example
    * ```
    *
    * //string
    * formatter: '{b0}: {c0}<br />{b1}: {c1}'
    *
    * // function
    * formatter: function (params, ticket, callback) {
    *     $.get('detail?name=' + params.name, function (content) {
    *         callback(ticket, toHTML(content));
    *     });
    *     return 'Loading';
    * }
    * ```
    */
  var formatter: js.UndefOr[String | Formatter] = js.native
  /**
    * Delay time for hiding tooltip, in ms.
    * It will be invalid when `alwaysShowContent` is `true`.
    *
    * @default 100
    */
  var hideDelay: js.UndefOr[Double] = js.native
  /**
    * The floating layer of tooltip space around content.
    * The unit is px. Default values for each position are 5.
    * And they can be set to different values with left, right,
    * top, and bottom.
    *
    * @example
    * // Set padding to be 5
    * padding: 5
    * // Set the top and bottom paddings to be 5, and left and right paddings to be 10
    * padding: [5, 10]
    * // Set each of the four paddings seperately
    * padding: [
    *     5,  // up
    *     10, // right
    *     5,  // down
    *     10, // left
    * ]
    *
    * @default 5
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * The position of the tooltip's floating layer,
    * which would follow the position of mouse by default.
    *
    * Options:
    * 1. String.
    *   + 'inside' - Center position of the graphic element
    *   where the mouse is in, which is only valid when trigger
    *   is 'item'.
    *   + 'top' - Top position of the graphic element where the mouse
    *   is in, which is only valid when trigger is 'item'.
    *   + 'left' - Left position of the graphic element where the mouse
    *   is in, which is only valid when trigger is 'item'.
    *   + 'right' - Right position of the graphic element where
    *   the mouse is in, which is only valid when trigger is 'item'.
    *   + 'bottom' - Bottom position of the graphic element where
    *   the mouse is in, which is only valid when trigger is 'item'.
    *
    * 2. Object - Object with optional properties such as `top`,
    * `left`, `right` and `bottom` that could be `string` or `number`.
    * e.g. `{left: 10, top: 30}`, or `{right: '20%', bottom: 40}`
    *
    * 3. Array - Display the position of tooltip's floating layer
    * through array, which supports absolute position
    * and relative percentage.
    *
    * 4. Function.
    *   + Parameters:
    *     + point: Mouse position.
    *     + param: The same as formatter.
    *     + dom: The DOM object of tooltip.
    *     + rect: It is valid only when mouse is on graphic elements,
    *       which stands for a bounding box with x, y, width, and height.
    *     + size: The size of dom echarts container.
    *       For example:
    *       `{contentSize: [width, height], viewSize: [width, height]}`
    *   + Return:
    *     position as `String`, `Array` or `Object` described above
    *
    * @see https://echarts.apache.org/en/option.html#tooltip.position
    */
  var position: js.UndefOr[Type] = js.native
  /**
    * Render mode for tooltip.
    * By default, it is set to be `'html'` so that extra DOM element
    * is used for tooltip.
    * It can also set to be `'richText'` so that the tooltip
    * will be rendered inside Canvas (SVG rich text is
    * not implemented yet).
    * This is very useful for environments that don't have DOM,
    * such as Wechat applications.
    *
    * @default 'html'
    */
  var renderMode: js.UndefOr[html] = js.native
  /**
    * Whether to show the tooltip component,
    * including tooltip floating layer and `axisPointer`.
    *
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show the tooltip floating layer,
    * whose default value is true.
    * It should be configurated to be `false`,
    * if you only need tooltip to trigger the event
    * or show the axisPointer without content.
    *
    * @default true
    */
  var showContent: js.UndefOr[Boolean] = js.native
  /**
    * Delay time for showing tooltip, in ms.
    * No delay by default, and it is not recommended to set.
    * Only valid when `triggerOn` is set to be `'mousemove'`.
    *
    * @default 0
    */
  var showDelay: js.UndefOr[Double] = js.native
  /**
    * The text style of tooltip's floating layer.
    */
  var textStyle: js.UndefOr[BaseTextStyle] = js.native
  /**
    * The transition duration of tooltip's animation, in seconds.
    * When it is set to be 0, it would move closely with the mouse.
    *
    * @default 0.4
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Type of triggering.
    * Options:
    * + `'item'` - Triggered by data item, which is mainly used
    *   for charts that don't have a category axis like scatter
    *   charts or pie charts.
    * + `'axis'` - Triggered by axes, which is mainly used
    *   for charts that have category axes, like bar charts
    *   or line charts.
    *   ECharts 2.x only supports axis trigger for category axis.
    *   In ECharts 3, it is supported for all types of axes in `grid`
    *   or `polar`. Also, you may assign axis with `axisPointer.axis`.
    * + `'none'` - Trigger nothing.
    *
    * @default 'item'
    */
  var trigger: js.UndefOr[item | axis | none] = js.native
  /**
    * Conditions to trigger tooltip.
    * Options:
    * + `'mousemove'` - Trigger when mouse moves.
    * + `'click'` - Trigger when mouse clicks.
    * + `'mousemove|click'` - Trigger when mouse clicks and moves.
    *   `'none'` - Do not triggered by `'mousemove'` and `'click'`.
    *   Tooltip can be triggered and hidden manually by calling
    *   `action.tooltip.showTip` and `action.tooltip.hideTip`.
    *   It can also be triggered by `axisPointer.handle` in this case.
    *
    * This attribute is new to ECharts 3.0.
    *
    * @default 'mousemove|click'
    */
  var triggerOn: js.UndefOr[mousemove | click | mousemoveVerticallineclick | none] = js.native
}

object Tooltip_ {
  @scala.inline
  def apply(): Tooltip_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tooltip_]
  }
  @scala.inline
  implicit class Tooltip_Ops[Self <: Tooltip_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysShowContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisPointer(value: typingsSlinky.echarts.echarts.EChartOption.Tooltip.AxisPointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPointer")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
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
    def withConfine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confine")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterable")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraCssText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraCssText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraCssText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraCssText")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterFunction3(
      value: (/* params */ Format | js.Array[Format], /* ticket */ String, /* callback */ js.Function2[/* ticket */ String, /* html */ String, Unit]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatter(value: String | Formatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionFunction5(
      value: (/* point */ js.Array[Double | String], /* params */ js.Object | js.Array[js.Object], /* element */ HTMLElement, /* rect */ js.Object, /* size */ js.Object) => (js.Array[Double | String]) | Obj
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withPosition(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMode(value: html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(js.undefined)
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
    def withShowContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: BaseTextStyle): Self = {
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
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: item | axis | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerOn(value: mousemove | click | mousemoveVerticallineclick | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(js.undefined)
        ret
    }
  }
  
}

