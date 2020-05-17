package typingsSlinky.physijs.Physijs

import typingsSlinky.three.mod.Euler
import typingsSlinky.three.mod.Matrix4
import typingsSlinky.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConeTwistConstraint extends Constraint {
  def disableMotor(): Unit = js.native
  def enableMotor(): Unit = js.native
  def setLimit(x: Double, y: Double, z: Double): Unit = js.native
  def setMaxMotorImpulse(max_impulse: Double): Unit = js.native
  def setMotorTarget(target: Euler): Unit = js.native
  def setMotorTarget(target: Matrix4): Unit = js.native
  def setMotorTarget(target: Vector3): Unit = js.native
}

