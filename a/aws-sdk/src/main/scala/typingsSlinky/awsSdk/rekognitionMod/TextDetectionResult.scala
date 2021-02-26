package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDetectionResult extends StObject {
  
  /**
    * Details about text detected in a video.
    */
  var TextDetection: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.TextDetection] = js.native
  
  /**
    * The time, in milliseconds from the start of the video, that the text was detected.
    */
  var Timestamp: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Timestamp] = js.native
}
object TextDetectionResult {
  
  @scala.inline
  def apply(): TextDetectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDetectionResult]
  }
  
  @scala.inline
  implicit class TextDetectionResultMutableBuilder[Self <: TextDetectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextDetection(value: TextDetection): Self = StObject.set(x, "TextDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDetectionUndefined: Self = StObject.set(x, "TextDetection", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
