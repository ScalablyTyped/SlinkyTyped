package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonColorLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies options of the gauge's scale. */
@js.native
trait BaseGaugeScale extends js.Object {
  /** Specifies whether to allow decimal values on the scale. When false, the scale contains integer values only. */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  /** Specifies an array of custom minor ticks. */
  var customMinorTicks: js.UndefOr[js.Array[Double]] = js.native
  /** Specifies an array of custom major ticks. */
  var customTicks: js.UndefOr[js.Array[Double]] = js.native
  /** Specifies the end value for the scale of the gauge. */
  var endValue: js.UndefOr[Double] = js.native
  /** Specifies common options for scale labels. */
  var label: js.UndefOr[BaseGaugeScaleLabel] = js.native
  /** Specifies options of the gauge's minor ticks. */
  var minorTick: js.UndefOr[AnonColorLength] = js.native
  /** Specifies an interval between minor ticks. */
  var minorTickInterval: js.UndefOr[Double] = js.native
  /** Specifies the minimum distance between two neighboring major ticks in pixels. */
  var scaleDivisionFactor: js.UndefOr[Double] = js.native
  /** Specifies the start value for the scale of the gauge. */
  var startValue: js.UndefOr[Double] = js.native
  /** Specifies options of the gauge's major ticks. */
  var tick: js.UndefOr[AnonColorLength] = js.native
  /** Specifies an interval between major ticks. */
  var tickInterval: js.UndefOr[Double] = js.native
}

object BaseGaugeScale {
  @scala.inline
  def apply(): BaseGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeScale]
  }
  @scala.inline
  implicit class BaseGaugeScaleOps[Self <: BaseGaugeScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDecimals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMinorTicks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMinorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMinorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMinorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomTicks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withEndValue(value: Double): Self = {
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
    def withLabel(value: BaseGaugeScaleLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTick(value: AnonColorLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleDivisionFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleDivisionFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleDivisionFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleDivisionFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withStartValue(value: Double): Self = {
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
    def withTick(value: AnonColorLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withTickInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(js.undefined)
        ret
    }
  }
  
}

