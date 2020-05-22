package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.SAPBroadphase")
@js.native
class SAPBroadphase ()
  extends typingsSlinky.cannon.CANNON.SAPBroadphase {
  def this(world: typingsSlinky.cannon.CANNON.World) = this()
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

/* static members */
@JSGlobal("CANNON.SAPBroadphase")
@js.native
object SAPBroadphase extends js.Object {
  def checkBounds(bi: typingsSlinky.cannon.CANNON.Body, bj: typingsSlinky.cannon.CANNON.Body): Boolean = js.native
  def checkBounds(bi: typingsSlinky.cannon.CANNON.Body, bj: typingsSlinky.cannon.CANNON.Body, axisIndex: Double): Boolean = js.native
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}

