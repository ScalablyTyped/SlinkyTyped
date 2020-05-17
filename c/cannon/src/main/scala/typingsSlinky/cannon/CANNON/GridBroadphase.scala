package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBroadphase extends BroadPhase {
  var aabbMax: Vec3 = js.native
  var aabbMin: Vec3 = js.native
  var bins: js.Array[_] = js.native
  var nx: Double = js.native
  var ny: Double = js.native
  var nz: Double = js.native
}

object GridBroadphase {
  @scala.inline
  def apply(
    aabbMax: Vec3,
    aabbMin: Vec3,
    aabbQuery: (World, AABB, js.Array[Body]) => js.Array[Body],
    bins: js.Array[_],
    boundingSphereCheck: (Body, Body) => Boolean,
    collisionPairs: (World, js.Array[Body], js.Array[Body]) => Unit,
    dirty: Boolean,
    doBoundingBoxBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    doBoundingSphereBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    intersectionTest: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    makePairsUnique: (js.Array[Body], js.Array[Body]) => Unit,
    needBroadphaseCollision: (Body, Body) => Boolean,
    nx: Double,
    ny: Double,
    nz: Double,
    setWorld: World => Unit,
    useBoundingBoxes: Boolean,
    world: World
  ): GridBroadphase = {
    val __obj = js.Dynamic.literal(aabbMax = aabbMax.asInstanceOf[js.Any], aabbMin = aabbMin.asInstanceOf[js.Any], aabbQuery = js.Any.fromFunction3(aabbQuery), bins = bins.asInstanceOf[js.Any], boundingSphereCheck = js.Any.fromFunction2(boundingSphereCheck), collisionPairs = js.Any.fromFunction3(collisionPairs), dirty = dirty.asInstanceOf[js.Any], doBoundingBoxBroadphase = js.Any.fromFunction4(doBoundingBoxBroadphase), doBoundingSphereBroadphase = js.Any.fromFunction4(doBoundingSphereBroadphase), intersectionTest = js.Any.fromFunction4(intersectionTest), makePairsUnique = js.Any.fromFunction2(makePairsUnique), needBroadphaseCollision = js.Any.fromFunction2(needBroadphaseCollision), nx = nx.asInstanceOf[js.Any], ny = ny.asInstanceOf[js.Any], nz = nz.asInstanceOf[js.Any], setWorld = js.Any.fromFunction1(setWorld), useBoundingBoxes = useBoundingBoxes.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBroadphase]
  }
  @scala.inline
  implicit class GridBroadphaseOps[Self <: GridBroadphase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAabbMax(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabbMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAabbMin(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabbMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nz")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

