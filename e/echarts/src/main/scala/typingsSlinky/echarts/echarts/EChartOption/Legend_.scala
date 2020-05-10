package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.echarts.EChartOption.Legend.Formatter
import typingsSlinky.echarts.echarts.EChartOption.Legend.LegendDataObject
import typingsSlinky.echarts.echarts.EChartOption.Legend.PageFormatter
import typingsSlinky.echarts.echarts.EChartOption.Legend.PageIcons
import typingsSlinky.echarts.echartsStrings.auto
import typingsSlinky.echarts.echartsStrings.end
import typingsSlinky.echarts.echartsStrings.horizontal
import typingsSlinky.echarts.echartsStrings.left
import typingsSlinky.echarts.echartsStrings.multiple
import typingsSlinky.echarts.echartsStrings.plain
import typingsSlinky.echarts.echartsStrings.right
import typingsSlinky.echarts.echartsStrings.scroll
import typingsSlinky.echarts.echartsStrings.single
import typingsSlinky.echarts.echartsStrings.start
import typingsSlinky.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://echarts.apache.org/en/option.html#legend
  */
@js.native
trait Legend_ extends js.Object {
  /**
    * Legend mrker and text aligning. By default,
    * it automatically calculates from component location and orient.
    * When left value of this component is 'right',
    * and the vertical layout (orient is 'vertical'),
    * it would be aligned to 'right'.
    *
    * @default 'auto'
    */
  var align: js.UndefOr[auto | left | right] = js.native
  /**
    * Whether to use animation when page scrolll.
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Duration of the page scroll animation.
    *
    * @default 800
    */
  var animationDurationUpdate: js.UndefOr[Double] = js.native
  /**
    * Background color of legend, which is transparent by default.
    * Color can be represented in RGB, for example 'rgb(128, 128, 128)'.
    * RGBA can be used when you need alpha channel, for example 'rgba(128, 128, 128, 0.5)'.
    * You may also use hexadecimal format, for example '#ccc'.
    *
    * @default 'transparent'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Border color of legend. Support the same color format as backgroundColor.
    *
    * @default '#ccc'
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * The radius of rounded corner. Its unit is px.
    * And it supports use array to respectively specify the 4 corner radiuses.
    *
    * @default 0
    *
    * @example
    *
    * ```
    * borderRadius: 5, // consistently set the size of 4 rounded corners
    * borderRadius: [5, 5, 0, 0] // (clockwise upper left, upper right, bottom right and bottom left)
    * ```
    */
  var borderRadius: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Border width of legend.
    *
    * @default 1
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * Distance between legend component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var bottom: js.UndefOr[String | Double] = js.native
  /**
    * Data array of legend. An array item is usually a name representing string.
    * (If it is a pie chart, it could also be the name of a single data in the pie chart) of a series.
    * Legend component would automatically calculate the color and icon according to series.
    * Special string '' (null string) or '\n' (new line string) can be used for a new line.
    * If data is not specified, it will be auto collected from series. For most of series,
    * it will be collected from series.name or the dimension name specified by seriesName of series.encode.
    * For some types of series like pie and funnel, it will be collected from the name field of series.data.
    * If you need to set the style for a single item, you may also set the configuration of it.
    * In this case, name attribute is used to represent name of series.
    *
    * @see https://echarts.apache.org/en/option.html#legend.data
    */
  var data: js.UndefOr[js.Array[LegendDataObject | String]] = js.native
  /**
    * Formatter is used to format label of legend, which supports string template and callback function.
    *
    * @default null
    */
  var formatter: js.UndefOr[String | Formatter] = js.native
  /**
    * Height of legend component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Icon of the legend items.
    * Icon types provided by ECharts includes 'circle', 'rect', 'roundRect', 'triangle', 'diamond', 'pin', 'arrow', 'none'
    * It can be set to an image with 'image://url' , in which URL is the link to an image, or dataURI of an image.
    * Icons can be set to arbitrary vector path via 'path://' in ECharts.
    * As compared with raster image, vector paths prevent from jagging and blurring when scaled,
    * and have a better control over changing colors. Size of vectoer icon will be adapted automatically.
    * Refer to SVG PathData for more information about format of path. You may export vector paths from tools like Adobe Illustrator.
    *
    * @see https://echarts.apache.org/en/option.html#legend.icon
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Legend color when not selected.
    *
    * @default '#ccc'
    */
  var inactiveColor: js.UndefOr[String] = js.native
  /**
    * The distance between each legend, horizontal distance in horizontal layout,
    * and vertical distance in vertical layout.
    *
    * @default 10
    */
  var itemGap: js.UndefOr[Double] = js.native
  /**
    * Image height of legend symbol.
    *
    * @default 14
    */
  var itemHeight: js.UndefOr[Double] = js.native
  /**
    * Image width of legend symbol.
    *
    * @default 25
    */
  var itemWidth: js.UndefOr[Double] = js.native
  /**
    * Distance between legend component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default 'auto'
    */
  var left: js.UndefOr[String | Double] = js.native
  /**
    * The layout orientation of legend.
    *
    * @default 'horizontal'
    */
  var orient: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Legend space around content.
    * The unit is px. Default values for each position are 5.
    * And they can be set to different values with left, right, top, and bottom.
    *
    * @example
    * ```
    * // Set padding to be 5
    * padding: 5
    * // Set the top and bottom paddings to be 5, and left and right paddings to be 10
    * padding: [5, 10]
    * // Set each of the four paddings seperately
    * padding: [
    *    5,  // up
    *    10, // right
    *    5,  // down
    *    10, // left
    * ]
    * ```
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * The gap between page buttons and legend items.
    *
    * @default null
    */
  var pageButtonGap: js.UndefOr[Double] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * The gap between page buttons and page info text.
    *
    * @default 5
    */
  var pageButtonItemGap: js.UndefOr[Double] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * The position of page buttons and page info. Optional values:
    * 'start': on the left or top.
    * 'end': on the right or bottom.
    *
    * @default 'end'
    */
  var pageButtonPosition: js.UndefOr[start | end] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * Page info formatter. It is '{current}/{total}' by default,
    * where {current} is current page number (start from 1), and {total} is the total page number.
    *
    * @default '{current}/{total}'
    */
  var pageFormatter: js.UndefOr[String | PageFormatter] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * The color of page buttons.
    *
    * @default '#2f4554'
    */
  var pageIconColor: js.UndefOr[String] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * The color of page buttons when they are inactive.
    *
    * @default '#aaa'
    */
  var pageIconInactiveColor: js.UndefOr[String] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * The size of page buttons. It can be a number, or an array, like [10, 3], represents [width, height].
    *
    * @default 15
    */
  var pageIconSize: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons
    */
  var pageIcons: js.UndefOr[PageIcons] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * The text style of page info.
    */
  var pageTextStyle: js.UndefOr[TextStyle] = js.native
  /**
    * Distance between legend component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var right: js.UndefOr[String | Double] = js.native
  /**
    * It works when legend.type is 'scroll'.
    * dataIndex of the left top most displayed item.
    * Although the scrolling of legend items can be controlled by calling setOption and specifying this property,
    * we suggest that do not controll legend in this way unless necessary (setOption might be time-consuming),
    * but just use action legendScroll to do that.
    *
    * @default 0
    * @see https://echarts.apache.org/en/option.html#legend.scrollDataIndex
    */
  var scrollDataIndex: js.UndefOr[Double] = js.native
  /**
    * State table of selected legend.
    *
    * @example
    * ```
    * selected: {
    *   // selected'series 1'
    *   'series 1': true,
    *   // unselected'series 2'
    *   'series 2': false
    * }
    * ```
    */
  var selected: js.UndefOr[js.Object] = js.native
  /**
    * Selected mode of legend, which controls whether series can be toggled displaying by clicking legends.
    * It is enabled by default, and you may set it to be false to disabled it.
    * Besides, it can be set to 'single' or 'multiple', for single selection and multiple selection.
    *
    * @default true
    */
  var selectedMode: js.UndefOr[Boolean | single | multiple] = js.native
  /**
    * Size of shadow blur. This attribute should be used along with shadowColor,
    * shadowOffsetX, shadowOffsetY to set shadow to component.
    * Attention:
    * This property works only if show: true is configured and backgroundColor is defined other than transparent.
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as color.
    * Attention: This property works only if show: true configured.
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * Whether to show the legend component.
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Whether to keep aspect for icons
    * (from series.symbol or user-defined legend.data.icon) in the form of path://.
    *
    * @default true
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  /**
    * Legend text style.
    */
  var textStyle: js.UndefOr[TextStyleWithRich] = js.native
  /**
    * Tooltip configuration for legend tooltip, which is similar to tooltip.
    *
    * @see https://echarts.apache.org/en/option.html#legend.tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /**
    * Distance between legend component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    * If the left value is set to be 'top', 'middle', or 'bottom',
    * then the component will be aligned automatically based on position.
    *
    * @default 'auto'
    */
  var top: js.UndefOr[String | Double] = js.native
  /**
    * Type of legend.
    * Optional values:
    *  'plain': Simple legend. (default)
    *  'scroll': Scrollable legend. It helps when too
    *   many legend items needed to be shown.
    *
    * @default 'plain'
    */
  var `type`: js.UndefOr[plain | scroll] = js.native
  /**
    * Width of legend component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * z value of all graphical elements in, which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @deafult 2
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * zlevel value of all graphical elements in.
    * zlevel is used to make layers with Canvas.
    * Graphical elements with different zlevel values will be placed in different Canvases,
    * which is a common optimization technique.
    * We can put those frequently changed elements (like those with animations) to a seperate zlevel.
    * Notice that too many Canvases will increase memory cost,
    * and should be used carefully on mobile phones to avoid crash.
    * Canvases with bigger zlevel will be placed on Canvases with smaller zlevel.
    *
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object Legend_ {
  @scala.inline
  def apply(): Legend_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Legend_]
  }
  @scala.inline
  implicit class Legend_Ops[Self <: Legend_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: auto | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
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
    def withAnimationDurationUpdate(value: Double): Self = {
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
    def withBorderRadius(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
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
    def withBottom(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[LegendDataObject | String]): Self = {
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
    def withFormatterFunction1(value: /* name */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withItemGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGap")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
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
    def withPageButtonGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageButtonGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonGap")(js.undefined)
        ret
    }
    @scala.inline
    def withPageButtonItemGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonItemGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageButtonItemGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonItemGap")(js.undefined)
        ret
    }
    @scala.inline
    def withPageButtonPosition(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageButtonPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPageFormatterFunction2(value: (/* current */ Double, /* total */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPageFormatter(value: String | PageFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIconInactiveColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIconInactiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIconInactiveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIconInactiveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIconSize(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIcons(value: PageIcons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTextStyle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDataIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedMode(value: Boolean | single | multiple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMode")(js.undefined)
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
    def withSymbolKeepAspect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolKeepAspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolKeepAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolKeepAspect")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: TextStyleWithRich): Self = {
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
    def withTooltip(value: Tooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: plain | scroll): Self = {
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
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
    @scala.inline
    def withZlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(js.undefined)
        ret
    }
  }
  
}

