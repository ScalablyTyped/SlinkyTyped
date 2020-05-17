package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadPhase extends js.Object {
  var dirty: Boolean = js.native
  var useBoundingBoxes: Boolean = js.native
  var world: World = js.native
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  def boundingSphereCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  def collisionPairs(world: World, p1: js.Array[Body], p2: js.Array[Body]): Unit = js.native
  def doBoundingBoxBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit = js.native
  def doBoundingSphereBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit = js.native
  def intersectionTest(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit = js.native
  def makePairsUnique(pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit = js.native
  def needBroadphaseCollision(bodyA: Body, bodyB: Body): Boolean = js.native
  def setWorld(world: World): Unit = js.native
}

object BroadPhase {
  @scala.inline
  def apply(
    aabbQuery: (World, AABB, js.Array[Body]) => js.Array[Body],
    boundingSphereCheck: (Body, Body) => Boolean,
    collisionPairs: (World, js.Array[Body], js.Array[Body]) => Unit,
    dirty: Boolean,
    doBoundingBoxBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    doBoundingSphereBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    intersectionTest: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    makePairsUnique: (js.Array[Body], js.Array[Body]) => Unit,
    needBroadphaseCollision: (Body, Body) => Boolean,
    setWorld: World => Unit,
    useBoundingBoxes: Boolean,
    world: World
  ): BroadPhase = {
    val __obj = js.Dynamic.literal(aabbQuery = js.Any.fromFunction3(aabbQuery), boundingSphereCheck = js.Any.fromFunction2(boundingSphereCheck), collisionPairs = js.Any.fromFunction3(collisionPairs), dirty = dirty.asInstanceOf[js.Any], doBoundingBoxBroadphase = js.Any.fromFunction4(doBoundingBoxBroadphase), doBoundingSphereBroadphase = js.Any.fromFunction4(doBoundingSphereBroadphase), intersectionTest = js.Any.fromFunction4(intersectionTest), makePairsUnique = js.Any.fromFunction2(makePairsUnique), needBroadphaseCollision = js.Any.fromFunction2(needBroadphaseCollision), setWorld = js.Any.fromFunction1(setWorld), useBoundingBoxes = useBoundingBoxes.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadPhase]
  }
  @scala.inline
  implicit class BroadPhaseOps[Self <: BroadPhase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAabbQuery(value: (World, AABB, js.Array[Body]) => js.Array[Body]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabbQuery")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBoundingSphereCheck(value: (Body, Body) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingSphereCheck")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCollisionPairs(value: (World, js.Array[Body], js.Array[Body]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionPairs")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoBoundingBoxBroadphase(value: (Body, Body, js.Array[Body], js.Array[Body]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doBoundingBoxBroadphase")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDoBoundingSphereBroadphase(value: (Body, Body, js.Array[Body], js.Array[Body]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doBoundingSphereBroadphase")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIntersectionTest(value: (Body, Body, js.Array[Body], js.Array[Body]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionTest")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMakePairsUnique(value: (js.Array[Body], js.Array[Body]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makePairsUnique")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNeedBroadphaseCollision(value: (Body, Body) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needBroadphaseCollision")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetWorld(value: World => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWorld")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseBoundingBoxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBoundingBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorld(value: World): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("world")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

