package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARFrameRequest extends js.Object {
  var anchors: js.UndefOr[ARFrameAnchorRequest] = js.native
  var capturedDepthData: js.UndefOr[Boolean] = js.native
  var lightEstimation: js.UndefOr[Boolean] = js.native
  var rawFeaturePoints: js.UndefOr[Boolean] = js.native
}

object ARFrameRequest {
  @scala.inline
  def apply(): ARFrameRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARFrameRequest]
  }
  @scala.inline
  implicit class ARFrameRequestOps[Self <: ARFrameRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchors(value: ARFrameAnchorRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(js.undefined)
        ret
    }
    @scala.inline
    def withCapturedDepthData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capturedDepthData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapturedDepthData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capturedDepthData")(js.undefined)
        ret
    }
    @scala.inline
    def withLightEstimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightEstimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightEstimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightEstimation")(js.undefined)
        ret
    }
    @scala.inline
    def withRawFeaturePoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawFeaturePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawFeaturePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawFeaturePoints")(js.undefined)
        ret
    }
  }
  
}

