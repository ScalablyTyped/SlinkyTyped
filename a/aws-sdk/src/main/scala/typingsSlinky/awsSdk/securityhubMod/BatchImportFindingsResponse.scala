package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchImportFindingsResponse extends js.Object {
  /**
    * The number of findings that failed to import.
    */
  var FailedCount: Integer = js.native
  /**
    * The list of findings that failed to import.
    */
  var FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.native
  /**
    * The number of findings that were successfully imported.
    */
  var SuccessCount: Integer = js.native
}

object BatchImportFindingsResponse {
  @scala.inline
  def apply(FailedCount: Integer, SuccessCount: Integer): BatchImportFindingsResponse = {
    val __obj = js.Dynamic.literal(FailedCount = FailedCount.asInstanceOf[js.Any], SuccessCount = SuccessCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsResponse]
  }
  @scala.inline
  implicit class BatchImportFindingsResponseOps[Self <: BatchImportFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedFindings(value: ImportFindingsErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedFindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedFindings")(js.undefined)
        ret
    }
  }
  
}

