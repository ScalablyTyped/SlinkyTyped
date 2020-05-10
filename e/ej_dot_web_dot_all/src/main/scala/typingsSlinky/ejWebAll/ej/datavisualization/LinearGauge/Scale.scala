package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale extends js.Object {
  /** Specifies the backgroundColor of the Scale.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies the scaleBar Gradient of bar pointer
    * @Default {Array}
    */
  var barPointers: js.UndefOr[js.Array[ScalesBarPointer]] = js.native
  /** Specifies the border of the Scale.
    * @Default {null}
    */
  var border: js.UndefOr[ScalesBorder] = js.native
  /** Specifies the customLabel
    * @Default {Array}
    */
  var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.native
  /** Specifies the scale Direction of the Scale. See
    * @Default {CounterClockwise}
    */
  var direction: js.UndefOr[Direction | String] = js.native
  /** Specifies the indicator
    * @Default {Array}
    */
  var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.native
  /** Specifies the labels.
    * @Default {Array}
    */
  var labels: js.UndefOr[js.Array[ScalesLabel]] = js.native
  /** Specifies the scaleBar Length.
    * @Default {290}
    */
  var length: js.UndefOr[Double] = js.native
  /** Specifies the majorIntervalValue of the Scale.
    * @Default {10}
    */
  var majorIntervalValue: js.UndefOr[Double] = js.native
  /** Specifies the markerPointers
    * @Default {Array}
    */
  var markerPointers: js.UndefOr[js.Array[ScalesMarkerPointer]] = js.native
  /** Specifies the maximum of the Scale.
    * @Default {null}
    */
  var maximum: js.UndefOr[Double] = js.native
  /** Specifies the minimum of the Scale.
    * @Default {null}
    */
  var minimum: js.UndefOr[Double] = js.native
  /** Specifies the minorIntervalValue of the Scale.
    * @Default {2}
    */
  var minorIntervalValue: js.UndefOr[Double] = js.native
  /** Specifies the opacity of the Scale.
    * @Default {NaN}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the position
    * @Default {null}
    */
  var position: js.UndefOr[ScalesPosition] = js.native
  /** Specifies the ranges in the tick.
    * @Default {Array}
    */
  var ranges: js.UndefOr[js.Array[ScalesRange]] = js.native
  /** Specifies the shadowOffset.
    * @Default {0}
    */
  var shadowOffset: js.UndefOr[Double] = js.native
  /** Specifies the showBarPointers state.
    * @Default {true}
    */
  var showBarPointers: js.UndefOr[Boolean] = js.native
  /** Specifies the showCustomLabels state.
    * @Default {false}
    */
  var showCustomLabels: js.UndefOr[Boolean] = js.native
  /** Specifies the showIndicators state.
    * @Default {false}
    */
  var showIndicators: js.UndefOr[Boolean] = js.native
  /** Specifies the showLabels state.
    * @Default {true}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  /** Specifies the showMarkerPointers state.
    * @Default {true}
    */
  var showMarkerPointers: js.UndefOr[Boolean] = js.native
  /** Specifies the showRanges state.
    * @Default {false}
    */
  var showRanges: js.UndefOr[Boolean] = js.native
  /** Specifies the showTicks state.
    * @Default {true}
    */
  var showTicks: js.UndefOr[Boolean] = js.native
  /** Specifies the ticks in the scale.
    * @Default {Array}
    */
  var ticks: js.UndefOr[js.Array[ScalesTick]] = js.native
  /** Specifies the scaleBar type .See
    * @Default {Rectangle}
    */
  var `type`: js.UndefOr[ScaleType | String] = js.native
  /** Specifies the scaleBar width.
    * @Default {30}
    */
  var width: js.UndefOr[Double] = js.native
}

object Scale {
  @scala.inline
  def apply(): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  implicit class ScaleOps[Self <: Scale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBarPointers(value: js.Array[ScalesBarPointer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: ScalesBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabels(value: js.Array[ScalesCustomLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Direction | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicators(value: js.Array[ScalesIndicator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[ScalesLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorIntervalValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorIntervalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorIntervalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorIntervalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerPointers(value: js.Array[ScalesMarkerPointer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorIntervalValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorIntervalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorIntervalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorIntervalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ScalesPosition): Self = {
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
    def withRanges(value: js.Array[ScalesRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBarPointers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBarPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBarPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBarPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCustomLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCustomLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIndicators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndicators")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMarkerPointers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMarkerPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMarkerPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMarkerPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: js.Array[ScalesTick]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ScaleType | String): Self = {
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
  }
  
}

