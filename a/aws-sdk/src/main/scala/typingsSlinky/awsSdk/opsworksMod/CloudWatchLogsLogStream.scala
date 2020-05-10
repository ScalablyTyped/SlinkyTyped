package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsLogStream extends js.Object {
  /**
    * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
    */
  var BatchCount: js.UndefOr[Integer] = js.native
  /**
    * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
    */
  var BatchSize: js.UndefOr[Integer] = js.native
  /**
    * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is 5000ms.
    */
  var BufferDuration: js.UndefOr[Integer] = js.native
  /**
    * Specifies how the time stamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference.
    */
  var DatetimeFormat: js.UndefOr[String] = js.native
  /**
    * Specifies the encoding of the log file so that the file can be read correctly. The default is utf_8. Encodings supported by Python codecs.decode() can be used here.
    */
  var Encoding: js.UndefOr[CloudWatchLogsEncoding] = js.native
  /**
    * Specifies log files that you want to push to CloudWatch Logs.  File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*). Only the latest file is pushed to CloudWatch Logs, based on file modification time. We recommend that you use wild card characters to specify a series of files of the same type, such as access_log.2014-06-01-01, access_log.2014-06-01-02, and so on by using a pattern like access_log.*. Don't use a wildcard to match multiple file types, such as access_log_80 and access_log_443. To specify multiple, different file types, add another log stream entry to the configuration file, so that each log file type is stored in a different log group. Zipped files are not supported.
    */
  var File: js.UndefOr[String] = js.native
  /**
    * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
    */
  var FileFingerprintLines: js.UndefOr[String] = js.native
  /**
    * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting is only used if there is no state persisted for that log stream.
    */
  var InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition] = js.native
  /**
    * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
    */
  var LogGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies the pattern for identifying the start of a log message.
    */
  var MultiLineStartPattern: js.UndefOr[String] = js.native
  /**
    * Specifies the time zone of log event time stamps.
    */
  var TimeZone: js.UndefOr[CloudWatchLogsTimeZone] = js.native
}

object CloudWatchLogsLogStream {
  @scala.inline
  def apply(): CloudWatchLogsLogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsLogStream]
  }
  @scala.inline
  implicit class CloudWatchLogsLogStreamOps[Self <: CloudWatchLogsLogStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchCount")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferDuration(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDatetimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatetimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatetimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: CloudWatchLogsEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFingerprintLines(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileFingerprintLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileFingerprintLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileFingerprintLines")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPosition(value: CloudWatchLogsInitialPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiLineStartPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiLineStartPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiLineStartPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiLineStartPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: CloudWatchLogsTimeZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZone")(js.undefined)
        ret
    }
  }
  
}

