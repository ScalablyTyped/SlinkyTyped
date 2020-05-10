package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorSummary extends js.Object {
  /** Required. */
  var errorCode: js.UndefOr[String] = js.native
  /**
    * Count of this type of error.
    * Required.
    */
  var errorCount: js.UndefOr[String] = js.native
  /** Error samples. */
  var errorLogEntries: js.UndefOr[js.Array[ErrorLogEntry]] = js.native
}

object ErrorSummary {
  @scala.inline
  def apply(): ErrorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorSummary]
  }
  @scala.inline
  implicit class ErrorSummaryOps[Self <: ErrorSummary] (val x: Self) extends AnyVal {
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
    def withErrorLogEntries(value: js.Array[ErrorLogEntry]): Self = {
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

