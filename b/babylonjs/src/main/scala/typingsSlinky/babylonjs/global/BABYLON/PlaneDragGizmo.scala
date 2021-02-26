package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PlaneDragGizmo")
@js.native
class PlaneDragGizmo protected ()
  extends typingsSlinky.babylonjs.BABYLON.PlaneDragGizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
}
/* static members */
object PlaneDragGizmo {
  
  /** @hidden */
  @JSGlobal("BABYLON.PlaneDragGizmo._CreatePlane")
  @js.native
  def _CreatePlane(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    material: typingsSlinky.babylonjs.BABYLON.StandardMaterial
  ): typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
}
