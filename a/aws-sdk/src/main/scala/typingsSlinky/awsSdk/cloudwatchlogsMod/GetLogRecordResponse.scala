package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogRecordResponse extends js.Object {
  /**
    * The requested log event, as a JSON string.
    */
  var logRecord: js.UndefOr[LogRecord] = js.native
}

object GetLogRecordResponse {
  @scala.inline
  def apply(): GetLogRecordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogRecordResponse]
  }
  @scala.inline
  implicit class GetLogRecordResponseOps[Self <: GetLogRecordResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogRecord(value: LogRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logRecord")(js.undefined)
        ret
    }
  }
  
}

