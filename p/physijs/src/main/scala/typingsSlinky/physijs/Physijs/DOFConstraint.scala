package typingsSlinky.physijs.Physijs

import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOFConstraint extends Constraint {
  def configureAngularMotor(which: Double, low_angle: Double, high_angle: Double, velocity: Double, max_force: Double): Unit = js.native
  def disableAngularMotor(which: Double): Unit = js.native
  def enableAngularMotor(which: Double): Unit = js.native
  def setAngularLowerLimit(limit: Vector3): Unit = js.native
  def setAngularUpperLimit(limit: Vector3): Unit = js.native
  def setLinearLowerLimit(limit: Vector3): Unit = js.native
  def setLinearUpperLimit(limit: Vector3): Unit = js.native
}

object DOFConstraint {
  @scala.inline
  def apply(
    configureAngularMotor: (Double, Double, Double, Double, Double) => Unit,
    disableAngularMotor: Double => Unit,
    enableAngularMotor: Double => Unit,
    getDefinition: () => js.Any,
    setAngularLowerLimit: Vector3 => Unit,
    setAngularUpperLimit: Vector3 => Unit,
    setLinearLowerLimit: Vector3 => Unit,
    setLinearUpperLimit: Vector3 => Unit
  ): DOFConstraint = {
    val __obj = js.Dynamic.literal(configureAngularMotor = js.Any.fromFunction5(configureAngularMotor), disableAngularMotor = js.Any.fromFunction1(disableAngularMotor), enableAngularMotor = js.Any.fromFunction1(enableAngularMotor), getDefinition = js.Any.fromFunction0(getDefinition), setAngularLowerLimit = js.Any.fromFunction1(setAngularLowerLimit), setAngularUpperLimit = js.Any.fromFunction1(setAngularUpperLimit), setLinearLowerLimit = js.Any.fromFunction1(setLinearLowerLimit), setLinearUpperLimit = js.Any.fromFunction1(setLinearUpperLimit))
    __obj.asInstanceOf[DOFConstraint]
  }
  @scala.inline
  implicit class DOFConstraintOps[Self <: DOFConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigureAngularMotor(value: (Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureAngularMotor")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withDisableAngularMotor(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAngularMotor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableAngularMotor(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAngularMotor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAngularLowerLimit(value: Vector3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAngularLowerLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAngularUpperLimit(value: Vector3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAngularUpperLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLinearLowerLimit(value: Vector3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLinearLowerLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLinearUpperLimit(value: Vector3 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLinearUpperLimit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

