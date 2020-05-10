package typingsSlinky.reactNativeChartsWrapper.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeChartsWrapper.AnonAction
import typingsSlinky.reactNativeChartsWrapper.AnonDataIndex
import typingsSlinky.reactNativeChartsWrapper.AnonDigits
import typingsSlinky.reactNativeChartsWrapper.AnonDurationX
import typingsSlinky.reactNativeChartsWrapper.AnonY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartBase extends ViewProps {
  var animation: js.UndefOr[AnonDurationX] = js.native
  var chartBackgroundColor: js.UndefOr[Color] = js.native
  var chartDescription: js.UndefOr[ChartDescription] = js.native
  var dragDecelerationEnabled: js.UndefOr[Boolean] = js.native
  var dragDecelerationFrictionCoef: js.UndefOr[Double] = js.native
  var highlightPerTapEnabled: js.UndefOr[Boolean] = js.native
  var highlights: js.UndefOr[js.Array[AnonDataIndex]] = js.native
  var legend: js.UndefOr[ChartLegend] = js.native
  var logEnabled: js.UndefOr[Boolean] = js.native
  var marker: js.UndefOr[AnonDigits] = js.native
  var noDataText: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, AnonAction], Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, AnonY | Null], Unit]] = js.native
  var touchEnabled: js.UndefOr[Boolean] = js.native
  var xAxis: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.mod.xAxis] = js.native
}

object ChartBase {
  @scala.inline
  def apply(): ChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBase]
  }
  @scala.inline
  implicit class ChartBaseOps[Self <: ChartBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: AnonDurationX): Self = {
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
    def withChartBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withChartDescription(value: ChartDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDecelerationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDecelerationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDecelerationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDecelerationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDecelerationFrictionCoef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDecelerationFrictionCoef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDecelerationFrictionCoef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDecelerationFrictionCoef")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightPerTapEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPerTapEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightPerTapEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPerTapEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlights(value: js.Array[AnonDataIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlights")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: ChartLegend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLogEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: AnonDigits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: SyntheticEvent[NodeHandle, AnonAction] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: SyntheticEvent[NodeHandle, AnonY | Null] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: xAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
  }
  
}

