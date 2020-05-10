package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDragDistance extends js.Object {
  var delta: Vector3 = js.native
  var dragDistance: Double = js.native
  var dragPlaneNormal: Vector3 = js.native
  var dragPlanePoint: Vector3 = js.native
  var pointerId: Double = js.native
}

object AnonDragDistance {
  @scala.inline
  def apply(
    delta: Vector3,
    dragDistance: Double,
    dragPlaneNormal: Vector3,
    dragPlanePoint: Vector3,
    pointerId: Double
  ): AnonDragDistance = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], dragDistance = dragDistance.asInstanceOf[js.Any], dragPlaneNormal = dragPlaneNormal.asInstanceOf[js.Any], dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragDistance]
  }
  @scala.inline
  implicit class AnonDragDistanceOps[Self <: AnonDragDistance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragPlaneNormal(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPlaneNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragPlanePoint(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPlanePoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

