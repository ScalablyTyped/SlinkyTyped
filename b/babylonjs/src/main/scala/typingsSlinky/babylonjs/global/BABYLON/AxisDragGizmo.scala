package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AxisDragGizmo")
@js.native
class AxisDragGizmo protected ()
  extends typingsSlinky.babylonjs.BABYLON.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragAxis: typingsSlinky.babylonjs.BABYLON.Vector3) = this()
  def this(dragAxis: typingsSlinky.babylonjs.BABYLON.Vector3, color: typingsSlinky.babylonjs.BABYLON.Color3) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.AxisDragGizmo")
@js.native
object AxisDragGizmo extends js.Object {
  
  /** @hidden */
  def _CreateArrow(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    material: typingsSlinky.babylonjs.BABYLON.StandardMaterial
  ): typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
  
  /** @hidden */
  def _CreateArrowInstance(scene: typingsSlinky.babylonjs.BABYLON.Scene, arrow: typingsSlinky.babylonjs.BABYLON.TransformNode): typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
}
