package typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1VideoContext extends js.Object {
  /**
    * If label detection has been requested, what labels should be detected
    * in addition to video-level labels or segment-level labels. If unspecified,
    * defaults to `SHOT_MODE`.
    */
  var labelDetectionMode: js.UndefOr[String] = js.native
  /**
    * Model to use for label detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var labelDetectionModel: js.UndefOr[String] = js.native
  /**
    * Model to use for safe search detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var safeSearchDetectionModel: js.UndefOr[String] = js.native
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video
    * is treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]] = js.native
  /**
    * Model to use for shot change detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var shotChangeDetectionModel: js.UndefOr[String] = js.native
  /**
    * Whether the video has been shot from a stationary (i.e. non-moving) camera.
    * When set to true, might improve detection accuracy for moving objects.
    */
  var stationaryCamera: js.UndefOr[Boolean] = js.native
}

object GoogleCloudVideointelligenceV1beta1VideoContext {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1VideoContext]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1VideoContextOps[Self <: GoogleCloudVideointelligenceV1beta1VideoContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelDetectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDetectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDetectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDetectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDetectionModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDetectionModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDetectionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDetectionModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeSearchDetectionModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearchDetectionModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeSearchDetectionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearchDetectionModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withShotChangeDetectionModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotChangeDetectionModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShotChangeDetectionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotChangeDetectionModel")(js.undefined)
        ret
    }
    @scala.inline
    def withStationaryCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stationaryCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStationaryCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stationaryCamera")(js.undefined)
        ret
    }
  }
  
}

