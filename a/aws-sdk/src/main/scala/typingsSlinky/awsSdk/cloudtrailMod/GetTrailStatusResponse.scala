package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrailStatusResponse extends js.Object {
  /**
    * Whether the CloudTrail is currently logging AWS API calls.
    */
  var IsLogging: js.UndefOr[Boolean] = js.native
  /**
    * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch Logs.
    */
  var LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.native
  /**
    * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
    */
  var LatestCloudWatchLogsDeliveryTime: js.UndefOr[js.Date] = js.native
  /**
    * This field is no longer in use.
    */
  var LatestDeliveryAttemptSucceeded: js.UndefOr[String] = js.native
  /**
    * This field is no longer in use.
    */
  var LatestDeliveryAttemptTime: js.UndefOr[String] = js.native
  /**
    * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated bucket. For more information see the topic Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To resolve the issue, create a new bucket and call UpdateTrail to specify the new bucket, or fix the existing objects so that CloudTrail can again write to the bucket. 
    */
  var LatestDeliveryError: js.UndefOr[String] = js.native
  /**
    * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
    */
  var LatestDeliveryTime: js.UndefOr[js.Date] = js.native
  /**
    * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the designated bucket. For more information see the topic Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To resolve the issue, create a new bucket and call UpdateTrail to specify the new bucket, or fix the existing objects so that CloudTrail can again write to the bucket. 
    */
  var LatestDigestDeliveryError: js.UndefOr[String] = js.native
  /**
    * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
    */
  var LatestDigestDeliveryTime: js.UndefOr[js.Date] = js.native
  /**
    * This field is no longer in use.
    */
  var LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.native
  /**
    * This field is no longer in use.
    */
  var LatestNotificationAttemptTime: js.UndefOr[String] = js.native
  /**
    * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more information about Amazon SNS errors, see the Amazon SNS Developer Guide. 
    */
  var LatestNotificationError: js.UndefOr[String] = js.native
  /**
    * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file to an account's Amazon S3 bucket.
    */
  var LatestNotificationTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
    */
  var StartLoggingTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
    */
  var StopLoggingTime: js.UndefOr[js.Date] = js.native
  /**
    * This field is no longer in use.
    */
  var TimeLoggingStarted: js.UndefOr[String] = js.native
  /**
    * This field is no longer in use.
    */
  var TimeLoggingStopped: js.UndefOr[String] = js.native
}

object GetTrailStatusResponse {
  @scala.inline
  def apply(): GetTrailStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrailStatusResponse]
  }
  @scala.inline
  implicit class GetTrailStatusResponseOps[Self <: GetTrailStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestCloudWatchLogsDeliveryError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestCloudWatchLogsDeliveryError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestCloudWatchLogsDeliveryError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestCloudWatchLogsDeliveryError")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestCloudWatchLogsDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestCloudWatchLogsDeliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestCloudWatchLogsDeliveryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestCloudWatchLogsDeliveryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestDeliveryAttemptSucceeded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDeliveryAttemptSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestDeliveryAttemptSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDeliveryAttemptSucceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestDeliveryAttemptTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDeliveryAttemptTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestDeliveryAttemptTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDeliveryAttemptTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestDeliveryError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDeliveryError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestDeliveryError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDeliveryError")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDeliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestDeliveryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDeliveryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestDigestDeliveryError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDigestDeliveryError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestDigestDeliveryError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDigestDeliveryError")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestDigestDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDigestDeliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestDigestDeliveryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestDigestDeliveryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestNotificationAttemptSucceeded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestNotificationAttemptSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestNotificationAttemptSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestNotificationAttemptSucceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestNotificationAttemptTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestNotificationAttemptTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestNotificationAttemptTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestNotificationAttemptTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestNotificationError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestNotificationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestNotificationError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestNotificationError")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestNotificationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestNotificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestNotificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestNotificationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLoggingTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartLoggingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLoggingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartLoggingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStopLoggingTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopLoggingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopLoggingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopLoggingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLoggingStarted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeLoggingStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLoggingStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeLoggingStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLoggingStopped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeLoggingStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLoggingStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeLoggingStopped")(js.undefined)
        ret
    }
  }
  
}

