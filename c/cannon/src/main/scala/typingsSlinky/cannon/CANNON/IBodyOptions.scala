package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBodyOptions extends js.Object {
  var allowSleep: js.UndefOr[Boolean] = js.native
  var angularDamping: js.UndefOr[Double] = js.native
  var angularVelocity: js.UndefOr[Vec3] = js.native
  var collisionFilterGroup: js.UndefOr[Double] = js.native
  var collisionFilterMask: js.UndefOr[Double] = js.native
  var fixedRotation: js.UndefOr[Boolean] = js.native
  var linearDamping: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var material: js.UndefOr[Material] = js.native
  var position: js.UndefOr[Vec3] = js.native
  var quaternion: js.UndefOr[Quaternion] = js.native
  var shape: js.UndefOr[Shape] = js.native
  var sleepSpeedLimit: js.UndefOr[Double] = js.native
  var sleepTimeLimit: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[Vec3] = js.native
}

object IBodyOptions {
  @scala.inline
  def apply(): IBodyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyOptions]
  }
  @scala.inline
  implicit class IBodyOptionsOps[Self <: IBodyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSleep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSleep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSleep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSleep")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularDamping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularDamping")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularVelocity(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionFilterGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionFilterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilterGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionFilterMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilterMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionFilterMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilterMask")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withLinearDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearDamping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearDamping")(js.undefined)
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
    def withMaterial(value: Material): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withQuaternion(value: Quaternion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quaternion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuaternion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quaternion")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSleepSpeedLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepSpeedLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSleepSpeedLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepSpeedLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSleepTimeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepTimeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSleepTimeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sleepTimeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocity(value: Vec3): Self = {
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

