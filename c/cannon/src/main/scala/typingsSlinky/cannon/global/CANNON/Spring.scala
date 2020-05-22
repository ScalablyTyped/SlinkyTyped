package typingsSlinky.cannon.global.CANNON

import typingsSlinky.cannon.CANNON.ISpringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Spring")
@js.native
class Spring ()
  extends typingsSlinky.cannon.CANNON.Spring {
  def this(options: ISpringOptions) = this()
  /* CompleteClass */
  override var bodyA: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var bodyB: typingsSlinky.cannon.CANNON.Body = js.native
  /* CompleteClass */
  override var damping: Double = js.native
  /* CompleteClass */
  override var localAnchorA: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var localAnchorB: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var restLength: Double = js.native
  /* CompleteClass */
  override var stffness: Double = js.native
  /* CompleteClass */
  override def applyForce(): Unit = js.native
  /* CompleteClass */
  override def getWorldAnchorA(result: typingsSlinky.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def getWorldAnchorB(result: typingsSlinky.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def setWorldAnchorA(worldAnchorA: typingsSlinky.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def setWorldAnchorB(worldAnchorB: typingsSlinky.cannon.CANNON.Vec3): Unit = js.native
}

