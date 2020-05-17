package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HingeConstraint extends Constraint {
  var motorEnabled: Boolean = js.native
  var motorEquation: RotationalMotorEquation = js.native
  var motorMaxForce: Double = js.native
  var motorMinForce: Double = js.native
  var motorTargetVelocity: Double = js.native
  def disableMotor(): Unit = js.native
  def enableMotor(): Unit = js.native
}

object HingeConstraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: Boolean,
    disable: () => Unit,
    disableMotor: () => Unit,
    enable: () => Unit,
    enableMotor: () => Unit,
    equations: js.Array[_],
    id: Double,
    motorEnabled: Boolean,
    motorEquation: RotationalMotorEquation,
    motorMaxForce: Double,
    motorMinForce: Double,
    motorTargetVelocity: Double,
    update: () => Unit
  ): HingeConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), disableMotor = js.Any.fromFunction0(disableMotor), enable = js.Any.fromFunction0(enable), enableMotor = js.Any.fromFunction0(enableMotor), equations = equations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], motorEnabled = motorEnabled.asInstanceOf[js.Any], motorEquation = motorEquation.asInstanceOf[js.Any], motorMaxForce = motorMaxForce.asInstanceOf[js.Any], motorMinForce = motorMinForce.asInstanceOf[js.Any], motorTargetVelocity = motorTargetVelocity.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[HingeConstraint]
  }
  @scala.inline
  implicit class HingeConstraintOps[Self <: HingeConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableMotor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMotor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableMotor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMotor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMotorEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motorEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotorEquation(value: RotationalMotorEquation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motorEquation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotorMaxForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motorMaxForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotorMinForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motorMinForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotorTargetVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motorTargetVelocity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

