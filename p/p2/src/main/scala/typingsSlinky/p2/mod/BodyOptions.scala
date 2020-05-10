package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyOptions extends js.Object {
  var allowSleep: js.UndefOr[Boolean] = js.native
  var angle: js.UndefOr[Double] = js.native
  var angularDamping: js.UndefOr[Double] = js.native
  var angularForce: js.UndefOr[Double] = js.native
  var angularVelocity: js.UndefOr[Double] = js.native
  var ccdIterations: js.UndefOr[Double] = js.native
  var ccdSpeedThreshold: js.UndefOr[Double] = js.native
  var collisionResponse: js.UndefOr[Boolean] = js.native
  var fixedRotation: js.UndefOr[Boolean] = js.native
  var fixedX: js.UndefOr[Boolean] = js.native
  var fixedY: js.UndefOr[Boolean] = js.native
  var force: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var gravityScale: js.UndefOr[Double] = js.native
  var id: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var position: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var sleepSpeedLimit: js.UndefOr[Double] = js.native
  var sleepTimeLimit: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object BodyOptions {
  @scala.inline
  def apply(): BodyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyOptions]
  }
  @scala.inline
  implicit class BodyOptionsOps[Self <: BodyOptions] (val x: Self) extends AnyVal {
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
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
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
    def withAngularForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngularForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularForce")(js.undefined)
        ret
    }
    @scala.inline
    def withAngularVelocity(value: Double): Self = {
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
    def withCcdIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccdIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcdIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccdIterations")(js.undefined)
        ret
    }
    @scala.inline
    def withCcdSpeedThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccdSpeedThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcdSpeedThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccdSpeedThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionResponse")(js.undefined)
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
    def withFixedX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedX")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedY")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withGravityScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityScale")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withPosition(value: js.Tuple2[Double, Double]): Self = {
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
    def withVelocity(value: js.Tuple2[Double, Double]): Self = {
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

