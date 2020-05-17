package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PlaneRotationGizmo")
@js.native
class PlaneRotationGizmo protected ()
  extends typingsSlinky.babylonjs.BABYLON.PlaneRotationGizmo {
  /**
    * Creates a PlaneRotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
    * @param color The color of the gizmo
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    */
  def this(planeNormal: typingsSlinky.babylonjs.BABYLON.Vector3) = this()
  def this(
    planeNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3
  ) = this()
  def this(
    planeNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    planeNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    tessellation: Double
  ) = this()
  def this(
    planeNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    tessellation: Double,
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.RotationGizmo]
  ) = this()
  def this(
    planeNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    tessellation: Double,
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.RotationGizmo],
    useEulerRotation: Boolean
  ) = this()
}

