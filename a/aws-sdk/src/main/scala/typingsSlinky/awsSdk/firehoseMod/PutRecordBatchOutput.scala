package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordBatchOutput extends js.Object {
  /**
    * Indicates whether server-side encryption (SSE) was enabled during this operation.
    */
  var Encrypted: js.UndefOr[BooleanObject] = js.native
  /**
    * The number of records that might have failed processing. This number might be greater than 0 even if the PutRecordBatch call succeeds. Check FailedPutCount to determine whether there are records that you need to resend.
    */
  var FailedPutCount: NonNegativeIntegerObject = js.native
  /**
    * The results array. For each record, the index of the response element is the same as the index used in the request array.
    */
  var RequestResponses: PutRecordBatchResponseEntryList = js.native
}

object PutRecordBatchOutput {
  @scala.inline
  def apply(FailedPutCount: NonNegativeIntegerObject, RequestResponses: PutRecordBatchResponseEntryList): PutRecordBatchOutput = {
    val __obj = js.Dynamic.literal(FailedPutCount = FailedPutCount.asInstanceOf[js.Any], RequestResponses = RequestResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordBatchOutput]
  }
  @scala.inline
  implicit class PutRecordBatchOutputOps[Self <: PutRecordBatchOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedPutCount(value: NonNegativeIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedPutCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestResponses(value: PutRecordBatchResponseEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(js.undefined)
        ret
    }
  }
  
}

