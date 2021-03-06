package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PlaneDragGizmo")
@js.native
class PlaneDragGizmo protected ()
  extends typingsSlinky.babylonjs.gizmosIndexMod.PlaneDragGizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragPlaneNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: typingsSlinky.babylonjs.mathColorMod.Color3,
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
}
/* static members */
object PlaneDragGizmo {
  
  /** @hidden */
  @JSImport("babylonjs/index", "PlaneDragGizmo._CreatePlane")
  @js.native
  def _CreatePlane(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    material: typingsSlinky.babylonjs.standardMaterialMod.StandardMaterial
  ): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
}
