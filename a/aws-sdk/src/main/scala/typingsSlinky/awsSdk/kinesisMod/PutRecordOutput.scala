package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordOutput extends js.Object {
  /**
    * The encryption type to use on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.EncryptionType] = js.native
  /**
    * The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.
    */
  var SequenceNumber: typingsSlinky.awsSdk.kinesisMod.SequenceNumber = js.native
  /**
    * The shard ID of the shard where the data record was placed.
    */
  var ShardId: typingsSlinky.awsSdk.kinesisMod.ShardId = js.native
}

object PutRecordOutput {
  @scala.inline
  def apply(SequenceNumber: SequenceNumber, ShardId: ShardId): PutRecordOutput = {
    val __obj = js.Dynamic.literal(SequenceNumber = SequenceNumber.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
  @scala.inline
  implicit class PutRecordOutputOps[Self <: PutRecordOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequenceNumber(value: SequenceNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardId")(value.asInstanceOf[js.Any])
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
  }
  
}

