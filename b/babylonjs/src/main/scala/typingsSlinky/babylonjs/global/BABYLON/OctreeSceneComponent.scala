package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.ISmartArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.OctreeSceneComponent")
@js.native
class OctreeSceneComponent protected ()
  extends typingsSlinky.babylonjs.BABYLON.OctreeSceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  /* CompleteClass */
  override var _tempRay: js.Any = js.native
  /**
    * Indicates if the meshes have been checked to make sure they are isEnabled()
    */
  /* CompleteClass */
  override val checksIsEnabled: Boolean = js.native
  /**
    * The component name help to identify the component in the list of scene components.
    */
  /* CompleteClass */
  override val name: String = js.native
  /**
    * The scene the component belongs to.
    */
  /* CompleteClass */
  override var scene: typingsSlinky.babylonjs.BABYLON.Scene = js.native
  /**
    * Disposes the component and the associated ressources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Return the list of active meshes
    * @returns the list of active meshes
    */
  /* CompleteClass */
  override def getActiveMeshCandidates(): ISmartArrayLike[typingsSlinky.babylonjs.BABYLON.AbstractMesh] = js.native
  /**
    * Return the list of active sub meshes
    * @param mesh The mesh to get the candidates sub meshes from
    * @returns the list of active sub meshes
    */
  /* CompleteClass */
  override def getActiveSubMeshCandidates(mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh): ISmartArrayLike[typingsSlinky.babylonjs.BABYLON.SubMesh] = js.native
  /**
    * Return the list of sub meshes colliding with a collider
    * @param mesh defines the mesh to find the submesh for
    * @param collider defines the collider to evaluate the collision against
    * @returns the list of colliding sub meshes
    */
  /* CompleteClass */
  override def getCollidingSubMeshCandidates(
    mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    collider: typingsSlinky.babylonjs.BABYLON.Collider
  ): ISmartArrayLike[typingsSlinky.babylonjs.BABYLON.SubMesh] = js.native
  /**
    * Return the list of sub meshes intersecting with a given local ray
    * @param mesh defines the mesh to find the submesh for
    * @param localRay defines the ray in local space
    * @returns the list of intersecting sub meshes
    */
  /* CompleteClass */
  override def getIntersectingSubMeshCandidates(mesh: typingsSlinky.babylonjs.BABYLON.AbstractMesh, localRay: typingsSlinky.babylonjs.BABYLON.Ray): ISmartArrayLike[typingsSlinky.babylonjs.BABYLON.SubMesh] = js.native
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  /* CompleteClass */
  override def rebuild(): Unit = js.native
  /**
    * Registers the component in a given scene
    */
  /* CompleteClass */
  override def register(): Unit = js.native
}

