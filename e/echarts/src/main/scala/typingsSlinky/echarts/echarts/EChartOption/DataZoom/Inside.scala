package typingsSlinky.echarts.echarts.EChartOption.DataZoom

import typingsSlinky.echarts.echartsStrings.empty
import typingsSlinky.echarts.echartsStrings.filter
import typingsSlinky.echarts.echartsStrings.none
import typingsSlinky.echarts.echartsStrings.weakFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data zoom component of inside type.
  * Refer to dataZoom for more information.
  * The inside means it's inside the coordinates.
  * Translation: data area can be translated when moving in coordinates.
  * Scaling:
  * PC: when mouse rolls (similar with touch pad) in coordinates.
  * Mobile: when touches and moved with two fingers in coordinates
  * on touch screens.
  *
  * @see https://echarts.apache.org/en/option.html#dataZoom-inside
  */
@js.native
trait Inside extends js.Object {
  var angleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var disable: js.UndefOr[Boolean] = js.native
  var end: js.UndefOr[Double] = js.native
  var endValue: js.UndefOr[Double | String | js.Date] = js.native
  var filterMode: js.UndefOr[filter | weakFilter | empty | none] = js.native
  var id: js.UndefOr[String] = js.native
  var maxSpan: js.UndefOr[Double] = js.native
  var maxValueSpan: js.UndefOr[Double | String | js.Date] = js.native
  var minSpan: js.UndefOr[Double] = js.native
  var minValueSpan: js.UndefOr[Double | String | js.Date] = js.native
  var moveOnMouseMove: js.UndefOr[Boolean] = js.native
  var moveOnMouseWheel: js.UndefOr[Boolean] = js.native
  var orient: js.UndefOr[String] = js.native
  var preventDefaultMouseMove: js.UndefOr[Boolean] = js.native
  var radiusAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var rangeMode: js.UndefOr[js.Array[String]] = js.native
  var singleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var start: js.UndefOr[Double] = js.native
  var startValue: js.UndefOr[Double | String | js.Date] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var xAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var yAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var zoomLock: js.UndefOr[Boolean] = js.native
  var zoomOnMouseWheel: js.UndefOr[Boolean] = js.native
}

object Inside {
  @scala.inline
  def apply(): Inside = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inside]
  }
  @scala.inline
  implicit class InsideOps[Self <: Inside] (val x: Self) extends AnyVal {
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
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
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
    def withMoveOnMouseMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnMouseMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveOnMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveOnMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnMouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOrient(value: String): Self = {
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
    def withPreventDefaultMouseMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultMouseMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultMouseMove")(js.undefined)
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
    @scala.inline
    def withZoomOnMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOnMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOnMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOnMouseWheel")(js.undefined)
        ret
    }
  }
  
}

