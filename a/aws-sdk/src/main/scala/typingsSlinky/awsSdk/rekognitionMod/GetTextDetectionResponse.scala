package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTextDetectionResponse extends StObject {
  
  /**
    * Current status of the text detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.StatusMessage] = js.native
  
  /**
    * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from the start of the video that the text was detected, and where it was detected on the screen.
    */
  var TextDetections: js.UndefOr[TextDetectionResults] = js.native
  
  /**
    * Version number of the text detection model that was used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.native
  
  var VideoMetadata: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.VideoMetadata] = js.native
}
object GetTextDetectionResponse {
  
  @scala.inline
  def apply(): GetTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTextDetectionResponse]
  }
  
  @scala.inline
  implicit class GetTextDetectionResponseMutableBuilder[Self <: GetTextDetectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setTextDetections(value: TextDetectionResults): Self = StObject.set(x, "TextDetections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDetectionsUndefined: Self = StObject.set(x, "TextDetections", js.undefined)
    
    @scala.inline
    def setTextDetectionsVarargs(value: TextDetectionResult*): Self = StObject.set(x, "TextDetections", js.Array(value :_*))
    
    @scala.inline
    def setTextModelVersion(value: String): Self = StObject.set(x, "TextModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextModelVersionUndefined: Self = StObject.set(x, "TextModelVersion", js.undefined)
    
    @scala.inline
    def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
  }
}
