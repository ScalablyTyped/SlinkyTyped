package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARFrame extends js.Object {
  var anchors: js.UndefOr[js.Array[Anchor] | Null] = js.native
  var capturedDepthData: js.UndefOr[CapturedDepthData | Null] = js.native
  var lightEstimation: js.UndefOr[LightEstimation | Null] = js.native
  var rawFeaturePoints: js.UndefOr[js.Array[RawFeaturePoint] | Null] = js.native
  var timestamp: Double = js.native
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
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchors(value: js.Array[Anchor]): Self = {
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
    def withAnchorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(null)
        ret
    }
    @scala.inline
    def withCapturedDepthData(value: CapturedDepthData): Self = {
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
    def withCapturedDepthDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capturedDepthData")(null)
        ret
    }
    @scala.inline
    def withLightEstimation(value: LightEstimation): Self = {
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
    def withLightEstimationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightEstimation")(null)
        ret
    }
    @scala.inline
    def withRawFeaturePoints(value: js.Array[RawFeaturePoint]): Self = {
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
    @scala.inline
    def withRawFeaturePointsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawFeaturePoints")(null)
        ret
    }
  }
  
}

