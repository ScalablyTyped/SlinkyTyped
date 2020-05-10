package typingsSlinky.reactNative.mod.Animated

import typingsSlinky.reactNative.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringAnimationConfig extends AnimationConfig {
  var bounciness: js.UndefOr[Double] = js.native
  var damping: js.UndefOr[Double] = js.native
  var delay: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var overshootClamping: js.UndefOr[Boolean] = js.native
  var restDisplacementThreshold: js.UndefOr[Double] = js.native
  var restSpeedThreshold: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var tension: js.UndefOr[Double] = js.native
  var toValue: Double | AnimatedValue | AnonX | AnimatedValueXY = js.native
  var velocity: js.UndefOr[Double | AnonX] = js.native
}

object SpringAnimationConfig {
  @scala.inline
  def apply(toValue: Double | AnimatedValue | AnonX | AnimatedValueXY, useNativeDriver: Boolean): SpringAnimationConfig = {
    val __obj = js.Dynamic.literal(toValue = toValue.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringAnimationConfig]
  }
  @scala.inline
  implicit class SpringAnimationConfigOps[Self <: SpringAnimationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToValue(value: Double | AnimatedValue | AnonX | AnimatedValueXY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounciness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounciness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounciness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounciness")(js.undefined)
        ret
    }
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
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(js.undefined)
        ret
    }
    @scala.inline
    def withOvershootClamping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootClamping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOvershootClamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootClamping")(js.undefined)
        ret
    }
    @scala.inline
    def withRestDisplacementThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restDisplacementThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestDisplacementThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restDisplacementThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withRestSpeedThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restSpeedThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestSpeedThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restSpeedThreshold")(js.undefined)
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
    def withTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocity(value: Double | AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(js.undefined)
        ret
    }
  }
  
}

