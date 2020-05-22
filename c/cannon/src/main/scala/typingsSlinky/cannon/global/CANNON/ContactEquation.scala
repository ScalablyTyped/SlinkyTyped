package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ContactEquation")
@js.native
class ContactEquation protected ()
  extends typingsSlinky.cannon.CANNON.ContactEquation {
  def this(bi: typingsSlinky.cannon.CANNON.Body, bj: typingsSlinky.cannon.CANNON.Body) = this()
  /* CompleteClass */
  override var a: Double = js.native
  /* CompleteClass */
  override var b: Double = js.native
  /* CompleteClass */
  override var bi: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var biInvInertiaTimesRixn: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var bj: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bjInvInertiaTimesRjxn: typingsSlinky.cannon.CANNON.Vec3 = js.native
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
  override var penetrationVec: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var restitution: Double = js.native
  /* CompleteClass */
  override var ri: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rixn: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rj: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rjxn: typingsSlinky.cannon.CANNON.Vec3 = js.native
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

