package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragPlanePoint extends js.Object {
  var dragPlanePoint: Vector3 = js.native
  var pointerId: Double = js.native
}

object DragPlanePoint {
  @scala.inline
  def apply(dragPlanePoint: Vector3, pointerId: Double): DragPlanePoint = {
    val __obj = js.Dynamic.literal(dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPlanePoint]
  }
  @scala.inline
  implicit class DragPlanePointOps[Self <: DragPlanePoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

