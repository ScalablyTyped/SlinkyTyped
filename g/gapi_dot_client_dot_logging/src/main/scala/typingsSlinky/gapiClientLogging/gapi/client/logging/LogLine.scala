package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogLine extends js.Object {
  /** App-provided log message. */
  var logMessage: js.UndefOr[String] = js.native
  /** Severity of this log entry. */
  var severity: js.UndefOr[String] = js.native
  /** Where in the source code this log message was written. */
  var sourceLocation: js.UndefOr[SourceLocation] = js.native
  /** Approximate time when this log entry was made. */
  var time: js.UndefOr[String] = js.native
}

object LogLine {
  @scala.inline
  def apply(): LogLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogLine]
  }
  @scala.inline
  implicit class LogLineOps[Self <: LogLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logMessage")(js.undefined)
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
    def withSourceLocation(value: SourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

