package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevoluteConstraintOptions extends ConstraintOptions {
  var localPivotA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localPivotB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var maxForce: js.UndefOr[Double] = js.native
  var worldPivot: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object RevoluteConstraintOptions {
  @scala.inline
  def apply(): RevoluteConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevoluteConstraintOptions]
  }
  @scala.inline
  implicit class RevoluteConstraintOptionsOps[Self <: RevoluteConstraintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalPivotA(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPivotA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPivotA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPivotA")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalPivotB(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPivotB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPivotB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPivotB")(js.undefined)
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
    @scala.inline
    def withWorldPivot(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldPivot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldPivot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldPivot")(js.undefined)
        ret
    }
  }
  
}

