package typingsSlinky.babylonjs.renderingIndexMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Rendering/index", "babylonjs/Meshes/linesMesh")
@js.native
object babylonjsMeshesLinesMeshAugmentingMod extends js.Object {
  
  @js.native
  trait InstancedLinesMesh extends js.Object {
    
    /**
      * Enables the edge rendering mode on the mesh.
      * This mode makes the mesh edges visible
      * @param epsilon defines the maximal distance between two angles to detect a face
      * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
      * @returns the current InstancedLinesMesh
      * @see https://www.babylonjs-playground.com/#19O9TU#0
      */
    def enableEdgesRendering(): typingsSlinky.babylonjs.edgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
    def enableEdgesRendering(epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean): typingsSlinky.babylonjs.edgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
    def enableEdgesRendering(epsilon: Double): typingsSlinky.babylonjs.edgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
    def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): typingsSlinky.babylonjs.edgesRendererMod.babylonjsMeshesLinesMeshAugmentingMod.InstancedLinesMesh = js.native
  }
  
  @js.native
  trait LinesMesh extends js.Object {
    
    /**
      * Enables the edge rendering mode on the mesh.
      * This mode makes the mesh edges visible
      * @param epsilon defines the maximal distance between two angles to detect a face
      * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
      * @returns the currentAbstractMesh
      * @see https://www.babylonjs-playground.com/#19O9TU#0
      */
    def enableEdgesRendering(): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double): AbstractMesh = js.native
    def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
  }
}
