package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "AxisDragGizmo")
@js.native
class AxisDragGizmo protected ()
  extends typingsSlinky.babylonjs.gizmosIndexMod.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
}

/* static members */
@JSImport("babylonjs/index", "AxisDragGizmo")
@js.native
object AxisDragGizmo extends js.Object {
  /** @hidden */
  def _CreateArrow(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    material: typingsSlinky.babylonjs.standardMaterialMod.StandardMaterial
  ): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
  /** @hidden */
  def _CreateArrowInstance(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    arrow: typingsSlinky.babylonjs.transformNodeMod.TransformNode
  ): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
}

