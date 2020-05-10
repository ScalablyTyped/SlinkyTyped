package typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsResultEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordsResultEntry extends js.Object {
  /**
    * <p>The error code for an individual record result. <code>ErrorCodes</code> can be either <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * <p>The error message for an individual record result. An <code>ErrorCode</code> value of <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID, stream name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error message <code>"Internal Service Failure"</code>.</p>
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * <p>The sequence number for an individual record result.</p>
    */
  var SequenceNumber: js.UndefOr[String] = js.native
  /**
    * <p>The shard ID for an individual record result.</p>
    */
  var ShardId: js.UndefOr[String] = js.native
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
    def withErrorCode(value: String): Self = {
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
    @scala.inline
    def withSequenceNumber(value: String): Self = {
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
    def withShardId(value: String): Self = {
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

