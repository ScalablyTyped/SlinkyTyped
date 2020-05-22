package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.rotationGizmoMod.RotationGizmo
import typingsSlinky.babylonjs.scaleGizmoMod.ScaleGizmo
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBoxGizmo extends js.Object {
  var boundingBoxGizmo: Nullable[typingsSlinky.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo]
  var positionGizmo: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]
  var rotationGizmo: Nullable[RotationGizmo]
  var scaleGizmo: Nullable[ScaleGizmo]
}

object BoundingBoxGizmo {
  @scala.inline
  def apply(
    boundingBoxGizmo: Nullable[typingsSlinky.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo] = null,
    positionGizmo: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo] = null,
    rotationGizmo: Nullable[RotationGizmo] = null,
    scaleGizmo: Nullable[ScaleGizmo] = null
  ): BoundingBoxGizmo = {
    val __obj = js.Dynamic.literal(boundingBoxGizmo = boundingBoxGizmo.asInstanceOf[js.Any], positionGizmo = positionGizmo.asInstanceOf[js.Any], rotationGizmo = rotationGizmo.asInstanceOf[js.Any], scaleGizmo = scaleGizmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxGizmo]
  }
}

