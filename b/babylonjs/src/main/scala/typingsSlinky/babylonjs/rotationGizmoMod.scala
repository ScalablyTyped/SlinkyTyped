package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.gizmoMod.Gizmo
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.planeRotationGizmoMod.PlaneRotationGizmo
import typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gizmos/rotationGizmo", JSImport.Namespace)
@js.native
object rotationGizmoMod extends js.Object {
  
  @js.native
  /**
    * Creates a RotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    */
  class RotationGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: js.UndefOr[scala.Nothing], tessellation: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Double) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean
    ) = this()
    def this(gizmoLayer: js.UndefOr[scala.Nothing], tessellation: Double, useEulerRotation: Boolean) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: js.UndefOr[scala.Nothing],
      useEulerRotation: Boolean
    ) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Double, useEulerRotation: Boolean) = this()
    
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
}
