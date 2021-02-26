package typingsSlinky.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotations related to one detected OCR text snippet. This will contain the
  * corresponding text, confidence value, and frame level information for each
  * detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1TextAnnotation extends StObject {
  
  /**
    * All video segments where OCR detected text appears.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1TextSegment]] = js.native
  
  /**
    * The detected text.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVideointelligenceV1TextAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1TextAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1TextAnnotationMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1TextAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1TextSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1TextSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
