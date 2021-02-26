package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.SnapDistance
import typingsSlinky.babylonjs.gizmoMod.Gizmo
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.pointerDragBehaviorMod.PointerDragBehavior
import typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.standardMaterialMod.StandardMaterial
import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object planeDragGizmoMod {
  
  @JSImport("babylonjs/Gizmos/planeDragGizmo", "PlaneDragGizmo")
  @js.native
  class PlaneDragGizmo protected () extends Gizmo {
    /**
      * Creates a PlaneDragGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
      * @param color The color of the gizmo
      */
    def this(dragPlaneNormal: Vector3) = this()
    def this(dragPlaneNormal: Vector3, color: Color3) = this()
    def this(dragPlaneNormal: Vector3, color: js.UndefOr[scala.Nothing], gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragPlaneNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    
    var _coloredMaterial: js.Any = js.native
    
    var _disableMaterial: js.Any = js.native
    
    var _dragging: js.Any = js.native
    
    var _gizmoMesh: js.Any = js.native
    
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
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    var snapDistance: Double = js.native
  }
  /* static members */
  object PlaneDragGizmo {
    
    /** @hidden */
    @JSImport("babylonjs/Gizmos/planeDragGizmo", "PlaneDragGizmo._CreatePlane")
    @js.native
    def _CreatePlane(scene: Scene, material: StandardMaterial): TransformNode = js.native
  }
}
