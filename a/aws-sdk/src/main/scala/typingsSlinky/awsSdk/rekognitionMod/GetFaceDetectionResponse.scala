package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFaceDetectionResponse extends StObject {
  
  /**
    * An array of faces detected in the video. Each element contains a detected face's details and the time, in milliseconds from the start of the video, the face was detected. 
    */
  var Faces: js.UndefOr[FaceDetections] = js.native
  
  /**
    * The current status of the face detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  
  /**
    * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to retrieve the next set of faces. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.StatusMessage] = js.native
  
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition video operation.
    */
  var VideoMetadata: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.VideoMetadata] = js.native
}
object GetFaceDetectionResponse {
  
  @scala.inline
  def apply(): GetFaceDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFaceDetectionResponse]
  }
  
  @scala.inline
  implicit class GetFaceDetectionResponseMutableBuilder[Self <: GetFaceDetectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaces(value: FaceDetections): Self = StObject.set(x, "Faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacesUndefined: Self = StObject.set(x, "Faces", js.undefined)
    
    @scala.inline
    def setFacesVarargs(value: FaceDetection*): Self = StObject.set(x, "Faces", js.Array(value :_*))
    
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
    def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
  }
}
