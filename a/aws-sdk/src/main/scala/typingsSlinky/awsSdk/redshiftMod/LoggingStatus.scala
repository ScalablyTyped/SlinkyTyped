package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingStatus extends js.Object {
  /**
    * The name of the S3 bucket where the log files are stored.
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    * The message indicating that logs failed to be delivered.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  /**
    * The last time when logs failed to be delivered.
    */
  var LastFailureTime: js.UndefOr[js.Date] = js.native
  /**
    * The last time that logs were delivered.
    */
  var LastSuccessfulDeliveryTime: js.UndefOr[js.Date] = js.native
  /**
    *  true if logging is on, false if logging is off.
    */
  var LoggingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The prefix applied to the log file names.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
}

object LoggingStatus {
  @scala.inline
  def apply(): LoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingStatus]
  }
  @scala.inline
  implicit class LoggingStatusOps[Self <: LoggingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFailureTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFailureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfulDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulDeliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfulDeliveryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulDeliveryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withS3KeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(js.undefined)
        ret
    }
  }
  
}

