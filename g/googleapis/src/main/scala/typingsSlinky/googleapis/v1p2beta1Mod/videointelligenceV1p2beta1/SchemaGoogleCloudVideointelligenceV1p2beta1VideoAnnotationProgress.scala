package typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotation progress for a single video.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress extends js.Object {
  /**
    * Video file location in [Google Cloud
    * Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Approximate percentage processed thus far. Guaranteed to be 100 when
    * fully processed.
    */
  var progressPercent: js.UndefOr[Double] = js.native
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Time of the most recent update.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgressOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUri")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

