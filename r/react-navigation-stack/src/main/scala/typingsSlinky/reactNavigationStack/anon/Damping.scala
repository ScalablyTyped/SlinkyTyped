package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Damping extends js.Object {
  var damping: Double = js.native
  var duration: js.UndefOr[scala.Nothing] = js.native
  var easing: js.UndefOr[scala.Nothing] = js.native
  var mass: Double = js.native
  var overshootClamping: Boolean = js.native
  var restDisplacementThreshold: Double = js.native
  var restSpeedThreshold: Double = js.native
  var stiffness: Double = js.native
  var timing: FnCallValueConfig = js.native
}

object Damping {
  @scala.inline
  def apply(
    damping: Double,
    mass: Double,
    overshootClamping: Boolean,
    restDisplacementThreshold: Double,
    restSpeedThreshold: Double,
    stiffness: Double,
    timing: FnCallValueConfig
  ): Damping = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any], overshootClamping = overshootClamping.asInstanceOf[js.Any], restDisplacementThreshold = restDisplacementThreshold.asInstanceOf[js.Any], restSpeedThreshold = restSpeedThreshold.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damping]
  }
  @scala.inline
  implicit class DampingOps[Self <: Damping] (val x: Self) extends AnyVal {
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
    def withMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOvershootClamping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootClamping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestDisplacementThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restDisplacementThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestSpeedThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restSpeedThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiming(value: FnCallValueConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

