package typingsSlinky.reactNative.mod.Animated

import typingsSlinky.reactNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecayAnimationConfig extends AnimationConfig {
  var deceleration: js.UndefOr[Double] = js.native
  var velocity: Double | X = js.native
}

object DecayAnimationConfig {
  @scala.inline
  def apply(useNativeDriver: Boolean, velocity: Double | X): DecayAnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayAnimationConfig]
  }
  @scala.inline
  implicit class DecayAnimationConfigOps[Self <: DecayAnimationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVelocity(value: Double | X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceleration")(js.undefined)
        ret
    }
  }
  
}

