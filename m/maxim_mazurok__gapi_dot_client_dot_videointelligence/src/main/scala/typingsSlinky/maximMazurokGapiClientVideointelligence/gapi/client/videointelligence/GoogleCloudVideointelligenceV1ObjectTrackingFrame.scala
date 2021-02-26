package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1ObjectTrackingFrame extends StObject {
  
  /** The normalized bounding box location of this object track for the frame. */
  var normalizedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1NormalizedBoundingBox] = js.native
  
  /** The timestamp of the frame in microseconds. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1ObjectTrackingFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1ObjectTrackingFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1ObjectTrackingFrameMutableBuilder[Self <: GoogleCloudVideointelligenceV1ObjectTrackingFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedBoundingBox(value: GoogleCloudVideointelligenceV1NormalizedBoundingBox): Self = StObject.set(x, "normalizedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedBoundingBoxUndefined: Self = StObject.set(x, "normalizedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
