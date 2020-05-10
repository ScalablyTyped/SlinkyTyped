package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockConstraintOptions extends ConstraintOptions {
  var localAngleB: js.UndefOr[Double] = js.native
  var localOffsetB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var maxForce: js.UndefOr[Double] = js.native
}

object LockConstraintOptions {
  @scala.inline
  def apply(): LockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockConstraintOptions]
  }
  @scala.inline
  implicit class LockConstraintOptionsOps[Self <: LockConstraintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalAngleB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAngleB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAngleB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAngleB")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalOffsetB(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localOffsetB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalOffsetB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localOffsetB")(js.undefined)
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

