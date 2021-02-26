package typingsSlinky.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Broadphase")
@js.native
class Broadphase protected () extends StObject {
  def this(`type`: Double) = this()
  
  def aabbCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  def aabbQuery(): js.Array[Body] = js.native
  def aabbQuery(world: js.UndefOr[scala.Nothing], aabb: js.UndefOr[scala.Nothing], result: js.Array[Body]): js.Array[Body] = js.native
  def aabbQuery(world: js.UndefOr[scala.Nothing], aabb: AABB): js.Array[Body] = js.native
  def aabbQuery(world: js.UndefOr[scala.Nothing], aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  def aabbQuery(world: World): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: js.UndefOr[scala.Nothing], result: js.Array[Body]): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: AABB): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  
  def boundingRadiusCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  def boundingVolumeCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  var boundingVolumeType: Double = js.native
  
  def canCollide(bodyA: Body, bodyB: Body): Boolean = js.native
  
  def getCollisionPairs(world: World): js.Array[Body] = js.native
  
  var result: js.Array[Body] = js.native
  
  def setWorld(world: World): Unit = js.native
  
  var `type`: Double = js.native
  
  var world: World = js.native
}
/* static members */
object Broadphase {
  
  @JSImport("p2", "Broadphase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Broadphase.AABB")
  @js.native
  def AABB: Double = js.native
  @scala.inline
  def AABB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AABB")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Broadphase.BOUNDING_CIRCLE")
  @js.native
  def BOUNDING_CIRCLE: Double = js.native
  @scala.inline
  def BOUNDING_CIRCLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOUNDING_CIRCLE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Broadphase.NAIVE")
  @js.native
  def NAIVE: Double = js.native
  @scala.inline
  def NAIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAIVE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Broadphase.SAP")
  @js.native
  def SAP: Double = js.native
  @scala.inline
  def SAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAP")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Broadphase.aabbCheck")
  @js.native
  def aabbCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  @JSImport("p2", "Broadphase.boundingRadiusCheck")
  @js.native
  def boundingRadiusCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  @JSImport("p2", "Broadphase.canCollide")
  @js.native
  def canCollide(bodyA: Body, bodyB: Body): Boolean = js.native
}
