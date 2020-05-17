package typingsSlinky.expo.aRMod

import typingsSlinky.expo.anon.BlendShapes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARFrameAnchorRequest extends js.Object {
  var ARFaceTrackingConfiguration: js.UndefOr[BlendShapes] = js.native
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
    def withARFaceTrackingConfiguration(value: BlendShapes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARFaceTrackingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARFaceTrackingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARFaceTrackingConfiguration")(js.undefined)
        ret
    }
  }
  
}

