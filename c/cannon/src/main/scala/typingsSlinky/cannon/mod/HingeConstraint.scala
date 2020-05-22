package typingsSlinky.cannon.mod

import typingsSlinky.cannon.CANNON.IHingeConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "HingeConstraint")
@js.native
class HingeConstraint protected ()
  extends typingsSlinky.cannon.CANNON.HingeConstraint {
  def this(bodyA: typingsSlinky.cannon.CANNON.Body, bodyB: typingsSlinky.cannon.CANNON.Body) = this()
  def this(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    options: IHingeConstraintOptions
  ) = this()
  /* CompleteClass */
  override var bodyA: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bodyB: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var collideConnected: Boolean = js.native
  /* CompleteClass */
  override var equations: js.Array[_] = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var motorEnabled: Boolean = js.native
  /* CompleteClass */
  override var motorEquation: typingsSlinky.cannon.CANNON.RotationalMotorEquation = js.native
  /* CompleteClass */
  override var motorMaxForce: Double = js.native
  /* CompleteClass */
  override var motorMinForce: Double = js.native
  /* CompleteClass */
  override var motorTargetVelocity: Double = js.native
  /* CompleteClass */
  override def disable(): Unit = js.native
  /* CompleteClass */
  override def disableMotor(): Unit = js.native
  /* CompleteClass */
  override def enable(): Unit = js.native
  /* CompleteClass */
  override def enableMotor(): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

