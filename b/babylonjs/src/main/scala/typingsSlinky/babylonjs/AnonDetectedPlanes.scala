package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetectedPlanes extends js.Object {
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.native
}

object AnonDetectedPlanes {
  @scala.inline
  def apply(): AnonDetectedPlanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDetectedPlanes]
  }
  @scala.inline
  implicit class AnonDetectedPlanesOps[Self <: AnonDetectedPlanes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectedPlanes(value: XRPlaneSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedPlanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedPlanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedPlanes")(js.undefined)
        ret
    }
  }
  
}

