package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordsOutput extends js.Object {
  /**
    * The encryption type used on the records. This parameter can be one of the following values:    NONE: Do not encrypt the records.    KMS: Use server-side encryption on the records using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.EncryptionType] = js.native
  /**
    * The number of unsuccessfully processed records in a PutRecords request.
    */
  var FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * An array of successfully and unsuccessfully processed record results, correlated with the request by natural ordering. A record that is successfully added to a stream includes SequenceNumber and ShardId in the result. A record that fails to be added to a stream includes ErrorCode and ErrorMessage in the result.
    */
  var Records: PutRecordsResultEntryList = js.native
}

object PutRecordsOutput {
  @scala.inline
  def apply(Records: PutRecordsResultEntryList): PutRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsOutput]
  }
  @scala.inline
  implicit class PutRecordsOutputOps[Self <: PutRecordsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: PutRecordsResultEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionType(value: EncryptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedRecordCount(value: PositiveIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedRecordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedRecordCount")(js.undefined)
        ret
    }
  }
  
}

