package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringOptions extends js.Object {
  var damping: js.UndefOr[Double] = js.native
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var worldAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var worldAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object SpringOptions {
  @scala.inline
  def apply(): SpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringOptions]
  }
  @scala.inline
  implicit class SpringOptionsOps[Self <: SpringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(js.undefined)
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
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(js.undefined)
        ret
    }
    @scala.inline
    def withWorldAnchorA(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldAnchorA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldAnchorA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldAnchorA")(js.undefined)
        ret
    }
    @scala.inline
    def withWorldAnchorB(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldAnchorB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldAnchorB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldAnchorB")(js.undefined)
        ret
    }
  }
  
}

