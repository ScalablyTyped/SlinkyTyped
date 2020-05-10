package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordBatchResponseEntry extends js.Object {
  /**
    * The error code for an individual record result.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ErrorCode] = js.native
  /**
    * The error message for an individual record result.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ErrorMessage] = js.native
  /**
    * The ID of the record.
    */
  var RecordId: js.UndefOr[PutResponseRecordId] = js.native
}

object PutRecordBatchResponseEntry {
  @scala.inline
  def apply(): PutRecordBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRecordBatchResponseEntry]
  }
  @scala.inline
  implicit class PutRecordBatchResponseEntryOps[Self <: PutRecordBatchResponseEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
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
    def withErrorMessage(value: ErrorMessage): Self = {
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
    @scala.inline
    def withRecordId(value: PutResponseRecordId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordId")(js.undefined)
        ret
    }
  }
  
}

