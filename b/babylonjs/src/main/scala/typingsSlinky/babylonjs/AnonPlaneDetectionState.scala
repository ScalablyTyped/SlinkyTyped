package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPlaneDetectionState extends js.Object {
  var planeDetectionState: js.UndefOr[AnonEnabled] = js.native
}

object AnonPlaneDetectionState {
  @scala.inline
  def apply(): AnonPlaneDetectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPlaneDetectionState]
  }
  @scala.inline
  implicit class AnonPlaneDetectionStateOps[Self <: AnonPlaneDetectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaneDetectionState(value: AnonEnabled): Self = {
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

