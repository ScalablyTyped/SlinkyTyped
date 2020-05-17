package typingsSlinky.geodesy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distance extends js.Object {
  var distance: Double = js.native
  var finalBearing: Double = js.native
  var initialBearing: Double = js.native
  var iterations: Double = js.native
}

object Distance {
  @scala.inline
  def apply(distance: Double, finalBearing: Double, initialBearing: Double, iterations: Double): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], finalBearing = finalBearing.asInstanceOf[js.Any], initialBearing = initialBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  @scala.inline
  implicit class DistanceOps[Self <: Distance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalBearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialBearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

