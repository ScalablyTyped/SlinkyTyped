package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.colliderMod.Collider
import typingsSlinky.babylonjs.octreeMod.Octree
import typingsSlinky.babylonjs.rayMod.Ray
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.smartArrayMod.ISmartArrayLike
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object octreeSceneComponentMod {
  
  @JSImport("babylonjs/Culling/Octrees/octreeSceneComponent", "OctreeSceneComponent")
  @js.native
  class OctreeSceneComponent protected () extends StObject {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _tempRay: js.Any = js.native
    
    /**
      * Indicates if the meshes have been checked to make sure they are isEnabled()
      */
    val checksIsEnabled: Boolean = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Return the list of active meshes
      * @returns the list of active meshes
      */
    def getActiveMeshCandidates(): ISmartArrayLike[AbstractMesh] = js.native
    
    /**
      * Return the list of active sub meshes
      * @param mesh The mesh to get the candidates sub meshes from
      * @returns the list of active sub meshes
      */
    def getActiveSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * Return the list of sub meshes colliding with a collider
      * @param mesh defines the mesh to find the submesh for
      * @param collider defines the collider to evaluate the collision against
      * @returns the list of colliding sub meshes
      */
    def getCollidingSubMeshCandidates(mesh: AbstractMesh, collider: Collider): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * Return the list of sub meshes intersecting with a given local ray
      * @param mesh defines the mesh to find the submesh for
      * @param localRay defines the ray in local space
      * @returns the list of intersecting sub meshes
      */
    def getIntersectingSubMeshCandidates(mesh: AbstractMesh, localRay: Ray): ISmartArrayLike[SubMesh] = js.native
    
    /**
      * The component name help to identify the component in the list of scene components.
      */
    val name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    def rebuild(): Unit = js.native
    
    /**
      * Registers the component in a given scene
      */
    def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /**
        * @hidden
        * Backing Field
        */
      var _submeshesOctree: Octree[SubMesh] = js.native
      
      /**
        * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
        * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
        * @param maxCapacity defines the maximum size of each block (64 by default)
        * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
        * @returns the new octree
        * @see https://www.babylonjs-playground.com/#NA4OQ#12
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        */
      def createOrUpdateSubmeshesOctree(): Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: js.UndefOr[scala.Nothing], maxDepth: Double): Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Double): Octree[SubMesh] = js.native
      def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): Octree[SubMesh] = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * @hidden
        * Backing Filed
        */
      var _selectionOctree: Octree[AbstractMesh] = js.native
      
      /**
        * Creates or updates the octree used to boost selection (picking)
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        * @param maxCapacity defines the maximum capacity per leaf
        * @param maxDepth defines the maximum depth of the octree
        * @returns an octree of AbstractMesh
        */
      def createOrUpdateSelectionOctree(): Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: js.UndefOr[scala.Nothing], maxDepth: Double): Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Double): Octree[AbstractMesh] = js.native
      def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): Octree[AbstractMesh] = js.native
      
      /**
        * Gets the octree used to boost mesh selection (picking)
        * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
        */
      var selectionOctree: Octree[AbstractMesh] = js.native
    }
  }
}
