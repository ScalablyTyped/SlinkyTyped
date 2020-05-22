package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Ray")
@js.native
class Ray ()
  extends typingsSlinky.cannon.CANNON.Ray {
  def this(from: typingsSlinky.cannon.CANNON.Vec3) = this()
  def this(from: typingsSlinky.cannon.CANNON.Vec3, to: typingsSlinky.cannon.CANNON.Vec3) = this()
  /* CompleteClass */
  override var checkCollisionResponse: Boolean = js.native
  /* CompleteClass */
  override var from: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var precision: Double = js.native
  /* CompleteClass */
  override var to: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def getAABB(result: typingsSlinky.cannon.CANNON.RaycastResult): Unit = js.native
}

