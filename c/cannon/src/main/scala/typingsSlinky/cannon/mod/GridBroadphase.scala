package typingsSlinky.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "GridBroadphase")
@js.native
class GridBroadphase ()
  extends typingsSlinky.cannon.CANNON.GridBroadphase {
  def this(aabbMin: typingsSlinky.cannon.CANNON.Vec3) = this()
  def this(aabbMin: typingsSlinky.cannon.CANNON.Vec3, aabbMax: typingsSlinky.cannon.CANNON.Vec3) = this()
  def this(aabbMin: typingsSlinky.cannon.CANNON.Vec3, aabbMax: typingsSlinky.cannon.CANNON.Vec3, nx: Double) = this()
  def this(
    aabbMin: typingsSlinky.cannon.CANNON.Vec3,
    aabbMax: typingsSlinky.cannon.CANNON.Vec3,
    nx: Double,
    ny: Double
  ) = this()
  def this(
    aabbMin: typingsSlinky.cannon.CANNON.Vec3,
    aabbMax: typingsSlinky.cannon.CANNON.Vec3,
    nx: Double,
    ny: Double,
    nz: Double
  ) = this()
  /* CompleteClass */
  override var aabbMax: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var aabbMin: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var bins: js.Array[_] = js.native
  /* CompleteClass */
  override var dirty: Boolean = js.native
  /* CompleteClass */
  override var nx: Double = js.native
  /* CompleteClass */
  override var ny: Double = js.native
  /* CompleteClass */
  override var nz: Double = js.native
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

