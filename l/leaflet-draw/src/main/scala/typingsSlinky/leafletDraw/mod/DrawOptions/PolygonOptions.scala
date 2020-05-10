package typingsSlinky.leafletDraw.mod.DrawOptions

import typingsSlinky.leafletDraw.mod.PrecisionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonOptions extends PolylineOptions {
  /**
    * Defines the precision for each type of unit (e.g. {km: 2, ft: 0}
    *
    * @default {}
    */
  var precision: js.UndefOr[PrecisionOptions] = js.native
  /**
    * Show the area of the drawn polygon in m², ha or km².
    * The area is only approximate and become less accurate the larger the polygon is.
    *
    * @default false
    */
  var showArea: js.UndefOr[Boolean] = js.native
}

object PolygonOptions {
  @scala.inline
  def apply(): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonOptions]
  }
  @scala.inline
  implicit class PolygonOptionsOps[Self <: PolygonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrecision(value: PrecisionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArea")(js.undefined)
        ret
    }
  }
  
}

