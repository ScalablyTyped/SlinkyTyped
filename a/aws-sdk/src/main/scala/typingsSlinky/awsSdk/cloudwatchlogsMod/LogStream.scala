package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogStream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the log stream.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The creation time of the stream, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The time of the first event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var firstEventTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. The lastEventTime value updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but may take longer in some rare situations.
    */
  var lastEventTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The ingestion time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var lastIngestionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.native
  /**
    * The number of bytes stored.  IMPORTANT:On June 17, 2019, this parameter was deprecated for log streams, and is always reported as zero. This change applies only to log streams. The storedBytes parameter for log groups is not affected.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.native
  /**
    * The sequence token.
    */
  var uploadSequenceToken: js.UndefOr[SequenceToken] = js.native
}

object LogStream {
  @scala.inline
  def apply(): LogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogStream]
  }
  @scala.inline
  implicit class LogStreamOps[Self <: LogStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstEventTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstEventTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstEventTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstEventTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEventTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEventTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEventTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEventTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLastIngestionTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIngestionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastIngestionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIngestionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamName(value: LogStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withStoredBytes(value: StoredBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoredBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSequenceToken(value: SequenceToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSequenceToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadSequenceToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSequenceToken")(js.undefined)
        ret
    }
  }
  
}

