package typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video segment level annotation results for label detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1LabelSegment extends StObject {
  
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /**
    * Video segment where a label was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1VideoSegment] = js.native
}
object SchemaGoogleCloudVideointelligenceV1LabelSegment {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1LabelSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1LabelSegment]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1LabelSegmentMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1LabelSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setSegment(value: SchemaGoogleCloudVideointelligenceV1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
