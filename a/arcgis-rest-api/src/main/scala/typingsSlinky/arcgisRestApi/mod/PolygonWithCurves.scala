package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonWithCurves
  extends HasZM
     with Geometry {
  var curveRings: js.Array[js.Array[Position | JsonCurve]] = js.native
}

object PolygonWithCurves {
  @scala.inline
  def apply(curveRings: js.Array[js.Array[Position | JsonCurve]]): PolygonWithCurves = {
    val __obj = js.Dynamic.literal(curveRings = curveRings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonWithCurves]
  }
  @scala.inline
  implicit class PolygonWithCurvesOps[Self <: PolygonWithCurves] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurveRings(value: js.Array[js.Array[Position | JsonCurve]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveRings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

