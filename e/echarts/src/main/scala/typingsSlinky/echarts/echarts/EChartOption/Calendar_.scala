package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.AnonBorderColor
import typingsSlinky.echarts.AnonLineStyle
import typingsSlinky.echarts.echarts.EChartOption.Calendar.DayLabel
import typingsSlinky.echarts.echarts.EChartOption.Calendar.MonthLabel
import typingsSlinky.echarts.echarts.EChartOption.Calendar.YearLabel
import typingsSlinky.echarts.echartsStrings.auto
import typingsSlinky.echarts.echartsStrings.horizontal
import typingsSlinky.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Calendar coordinates.
  *
  * @see https://echarts.apache.org/en/option.html#calendar
  */
@js.native
trait Calendar_ extends js.Object {
  /**
    * Distance between calendar component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * The size of each rect of calendar coordinates,
    * can be set to a single value or array,
    * the first element is width and the second element is height.
    * Support setting self-adaptation: auto, the default width and height to be 20.
    *
    * @default 20
    */
  var cellSize: js.UndefOr[Double | auto | (js.Array[auto | Double])] = js.native
  /**
    * Day style in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.dayLabel
    */
  var dayLabel: js.UndefOr[DayLabel] = js.native
  /**
    * The height of calendar coordinates.
    * Note: cellSize is 20 by default.
    * If height is set, cellSize[1] will be forced to auto;
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Every rect style in calendar coordinates.
    *
    * @see https://echarts.apache.org/en/option.html#calendar.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColor] = js.native
  /**
    * Distance between calendar component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default 80
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * Month label in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.monthLabel
    */
  var monthLabel: js.UndefOr[MonthLabel] = js.native
  /**
    * The layout orientation of calendar.
    */
  var orient: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Required, range of Calendar coordinates, support multiple formats.
    *
    * @see https://echarts.apache.org/en/option.html#calendar
    */
  var range: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  /**
    * Distance between calendar component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse events.
    *
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Calendar coordinates splitLine style.
    */
  var splitLine: js.UndefOr[AnonLineStyle] = js.native
  /**
    * Distance between calendar component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    * If the left value is set to be 'top', 'middle', or 'bottom',
    * then the component will be aligned automatically based on position.
    *
    * @default 60
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * The height of calendar coordinates.
    * Note: cellSize is 20 by default.
    * If width is set, cellSize[0] will be forced to auto;
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * Year label in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.yearLabel
    */
  var yearLabel: js.UndefOr[YearLabel] = js.native
  /**
    * z value of all graphical elements in, which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @default 2
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * zlevel value of all graphical elements in.
    * zlevel is used to make layers with Canvas.
    * Graphical elements with different zlevel values will be placed in different Canvases,
    * which is a common optimization technique.
    * We can put those frequently changed elements (like those with animations) to a seperate zlevel.
    * Notice that too many Canvases will increase memory cost, and should be used carefully on mobile phones to avoid crash.
    *
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object Calendar_ {
  @scala.inline
  def apply(): Calendar_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendar_]
  }
  @scala.inline
  implicit class Calendar_Ops[Self <: Calendar_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double | String): Self = {
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
    def withCellSize(value: Double | auto | (js.Array[auto | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDayLabel(value: DayLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withItemStyle(value: AnonBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double | String): Self = {
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
    def withMonthLabel(value: MonthLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLabel")(js.undefined)
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
    def withRange(value: Double | String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Double | String): Self = {
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
    def withSplitLine(value: AnonLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitLine")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double | String): Self = {
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
    def withWidth(value: Double | String): Self = {
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
    def withYearLabel(value: YearLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearLabel")(js.undefined)
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

