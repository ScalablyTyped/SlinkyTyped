package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.BABYLON.BoundingBoxGizmo
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.PositionGizmo
import typingsSlinky.babylonjs.BABYLON.RotationGizmo
import typingsSlinky.babylonjs.BABYLON.ScaleGizmo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPositionGizmo extends js.Object {
  var boundingBoxGizmo: Nullable[BoundingBoxGizmo] = js.native
  var positionGizmo: Nullable[PositionGizmo] = js.native
  var rotationGizmo: Nullable[RotationGizmo] = js.native
  var scaleGizmo: Nullable[ScaleGizmo] = js.native
}

object AnonPositionGizmo {
  @scala.inline
  def apply(): AnonPositionGizmo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPositionGizmo]
  }
  @scala.inline
  implicit class AnonPositionGizmoOps[Self <: AnonPositionGizmo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBoxGizmo(value: Nullable[BoundingBoxGizmo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBoxGizmo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundingBoxGizmoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBoxGizmo")(null)
        ret
    }
    @scala.inline
    def withPositionGizmo(value: Nullable[PositionGizmo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionGizmo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionGizmoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionGizmo")(null)
        ret
    }
    @scala.inline
    def withRotationGizmo(value: Nullable[RotationGizmo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationGizmo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationGizmoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationGizmo")(null)
        ret
    }
    @scala.inline
    def withScaleGizmo(value: Nullable[ScaleGizmo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleGizmo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleGizmoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleGizmo")(null)
        ret
    }
  }
  
}

