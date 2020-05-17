package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RotationGizmo")
@js.native
/**
  * Creates a RotationGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param tessellation Amount of tessellation to be used when creating rotation circles
  * @param useEulerRotation Use and update Euler angle instead of quaternion
  */
class RotationGizmo ()
  extends typingsSlinky.babylonjs.BABYLON.RotationGizmo {
  def this(gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  def this(gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer, tessellation: Double) = this()
  def this(
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    tessellation: Double,
    useEulerRotation: Boolean
  ) = this()
}

