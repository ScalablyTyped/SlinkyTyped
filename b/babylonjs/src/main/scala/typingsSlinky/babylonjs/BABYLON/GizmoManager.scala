package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GizmoManager extends IDisposable {
  
  var _attachedMesh: js.Any = js.native
  
  var _boundingBoxColor: js.Any = js.native
  
  var _defaultKeepDepthUtilityLayer: js.Any = js.native
  
  var _defaultUtilityLayer: js.Any = js.native
  
  var _gizmosEnabled: js.Any = js.native
  
  var _pointerObserver: js.Any = js.native
  
  /**
    * Attaches a set of gizmos to the specified mesh
    * @param mesh The mesh the gizmo's should be attached to
    */
  def attachToMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
  
  /**
    * Array of meshes which will have the gizmo attached when a pointer selected them. If null, all meshes are attachable. (Default: null)
    */
  var attachableMeshes: Nullable[js.Array[AbstractMesh]] = js.native
  
  /**
    * When bounding box gizmo is enabled, this can be used to track drag/end events
    */
  var boundingBoxDragBehavior: SixDofDragBehavior = js.native
  
  def boundingBoxGizmoEnabled: Boolean = js.native
  /**
    * If the boundingBox gizmo is enabled
    */
  def boundingBoxGizmoEnabled_=(value: Boolean): Unit = js.native
  
  /** When true, the gizmo will be detached from the current object when a pointer down occurs with an empty picked mesh */
  var clearGizmoOnEmptyPointerEvent: Boolean = js.native
  
  /**
    * Gizmo's created by the gizmo manager, gizmo will be null until gizmo has been enabled for the first time
    */
  var gizmos: typingsSlinky.babylonjs.anon.PositionGizmo = js.native
  
  /**
    * Utility layer that the bounding box gizmo belongs to
    */
  def keepDepthUtilityLayer: UtilityLayerRenderer = js.native
  
  /** Fires an event when the manager is attached to a mesh */
  var onAttachedToMeshObservable: Observable[Nullable[AbstractMesh]] = js.native
  
  def positionGizmoEnabled: Boolean = js.native
  /**
    * If the position gizmo is enabled
    */
  def positionGizmoEnabled_=(value: Boolean): Unit = js.native
  
  def rotationGizmoEnabled: Boolean = js.native
  /**
    * If the rotation gizmo is enabled
    */
  def rotationGizmoEnabled_=(value: Boolean): Unit = js.native
  
  def scaleGizmoEnabled: Boolean = js.native
  /**
    * If the scale gizmo is enabled
    */
  def scaleGizmoEnabled_=(value: Boolean): Unit = js.native
  
  var scene: js.Any = js.native
  
  /**
    * If pointer events should perform attaching/detaching a gizmo, if false this can be done manually via attachToMesh. (Default: true)
    */
  var usePointerToAttachGizmos: Boolean = js.native
  
  /**
    * Utility layer that all gizmos besides bounding box belong to
    */
  def utilityLayer: UtilityLayerRenderer = js.native
}
