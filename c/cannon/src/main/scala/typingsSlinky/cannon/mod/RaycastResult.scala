package typingsSlinky.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "RaycastResult")
@js.native
class RaycastResult ()
  extends typingsSlinky.cannon.CANNON.RaycastResult {
  /* CompleteClass */
  override var body: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var distance: Double = js.native
  /* CompleteClass */
  override var hasHit: Boolean = js.native
  /* CompleteClass */
  override var hitNormalWorld: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var hitPointWorld: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rayFromWorld: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var rayToWorld: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var shape: typingsSlinky.cannon.CANNON.Shape = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def set(
    rayFromWorld: typingsSlinky.cannon.CANNON.Vec3,
    rayToWorld: typingsSlinky.cannon.CANNON.Vec3,
    hitNormalWorld: typingsSlinky.cannon.CANNON.Vec3,
    hitPointWorld: typingsSlinky.cannon.CANNON.Vec3,
    shape: typingsSlinky.cannon.CANNON.Shape,
    body: typingsSlinky.cannon.CANNON.Body,
    distance: Double
  ): Unit = js.native
}

