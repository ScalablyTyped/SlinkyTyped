package typingsSlinky.popmotion.physicsTypesMod

import typingsSlinky.popmotion.popmotionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsProps extends js.Object {
  var acceleration: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var from: js.UndefOr[Double] = js.native
  var restSpeed: js.UndefOr[Double | `false`] = js.native
  var springStrength: js.UndefOr[Double] = js.native
  var to: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object PhysicsProps {
  @scala.inline
  def apply(): PhysicsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsProps]
  }
  @scala.inline
  implicit class PhysicsPropsOps[Self <: PhysicsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(js.undefined)
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
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withRestSpeed(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springStrength")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocity(value: Double): Self = {
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

