package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConeTwistConstraintOptions extends js.Object {
  var axisA: js.UndefOr[Vec3] = js.native
  var axisB: js.UndefOr[Vec3] = js.native
  var maxForce: js.UndefOr[Double] = js.native
  var pivotA: js.UndefOr[Vec3] = js.native
  var pivotB: js.UndefOr[Vec3] = js.native
}

object IConeTwistConstraintOptions {
  @scala.inline
  def apply(): IConeTwistConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConeTwistConstraintOptions]
  }
  @scala.inline
  implicit class IConeTwistConstraintOptionsOps[Self <: IConeTwistConstraintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisA(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisA")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisB(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisB")(js.undefined)
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
    def withPivotA(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotA")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotB(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotB")(js.undefined)
        ret
    }
  }
  
}

