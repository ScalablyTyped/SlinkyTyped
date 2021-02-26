package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collisionsIndexMod {
  
  @JSImport("babylonjs/Collisions/index", "Collider")
  @js.native
  class Collider ()
    extends typingsSlinky.babylonjs.colliderMod.Collider
  
  @JSImport("babylonjs/Collisions/index", "DefaultCollisionCoordinator")
  @js.native
  class DefaultCollisionCoordinator ()
    extends typingsSlinky.babylonjs.collisionCoordinatorMod.DefaultCollisionCoordinator
  
  @JSImport("babylonjs/Collisions/index", "IntersectionInfo")
  @js.native
  class IntersectionInfo protected ()
    extends typingsSlinky.babylonjs.intersectionInfoMod.IntersectionInfo {
    def this(bu: Nullable[Double], bv: Nullable[Double], distance: Double) = this()
  }
  
  @JSImport("babylonjs/Collisions/index", "_MeshCollisionData")
  @js.native
  class MeshCollisionData ()
    extends typingsSlinky.babylonjs.meshCollisionDataMod.MeshCollisionData
  
  @JSImport("babylonjs/Collisions/index", "PickingInfo")
  @js.native
  class PickingInfo ()
    extends typingsSlinky.babylonjs.pickingInfoMod.PickingInfo
}
