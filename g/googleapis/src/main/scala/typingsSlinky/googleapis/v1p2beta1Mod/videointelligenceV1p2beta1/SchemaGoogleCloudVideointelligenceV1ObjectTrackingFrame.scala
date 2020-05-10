package typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotations for object detection and tracking. This field
  * stores per frame location, time offset, and confidence.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1ObjectTrackingFrame extends js.Object {
  /**
    * The normalized bounding box location of this object track for the frame.
    */
  var normalizedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox] = js.native
  /**
    * The timestamp of the frame in microseconds.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1ObjectTrackingFrame {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1ObjectTrackingFrame]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1ObjectTrackingFrameOps[Self <: SchemaGoogleCloudVideointelligenceV1ObjectTrackingFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalizedBoundingBox(value: SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox): Self = {
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

