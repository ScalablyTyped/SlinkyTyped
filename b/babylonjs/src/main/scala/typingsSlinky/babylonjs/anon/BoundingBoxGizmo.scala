package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.rotationGizmoMod.RotationGizmo
import typingsSlinky.babylonjs.scaleGizmoMod.ScaleGizmo
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingBoxGizmo extends js.Object {
  var boundingBoxGizmo: Nullable[typingsSlinky.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo] = js.native
  var positionGizmo: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo] = js.native
  var rotationGizmo: Nullable[RotationGizmo] = js.native
  var scaleGizmo: Nullable[ScaleGizmo] = js.native
}

object BoundingBoxGizmo {
  @scala.inline
  def apply(): BoundingBoxGizmo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingBoxGizmo]
  }
  @scala.inline
  implicit class BoundingBoxGizmoOps[Self <: BoundingBoxGizmo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBoxGizmo(value: Nullable[typingsSlinky.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo]): Self = {
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
    def withPositionGizmo(value: Nullable[typingsSlinky.babylonjs.positionGizmoMod.PositionGizmo]): Self = {
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

