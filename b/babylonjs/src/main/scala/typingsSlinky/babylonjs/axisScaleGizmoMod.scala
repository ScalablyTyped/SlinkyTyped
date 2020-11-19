package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.SnapDistance
import typingsSlinky.babylonjs.gizmoMod.Gizmo
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.pointerDragBehaviorMod.PointerDragBehavior
import typingsSlinky.babylonjs.scaleGizmoMod.ScaleGizmo
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gizmos/axisScaleGizmo", JSImport.Namespace)
@js.native
object axisScaleGizmoMod extends js.Object {
  
  @js.native
  class AxisScaleGizmo protected () extends Gizmo {
    /**
      * Creates an AxisScaleGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragAxis The axis which the gizmo will be able to scale on
      * @param color The color of the gizmo
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: js.UndefOr[scala.Nothing], gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[ScaleGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[ScaleGizmo]
    ) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer, parent: Nullable[ScaleGizmo]) = this()
    
    var _arrow: js.Any = js.native
    
    var _coloredMaterial: js.Any = js.native
    
    var _hoverMaterial: js.Any = js.native
    
    var _isEnabled: js.Any = js.native
    
    var _parent: js.Any = js.native
    
    var _pointerObserver: js.Any = js.native
    
    /**
      * Drag behavior responsible for the gizmos dragging interactions
      */
    var dragBehavior: PointerDragBehavior = js.native
    
    def isEnabled: Boolean = js.native
    /**
      * If the gizmo is enabled
      */
    def isEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance] = js.native
    
    /**
      * Custom sensitivity value for the drag strength
      */
    var sensitivity: Double = js.native
    
    def setCustomMesh(mesh: Mesh, useGizmoMaterial: Boolean): Unit = js.native
    
    /**
      * Scale distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    var snapDistance: Double = js.native
    
    /**
      * If the scaling operation should be done on all axis (default: false)
      */
    var uniformScaling: Boolean = js.native
  }
}
