package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartContentModerationRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartContentModeration requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.JobTag] = js.native
  /**
    * Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content label. Confidence represents how certain Amazon Rekognition is that the moderated content is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return any moderated content labels with a confidence level lower than this specified value. If you don't specify MinConfidence, GetContentModeration returns labels with confidence values greater than or equal to 50 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
  /**
    * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the unsafe content analysis to.
    */
  var NotificationChannel: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.NotificationChannel] = js.native
  /**
    * The video in which you want to detect unsafe content. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typingsSlinky.awsSdk.rekognitionMod.Video = js.native
}

object StartContentModerationRequest {
  @scala.inline
  def apply(Video: Video): StartContentModerationRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContentModerationRequest]
  }
  @scala.inline
  implicit class StartContentModerationRequestOps[Self <: StartContentModerationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVideo(value: Video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTag(value: JobTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobTag")(js.undefined)
        ret
    }
    @scala.inline
    def withMinConfidence(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationChannel(value: NotificationChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationChannel")(js.undefined)
        ret
    }
  }
  
}

