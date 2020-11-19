package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationGizmo extends Gizmo {
  
  var _meshAttached: js.Any = js.native
  
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[_] = js.native
  
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[_] = js.native
  
  @JSName("scaleRatio")
  def scaleRatio_MRotationGizmo: Double = js.native
  
  def snapDistance: Double = js.native
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  def snapDistance_=(value: Double): Unit = js.native
  
  @JSName("updateGizmoRotationToMatchAttachedMesh")
  def updateGizmoRotationToMatchAttachedMesh_MRotationGizmo: Boolean = js.native
  
  /**
    * Internal gizmo used for interactions on the x axis
    */
  var xGizmo: PlaneRotationGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the y axis
    */
  var yGizmo: PlaneRotationGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the z axis
    */
  var zGizmo: PlaneRotationGizmo = js.native
}
