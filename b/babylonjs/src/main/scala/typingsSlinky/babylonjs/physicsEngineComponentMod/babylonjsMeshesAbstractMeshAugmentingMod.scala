package typingsSlinky.babylonjs.physicsEngineComponentMod

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.nodeMod.Node
import typingsSlinky.babylonjs.observableMod.Observer
import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Meshes/abstractMesh", JSImport.Namespace)
@js.native
object babylonjsMeshesAbstractMeshAugmentingMod extends js.Object {
  
  @js.native
  trait AbstractMesh extends js.Object {
    
    /** @hidden */
    var _disposePhysicsObserver: Nullable[Observer[Node]] = js.native
    
    /** @hidden */
    var _physicsImpostor: Nullable[PhysicsImpostor] = js.native
    
    /** Apply a physic impulse to the mesh
      * @param force defines the force to apply
      * @param contactPoint defines where to apply the force
      * @returns the current mesh
      * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
      */
    def applyImpulse(force: Vector3, contactPoint: Vector3): AbstractMesh = js.native
    
    /**
      * Gets the current physics impostor
      * @see https://doc.babylonjs.com/features/physics_engine
      * @returns a physics impostor or null
      */
    def getPhysicsImpostor(): Nullable[PhysicsImpostor] = js.native
    
    /**
      * Gets or sets impostor used for physic simulation
      * @see https://doc.babylonjs.com/features/physics_engine
      */
    var physicsImpostor: Nullable[PhysicsImpostor] = js.native
    
    /**
      * Creates a physic joint between two meshes
      * @param otherMesh defines the other mesh to use
      * @param pivot1 defines the pivot to use on this mesh
      * @param pivot2 defines the pivot to use on the other mesh
      * @param options defines additional options (can be plugin dependent)
      * @returns the current mesh
      * @see https://www.babylonjs-playground.com/#0BS5U0#0
      */
    def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3): AbstractMesh = js.native
    def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): AbstractMesh = js.native
  }
}
