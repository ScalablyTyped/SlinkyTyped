package typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment extends js.Object {
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * end of the segment (inclusive).
    */
  var endTimeOffset: js.UndefOr[String] = js.native
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * start of the segment (inclusive).
    */
  var startTimeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegmentOps[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTimeOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeOffset")(js.undefined)
        ret
    }
  }
  
}

