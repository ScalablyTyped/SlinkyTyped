package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARFrame extends js.Object {
  var anchors: js.UndefOr[js.Array[Anchor] | Null] = js.undefined
  var capturedDepthData: js.UndefOr[CapturedDepthData | Null] = js.undefined
  var lightEstimation: js.UndefOr[LightEstimation | Null] = js.undefined
  var rawFeaturePoints: js.UndefOr[js.Array[RawFeaturePoint] | Null] = js.undefined
  var timestamp: Double
}

object ARFrame {
  @scala.inline
  def apply(timestamp: Double): ARFrame = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARFrame]
  }
  @scala.inline
  implicit class ARFrameOps[Self <: ARFrame] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchorsVarargs(value: Anchor*): Self = this.set("anchors", js.Array(value :_*))
    @scala.inline
    def setAnchors(value: js.Array[Anchor]): Self = this.set("anchors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchors: Self = this.set("anchors", js.undefined)
    @scala.inline
    def setAnchorsNull: Self = this.set("anchors", null)
    @scala.inline
    def setCapturedDepthData(value: CapturedDepthData): Self = this.set("capturedDepthData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapturedDepthData: Self = this.set("capturedDepthData", js.undefined)
    @scala.inline
    def setCapturedDepthDataNull: Self = this.set("capturedDepthData", null)
    @scala.inline
    def setLightEstimation(value: LightEstimation): Self = this.set("lightEstimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightEstimation: Self = this.set("lightEstimation", js.undefined)
    @scala.inline
    def setLightEstimationNull: Self = this.set("lightEstimation", null)
    @scala.inline
    def setRawFeaturePointsVarargs(value: RawFeaturePoint*): Self = this.set("rawFeaturePoints", js.Array(value :_*))
    @scala.inline
    def setRawFeaturePoints(value: js.Array[RawFeaturePoint]): Self = this.set("rawFeaturePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawFeaturePoints: Self = this.set("rawFeaturePoints", js.undefined)
    @scala.inline
    def setRawFeaturePointsNull: Self = this.set("rawFeaturePoints", null)
  }
  
}

