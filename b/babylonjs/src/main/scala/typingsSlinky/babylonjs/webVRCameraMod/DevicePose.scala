package typingsSlinky.babylonjs.webVRCameraMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePose extends js.Object {
  /**
    * The angularAcceleration of the device, values in array are [x,y,z].
    */
  val angularAcceleration: Nullable[js.typedarray.Float32Array] = js.native
  /**
    * The angularVelocity of the device, values in array are [x,y,z].
    */
  val angularVelocity: Nullable[js.typedarray.Float32Array] = js.native
  /**
    * The linearAcceleration of the device, values in array are [x,y,z].
    */
  val linearAcceleration: Nullable[js.typedarray.Float32Array] = js.native
  /**
    * The linearVelocity of the device, values in array are [x,y,z].
    */
  val linearVelocity: Nullable[js.typedarray.Float32Array] = js.native
  /**
    * The orientation of the device in a quaternion array, values in array are [x,y,z,w].
    */
  val orientation: Nullable[js.typedarray.Float32Array] = js.native
  /**
    * The position of the device, values in array are [x,y,z].
    */
  val position: Nullable[js.typedarray.Float32Array] = js.native
}

object DevicePose {
  @scala.inline
  def apply(): DevicePose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePose]
  }
  @scala.inline
  implicit class DevicePoseOps[Self <: DevicePose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngularAcceleration(value: Nullable[js.typedarray.Float32Array]): Self = {
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
    def withAngularVelocity(value: Nullable[js.typedarray.Float32Array]): Self = {
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
    def withLinearAcceleration(value: Nullable[js.typedarray.Float32Array]): Self = {
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
    def withLinearVelocity(value: Nullable[js.typedarray.Float32Array]): Self = {
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
    def withOrientation(value: Nullable[js.typedarray.Float32Array]): Self = {
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
    def withPosition(value: Nullable[js.typedarray.Float32Array]): Self = {
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

