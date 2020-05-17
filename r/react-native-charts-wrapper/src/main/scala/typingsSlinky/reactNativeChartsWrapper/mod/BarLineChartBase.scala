package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.anon.Right
import typingsSlinky.reactNativeChartsWrapper.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarLineChartBase extends ChartBase {
  var autoScaleMinMaxEnabled: js.UndefOr[Boolean] = js.native
  var borderColor: js.UndefOr[Color] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var doubleTapToZoomEnabled: js.UndefOr[Boolean] = js.native
  var dragEnabled: js.UndefOr[Boolean] = js.native
  var drawBorders: js.UndefOr[Boolean] = js.native
  var drawGridBackground: js.UndefOr[Boolean] = js.native
  var extraOffsets: js.UndefOr[Offsets] = js.native
  var gridBackgroundColor: js.UndefOr[Double] = js.native
  var group: js.UndefOr[String] = js.native
  var highlightPerDragEnabled: js.UndefOr[Boolean] = js.native
  var identifier: js.UndefOr[String] = js.native
  var keepPositionOnRotation: js.UndefOr[Boolean] = js.native
  var maxHighlightDistance: js.UndefOr[Double] = js.native
  var maxVisibleValueCount: js.UndefOr[Double] = js.native
  var minOffset: js.UndefOr[Double] = js.native
  var pinchZoom: js.UndefOr[Boolean] = js.native
  var scaleEnabled: js.UndefOr[Boolean] = js.native
  var scaleXEnabled: js.UndefOr[Boolean] = js.native
  var scaleYEnabled: js.UndefOr[Boolean] = js.native
  var syncX: js.UndefOr[Boolean] = js.native
  var syncY: js.UndefOr[Boolean] = js.native
  var viewPortOffsets: js.UndefOr[Offsets] = js.native
  var visibleRange: js.UndefOr[X] = js.native
  var yAxis: js.UndefOr[Right] = js.native
  var zoom: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.anon.AxisDependency] = js.native
}

object BarLineChartBase {
  @scala.inline
  def apply(): BarLineChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLineChartBase]
  }
  @scala.inline
  implicit class BarLineChartBaseOps[Self <: BarLineChartBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScaleMinMaxEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScaleMinMaxEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScaleMinMaxEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScaleMinMaxEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: Color): Self = {
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
    def withDoubleTapToZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapToZoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleTapToZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapToZoomEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawGridBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGridBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawGridBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGridBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraOffsets(value: Offsets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraOffsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraOffsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraOffsets")(js.undefined)
        ret
    }
    @scala.inline
    def withGridBackgroundColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightPerDragEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPerDragEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightPerDragEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPerDragEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepPositionOnRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepPositionOnRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepPositionOnRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepPositionOnRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHighlightDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHighlightDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHighlightDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHighlightDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVisibleValueCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleValueCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVisibleValueCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleValueCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleXEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleXEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleXEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleXEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleYEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleYEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleYEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleYEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncX")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncY")(js.undefined)
        ret
    }
    @scala.inline
    def withViewPortOffsets(value: Offsets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPortOffsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewPortOffsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPortOffsets")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleRange(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: Right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: typingsSlinky.reactNativeChartsWrapper.anon.AxisDependency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

