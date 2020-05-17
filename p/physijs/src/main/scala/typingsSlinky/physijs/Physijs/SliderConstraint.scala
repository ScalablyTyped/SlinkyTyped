package typingsSlinky.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderConstraint extends Constraint {
  def disableAngularMotor(): Unit = js.native
  def disableLinearMotor(): Unit = js.native
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
  def enableLinearMotor(velocity: Double, acceleration: Double): Unit = js.native
  def setLimits(lin_lower: Double, lin_upper: Double, ang_lower: Double, ang_upper: Double): Unit = js.native
  def setRestitution(linear: Double, angular: Double): Unit = js.native
}

object SliderConstraint {
  @scala.inline
  def apply(
    disableAngularMotor: () => Unit,
    disableLinearMotor: () => Unit,
    enableAngularMotor: (Double, Double) => Unit,
    enableLinearMotor: (Double, Double) => Unit,
    getDefinition: () => js.Any,
    setLimits: (Double, Double, Double, Double) => Unit,
    setRestitution: (Double, Double) => Unit
  ): SliderConstraint = {
    val __obj = js.Dynamic.literal(disableAngularMotor = js.Any.fromFunction0(disableAngularMotor), disableLinearMotor = js.Any.fromFunction0(disableLinearMotor), enableAngularMotor = js.Any.fromFunction2(enableAngularMotor), enableLinearMotor = js.Any.fromFunction2(enableLinearMotor), getDefinition = js.Any.fromFunction0(getDefinition), setLimits = js.Any.fromFunction4(setLimits), setRestitution = js.Any.fromFunction2(setRestitution))
    __obj.asInstanceOf[SliderConstraint]
  }
  @scala.inline
  implicit class SliderConstraintOps[Self <: SliderConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableAngularMotor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAngularMotor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableLinearMotor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLinearMotor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableAngularMotor(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAngularMotor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEnableLinearMotor(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinearMotor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetLimits(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLimits")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetRestitution(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRestitution")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

