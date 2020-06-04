package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Damping extends js.Object {
  var damping: Double
  var duration: js.UndefOr[scala.Nothing] = js.undefined
  var easing: js.UndefOr[scala.Nothing] = js.undefined
  var mass: Double
  var overshootClamping: Boolean
  var restDisplacementThreshold: Double
  var restSpeedThreshold: Double
  var stiffness: Double
  var timing: FnCallValueConfig
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    @scala.inline
    def setOvershootClamping(value: Boolean): Self = this.set("overshootClamping", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestDisplacementThreshold(value: Double): Self = this.set("restDisplacementThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestSpeedThreshold(value: Double): Self = this.set("restSpeedThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiming(value: FnCallValueConfig): Self = this.set("timing", value.asInstanceOf[js.Any])
  }
  
}

