package typingsSlinky.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotations corresponding to one tracked object.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation extends js.Object {
  /**
    * Object category&#39;s labeling confidence of this track.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Entity to specify the object category that this track is labeled as.
    */
  var entity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1Entity] = js.native
  /**
    * Information corresponding to all frames where this object track appears.
    * Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame
    * messages in frames. Streaming mode: it can only be one
    * ObjectTrackingFrame message in frames.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame]] = js.native
  /**
    * Non-streaming batch mode ONLY. Each object track corresponds to one video
    * segment where it appears.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.native
  /**
    * Streaming mode ONLY. In streaming mode, we do not know the end time of a
    * tracked object before it is completed. Hence, there is no VideoSegment
    * info returned. Instead, we provide a unique identifiable integer track_id
    * so that the customers can correlate the results of the ongoing
    * ObjectTrackAnnotation of the same track_id over time.
    */
  var trackId: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotationOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity(value: SchemaGoogleCloudVideointelligenceV1p2beta1Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
        ret
    }
    @scala.inline
    def withFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackId")(js.undefined)
        ret
    }
  }
  
}

