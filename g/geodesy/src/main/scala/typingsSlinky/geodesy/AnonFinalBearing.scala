package typingsSlinky.geodesy

import typingsSlinky.geodesy.latlonEllipsoidalVincentyMod.LatLonEllipsoidalVincenty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFinalBearing extends js.Object {
  var finalBearing: Double = js.native
  var iterations: Double = js.native
  var point: LatLonEllipsoidalVincenty = js.native
}

object AnonFinalBearing {
  @scala.inline
  def apply(finalBearing: Double, iterations: Double, point: LatLonEllipsoidalVincenty): AnonFinalBearing = {
    val __obj = js.Dynamic.literal(finalBearing = finalBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFinalBearing]
  }
  @scala.inline
  implicit class AnonFinalBearingOps[Self <: AnonFinalBearing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinalBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalBearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: LatLonEllipsoidalVincenty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

