package typingsSlinky.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Label annotation.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation extends StObject {
  
  /**
    * Common categories for the detected entity. E.g. when the label is
    * `Terrier` the category is likely `dog`. And in some cases there might be
    * more than one categories e.g. `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1Entity]] = js.native
  
  /**
    * Detected entity.
    */
  var entity: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1Entity] = js.native
  
  /**
    * All video frames where a label was detected.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1LabelFrame]] = js.native
  
  /**
    * All video segments where a label was detected.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotationMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1LabelAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryEntities(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1Entity]): Self = StObject.set(x, "categoryEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryEntitiesUndefined: Self = StObject.set(x, "categoryEntities", js.undefined)
    
    @scala.inline
    def setCategoryEntitiesVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1Entity*): Self = StObject.set(x, "categoryEntities", js.Array(value :_*))
    
    @scala.inline
    def setEntity(value: SchemaGoogleCloudVideointelligenceV1p2beta1Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1LabelFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1LabelFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
