package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaneDetectionState extends js.Object {
  var planeDetectionState: js.UndefOr[Enabled] = js.native
}

object PlaneDetectionState {
  @scala.inline
  def apply(): PlaneDetectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaneDetectionState]
  }
  @scala.inline
  implicit class PlaneDetectionStateOps[Self <: PlaneDetectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaneDetectionState(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planeDetectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaneDetectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planeDetectionState")(js.undefined)
        ret
    }
  }
  
}

