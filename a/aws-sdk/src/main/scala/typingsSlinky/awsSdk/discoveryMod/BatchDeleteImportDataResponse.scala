package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImportDataResponse extends js.Object {
  /**
    * Error messages returned for each import task that you deleted as a response for this command.
    */
  var errors: js.UndefOr[BatchDeleteImportDataErrorList] = js.native
}

object BatchDeleteImportDataResponse {
  @scala.inline
  def apply(): BatchDeleteImportDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImportDataResponse]
  }
  @scala.inline
  implicit class BatchDeleteImportDataResponseOps[Self <: BatchDeleteImportDataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: BatchDeleteImportDataErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

