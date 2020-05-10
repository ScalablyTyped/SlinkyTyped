package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale extends js.Object {
  /** Specify backgroundColor for the scale of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specify border for scales of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesBorder] = js.native
  /** Specify the custom labels for the scales.
    * @Default {Array}
    */
  var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.native
  /** Specify scale direction of circular gauge. See
    * @Default {Clockwise}
    */
  var direction: js.UndefOr[Direction | String] = js.native
  /** Specify representing state of circular gauge
    * @Default {Array}
    */
  var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.native
  /** Specify the text values displayed in a meaningful manner alongside the ticks of circular gauge
    * @Default {Array}
    */
  var labels: js.UndefOr[js.Array[ScalesLabel]] = js.native
  /** Specify majorIntervalValue of circular gauge
    * @Default {10}
    */
  var majorIntervalValue: js.UndefOr[Double] = js.native
  /** Specify maximum scale value of circular gauge
    * @Default {null}
    */
  var maximum: js.UndefOr[Double] = js.native
  /** Specify minimum scale value of circular gauge
    * @Default {null}
    */
  var minimum: js.UndefOr[Double] = js.native
  /** Specify minorIntervalValue of circular gauge
    * @Default {2}
    */
  var minorIntervalValue: js.UndefOr[Double] = js.native
  /** Specify opacity value of circular gauge
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specify pointer cap of circular gauge
    * @Default {Object}
    */
  var pointerCap: js.UndefOr[ScalesPointerCap] = js.native
  /** Specify pointers value of circular gauge
    * @Default {Array}
    */
  var pointers: js.UndefOr[js.Array[ScalesPointer]] = js.native
  /** Specify scale radius of circular gauge
    * @Default {170}
    */
  var radius: js.UndefOr[Double] = js.native
  /** Specify ranges value of circular gauge
    * @Default {Array}
    */
  var ranges: js.UndefOr[js.Array[ScalesRange]] = js.native
  /** Specify shadowOffset value of circular gauge
    * @Default {0}
    */
  var shadowOffset: js.UndefOr[Double] = js.native
  /** Specify showIndicators of circular gauge
    * @Default {false}
    */
  var showIndicators: js.UndefOr[Boolean] = js.native
  /** Specify showLabels of circular gauge
    * @Default {true}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  /** Specify showPointers of circular gauge
    * @Default {true}
    */
  var showPointers: js.UndefOr[Boolean] = js.native
  /** Specify showRanges of circular gauge
    * @Default {false}
    */
  var showRanges: js.UndefOr[Boolean] = js.native
  /** Specify showScaleBar of circular gauge
    * @Default {false}
    */
  var showScaleBar: js.UndefOr[Boolean] = js.native
  /** Specify showTicks of circular gauge
    * @Default {true}
    */
  var showTicks: js.UndefOr[Boolean] = js.native
  /** Specify scaleBar size of circular gauge
    * @Default {6}
    */
  var size: js.UndefOr[Double] = js.native
  /** Specify startAngle of circular gauge
    * @Default {115}
    */
  var startAngle: js.UndefOr[Double] = js.native
  /** Specify subGauge of circular gauge
    * @Default {Array}
    */
  var subGauges: js.UndefOr[js.Array[ScalesSubGauge]] = js.native
  /** Specify sweepAngle of circular gauge
    * @Default {310}
    */
  var sweepAngle: js.UndefOr[Double] = js.native
  /** Specify ticks of circular gauge
    * @Default {Array}
    */
  var ticks: js.UndefOr[js.Array[ScalesTick]] = js.native
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
    def withPointerCap(value: ScalesPointerCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerCap")(js.undefined)
        ret
    }
    @scala.inline
    def withPointers(value: js.Array[ScalesPointer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointers")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
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
    def withShowPointers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPointers")(js.undefined)
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
    def withShowScaleBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScaleBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScaleBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScaleBar")(js.undefined)
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
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubGauges(value: js.Array[ScalesSubGauge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGauges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubGauges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGauges")(js.undefined)
        ret
    }
    @scala.inline
    def withSweepAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweepAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSweepAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweepAngle")(js.undefined)
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
  }
  
}

