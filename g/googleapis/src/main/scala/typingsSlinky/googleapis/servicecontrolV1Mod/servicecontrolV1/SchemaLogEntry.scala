package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An individual log entry.
  */
@js.native
trait SchemaLogEntry extends js.Object {
  /**
    * Optional. Information about the HTTP request associated with this log
    * entry, if applicable.
    */
  var httpRequest: js.UndefOr[SchemaHttpRequest] = js.native
  /**
    * A unique ID for the log entry used for deduplication. If omitted, the
    * implementation will generate one based on operation_id.
    */
  var insertId: js.UndefOr[String] = js.native
  /**
    * A set of user-defined (key, value) data that provides additional
    * information about the log entry.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Required. The log to which this log entry belongs. Examples:
    * `&quot;syslog&quot;`, `&quot;book_log&quot;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. Information about an operation associated with the log entry,
    * if applicable.
    */
  var operation: js.UndefOr[SchemaLogEntryOperation] = js.native
  /**
    * The log entry payload, represented as a protocol buffer that is expressed
    * as a JSON object. The only accepted type currently is AuditLog.
    */
  var protoPayload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The severity of the log entry. The default value is
    * `LogSeverity.DEFAULT`.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The log entry payload, represented as a structure that is expressed as a
    * JSON object.
    */
  var structPayload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The log entry payload, represented as a Unicode string (UTF-8).
    */
  var textPayload: js.UndefOr[String] = js.native
  /**
    * The time the event described by the log entry occurred. If omitted,
    * defaults to operation start time.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Optional. Resource name of the trace associated with the log entry, if
    * any. If this field contains a relative resource name, you can assume the
    * name is relative to `//tracing.googleapis.com`. Example:
    * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
    */
  var trace: js.UndefOr[String] = js.native
}

object SchemaLogEntry {
  @scala.inline
  def apply(): SchemaLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogEntry]
  }
  @scala.inline
  implicit class SchemaLogEntryOps[Self <: SchemaLogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpRequest(value: SchemaHttpRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequest")(js.undefined)
        ret
    }
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
    def withLabels(value: StringDictionary[String]): Self = {
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
    def withOperation(value: SchemaLogEntryOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withProtoPayload(value: StringDictionary[js.Any]): Self = {
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
    def withStructPayload(value: StringDictionary[js.Any]): Self = {
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
    @scala.inline
    def withTrace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
  }
  
}

