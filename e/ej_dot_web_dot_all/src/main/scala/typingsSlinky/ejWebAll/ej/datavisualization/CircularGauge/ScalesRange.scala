package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesRange extends js.Object {
  /** Specify backgroundColor for the ranges of circular gauge
    * @Default {#32b3c6}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specify border for ranges of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesRangesBorder] = js.native
  /** Specify distanceFromScale value for ranges of circular gauge
    * @Default {25}
    */
  var distanceFromScale: js.UndefOr[Double] = js.native
  /** Specify endValue for ranges of circular gauge
    * @Default {null}
    */
  var endValue: js.UndefOr[Double] = js.native
  /** Specify endWidth for ranges of circular gauge
    * @Default {10}
    */
  var endWidth: js.UndefOr[Double] = js.native
  /** Specify range gradients of circular gauge
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.native
  /** Specify text for the ranges of circular gauge
    * @Default {null}
    */
  var legendText: js.UndefOr[String] = js.native
  /** Specify opacity value for ranges of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specify placement of circular gauge. See RangePlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.native
  /** Specify size of the range value of circular gauge
    * @Default {5}
    */
  var size: js.UndefOr[Double] = js.native
  /** Specify startValue for ranges of circular gauge
    * @Default {null}
    */
  var startValue: js.UndefOr[Double] = js.native
  /** Specify startWidth of circular gauge
    * @Default {[Array.number] scale.ranges.startWidth = 10}
    */
  var startWidth: js.UndefOr[Double] = js.native
}

object ScalesRange {
  @scala.inline
  def apply(): ScalesRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesRange]
  }
  @scala.inline
  implicit class ScalesRangeOps[Self <: ScalesRange] (val x: Self) extends AnyVal {
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
    def withBorder(value: ScalesRangesBorder): Self = {
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
    def withDistanceFromScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceFromScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromScale")(js.undefined)
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
    def withEndWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGradients(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradients")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendText")(js.undefined)
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
    def withPlacement(value: Placement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
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
    def withStartWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWidth")(js.undefined)
        ret
    }
  }
  
}

