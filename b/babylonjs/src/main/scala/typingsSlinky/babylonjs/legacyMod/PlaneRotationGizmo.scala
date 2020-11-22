package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PlaneRotationGizmo")
@js.native
class PlaneRotationGizmo protected ()
  extends typingsSlinky.babylonjs.indexMod.PlaneRotationGizmo {
  /**
    * Creates a PlaneRotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
    * @param color The color of the gizmo
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    * @param thickness display gizmo axis thickness
    */
  def this(
    planeNormal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[typingsSlinky.babylonjs.mathColorMod.Color3],
    gizmoLayer: js.UndefOr[typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer],
    tessellation: js.UndefOr[Double],
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.rotationGizmoMod.RotationGizmo]],
    useEulerRotation: js.UndefOr[Boolean],
    thickness: js.UndefOr[Double]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "PlaneRotationGizmo")
@js.native
object PlaneRotationGizmo extends js.Object {
  
  var _CircleConstants: js.Any = js.native
}
