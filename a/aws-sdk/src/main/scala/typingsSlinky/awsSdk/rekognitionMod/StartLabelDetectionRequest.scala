package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartLabelDetectionRequest extends StObject {
  
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartLabelDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.JobTag] = js.native
  
  /**
    * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected label. Confidence represents how certain Amazon Rekognition is that a label is correctly identified.0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any labels with a confidence level lower than this specified value. If you don't specify MinConfidence, the operation returns labels with confidence values greater than or equal to 50 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
  
  /**
    * The Amazon SNS topic ARN you want Amazon Rekognition Video to publish the completion status of the label detection operation to. 
    */
  var NotificationChannel: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.NotificationChannel] = js.native
  
  /**
    * The video in which you want to detect labels. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typingsSlinky.awsSdk.rekognitionMod.Video = js.native
}
object StartLabelDetectionRequest {
  
  @scala.inline
  def apply(Video: Video): StartLabelDetectionRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLabelDetectionRequest]
  }
  
  @scala.inline
  implicit class StartLabelDetectionRequestMutableBuilder[Self <: StartLabelDetectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    @scala.inline
    def setMinConfidence(value: Percent): Self = StObject.set(x, "MinConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinConfidenceUndefined: Self = StObject.set(x, "MinConfidence", js.undefined)
    
    @scala.inline
    def setNotificationChannel(value: NotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    @scala.inline
    def setVideo(value: Video): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
  }
}
