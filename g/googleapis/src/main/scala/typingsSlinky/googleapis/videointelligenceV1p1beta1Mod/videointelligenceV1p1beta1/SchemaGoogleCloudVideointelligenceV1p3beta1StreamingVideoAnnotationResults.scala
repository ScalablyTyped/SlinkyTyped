package typingsSlinky.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Streaming annotation results corresponding to a portion of the video that
  * is currently being processed.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults extends js.Object {
  /**
    * Explicit content annotation results.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation] = js.native
  /**
    * Label annotation results.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]] = js.native
  /**
    * Object tracking results.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]] = js.native
  /**
    * Shot annotation results. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResultsOps[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicitAnnotation(value: SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withShotAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShotAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shotAnnotations")(js.undefined)
        ret
    }
  }
  
}

