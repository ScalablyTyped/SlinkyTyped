package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineWithCurves
  extends HasZM
     with Geometry {
  var curvePaths: js.Array[js.Array[Position | JsonCurve]] = js.native
}

object PolylineWithCurves {
  @scala.inline
  def apply(curvePaths: js.Array[js.Array[Position | JsonCurve]]): PolylineWithCurves = {
    val __obj = js.Dynamic.literal(curvePaths = curvePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineWithCurves]
  }
  @scala.inline
  implicit class PolylineWithCurvesOps[Self <: PolylineWithCurves] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurvePaths(value: js.Array[js.Array[Position | JsonCurve]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curvePaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

