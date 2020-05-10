package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordsResultEntry extends js.Object {
  /**
    * The error code for an individual record result. ErrorCodes can be either ProvisionedThroughputExceededException or InternalFailure.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.ErrorCode] = js.native
  /**
    * The error message for an individual record result. An ErrorCode value of ProvisionedThroughputExceededException has an error message that includes the account ID, stream name, and shard ID. An ErrorCode value of InternalFailure has the error message "Internal Service Failure".
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.ErrorMessage] = js.native
  /**
    * The sequence number for an individual record result.
    */
  var SequenceNumber: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.SequenceNumber] = js.native
  /**
    * The shard ID for an individual record result.
    */
  var ShardId: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.ShardId] = js.native
}

object PutRecordsResultEntry {
  @scala.inline
  def apply(): PutRecordsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRecordsResultEntry]
  }
  @scala.inline
  implicit class PutRecordsResultEntryOps[Self <: PutRecordsResultEntry] (val x: Self) extends AnyVal {
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
    def withSequenceNumber(value: SequenceNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withShardId(value: ShardId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardId")(js.undefined)
        ret
    }
  }
  
}

