package typingsSlinky.echarts.echarts.EChartOption.DataZoom

import typingsSlinky.echarts.echarts.EChartOption.BaseTextStyle
import typingsSlinky.echarts.echartsStrings.empty
import typingsSlinky.echarts.echartsStrings.filter
import typingsSlinky.echarts.echartsStrings.horizontal
import typingsSlinky.echarts.echartsStrings.none
import typingsSlinky.echarts.echartsStrings.vertical
import typingsSlinky.echarts.echartsStrings.weakFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://echarts.apache.org/en/option.html#dataZoom-slider
  */
@js.native
trait Slider extends js.Object {
  var angleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var bottom: js.UndefOr[String | Double] = js.native
  var dataBackground: js.UndefOr[js.Object] = js.native
  var end: js.UndefOr[Double] = js.native
  var endValue: js.UndefOr[Double | String | js.Date] = js.native
  var fillerColor: js.UndefOr[String] = js.native
  var filterMode: js.UndefOr[filter | weakFilter | empty | none] = js.native
  var handleIcon: js.UndefOr[String] = js.native
  var handleSize: js.UndefOr[Double | String] = js.native
  var handleStyle: js.UndefOr[js.Object] = js.native
  var id: js.UndefOr[String] = js.native
  var labelFormatter: js.UndefOr[String | js.Function] = js.native
  var labelPrecision: js.UndefOr[Double] = js.native
  var left: js.UndefOr[String | Double] = js.native
  var maxSpan: js.UndefOr[Double] = js.native
  var maxValueSpan: js.UndefOr[Double | String | js.Date] = js.native
  var minSpan: js.UndefOr[Double] = js.native
  var minValueSpan: js.UndefOr[Double | String | js.Date] = js.native
  var orient: js.UndefOr[vertical | horizontal] = js.native
  var radiusAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var rangeMode: js.UndefOr[js.Array[String]] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
  var right: js.UndefOr[String | Double] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var showDataShadow: js.UndefOr[String] = js.native
  var showDetail: js.UndefOr[Boolean] = js.native
  var singleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var start: js.UndefOr[Double] = js.native
  var startValue: js.UndefOr[Double | String | js.Date] = js.native
  var textStyle: js.UndefOr[BaseTextStyle] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var top: js.UndefOr[String | Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var xAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var yAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var z: js.UndefOr[Double] = js.native
  var zlevel: js.UndefOr[Double] = js.native
  var zoomLock: js.UndefOr[Boolean] = js.native
}

object Slider {
  @scala.inline
  def apply(): Slider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slider]
  }
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleAxisIndex(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleAxisIndex")(js.undefined)
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
    def withDataBackground(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEndValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndValue(value: Double | String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFillerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMode(value: filter | weakFilter | empty | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyle")(js.undefined)
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
    def withLabelFormatter(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrecision")(js.undefined)
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
    def withMaxSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValueSpanDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValueSpan(value: Double | String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueSpanDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValueSpan(value: Double | String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: vertical | horizontal): Self = {
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
    def withRadiusAxisIndex(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusAxisIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeMode(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(js.undefined)
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
    def withShowDataShadow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDataShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDetail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleAxisIndex(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleAxisIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStartValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartValue(value: Double | String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(js.undefined)
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
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
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
    def withType(value: String): Self = {
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
    def withXAxisIndex(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisIndex(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisIndex")(js.undefined)
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
    @scala.inline
    def withZoomLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLock")(js.undefined)
        ret
    }
  }
  
}

