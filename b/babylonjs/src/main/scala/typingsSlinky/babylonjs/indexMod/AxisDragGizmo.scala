package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AxisDragGizmo")
@js.native
class AxisDragGizmo protected ()
  extends typingsSlinky.babylonjs.gizmosIndexMod.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param thickness display gizmo axis thickness
    */
  def this(dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]],
    thickness: Double
  ) = this()
}
/* static members */
object AxisDragGizmo {
  
  /** @hidden */
  @JSImport("babylonjs/index", "AxisDragGizmo._CreateArrow")
  @js.native
  def _CreateArrow(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    material: typingsSlinky.babylonjs.standardMaterialMod.StandardMaterial
  ): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
  @JSImport("babylonjs/index", "AxisDragGizmo._CreateArrow")
  @js.native
  def _CreateArrow(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    material: typingsSlinky.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: js.UndefOr[scala.Nothing],
    isCollider: Boolean
  ): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
  @JSImport("babylonjs/index", "AxisDragGizmo._CreateArrow")
  @js.native
  def _CreateArrow(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    material: typingsSlinky.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: Double
  ): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
  @JSImport("babylonjs/index", "AxisDragGizmo._CreateArrow")
  @js.native
  def _CreateArrow(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    material: typingsSlinky.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: Double,
    isCollider: Boolean
  ): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "AxisDragGizmo._CreateArrowInstance")
  @js.native
  def _CreateArrowInstance(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    arrow: typingsSlinky.babylonjs.transformNodeMod.TransformNode
  ): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
}
