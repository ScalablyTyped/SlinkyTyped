package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFaceSearchRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartFaceSearch requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  /**
    * ID of the collection that contains the faces you want to search for.
    */
  var CollectionId: typingsSlinky.awsSdk.rekognitionMod.CollectionId = js.native
  /**
    * The minimum confidence in the person match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.JobTag] = js.native
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the search. 
    */
  var NotificationChannel: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.NotificationChannel] = js.native
  /**
    * The video you want to search. The video must be stored in an Amazon S3 bucket. 
    */
  var Video: typingsSlinky.awsSdk.rekognitionMod.Video = js.native
}

object StartFaceSearchRequest {
  @scala.inline
  def apply(CollectionId: CollectionId, Video: Video): StartFaceSearchRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFaceSearchRequest]
  }
  @scala.inline
  implicit class StartFaceSearchRequestOps[Self <: StartFaceSearchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionId(value: CollectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withFaceMatchThreshold(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceMatchThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceMatchThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceMatchThreshold")(js.undefined)
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

