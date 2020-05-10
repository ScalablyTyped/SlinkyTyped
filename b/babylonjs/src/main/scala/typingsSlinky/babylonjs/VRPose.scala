package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRPose extends js.Object {
  val angularAcceleration: js.typedarray.Float32Array | Null = js.native
  val angularVelocity: js.typedarray.Float32Array | Null = js.native
  val linearAcceleration: js.typedarray.Float32Array | Null = js.native
  val linearVelocity: js.typedarray.Float32Array | Null = js.native
  val orientation: js.typedarray.Float32Array | Null = js.native
  val position: js.typedarray.Float32Array | Null = js.native
  val timestamp: Double = js.native
}

object VRPose {
  @scala.inline
  def apply(timestamp: Double): VRPose = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRPose]
  }
  @scala.inline
  implicit class VRPoseOps[Self <: VRPose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularAcceleration(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularAccelerationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularAcceleration")(null)
        ret
    }
    @scala.inline
    def withAngularVelocity(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularVelocityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(null)
        ret
    }
    @scala.inline
    def withLinearAcceleration(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearAccelerationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearAcceleration")(null)
        ret
    }
    @scala.inline
    def withLinearVelocity(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearVelocityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearVelocity")(null)
        ret
    }
    @scala.inline
    def withOrientation(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(null)
        ret
    }
    @scala.inline
    def withPosition(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(null)
        ret
    }
  }
  
}

