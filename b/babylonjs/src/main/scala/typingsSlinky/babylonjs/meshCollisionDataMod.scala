package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.colliderMod.Collider
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.observableMod.Observer
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshCollisionDataMod {
  
  @JSImport("babylonjs/Collisions/meshCollisionData", "_MeshCollisionData")
  @js.native
  class MeshCollisionData () extends StObject {
    
    var _checkCollisions: Boolean = js.native
    
    var _collider: Nullable[Collider] = js.native
    
    var _collisionGroup: Double = js.native
    
    var _collisionMask: Double = js.native
    
    var _collisionResponse: Boolean = js.native
    
    var _diffPositionForCollisions: Vector3 = js.native
    
    var _oldPositionForCollisions: Vector3 = js.native
    
    var _onCollideObserver: Nullable[Observer[AbstractMesh]] = js.native
    
    var _onCollisionPositionChangeObserver: Nullable[Observer[Vector3]] = js.native
    
    var _surroundingMeshes: Nullable[js.Array[AbstractMesh]] = js.native
  }
}
