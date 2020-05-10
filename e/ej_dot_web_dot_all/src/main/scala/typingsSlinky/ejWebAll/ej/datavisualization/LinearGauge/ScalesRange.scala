package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesRange extends js.Object {
  /** Specifies the backgroundColor in the ranges.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies the border in the ranges.
    * @Default {null}
    */
  var border: js.UndefOr[ScalesRangesBorder] = js.native
  /** Specifies the distanceFromScale in the ranges.
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.native
  /** Specifies the endValue in the ranges.
    * @Default {60}
    */
  var endValue: js.UndefOr[Double] = js.native
  /** Specifies the endWidth in the ranges.
    * @Default {10}
    */
  var endWidth: js.UndefOr[Double] = js.native
  /** Specifies the range Gradient in the ranges.
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.native
  /** Specifies the opacity in the ranges.
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the range Position in the ranges. See RangePlacement
    * @Default {Center}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.native
  /** Specifies the startValue in the ranges.
    * @Default {20}
    */
  var startValue: js.UndefOr[Double] = js.native
  /** Specifies the startWidth in the ranges.
    * @Default {10}
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
    def withPlacement(value: PointerPlacement | String): Self = {
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

