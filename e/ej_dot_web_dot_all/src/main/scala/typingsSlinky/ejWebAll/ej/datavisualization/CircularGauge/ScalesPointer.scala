package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesPointer extends js.Object {
  /** Specify backNeedleLength of circular gauge
    * @Default {10}
    */
  var backNeedleLength: js.UndefOr[Double] = js.native
  /** Specify backgroundColor for the pointer of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specify the border for pointers of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesPointersBorder] = js.native
  /** Specify distanceFromScale value for pointers of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.native
  /** Specify pointer gradients of circular gauge
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.native
  /** Specify pointer image of circular gauge.It is applicable for both marker as well as needle type pointers.
    * @Default {NULL}
    */
  var imageUrl: js.UndefOr[String] = js.native
  /** Specify pointer length of circular gauge
    * @Default {150}
    */
  var length: js.UndefOr[Double] = js.native
  /** Specify marker Style value of circular gauge. See
    * @Default {Rectangle}
    */
  var markerType: js.UndefOr[MarkerType | String] = js.native
  /** Specify needle Style value of circular gauge. See
    * @Default {Triangle}
    */
  var needleType: js.UndefOr[NeedleType | String] = js.native
  /** Specify opacity value for pointer of circular gauge
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specify pointer Placement value of circular gauge. See PointerPlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.native
  /** Specify pointer value text of circular gauge.
    * @Default {Object}
    */
  var pointerValueText: js.UndefOr[ScalesPointersPointerValueText] = js.native
  /** Specify radius value for pointer of circular gauge
    * @Default {null}
    */
  var radius: js.UndefOr[Double] = js.native
  /** Specify showBackNeedle value of circular gauge
    * @Default {false}
    */
  var showBackNeedle: js.UndefOr[Boolean] = js.native
  /** Specify pointer type value of circular gauge. See
    * @Default {Needle}
    */
  var `type`: js.UndefOr[PointerType | String] = js.native
  /** Specify value of the pointer of circular gauge
    * @Default {null}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specify pointer width of circular gauge
    * @Default {7}
    */
  var width: js.UndefOr[Double] = js.native
}

object ScalesPointer {
  @scala.inline
  def apply(): ScalesPointer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesPointer]
  }
  @scala.inline
  implicit class ScalesPointerOps[Self <: ScalesPointer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackNeedleLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backNeedleLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackNeedleLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backNeedleLength")(js.undefined)
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
    def withBorder(value: ScalesPointersBorder): Self = {
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
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
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
    def withMarkerType(value: MarkerType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerType")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleType(value: NeedleType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleType")(js.undefined)
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
    def withPointerValueText(value: ScalesPointersPointerValueText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerValueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerValueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerValueText")(js.undefined)
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
    def withShowBackNeedle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackNeedle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBackNeedle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBackNeedle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PointerType | String): Self = {
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
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
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

