package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlyToInterpolatorProps extends js.Object {
  var curve: js.UndefOr[Double] = js.native
  var maxDuraiton: js.UndefOr[Double] = js.native
  var screenSpeed: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
}

object FlyToInterpolatorProps {
  @scala.inline
  def apply(): FlyToInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlyToInterpolatorProps]
  }
  @scala.inline
  implicit class FlyToInterpolatorPropsOps[Self <: FlyToInterpolatorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurve(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDuraiton(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDuraiton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDuraiton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDuraiton")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
  }
  
}

