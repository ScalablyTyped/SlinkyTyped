package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.NaiveBroadphase")
@js.native
class NaiveBroadphase ()
  extends typingsSlinky.cannon.CANNON.BroadPhase {
  /* CompleteClass */
  override var dirty: Boolean = js.native
  /* CompleteClass */
  override var useBoundingBoxes: Boolean = js.native
  /* CompleteClass */
  override var world: typingsSlinky.cannon.CANNON.World = js.native
  /* CompleteClass */
  override def aabbQuery(
    world: typingsSlinky.cannon.CANNON.World,
    aabb: typingsSlinky.cannon.CANNON.AABB,
    result: js.Array[typingsSlinky.cannon.CANNON.Body]
  ): js.Array[typingsSlinky.cannon.CANNON.Body] = js.native
  /* CompleteClass */
  override def boundingSphereCheck(bodyA: typingsSlinky.cannon.CANNON.Body, bodyB: typingsSlinky.cannon.CANNON.Body): Boolean = js.native
  /* CompleteClass */
  override def collisionPairs(
    world: typingsSlinky.cannon.CANNON.World,
    p1: js.Array[typingsSlinky.cannon.CANNON.Body],
    p2: js.Array[typingsSlinky.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def doBoundingBoxBroadphase(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    pairs1: js.Array[typingsSlinky.cannon.CANNON.Body],
    pairs2: js.Array[typingsSlinky.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def doBoundingSphereBroadphase(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    pairs1: js.Array[typingsSlinky.cannon.CANNON.Body],
    pairs2: js.Array[typingsSlinky.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def intersectionTest(
    bodyA: typingsSlinky.cannon.CANNON.Body,
    bodyB: typingsSlinky.cannon.CANNON.Body,
    pairs1: js.Array[typingsSlinky.cannon.CANNON.Body],
    pairs2: js.Array[typingsSlinky.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def makePairsUnique(
    pairs1: js.Array[typingsSlinky.cannon.CANNON.Body],
    pairs2: js.Array[typingsSlinky.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def needBroadphaseCollision(bodyA: typingsSlinky.cannon.CANNON.Body, bodyB: typingsSlinky.cannon.CANNON.Body): Boolean = js.native
  /* CompleteClass */
  override def setWorld(world: typingsSlinky.cannon.CANNON.World): Unit = js.native
}

