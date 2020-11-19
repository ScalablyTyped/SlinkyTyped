package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.axisDragGizmoMod.AxisDragGizmo
import typingsSlinky.babylonjs.gizmoMod.Gizmo
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.planeDragGizmoMod.PlaneDragGizmo
import typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gizmos/positionGizmo", JSImport.Namespace)
@js.native
object positionGizmoMod extends js.Object {
  
  @js.native
  /**
    * Creates a PositionGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class PositionGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    
    /**
      * private variables
      */
    var _meshAttached: js.Any = js.native
    
    /**
      * If set to true, planar drag is enabled
      */
    var _planarGizmoEnabled: js.Any = js.native
    
    var _scaleRatio: js.Any = js.native
    
    var _snapDistance: js.Any = js.native
    
    var _updateGizmoRotationToMatchAttachedMesh: js.Any = js.native
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[_] = js.native
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[_] = js.native
    
    def planarGizmoEnabled: Boolean = js.native
    /**
      * If the planar drag gizmo is enabled
      * setting this will enable/disable XY, XZ and YZ planes regardless of individual gizmo settings.
      */
    def planarGizmoEnabled_=(value: Boolean): Unit = js.native
    
    @JSName("scaleRatio")
    def scaleRatio_MPositionGizmo: Double = js.native
    
    def snapDistance: Double = js.native
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    def snapDistance_=(value: Double): Unit = js.native
    
    @JSName("updateGizmoRotationToMatchAttachedMesh")
    def updateGizmoRotationToMatchAttachedMesh_MPositionGizmo: Boolean = js.native
    
    /**
      * Internal gizmo used for interactions on the x axis
      */
    var xGizmo: AxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the yz plane
      */
    var xPlaneGizmo: PlaneDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the y axis
      */
    var yGizmo: AxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the xz plane
      */
    var yPlaneGizmo: PlaneDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the z axis
      */
    var zGizmo: AxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the xy plane
      */
    var zPlaneGizmo: PlaneDragGizmo = js.native
  }
}
