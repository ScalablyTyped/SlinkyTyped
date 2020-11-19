package typingsSlinky.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Label annotation.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1LabelAnnotation extends js.Object {
  
  /**
    * Common categories for the detected entity. E.g. when the label is
    * `Terrier` the category is likely `dog`. And in some cases there might be
    * more than one categories e.g. `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1Entity]] = js.native
  
  /**
    * Detected entity.
    */
  var entity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1Entity] = js.native
  
  /**
    * All video frames where a label was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1LabelFrame]] = js.native
  
  /**
    * All video segments where a label was detected.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1LabelSegment]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1LabelAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1LabelAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1LabelAnnotationOps[Self <: SchemaGoogleCloudVideointelligenceV1LabelAnnotation] (val x: Self) extends AnyVal {
    
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
    def setCategoryEntitiesVarargs(value: SchemaGoogleCloudVideointelligenceV1Entity*): Self = this.set("categoryEntities", js.Array(value :_*))
    
    @scala.inline
    def setCategoryEntities(value: js.Array[SchemaGoogleCloudVideointelligenceV1Entity]): Self = this.set("categoryEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryEntities: Self = this.set("categoryEntities", js.undefined)
    
    @scala.inline
    def setEntity(value: SchemaGoogleCloudVideointelligenceV1Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1LabelFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1LabelFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1LabelSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1LabelSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
  }
}
