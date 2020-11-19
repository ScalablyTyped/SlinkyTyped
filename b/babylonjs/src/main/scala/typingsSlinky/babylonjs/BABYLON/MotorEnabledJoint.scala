package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babylonjs.BABYLON.IMotorEnabledJoint because var conflicts: physicsJoint. Inlined setMotor, setMotor, setMotor, setMotor, setMotor, setMotor, setMotor, setMotor, setLimit, setLimit, setLimit, setLimit */ @js.native
trait MotorEnabledJoint extends PhysicsJoint {
  
  /**
    * Set the motor's limits.
    * Attention, this function is plugin specific. Engines won't react 100% the same.
    * @param upperLimit The upper limit of the motor
    * @param lowerLimit The lower limit of the motor
    */
  /**
    * Sets the limit of the motor
    * @param upperLimit The upper limit of the motor
    * @param lowerLimit The lower limit of the motor
    * @param motorIndex The index of the motor
    */
  def setLimit(upperLimit: Double): Unit = js.native
  def setLimit(upperLimit: Double, lowerLimit: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
  def setLimit(upperLimit: Double, lowerLimit: Double): Unit = js.native
  def setLimit(upperLimit: Double, lowerLimit: Double, motorIndex: Double): Unit = js.native
  
  /**
    * Set the motor values.
    * Attention, this function is plugin specific. Engines won't react 100% the same.
    * @param force the force to apply
    * @param maxForce max force for this motor.
    */
  /**
    * Sets the motor of the motor-enabled joint
    * @param force The force of the motor
    * @param maxForce The maximum force of the motor
    * @param motorIndex The index of the motor
    */
  def setMotor(): Unit = js.native
  def setMotor(force: js.UndefOr[scala.Nothing], maxForce: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
  def setMotor(force: js.UndefOr[scala.Nothing], maxForce: Double): Unit = js.native
  def setMotor(force: js.UndefOr[scala.Nothing], maxForce: Double, motorIndex: Double): Unit = js.native
  def setMotor(force: Double): Unit = js.native
  def setMotor(force: Double, maxForce: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
  def setMotor(force: Double, maxForce: Double): Unit = js.native
  def setMotor(force: Double, maxForce: Double, motorIndex: Double): Unit = js.native
}
