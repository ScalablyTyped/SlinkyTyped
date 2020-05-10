package typingsSlinky.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  var leftSideBearing: Double = js.native
  var rightSideBearing: js.UndefOr[Double] = js.native
  var xMax: Double = js.native
  var xMin: Double = js.native
  var yMax: Double = js.native
  var yMin: Double = js.native
}

object Metrics {
  @scala.inline
  def apply(leftSideBearing: Double, xMax: Double, xMin: Double, yMax: Double, yMin: Double): Metrics = {
    val __obj = js.Dynamic.literal(leftSideBearing = leftSideBearing.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftSideBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftSideBearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightSideBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSideBearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSideBearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSideBearing")(js.undefined)
        ret
    }
  }
  
}

