package typingsSlinky.physijs.Physijs

import typingsSlinky.three.mod.Euler
import typingsSlinky.three.mod.Matrix4
import typingsSlinky.three.mod.Object3D
import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.ConeTwistConstraint")
@js.native
class ConeTwistConstraint protected () extends Constraint {
  def this(objecta: Object3D, objectb: Object3D, position: Vector3) = this()
  def disableMotor(): Unit = js.native
  def enableMotor(): Unit = js.native
  /* CompleteClass */
  override def getDefinition(): js.Any = js.native
  def setLimit(x: Double, y: Double, z: Double): Unit = js.native
  def setMaxMotorImpulse(max_impulse: Double): Unit = js.native
  def setMotorTarget(target: Euler): Unit = js.native
  def setMotorTarget(target: Matrix4): Unit = js.native
  def setMotorTarget(target: Vector3): Unit = js.native
}

