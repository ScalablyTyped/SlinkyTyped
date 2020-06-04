package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARFrameRequest extends js.Object {
  var anchors: js.UndefOr[ARFrameAnchorRequest] = js.undefined
  var capturedDepthData: js.UndefOr[Boolean] = js.undefined
  var lightEstimation: js.UndefOr[Boolean] = js.undefined
  var rawFeaturePoints: js.UndefOr[Boolean] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchors(value: ARFrameAnchorRequest): Self = this.set("anchors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchors: Self = this.set("anchors", js.undefined)
    @scala.inline
    def setCapturedDepthData(value: Boolean): Self = this.set("capturedDepthData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapturedDepthData: Self = this.set("capturedDepthData", js.undefined)
    @scala.inline
    def setLightEstimation(value: Boolean): Self = this.set("lightEstimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightEstimation: Self = this.set("lightEstimation", js.undefined)
    @scala.inline
    def setRawFeaturePoints(value: Boolean): Self = this.set("rawFeaturePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawFeaturePoints: Self = this.set("rawFeaturePoints", js.undefined)
  }
  
}

