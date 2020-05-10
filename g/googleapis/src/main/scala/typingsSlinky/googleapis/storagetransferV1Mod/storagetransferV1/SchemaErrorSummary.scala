package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A summary of errors by error code, plus a count and sample error log
  * entries.
  */
@js.native
trait SchemaErrorSummary extends js.Object {
  /**
    * Required.
    */
  var errorCode: js.UndefOr[String] = js.native
  /**
    * Count of this type of error. Required.
    */
  var errorCount: js.UndefOr[String] = js.native
  /**
    * Error samples.  No more than 100 error log entries may be recorded for a
    * given error code for a single task.
    */
  var errorLogEntries: js.UndefOr[js.Array[SchemaErrorLogEntry]] = js.native
}

object SchemaErrorSummary {
  @scala.inline
  def apply(): SchemaErrorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorSummary]
  }
  @scala.inline
  implicit class SchemaErrorSummaryOps[Self <: SchemaErrorSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorLogEntries(value: js.Array[SchemaErrorLogEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLogEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorLogEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLogEntries")(js.undefined)
        ret
    }
  }
  
}

