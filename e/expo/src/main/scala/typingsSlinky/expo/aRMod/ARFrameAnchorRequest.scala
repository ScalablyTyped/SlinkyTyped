package typingsSlinky.expo.aRMod

import typingsSlinky.expo.anon.BlendShapes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARFrameAnchorRequest extends js.Object {
  var ARFaceTrackingConfiguration: js.UndefOr[BlendShapes] = js.undefined
}

object ARFrameAnchorRequest {
  @scala.inline
  def apply(): ARFrameAnchorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARFrameAnchorRequest]
  }
  @scala.inline
  implicit class ARFrameAnchorRequestOps[Self <: ARFrameAnchorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setARFaceTrackingConfiguration(value: BlendShapes): Self = this.set("ARFaceTrackingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARFaceTrackingConfiguration: Self = this.set("ARFaceTrackingConfiguration", js.undefined)
  }
  
}

