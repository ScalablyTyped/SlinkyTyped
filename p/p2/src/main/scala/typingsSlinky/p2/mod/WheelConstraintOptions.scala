package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WheelConstraintOptions extends js.Object {
  var localForwardVector: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localPosition: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var sideFriction: js.UndefOr[Double] = js.native
}

object WheelConstraintOptions {
  @scala.inline
  def apply(): WheelConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelConstraintOptions]
  }
  @scala.inline
  implicit class WheelConstraintOptionsOps[Self <: WheelConstraintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalForwardVector(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localForwardVector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalForwardVector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localForwardVector")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalPosition(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSideFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideFriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideFriction")(js.undefined)
        ret
    }
  }
  
}

