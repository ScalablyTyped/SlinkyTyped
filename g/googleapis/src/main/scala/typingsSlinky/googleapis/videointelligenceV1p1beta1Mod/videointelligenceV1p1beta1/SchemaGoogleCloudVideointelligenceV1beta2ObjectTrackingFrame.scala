package typingsSlinky.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotations for object detection and tracking. This field
  * stores per frame location, time offset, and confidence.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame extends js.Object {
  /**
    * The normalized bounding box location of this object track for the frame.
    */
  var normalizedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox] = js.native
  /**
    * The timestamp of the frame in microseconds.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrameOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalizedBoundingBox(value: SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedBoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizedBoundingBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedBoundingBox")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOffset")(js.undefined)
        ret
    }
  }
  
}

