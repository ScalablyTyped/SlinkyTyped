package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrismaticConstraintOptions extends ConstraintOptions {
  var disableRotationalLock: js.UndefOr[Boolean] = js.native
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localAxisA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var lowerLimit: js.UndefOr[Double] = js.native
  var maxForce: js.UndefOr[Double] = js.native
  var upperLimit: js.UndefOr[Double] = js.native
}

object PrismaticConstraintOptions {
  @scala.inline
  def apply(): PrismaticConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrismaticConstraintOptions]
  }
  @scala.inline
  implicit class PrismaticConstraintOptionsOps[Self <: PrismaticConstraintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableRotationalLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRotationalLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRotationalLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRotationalLock")(js.undefined)
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
    def withLocalAxisA(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAxisA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAxisA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAxisA")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLimit")(js.undefined)
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
    def withUpperLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLimit")(js.undefined)
        ret
    }
  }
  
}

