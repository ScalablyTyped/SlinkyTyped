package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTextDetectionRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartTextDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentaly started more than once.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  /**
    * Optional parameters that let you set criteria the text must meet to be included in your response.
    */
  var Filters: js.UndefOr[StartTextDetectionFilters] = js.native
  /**
    * An identifier returned in the completion status published by your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.JobTag] = js.native
  var NotificationChannel: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.NotificationChannel] = js.native
  var Video: typingsSlinky.awsSdk.rekognitionMod.Video = js.native
}

object StartTextDetectionRequest {
  @scala.inline
  def apply(Video: Video): StartTextDetectionRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTextDetectionRequest]
  }
  @scala.inline
  implicit class StartTextDetectionRequestOps[Self <: StartTextDetectionRequest] (val x: Self) extends AnyVal {
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
    def withFilters(value: StartTextDetectionFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
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

