package typingsSlinky.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Label annotation.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation extends js.Object {
  /**
    * Common categories for the detected entity. E.g. when the label is
    * `Terrier` the category is likely `dog`. And in some cases there might be
    * more than one categories e.g. `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1Entity]] = js.native
  /**
    * Detected entity.
    */
  var entity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1Entity] = js.native
  /**
    * All video frames where a label was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelFrame]] = js.native
  /**
    * All video segments where a label was detected.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelSegment]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotationOps[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryEntities(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1Entity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity(value: SchemaGoogleCloudVideointelligenceV1p3beta1Entity): Self = {
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
    def withFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelFrame]): Self = {
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
    def withSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelSegment]): Self = {
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
  }
  
}

