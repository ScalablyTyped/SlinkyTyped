package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastReportGenerationExecutionError extends js.Object {
  /**
    * The error code for the error that is returned when a usage report can't be generated.
    */
  var ErrorCode: js.UndefOr[UsageReportExecutionErrorCode] = js.native
  /**
    * The error message for the error that is returned when a usage report can't be generated.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
}

object LastReportGenerationExecutionError {
  @scala.inline
  def apply(): LastReportGenerationExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastReportGenerationExecutionError]
  }
  @scala.inline
  implicit class LastReportGenerationExecutionErrorOps[Self <: LastReportGenerationExecutionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: UsageReportExecutionErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
  }
  
}

