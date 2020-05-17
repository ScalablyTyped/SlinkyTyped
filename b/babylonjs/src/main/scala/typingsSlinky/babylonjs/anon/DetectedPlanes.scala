package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.XRPlaneSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedPlanes extends js.Object {
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.native
}

object DetectedPlanes {
  @scala.inline
  def apply(): DetectedPlanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedPlanes]
  }
  @scala.inline
  implicit class DetectedPlanesOps[Self <: DetectedPlanes] (val x: Self) extends AnyVal {
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

