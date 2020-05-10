package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceConstraintOptions extends ConstraintOptions {
  var distance: js.UndefOr[Double] = js.native
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var maxForce: js.UndefOr[Double] = js.native
}

object DistanceConstraintOptions {
  @scala.inline
  def apply(): DistanceConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceConstraintOptions]
  }
  @scala.inline
  implicit class DistanceConstraintOptionsOps[Self <: DistanceConstraintOptions] (val x: Self) extends AnyVal {
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
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAnchorA(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAnchorA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorA")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAnchorB(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAnchorB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorB")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxForce")(js.undefined)
        ret
    }
  }
  
}

