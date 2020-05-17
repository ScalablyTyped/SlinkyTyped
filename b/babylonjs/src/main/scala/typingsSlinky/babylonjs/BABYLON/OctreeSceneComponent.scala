package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OctreeSceneComponent extends js.Object {
  var _tempRay: js.Any = js.native
  /**
    * Indicates if the meshes have been checked to make sure they are isEnabled()
    */
  val checksIsEnabled: Boolean = js.native
  /**
    * The component name help to identify the component in the list of scene components.
    */
  val name: String = js.native
  /**
    * The scene the component belongs to.
    */
  var scene: Scene = js.native
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
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  def rebuild(): Unit = js.native
  /**
    * Registers the component in a given scene
    */
  def register(): Unit = js.native
}

object OctreeSceneComponent {
  @scala.inline
  def apply(
    _tempRay: js.Any,
    checksIsEnabled: Boolean,
    dispose: () => Unit,
    getActiveMeshCandidates: () => ISmartArrayLike[AbstractMesh],
    getActiveSubMeshCandidates: AbstractMesh => ISmartArrayLike[SubMesh],
    getCollidingSubMeshCandidates: (AbstractMesh, Collider) => ISmartArrayLike[SubMesh],
    getIntersectingSubMeshCandidates: (AbstractMesh, Ray) => ISmartArrayLike[SubMesh],
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): OctreeSceneComponent = {
    val __obj = js.Dynamic.literal(_tempRay = _tempRay.asInstanceOf[js.Any], checksIsEnabled = checksIsEnabled.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getActiveMeshCandidates = js.Any.fromFunction0(getActiveMeshCandidates), getActiveSubMeshCandidates = js.Any.fromFunction1(getActiveSubMeshCandidates), getCollidingSubMeshCandidates = js.Any.fromFunction2(getCollidingSubMeshCandidates), getIntersectingSubMeshCandidates = js.Any.fromFunction2(getIntersectingSubMeshCandidates), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[OctreeSceneComponent]
  }
  @scala.inline
  implicit class OctreeSceneComponentOps[Self <: OctreeSceneComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_tempRay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tempRay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecksIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksIsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveMeshCandidates(value: () => ISmartArrayLike[AbstractMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveMeshCandidates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveSubMeshCandidates(value: AbstractMesh => ISmartArrayLike[SubMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveSubMeshCandidates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCollidingSubMeshCandidates(value: (AbstractMesh, Collider) => ISmartArrayLike[SubMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollidingSubMeshCandidates")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetIntersectingSubMeshCandidates(value: (AbstractMesh, Ray) => ISmartArrayLike[SubMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIntersectingSubMeshCandidates")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRebuild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegister(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

