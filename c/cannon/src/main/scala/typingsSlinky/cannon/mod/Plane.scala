package typingsSlinky.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Plane")
@js.native
class Plane ()
  extends typingsSlinky.cannon.CANNON.Plane {
  /* CompleteClass */
  override var boundingSphereRadius: Double = js.native
  /* CompleteClass */
  override var collisionResponse: Boolean = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override var worldNormal: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var worldNormalNeedsUpdate: Boolean = js.native
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typingsSlinky.cannon.CANNON.Vec3): typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def calculateWorldAABB(
    pos: typingsSlinky.cannon.CANNON.Vec3,
    quat: typingsSlinky.cannon.CANNON.Quaternion,
    min: Double,
    max: Double
  ): Unit = js.native
  /* CompleteClass */
  override def computeWorldNormal(quat: typingsSlinky.cannon.CANNON.Quaternion): Unit = js.native
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  /* CompleteClass */
  override def volume(): Double = js.native
}

