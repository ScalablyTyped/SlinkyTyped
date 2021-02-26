package typingsSlinky.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadPhase extends StObject {
  
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  
  def boundingSphereCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  def collisionPairs(world: World, p1: js.Array[Body], p2: js.Array[Body]): Unit = js.native
  
  var dirty: Boolean = js.native
  
  def doBoundingBoxBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit = js.native
  
  def doBoundingSphereBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit = js.native
  
  def intersectionTest(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit = js.native
  
  def makePairsUnique(pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit = js.native
  
  def needBroadphaseCollision(bodyA: Body, bodyB: Body): Boolean = js.native
  
  def setWorld(world: World): Unit = js.native
  
  var useBoundingBoxes: Boolean = js.native
  
  var world: World = js.native
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
  implicit class BroadPhaseMutableBuilder[Self <: BroadPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAabbQuery(value: (World, AABB, js.Array[Body]) => js.Array[Body]): Self = StObject.set(x, "aabbQuery", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBoundingSphereCheck(value: (Body, Body) => Boolean): Self = StObject.set(x, "boundingSphereCheck", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollisionPairs(value: (World, js.Array[Body], js.Array[Body]) => Unit): Self = StObject.set(x, "collisionPairs", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoBoundingBoxBroadphase(value: (Body, Body, js.Array[Body], js.Array[Body]) => Unit): Self = StObject.set(x, "doBoundingBoxBroadphase", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDoBoundingSphereBroadphase(value: (Body, Body, js.Array[Body], js.Array[Body]) => Unit): Self = StObject.set(x, "doBoundingSphereBroadphase", js.Any.fromFunction4(value))
    
    @scala.inline
    def setIntersectionTest(value: (Body, Body, js.Array[Body], js.Array[Body]) => Unit): Self = StObject.set(x, "intersectionTest", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMakePairsUnique(value: (js.Array[Body], js.Array[Body]) => Unit): Self = StObject.set(x, "makePairsUnique", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNeedBroadphaseCollision(value: (Body, Body) => Boolean): Self = StObject.set(x, "needBroadphaseCollision", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetWorld(value: World => Unit): Self = StObject.set(x, "setWorld", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseBoundingBoxes(value: Boolean): Self = StObject.set(x, "useBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorld(value: World): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
  }
}
