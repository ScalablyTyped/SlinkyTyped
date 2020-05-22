package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Sphere")
@js.native
class Sphere protected ()
  extends typingsSlinky.cannon.CANNON.Sphere {
  def this(radius: Double) = this()
  /* CompleteClass */
  override var boundingSphereRadius: Double = js.native
  /* CompleteClass */
  override var collisionResponse: Boolean = js.native
  /* CompleteClass */
  override var radius: Double = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typingsSlinky.cannon.CANNON.Vec3): typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  /* CompleteClass */
  override def volume(): Double = js.native
}

