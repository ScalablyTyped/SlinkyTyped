package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RotationalEquation")
@js.native
class RotationalEquation protected ()
  extends typingsSlinky.cannon.CANNON.RotationalEquation {
  def this(bodyA: typingsSlinky.cannon.CANNON.Body, bodyB: typingsSlinky.cannon.CANNON.Body) = this()
  /* CompleteClass */
  override var a: Double = js.native
  /* CompleteClass */
  override var b: Double = js.native
  /* CompleteClass */
  override var bi: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bj: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /* CompleteClass */
  override var eps: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var invIi: typingsSlinky.cannon.CANNON.Mat3 = js.native
  /* CompleteClass */
  override var invIj: typingsSlinky.cannon.CANNON.Mat3 = js.native
  /* CompleteClass */
  override var jacobianElementA: typingsSlinky.cannon.CANNON.JacobianElement = js.native
  /* CompleteClass */
  override var jacobianElementB: typingsSlinky.cannon.CANNON.JacobianElement = js.native
  /* CompleteClass */
  override var maxForce: Double = js.native
  /* CompleteClass */
  override var minForce: Double = js.native
  /* CompleteClass */
  override var ni: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var nixnj: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var nj: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var njxni: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var relForce: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var relVel: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def addToWlamda(deltalambda: Double): Double = js.native
  /* CompleteClass */
  override def computeB(a: Double, b: Double, h: Double): Double = js.native
  /* CompleteClass */
  override def computeC(): Double = js.native
  /* CompleteClass */
  override def computeGW(): Double = js.native
  /* CompleteClass */
  override def computeGWlamda(): Double = js.native
  /* CompleteClass */
  override def computeGiMGt(): Double = js.native
  /* CompleteClass */
  override def computeGiMf(): Double = js.native
  /* CompleteClass */
  override def computeGq(): Double = js.native
  /* CompleteClass */
  override def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
}

