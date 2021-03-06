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

object axisDragGizmoMod {
  
  @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo")
  @js.native
  class AxisDragGizmo protected () extends Gizmo {
    /**
      * Creates an AxisDragGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragAxis The axis which the gizmo will be able to drag on
      * @param color The color of the gizmo
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: js.UndefOr[scala.Nothing], gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: js.UndefOr[Nullable[PositionGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: js.UndefOr[scala.Nothing],
      gizmoLayer: UtilityLayerRenderer,
      parent: js.UndefOr[Nullable[PositionGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: js.UndefOr[scala.Nothing],
      parent: js.UndefOr[Nullable[PositionGizmo]],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: js.UndefOr[Nullable[PositionGizmo]],
      thickness: Double
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
  object AxisDragGizmo {
    
    /** @hidden */
    @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo._CreateArrow")
    @js.native
    def _CreateArrow(scene: Scene, material: StandardMaterial): TransformNode = js.native
    @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo._CreateArrow")
    @js.native
    def _CreateArrow(
      scene: Scene,
      material: StandardMaterial,
      thickness: js.UndefOr[scala.Nothing],
      isCollider: Boolean
    ): TransformNode = js.native
    @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo._CreateArrow")
    @js.native
    def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double): TransformNode = js.native
    @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo._CreateArrow")
    @js.native
    def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double, isCollider: Boolean): TransformNode = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo._CreateArrowInstance")
    @js.native
    def _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode = js.native
  }
}
