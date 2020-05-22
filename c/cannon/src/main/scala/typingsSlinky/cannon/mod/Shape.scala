package typingsSlinky.cannon.mod

import typingsSlinky.cannon.anon.BOX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Shape")
@js.native
class Shape ()
  extends typingsSlinky.cannon.CANNON.Shape {
  /* CompleteClass */
  override var boundingSphereRadius: Double = js.native
  /* CompleteClass */
  override var collisionResponse: Boolean = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typingsSlinky.cannon.CANNON.Vec3): typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  /* CompleteClass */
  override def volume(): Double = js.native
}

/* static members */
@JSImport("cannon", "Shape")
@js.native
object Shape extends js.Object {
  var types: BOX = js.native
}

