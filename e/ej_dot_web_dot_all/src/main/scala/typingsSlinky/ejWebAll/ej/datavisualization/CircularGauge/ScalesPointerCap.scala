package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesPointerCap extends js.Object {
  /** Specify cap backgroundColor of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specify cap borderColor of circular gauge
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Specify pointerCap borderWidth value of circular gauge
    * @Default {3}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /** Specify cap interiorGradient value of circular gauge
    * @Default {null}
    */
  var interiorGradient: js.UndefOr[js.Any] = js.native
  /** Specify pointerCap Radius value of circular gauge
    * @Default {7}
    */
  var radius: js.UndefOr[Double] = js.native
}

object ScalesPointerCap {
  @scala.inline
  def apply(): ScalesPointerCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesPointerCap]
  }
  @scala.inline
  implicit class ScalesPointerCapOps[Self <: ScalesPointerCap] (val x: Self) extends AnyVal {
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
    def withInteriorGradient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interiorGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteriorGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interiorGradient")(js.undefined)
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
  }
  
}

