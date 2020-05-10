package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImportDataError extends js.Object {
  /**
    * The type of error that occurred for a specific import task.
    */
  var errorCode: js.UndefOr[BatchDeleteImportDataErrorCode] = js.native
  /**
    * The description of the error that occurred for a specific import task.
    */
  var errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription] = js.native
  /**
    * The unique import ID associated with the error that occurred.
    */
  var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.native
}

object BatchDeleteImportDataError {
  @scala.inline
  def apply(): BatchDeleteImportDataError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImportDataError]
  }
  @scala.inline
  implicit class BatchDeleteImportDataErrorOps[Self <: BatchDeleteImportDataError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: BatchDeleteImportDataErrorCode): Self = {
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
    def withErrorDescription(value: BatchDeleteImportDataErrorDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withImportTaskId(value: ImportTaskIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importTaskId")(js.undefined)
        ret
    }
  }
  
}

