package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.RotationGizmo
import typingsSlinky.babylonjs.BABYLON.ScaleGizmo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionGizmo extends js.Object {
  var boundingBoxGizmo: Nullable[typingsSlinky.babylonjs.BABYLON.BoundingBoxGizmo]
  var positionGizmo: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  var rotationGizmo: Nullable[RotationGizmo]
  var scaleGizmo: Nullable[ScaleGizmo]
}

object PositionGizmo {
  @scala.inline
  def apply(
    boundingBoxGizmo: Nullable[typingsSlinky.babylonjs.BABYLON.BoundingBoxGizmo] = null,
    positionGizmo: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo] = null,
    rotationGizmo: Nullable[RotationGizmo] = null,
    scaleGizmo: Nullable[ScaleGizmo] = null
  ): PositionGizmo = {
    val __obj = js.Dynamic.literal(boundingBoxGizmo = boundingBoxGizmo.asInstanceOf[js.Any], positionGizmo = positionGizmo.asInstanceOf[js.Any], rotationGizmo = rotationGizmo.asInstanceOf[js.Any], scaleGizmo = scaleGizmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionGizmo]
  }
}

