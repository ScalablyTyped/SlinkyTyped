package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntry extends js.Object {
  /**
    * A unique ID for the log entry used for deduplication. If omitted,
    * the implementation will generate one based on operation_id.
    */
  var insertId: js.UndefOr[String] = js.native
  /**
    * A set of user-defined (key, value) data that provides additional
    * information about the log entry.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Required. The log to which this log entry belongs. Examples: `"syslog"`,
    * `"book_log"`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The log entry payload, represented as a protocol buffer that is
    * expressed as a JSON object. The only accepted type currently is
    * AuditLog.
    */
  var protoPayload: js.UndefOr[Record[String, _]] = js.native
  /**
    * The severity of the log entry. The default value is
    * `LogSeverity.DEFAULT`.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The log entry payload, represented as a structure that
    * is expressed as a JSON object.
    */
  var structPayload: js.UndefOr[Record[String, _]] = js.native
  /** The log entry payload, represented as a Unicode string (UTF-8). */
  var textPayload: js.UndefOr[String] = js.native
  /**
    * The time the event described by the log entry occurred. If
    * omitted, defaults to operation start time.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object LogEntry {
  @scala.inline
  def apply(): LogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntry]
  }
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertId")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProtoPayload(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protoPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtoPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protoPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withStructPayload(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

