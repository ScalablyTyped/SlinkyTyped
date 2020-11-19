package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.axisScaleGizmoMod.AxisScaleGizmo
import typingsSlinky.babylonjs.gizmoMod.Gizmo
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gizmos/scaleGizmo", JSImport.Namespace)
@js.native
object scaleGizmoMod extends js.Object {
  
  @js.native
  /**
    * Creates a ScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class ScaleGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    
    var _meshAttached: js.Any = js.native
    
    var _octahedron: js.Any = js.native
    
    var _scaleRatio: js.Any = js.native
    
    var _sensitivity: js.Any = js.native
    
    var _snapDistance: js.Any = js.native
    
    var _uniformScalingMesh: js.Any = js.native
    
    var _updateGizmoRotationToMatchAttachedMesh: js.Any = js.native
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[_] = js.native
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[_] = js.native
    
    @JSName("scaleRatio")
    def scaleRatio_MScaleGizmo: Double = js.native
    
    def sensitivity: Double = js.native
    /**
      * Sensitivity factor for dragging (Default: 1)
      */
    def sensitivity_=(value: Double): Unit = js.native
    
    def snapDistance: Double = js.native
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    def snapDistance_=(value: Double): Unit = js.native
    
    /**
      * Internal gizmo used to scale all axis equally
      */
    var uniformScaleGizmo: AxisScaleGizmo = js.native
    
    @JSName("updateGizmoRotationToMatchAttachedMesh")
    def updateGizmoRotationToMatchAttachedMesh_MScaleGizmo: Boolean = js.native
    
    /**
      * Internal gizmo used for interactions on the x axis
      */
    var xGizmo: AxisScaleGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the y axis
      */
    var yGizmo: AxisScaleGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the z axis
      */
    var zGizmo: AxisScaleGizmo = js.native
  }
}
