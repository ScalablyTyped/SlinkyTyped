package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDragAxis extends js.Object {
  var dragAxis: js.UndefOr[Vector3] = js.native
  var dragPlaneNormal: js.UndefOr[Vector3] = js.native
}

object AnonDragAxis {
  @scala.inline
  def apply(): AnonDragAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDragAxis]
  }
  @scala.inline
  implicit class AnonDragAxisOps[Self <: AnonDragAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragAxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withDragPlaneNormal(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPlaneNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragPlaneNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPlaneNormal")(js.undefined)
        ret
    }
  }
  
}

