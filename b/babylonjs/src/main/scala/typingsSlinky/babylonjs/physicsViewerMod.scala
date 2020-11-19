package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Debug/physicsViewer", JSImport.Namespace)
@js.native
object physicsViewerMod extends js.Object {
  
  @js.native
  class PhysicsViewer protected () extends js.Object {
    /**
      * Creates a new PhysicsViewer
      * @param scene defines the hosting scene
      */
    def this(scene: Scene) = this()
    
    var _debugBoxMesh: js.Any = js.native
    
    var _debugCylinderMesh: js.Any = js.native
    
    var _debugMaterial: js.Any = js.native
    
    var _debugMeshMeshes: js.Any = js.native
    
    var _debugSphereMesh: js.Any = js.native
    
    var _getDebugBoxMesh: js.Any = js.native
    
    var _getDebugCylinderMesh: js.Any = js.native
    
    var _getDebugMaterial: js.Any = js.native
    
    var _getDebugMesh: js.Any = js.native
    
    var _getDebugMeshMesh: js.Any = js.native
    
    var _getDebugSphereMesh: js.Any = js.native
    
    /** @hidden */
    var _impostors: js.Array[Nullable[PhysicsImpostor]] = js.native
    
    /** @hidden */
    var _meshes: js.Array[Nullable[AbstractMesh]] = js.native
    
    /** @hidden */
    var _numMeshes: Double = js.native
    
    /** @hidden */
    var _physicsEnginePlugin: Nullable[IPhysicsEnginePlugin] = js.native
    
    var _renderFunction: js.Any = js.native
    
    /** @hidden */
    var _scene: Nullable[Scene] = js.native
    
    /** @hidden */
    /* protected */ def _updateDebugMeshes(): Unit = js.native
    
    var _utilityLayer: js.Any = js.native
    
    /** Releases all resources */
    def dispose(): Unit = js.native
    
    /**
      * Hides a specified physic impostor
      * @param impostor defines the impostor to hide
      */
    def hideImpostor(impostor: Nullable[PhysicsImpostor]): Unit = js.native
    
    /**
      * Renders a specified physic impostor
      * @param impostor defines the impostor to render
      * @param targetMesh defines the mesh represented by the impostor
      * @returns the new debug mesh used to render the impostor
      */
    def showImpostor(impostor: PhysicsImpostor): Nullable[AbstractMesh] = js.native
    def showImpostor(impostor: PhysicsImpostor, targetMesh: Mesh): Nullable[AbstractMesh] = js.native
  }
}
